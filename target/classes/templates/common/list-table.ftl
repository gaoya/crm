<#macro search>
<div class="searchBar" style="padding-top: 20px; padding-bottom: 20px">
    <form id="searchForm">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">多规则验证</label>
                <div class="layui-input-inline">
                    <input type="text" name="number" lay-verify="required|number" autocomplete="off"
                           class="layui-input" placeholder="">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">验证日期</label>
                <div class="layui-input-inline">
                    <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">验证链接</label>
                <div class="layui-input-inline">
                    <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
    </form>
    <button class="layui-btn" data-type="reload">搜索</button>
    <button class="layui-btn" data-type="add">新增</button>
    <button class="layui-btn" data-type="batchDel">批量删除</button>
</div>
</#macro>

<#-- table 内部 tool -->
<#macro innerToolsBar >
        <script type="text/html" id="toolBar">
            <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
            <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
            <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
        </script>
</#macro>

<#-- table -->
<#macro table listDataUrl >
        <table id="tableData" class="layui-table"
               lay-data="{cellMinWidth: 600, height:520, url:'${listDataUrl}', page:true}"
               lay-filter="tableLayFilter">
            <thead>
            <tr>
                <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
                <th lay-data="{field:'id', width: 80, sort: true, fixed: true}">ID</th>
                <th lay-data="{field:'username',width: 80, fixed: true}">用户名</th>
                <th lay-data="{field:'sex',  sort: true}">性别</th>
                <th lay-data="{field:'city'}">城市</th>
                <th lay-data="{field:'sign'}">签名</th>
                <th lay-data="{field:'experience', sort: true}">积分</th>
                <th lay-data="{field:'classify'}">职业</th>
                <th lay-data="{field:'wealth', sort: true}">财富</th>
                <th lay-data="{field:'score', width:80, sort: true, fixed: 'right'}">评分</th>
                <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#toolBar'}"></th>
            </tr>
            </thead>
        </table>
</#macro>