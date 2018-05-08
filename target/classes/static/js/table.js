function initTable(_prefix) {
    layui.use('table', function () {
        //监听表格复选框选择
        layui.table.on('checkbox(tableLayFilter)', function (obj) {
            console.log(obj)
        });
        //监听工具条
        layui.table.on('tool(tableLayFilter)', function (obj) {
            var data = obj.data;
            if (obj.event === 'detail') {
                tableDetail(_prefix + '/detailview/' + data.id);
            } else if (obj.event === 'del') {
                tableDelete(_prefix,obj);
            } else if (obj.event === 'edit') {
                tableEdit(_prefix + '/editview/' + data.id);
            }
        });

        var $ = layui.$, active = {
            // 批量删除数据
            batchDel: function() {
                tableBatchDelete(_prefix, 'tableData');
            } ,
            //重新加载
            reload: function () {
                readTable("#searchForm");
            },
            //新建
            add: function () {
                tableAdd(_prefix + "/addview")
            }
        };

        $('.searchBar .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

    });
}



/***
 * 显示详情信息
 */
function tableDetail(_url) {
    var _title = "详情信息";
    show(_title, _url);
}

/**
 * 新增页面
 * @param _url
 */
function tableAdd(_url) {
    var _title = "新增信息";
    show(_title, _url);
}

/**
 * 修改页面
 */
function tableEdit(_url) {
    var _title = "修改页面";
    show(_title, _url);
}

/**
 * 删除页面
 */
function tableDelete( _suffix,_obj) {

    layer.confirm('真的删除行么', function(index){
        if (_obj==null){
            layer.msg('删除失败！',{icon:2});
        }else {
            $.ajax({
                url:   _suffix + "/delete/" + _obj.data.id,
                type:'get',
                success: function(result){
                    if (result.deleteCount>0){
                        layer.msg("删除数据成功",{icon:1},function () {
                            _obj.del();
                            location.reload();
                            layer.close(index);
                        });
                    }else {
                        layer.msg("删除数据失败",{icon:2});
                    }

                },error: function(resp){
                    layer.msg("通讯失败",{icon:2});
                }
            });
        }

    });
}

/**
 * 批量删除数据
 */
function tableBatchDelete(_suffix, _tableData) {
    var table = layui.table;
    var checkStatus = table.checkStatus(_tableData);
    var checkData = checkStatus.data;       // 删除的数据
    if (checkData.length<=0) {
        layer.msg('请选择需要删除的数据！');
    }else {
        layer.confirm('是否删除批量数据?',function (index) {
            var ids = '';
            //batchDelete
            $.map(checkData,function(c){
                console.log(c['id'])
                ids += c['id'] + ',';
            });
            $.ajax({
                url:  _suffix + "/batchDelete" ,
                data: {
                    ids: ids
                },
                type: 'post',
                success: function(result){
                    if (result.deleteCount>0){
                        layer.msg("删除数据成功",{icon:1},function () {
                            location.reload();
                            layer.close(index);
                        });
                    }else {
                        layer.msg("删除数据失败",{icon:2});
                    }

                },error: function(resp){
                    layer.msg("通讯失败",{icon:2});
                }
            })

        })
    }

}

function readTable(_searchForm) {
    var searchFormParams = jQuery(_searchForm).serializeArray();
    var objectJson = {};
    $.map(searchFormParams,function (param) {
        objectJson[param.name] = param.value;
    });
    var table = layui.table;
    //执行重载
    table.reload('tableData', {
        page: {
            curr: 1 //重新从第 1 页开始
        }
        , where:
            objectJson

    });
}

/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    w       弹出层宽度（缺省调默认值）
    h       弹出层高度（缺省调默认值）
*/
function show(title,url,w,h){
    if (title == null || title == '') {
        title=false;
    };
    if (url == null || url == '') {
        url="404.html";
    };
    if (w == null || w == '') {
        w=($(window).width()*0.9);
    };
    if (h == null || h == '') {
        h=($(window).height() - 50);
    };
    layer.open({
        type: 2,
        area: [w+'px', h +'px'],
        fix: false, //不固定
        maxmin: true,
        shadeClose: true,
        shade:0.4,
        title: title,
        content: url
    });
}
