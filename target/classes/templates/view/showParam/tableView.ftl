<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>表单元素</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/static/component/lib/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/static/component/lib/layui/css/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
        <#--基本信息-->
            <form class="layui-form" action="" lay-filter="component-form-element">
            <#--id -->
                <input type="hidden" id="id" name="id" value="${(data.ID)!""}">
                <input type="hidden" id="menuCode" name="menuCode" value="${(menuCode)!""}">
                <input type="hidden" id="typeModel" name="typeModel" value="${(typeModel)!""}">
                <div class="layui-card">
                    <div class="layui-card-header">基本信息</div>
                    <div class="layui-card-body">
                        <#list paramsData as param>
                            <#if param.pId=='menuId'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">菜单id：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add' || typeModel=='edit'>
                                            <input type="text" name="menuId" id="menuId" lay-verify="required"
                                                   placeholder=""
                                                   autocomplete="off" class="layui-input" value="${(data.MENUID)!""}">
                                        <#else >
                                            ${(data.MENUID)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='menuCode'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">菜单编码：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="menuCode" id="menuCode" lay-verify="required"
                                                   placeholder="" value="${(data.MENUCODE)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.MENUCODE)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='pId'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">id：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pId" id="pId" lay-verify="required"
                                                   placeholder="" value="${(data.PID)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PID)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='pName'>
                             <div class="layui-form-item">
                                 <label class="layui-form-label">name：</label>
                                 <div class="layui-input-block">
                                    <#if typeModel=='add'|| typeModel=='edit'>
                                        <input type="text" name="pName" id="pName" lay-verify="required"
                                               placeholder="" value="${(data.PNAME)!""}"
                                               autocomplete="off" class="layui-input">
                                    <#else >
                                        ${(data.PNAME)!""}
                                    </#if>
                                 </div>
                             </div>
                            </#if>
                            <#if param.pId=='pPlaceholder'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">提示：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pPlaceholder" id="pPlaceholder" lay-verify="required"
                                                   placeholder="" value="${(data.PPLACEHOLDER)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PPLACEHOLDER)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pLabel'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">标签：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pLabel" id="pLabel" lay-verify="required"
                                                   placeholder="" value="${(data.PLABEL)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PLABEL)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pSearch'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">搜索是否启用：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="radio" name="pSearch" value="0" title="是" checked>
                                            <input type="radio" name="pSearch" value="1" title="否">
                                        <#else >
                                            ${(data.PSEARCH)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pSearchdata'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">搜索数据设置：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pSearchdata" id="pSearchdata" lay-verify="required"
                                                   placeholder="" value="${(data.PSEARCHDATA)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PSEARCHDATA)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pList'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">列表是否启用：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>

                                            <input type="radio" name="pList" value="0" title="是" checked>
                                            <input type="radio" name="pList" value="1" title="否">
                                        <#else >
                                            ${(data.PLIST)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pListdata'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">列表数据设置：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pListdata" id="pListdata" lay-verify="required"
                                                   placeholder="" value="${(data.PLISTDATA)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PLISTDATA)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pAdd'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">新增是否启用：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="radio" name="pAdd" value="0" title="是" checked>
                                            <input type="radio" name="pAdd" value="1" title="否">
                                        <#else >
                                            ${(data.PADD)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pAdddata'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">新增数据设置：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pAdddata" id="pAdddata" lay-verify="required"
                                                   placeholder="" value="${(data.PADDDATA)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PADDDATA)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pUpdate'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">修改是否启用：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>

                                            <input type="radio" name="pUpdate" value="0" title="是" checked>
                                            <input type="radio" name="pUpdate" value="1" title="否">
                                        <#else >
                                            ${(data.PUPDATE)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pUpdatedata'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">修改数据设置：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pUpdatedata" id="pUpdatedata" lay-verify="required"
                                                   placeholder="" value="${(data.PUPDATEDATA)!""}"
                                                   autocomplete="off" class="layui-input">

                                        <#else >
                                            ${(data.PUPDATEDATA)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pUpdatedata'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">修改数据设置：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pUpdatedata" id="pUpdatedata" lay-verify="required"
                                                   placeholder="" value="${(data.PUPDATEDATA)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PUPDATEDATA)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pDetail'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">详情是否启用：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>

                                            <input type="radio" name="pDetail" value="0" title="是" checked>
                                            <input type="radio" name="pDetail" value="1" title="否">
                                        <#else >
                                            ${(data.PDETAIL)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pDel'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">删除是否启用：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="radio" name="pDel" value="0" title="是" checked>
                                            <input type="radio" name="pDel" value="1" title="否">

                                        <#else >
                                            ${(data.PDEL)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pDefaultvalue'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">默认值：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pDefaultvalue" id="pDefaultvalue" lay-verify="required"
                                                   placeholder="" value="${(data.PDEFAULTVALUE)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PDEFAULTVALUE)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pUser'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">创建人：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pUser" id="pUser" lay-verify="required"
                                                   placeholder="" value="${(data.PUSER)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PUSER)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pTime'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">创建时间：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pTime" id="pTime" lay-verify="required"
                                                   placeholder="" value="${(data.pTime)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.pTime)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='pSort'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">排序：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="pSort" id="pSort" lay-verify="required"
                                                   placeholder="" value="${(data.PSORT)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PSORT)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>

                            <#if param.pId=='remark'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">备注：</label>
                                   <div class="layui-input-block">
                                <#if typeModel=='add'|| typeModel=='edit'>
                                       <textarea name="other" style="height: 200px" id="remark" name="remark"
                                                 placeholder=""
                                                 class="layui-textarea">${(data.REMARK)!""}</textarea>
                                <#else >
                                    ${(data.REMARK)!""}
                                </#if>
                                   </div>
                               </div>

                            </#if>
                        </#list>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <#if typeModel=='add'|| typeModel=='edit'>
                                    <button class="layui-btn" lay-submit lay-filter="component-form-element">立即提交</button>
                                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                               </#if>
                                <button type="button" class="layui-btn" id="close">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="/static/component/lib/layui/layui.js"></script>
<script>
    layui.config({
        base: '/static/' //静态资源所在路径
    }).use(['form', 'layer'], function () {
        var $ = layui.$
                , form = layui.form;
        // 数据提交
        form.on('submit(component-form-element)', function (data) {
            var typeModel = $("#typeModel").val();
            var menuCode = $("#menuCode").val();
            $.ajax({
                url: '/' + menuCode + '/' + typeModel,
                data: JSON.parse(JSON.stringify(data.field)),
                type: 'post',
                success: function(result) {
                    if (result.code == '0') {
                        layer.msg('保存成功!',{icon:1},function () {
                            window.parent.location.reload();
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        })
                    }
                },
                error: function (result) {

                }
            })

            return false;
        });

        $("#close").click(function () {
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        })
    });
</script>
</body>
</html>