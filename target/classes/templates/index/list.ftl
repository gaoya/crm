<!DOCTYPE html  >
<html>
<#import "/common/common.ftl" as common/>
<#import "/common/list-table.ftl" as ltable/>
<@common.header '系统用户表'/>
<body style="width:95%;padding:0 15px">
<@ltable.search/>
<!-- table中内部操作 -->
<@ltable.innerToolsBar/>
<@common.js/>
<@ltable.table '/${menuType}/list'/>
<script>
    initTable('/${menuType}')
</script>
</body>
</html>