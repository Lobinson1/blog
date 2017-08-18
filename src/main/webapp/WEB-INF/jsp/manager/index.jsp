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
<body>
    <div class="layui-main">
        <div class="layui-tab-bar">
            <ul class="layui-nav" lay-filter="">
                <li class="layui-nav-item"><a href="">最新活动</a></li>
                <li class="layui-nav-item layui-this"><a href="">产品</a></li>
                <li class="layui-nav-item"><a href="">大数据</a></li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child"> <!-- 二级菜单 -->
                        <dd><a href="">移动模块</a></dd>
                        <dd><a href="">后台模版</a></dd>
                        <dd><a href="">电商平台</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">社区</a></li>
            </ul>
        </div>
    </div>
</body>
</html>
