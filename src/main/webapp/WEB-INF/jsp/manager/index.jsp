<%--
  Created by IntelliJ IDEA.
  User: chenjunxu
  Date: 2017/8/18
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <%@include file="/WEB-INF/include/include.jsp"%>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
<%@include file="/WEB-INF/include/framework.jsp"%>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <iframe id="index-body" name="index-body" src="${apps}/manager/index/index" width="100%" height="94%" style="border: none"></iframe>
        </div>
    </div>

<%@include file="/WEB-INF/include/foot.jsp"%>
</div>
</body>
</html>
