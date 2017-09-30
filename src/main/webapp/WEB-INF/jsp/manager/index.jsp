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
    <div class="layui-header">
        <div class="layui-logo">第一步</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="javascript:void(0);" nav-code="console">控制台</a></li>
            <li class="layui-nav-item"><a href="javascript:void(0);" nav-code="blog">博客管理</a></li>
            <li class="layui-nav-item"><a href="javascript:void(0);" nav-code="user">用户管理</a></li>
            <li class="layui-nav-item">
                <a href="javascript:void(0);">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:void(0);">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">小贤贤
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:void(0);">暂时不明</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:void(0);">列表一</a></dd>
                        <dd><a href="javascript:void(0);">列表二</a></dd>
                        <dd><a href="javascript:void(0);">列表三</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:void(0);">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:void(0);">列表一</a></dd>
                        <dd><a href="javascript:void(0);">列表二</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">发布商品</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;"><iframe id="index-body" name="index-body" src="http://www.baidu.com" width="100%" height="94%" style="border: none"></iframe></div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © lobinson.xin - 底部固定区域
    </div>
</div>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

        $(document).find("*[nav-code]").on('click', function () {
            var navCode = $(this).attr("nav-code");
            $("#index-body").attr("src", "${apps}/index/navCode?code="+navCode);
        })

    });
</script>
</body>
</html>
