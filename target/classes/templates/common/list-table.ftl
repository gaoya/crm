<#macro search>
<div class="searchBar" style="padding-top: 20px; padding-bottom: 20px">
    <form id="searchForm">
        <div class="layui-form-item">
            <#list searchData as search>
                <div class="layui-inline">
                    <label class="layui-form-label">${search.pLabel}</label>
                    <div class="layui-input-inline">
                        ${search.pSearchdata}
                    </div>
                </div>
            </#list>
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
                <#list titleData as title>
                    <th lay-data="${title.pListdata}">${title.pLabel}</th>
                </#list>
                <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#toolBar'}"></th>
            </tr>
            </thead>
        </table>
</#macro>