<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="60%" cellpadding="0" cellspacing="0">
    <tr>
        <th>删除</th><th>id</th>
        <th>uid</th>
        <th>num</th>
        <th>createTime</th>
        <th>note</th>
        <th>操作</th>
    </tr>
    <form action="<c:url value="/delete.action" />" method="post">
    <c:forEach items="${list}" var="p" varStatus="status">
        <tr>
            <td><input type="checkbox" name="ids" value="${p.id}"/> </td>
            <td>${p.id}
                <input type="hidden" value="${p.id}" name="orderList[${status.index}].id"/> </td>
            <td>
                <input type="text" value="${p.uid}" name="orderList[${status.index}].uid"/></td>
            <td>
                <input type="text" value="${p.num}" name="orderList[${status.index}].num"/></td>
            <td>
                <input type="text" value="<fmt:formatDate value="${p.createTime}"/>" name="orderList[${status.index}].createTime"/>
            </td>
            <td>
                <input type="text" value="${p.note}" name="orderList[${status.index}].note"/></td>
            <td><a href="eidt.action?id=${p.id}">修改</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td><input type="submit" value="批量删除"/> </td>
        <td><input type="submit" value="批量修改"/> </td>
    </tr>
    </form>
</table>
</body>
</html>
