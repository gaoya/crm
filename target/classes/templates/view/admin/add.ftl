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
                <input type="hidden" id="id" name="id" value="${(data.id)!""}">
                <div class="layui-card">
                    <div class="layui-card-header">基本信息</div>
                    <div class="layui-card-body">
                        <#list paramsData as param>
                            <#if param.pId=='name'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">姓名：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add' || typeModel=='edit'>
                                            <input type="text" name="name" id="name" lay-verify="required"
                                                   placeholder=""
                                                   autocomplete="off" class="layui-input" value="${(data.name)!""}">
                                        <#else >
                                            ${(data.name)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='age'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">年龄：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="age" id="age" lay-verify="required|number"
                                                   placeholder="" value="${(data.age)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.age)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='phone'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">手机号码：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="phone" id="phone" lay-verify="required|number"
                                                   placeholder="" value="${(data.phone)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.phone)!""}
                                        </#if>
                                    </div>
                                </div>
                            </#if>
                            <#if param.pId=='address'>
                             <div class="layui-form-item">
                                 <label class="layui-form-label">地址：</label>
                                 <div class="layui-input-block">
                                    <#if typeModel=='add'|| typeModel=='edit'>
                                        <input type="text" name="address" id="address" lay-verify="required"
                                               placeholder="" value="${(data.address)!""}"
                                               autocomplete="off" class="layui-input">
                                    <#else >
                                        ${(data.address)!""}
                                    </#if>
                                 </div>
                             </div>
                            </#if>
                            <#if param.pId=='email'>
                               <div class="layui-form-item">
                                   <label class="layui-form-label">Email：</label>
                                   <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="email" id="email" lay-verify="required"
                                                   placeholder="" value="${(data.email)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.email)!""}
                                        </#if>
                                   </div>
                               </div>
                            </#if>
                            <#if param.pId=='qq'>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">QQ：</label>
                                    <div class="layui-input-block">
                                        <#if typeModel=='add'|| typeModel=='edit'>
                                            <input type="text" name="qq" id="qq" lay-verify="required"
                                                   placeholder="" value="${(data.qq)!""}"
                                                   autocomplete="off" class="layui-input">
                                        <#else >
                                            ${(data.qq)!""}
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
                                    ${(data.useFlag)!""}
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
                                    ${(data.delFlag)!""}
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
                                           placeholder="" value="${(data.createUser)!""}"
                                           autocomplete="off" class="layui-input">
                                <#else >
                                    ${(data.createUser)!""}
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
                                           placeholder="" value="${(data.createTime)!""}"
                                           autocomplete="off" class="layui-input">
                                <#else >
                                    ${(data.createTime)!""}
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
                                                 class="layui-textarea">${(data.remark)!""}</textarea>
                                <#else >
                                    ${(data.remark)!""}
                                </#if>
                                   </div>
                               </div>

                            </#if>
                        </#list>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="component-form-element">立即提交</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
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
            layer.msg(JSON.stringify(data.field));
            $.ajax({
                url: '/admin/insert',
                data: JSON.parse(JSON.stringify(data.field)),
                type: 'post',
                success: function(result) {
                    layer.msg(result);
                },
                error: function (result) {

                }

            })

            return false;
        });
    });
</script>
</body>
</html>