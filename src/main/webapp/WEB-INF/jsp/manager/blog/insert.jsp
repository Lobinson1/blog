<%--
  Created by IntelliJ IDEA.
  User: chenjunxu
  Date: 2017/10/16
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建博客</title>
    <%@include file="/WEB-INF/include/include.jsp"%>
</head>
<body>
    <div class="layui-container">
        <div class="layui-row">
            <div class="layui-col-xs9 layui-col-sm9 layui-col-md11">
                <a href="javascript:window.history.back();" class="layui-btn-sm layui-btn">返回</a>
                <h2 class="title-right">新建博客</h2>
                <hr class="layui-bg-cyan">
                <form action="${apps}/manager/blog/insert" method="post" class="layui-form">
                    <div class="layui-form-item">
                        <label class="layui-form-label">标题</label>
                        <div class="layui-input-block">
                            <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">类型</label>
                        <div class="layui-input-block"></div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">正文</label>
                        <div class="layui-input-block">
                            <div id="editor"></div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="layui-col-xs3 layui-col-sm3 layui-col-md1">
            </div>
        </div>
    </div>

    <script type="text/javascript" src="${apps}/static/wangEditor/release/wangEditor.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor = new E("#editor");
    editor.create();

</script>
</body>
</html>
