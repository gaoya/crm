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
    <link rel="stylesheet" href="/static/css/admin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/component/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/css/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="layui-fluid">
    <div class="layui-col-md12">
        <div class="layui-card">
            <div class="layui-card-header">新增</div>
            <div class="layui-card-body layui-row layui-col-space10">
                <form class="layui-form">
                    <div class="layui-col-md6">

                            <!-- 提示标签-->
                            <label for="id" class="layui-form-label">
                                <span class="x-red">*</span>
                                id
                            </label>
                    </div>

                            <!-- 输入信息-->
                            <div class="layui-input-inline">
                                <input type="text" lay-verify="required|number" autocomplete="off"
                                       id="id" name="id" class="layui-input" placeholder="id">
                            </div>
                            <!-- 提示信息 -->
                            <div class="layui-form-mid layui-word-aux">
                                <span class="x-red">*</span>将会成为您唯一的登入名
                            </div>

                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="name" class="layui-form-label">
                            <span class="x-red">*</span>
                            name
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="name" name="name"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="age" class="layui-form-label">
                            <span class="x-red">*</span>
                            age
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="age" name="age"  class="layui-input" placeholder="age">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="phone" class="layui-form-label">
                            <span class="x-red">*</span>
                            phone
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="phone" name="phone"  class="layui-input" placeholder="phone">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="address" class="layui-form-label">
                            <span class="x-red">*</span>
                            address
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="address" name="address"  class="layui-input" placeholder="address">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="email" class="layui-form-label">
                            <span class="x-red">*</span>
                            email
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="email" name="email"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="qq" class="layui-form-label">
                            <span class="x-red">*</span>
                            qq
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="qq" name="qq"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="createTime" class="layui-form-label">
                            <span class="x-red">*</span>
                            createTime
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="createTime" name="createTime"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="createUser" class="layui-form-label">
                            <span class="x-red">*</span>
                            createUser
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="createUser" name="createUser"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="useFlag" class="layui-form-label">
                            <span class="x-red">*</span>
                            userFlag
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="useFlag" name="useFlag"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="delFlag" class="layui-form-label">
                            <span class="x-red">*</span>
                            delFlag
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="delFlag" name="delFlag"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-col-md12">
                    <div class="layui-form-item">
                        <!-- 提示标签-->
                        <label for="remark" class="layui-form-label">
                            <span class="x-red">*</span>
                            remark
                        </label>
                        <!-- 输入信息-->
                        <div class="layui-input-inline">
                            <input type="text" lay-verify="required|number" autocomplete="off"
                                   id="remark" name="remark"  class="layui-input" placeholder="name">
                        </div>
                        <!-- 提示信息 -->
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名
                        </div>
                    </div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                        </label>
                        <button class="layui-btn" lay-filter="add" lay-submit="">
                            增加
                        </button>
                    </div>
                </form>
            </div>
        </div>

    </div>

</div>
<script>

    $(function () {
        // $.ajax({     //得到url地址
        //     url : '/admin/'
        // }) ;
    });


    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
                , layer = layui.layer;

        // //自定义验证规则
        // form.verify({
        //   nikename: function(value){
        //     if(value.length < 5){
        //       return '昵称至少得5个字符啊';
        //     }
        //   }
        //   ,pass: [/(.+){6,12}$/, '密码必须6到12位']
        //   ,repass: function(value){
        //       if($('#L_pass').val()!=$('#L_repass').val()){
        //           return '两次密码不一致';
        //       }
        //   }
        // });

        //监听提交
        form.on('submit(add)', function (data) {
            console.log(data);
            //发异步，把数据提交给php
            layer.msg("增加成功", {icon: 6}, function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
        });


    });
</script>
</body>

</html>