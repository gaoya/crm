<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org">
<#import "/common/common.ftl" as common/>
<@common.header '首页'/>
<#--<head>-->

    <#--<meta charset="utf-8">-->
    <#--<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">-->
    <#--<title>KIT ADMIN</title>-->
    <#--<link rel="stylesheet" href="/static/plugins/layui/css/layui.css" media="all">-->
    <#--<link rel="stylesheet" href="/static/font-awesome-4.7.0/css/font-awesome.css" media="all">-->
    <#--<link rel="stylesheet" href="/static/css/app.css" media="all">-->
<#--</head>-->

<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">KIT ADMIN</div>
            <div class="layui-logo kit-logo-mobile">K</div>
            <ul class="layui-nav layui-layout-left kit-nav">
                <li class="layui-nav-item"><a href="javascript:;">控制台</a></li>
                <li class="layui-nav-item"><a href="javascript:;">商品管理</a></li>
                <li class="layui-nav-item"><a href="javascript:;" id="pay"><i class="fa fa-gratipay" aria-hidden="true"></i> 捐赠我</a></li>
                <li class="layui-nav-item">
                    <a href="javascript:;">其它系统</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">邮件管理</a></dd>
                        <dd><a href="javascript:;">消息管理</a></dd>
                        <dd><a href="javascript:;">授权管理</a></dd>
                    </dl>
                </li>
            </ul>
            <ul class="layui-nav layui-layout-right kit-nav">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://m.zhengjinfan.cn/images/0.jpg" class="layui-nav-img"> Van
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">基本资料</a></dd>
                        <dd><a href="javascript:;">安全设置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="javascript:window.location.href='logout';"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black kit-side">
            <div class="layui-side-scroll">
                <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 用户管理</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" data-url="/admin/tableList?_urlP=admin" data-icon="fa-user" data-title="系统管理员" kit-target data-id="1"><i class="fa fa-user"></i>&nbsp;&nbsp;<span>系统管理员</span></a></dd>
                            <dd><a href="javascript:;" data-url="/role/tableList?_urlP=role" data-icon="fa-user" data-title="系统角色" kit-target data-id="2"><i class="fa fa-user"></i>&nbsp;&nbsp;<span>系统角色</span></a></dd>
                            <dd><a href="javascript:;" data-url="/permit/tableList?_urlP=permit" data-icon="fa-user" data-title="系统权限" kit-target data-id="3"><i class="fa fa-user"></i>&nbsp;&nbsp;<span>系统权限</span></a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 系统设置</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" data-url="/showParam/tableList?_urlP=showParam" data-icon="fa-user" data-title="系统设置" kit-target data-id="4"><i class="fa fa-user"></i>&nbsp;&nbsp;<span>系统设置</span></a></dd>
                        </dl>
                    </li>


                    <li class="layui-nav-item">
                        <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 组件</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" kit-target data-options="{url:'navbar.html',icon:'&#xe658;',title:'Navbar',id:'6'}"><i class="layui-icon">&#xe658;</i><span> Navbar</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'tab.html',icon:'&#xe658;',title:'TAB',id:'7'}"><i class="layui-icon">&#xe658;</i><span> Tab</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'onelevel.html',icon:'&#xe658;',title:'OneLevel',id:'50'}"><i class="layui-icon">&#xe658;</i><span> OneLevel</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'app.html',icon:'&#xe658;',title:'App',id:'8'}"><i class="layui-icon">&#xe658;</i><span> app.js主入口</span></a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" data-url="/components/table/table.html" data-name="table" kit-loader><i class="fa fa-plug" aria-hidden="true"></i><span> 表格(page)</span></a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" data-url="/views/form.html" data-name="form" kit-loader><i class="fa fa-plug" aria-hidden="true"></i><span> 表单(page)</span></a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="layui-body" id="container">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">主体内容加载中,请稍等...</div>
        </div>
        <@common.footer/>
    </div>
    <@common.js/>
    <script>
        var message;
        layui.config({
            base: '/static/js/'
        }).use(['app', 'message'], function() {
            var app = layui.app,
                $ = layui.jquery,
                layer = layui.layer;
            //将message设置为全局以便子页面调用
            message = layui.message;
            //主入口
            app.set({
                type: 'iframe'
            }).init();
            $('#pay').on('click', function() {
                layer.open({
                    title: false,
                    type: 1,
                    content: '<img src="/static/images/pay.png" />',
                    area: ['500px', '250px'],
                    shadeClose: true
                });
            });
        });
    </script>
</body>

</html>