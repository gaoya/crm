


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>表单元素</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="/static/component/lib/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/static/component/lib/layui/css/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">

            <div class="layui-card">
                <div class="layui-card-header">响应式组合</div>
                <div class="layui-card-body">
                    <form class="layui-form" action="" lay-filter="component-form-element">
                            <div class="layui-form-item">
                                <label class="layui-form-label">员工姓名：</label>
                                <div class="layui-input-block">
                                    <input type="text" name="fullname" lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">技术工种：</label>
                                <div class="layui-input-block">
                                    <select name="type" lay-verify="required" lay-filter="aihao">
                                        <option value=""></option>
                                        <option value="0">前端工程师</option>
                                        <option value="1">Node.js工程师</option>
                                        <option value="2">PHP工程师</option>
                                        <option value="3">Java工程师</option>
                                        <option value="4">运维</option>
                                        <option value="4">视觉设计师</option>
                                    </select>
                                </div>
                            </div>

                        <div class="layui-form-item">
                            <label class="layui-form-label">兴趣爱好：</label>
                            <div class="layui-input-block">
                                <input type="checkbox" name="interest[write]" title="写作">
                                <input type="checkbox" name="interest[read]" title="阅读">
                                <input type="checkbox" name="interest[code]" title="代码" checked>
                                <input type="checkbox" name="interest[dreaming]" title="做梦">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">是否婚姻：</label>
                            <div class="layui-input-block">
                                <input type="checkbox" name="marriage" lay-skin="switch" lay-text="是|否">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">所属职称：</label>
                            <div class="layui-input-block">
                                <input type="radio" name="role" value="" title="经理">
                                <input type="radio" name="role" value="" title="主管">
                                <input type="radio" name="role" value="" title="码农" checked>
                                <input type="radio" name="role" value="" title="端水">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">其它信息：</label>
                            <div class="layui-input-block">
                                <textarea name="other" placeholder="" class="layui-textarea"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label"> </label>
                            <div class="layui-input-block">
                                <input type="checkbox" name="agreement" title="同意" lay-skin="primary" checked>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="component-form-element">立即提交</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="/static/component/lib/layui/layui.js"></script>
<script>
    layui.config({
        base: '/static/' //静态资源所在路径
    }).use(['form', 'layer'], function(){
        var $ = layui.$
                ,admin = layui.admin
                ,element = layui.element
                ,form = layui.form;

        form.render(null, 'component-form-element');
        element.render('breadcrumb', 'breadcrumb');

        form.on('submit(component-form-element)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>