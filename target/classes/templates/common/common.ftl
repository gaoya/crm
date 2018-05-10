<#macro header title>
    <head>
        <meta charset="utf-8">
        <title>${title}</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <link rel="stylesheet" href="/static/component/lib/layui/css/layui.css" media="all">
        <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
        <link rel="stylesheet" href="/static/font-awesome-4.7.0/css/font-awesome.css">
        <link rel="stylesheet" href="/static/css/app.css" media="all">
    </head>
</#macro>

<#macro js >
    <script src="/static/js/jquery-3.3.1.js" charset="utf-8"></script>
    <script src="/static/component/lib/layui/layui.js" charset="utf-8"></script>
    <script src="/static/js/table.js" charset="utf-8"></script>
</#macro>

<#macro footer>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        2017 &copy;
        <a href="http://kit.zhengjinfan.cn/">kit.zhengjinfan.cn/</a> MIT license
    </div>
</#macro>

