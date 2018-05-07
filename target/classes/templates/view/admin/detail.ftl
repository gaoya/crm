<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="/static/component/css/font.css">
    <link rel="stylesheet" href="/static/component/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/component/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/component/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form class="layui-form">
            <#list detailData as detail>
                <div class="layui-form-item">
                    <!-- 提示标签-->
                    <label for="${detail.pId}" class="layui-form-label">
                        ${detail.pAddUpdateLabel}
                        ${detail.pLabel}
                    </label>
                    <!-- 输入信息-->
                    <div class="layui-input-inline">
                        ${detail.pAdddata}
                    </div>
                    <!-- 提示信息 -->
                    <div class="layui-form-mid layui-word-aux">
                        ${detail.pAddUpdateMsg}
                    </div>
                </div>
            </#list>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" id="closeWindows">
                关闭
            </button>
        </div>
    </form>
</div>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
                , layer = layui.layer;
        //关闭

        form.on('submit(close)', function (data) {
            // 获得frame索引
            var index = parent.layer.getFrameIndex(window.name);
            //关闭当前frame
            // parent.layer.close(index);
            layer.close(index);
        });
    });
</script>
</body>

</html>