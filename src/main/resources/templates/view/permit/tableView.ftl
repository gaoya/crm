<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>表单元素</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
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
                            <#if param.pId=='permitNo'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">权限编号：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add' || typeModel=='edit'>
                                            <input type="text" name="permitNo" id="permitNo" lay-verify="required"
                                                   placeholder=""
                                                   autocomplete="off" class="layui-input" value="${(data.PERMITNO)!""}">
                                        <#else >
                                            ${(data.PERMITNO)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='permitName'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">权限名称：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="permitName" id="permitName" lay-verify="required"
                                                   placeholder="" value="${(data.PERMITNAME)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PERMITNAME)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='permitAlias'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">权限别名：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="permitAlias" id="permitAlias" lay-verify="required"
                                                   placeholder="" value="${(data.PERMITALIAS)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PERMITALIAS)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='permitCode'>
                             <div class="layui-form-item">
                                 <label class="layui-form-label">权限编码：</label>
                                 <div class="layui-input-block">
                                    <#if typeModel=='add'|| typeModel=='edit'>
                                        <input type="text" name="permitCode" id="permitCode" lay-verify="required"
                                               placeholder="" value="${(data.PERMITCODE)!""}"
                                               autocomplete="off" class="layui-input">
                                    <#else >
                                        ${(data.PERMITCODE)!""}
                                    </#if>
                                 </div>
                             </div>
                            </#if>
                            <#if param.pId=='permitIntroduction'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">权限介绍：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="permitIntroduction" id="permitIntroduction" lay-verify="required"
                                                   placeholder="" value="${(data.PERMITINTRODUCTION)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.PERMITINTRODUCTION)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='useFlag'>
                            <div class="layui-form-item">
                                <label class="layui-form-label">是否使用：</label>
                                <div class="layui-input-block">
                                <#if typeModel=='add'|| typeModel=='edit'>
                                    <input type="radio" name="useFlag" value="0" title="是" checked>
                                    <input type="radio" name="useFlag" value="1" title="否">
                                <#else >
                                    ${(data.USEFLAG)!""}
                                </#if>
                                </div>
                            </div>
                            </#if>
                            <#if param.pId=='delFlag'>
                            <div class="layui-form-item">
                                <label class="layui-form-label">是否删除：</label>
                                <div class="layui-input-block">
                                <#if typeModel=='add'|| typeModel=='edit'>
                                    <input type="radio" name="delFlag" value="0" title="是" checked>
                                    <input type="radio" name="delFlag" value="1" title="否">
                                <#else >
                                    ${(data.DELFLAG)!""}
                                </#if>
                                </div>
                            </div>
                            </#if>
                            <#if param.pId=='createUser'>
                            <div class="layui-form-item">
                                <label class="layui-form-label">创建人：</label>
                                <div class="layui-input-block">
                                <#if typeModel=='add'|| typeModel=='edit'>
                                    <input type="text" name="createUser" id="createUser" lay-verify="required"
                                           placeholder="" value="${(data.CREATEUSER)!""}"
                                           autocomplete="off" class="layui-input">
                                <#else >
                                    ${(data.CREATEUSER)!""}
                                </#if>
                                </div>
                            </div>
                            </#if>
                            <#if param.pId=='createTime'>
                            <div class="layui-form-item">
                                <label class="layui-form-label">创建时间：</label>
                                <div class="layui-input-block">
                                <#if typeModel=='add'|| typeModel=='edit'>
                                    <input type="text" name="createTime" id="createTime" lay-verify="required"
                                           placeholder="" value="${(data.CREATETIME)!""}"
                                           autocomplete="off" class="layui-input">
                                <#else >
                                    ${(data.CREATETIME)!""}
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