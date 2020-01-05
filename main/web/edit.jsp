<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form  action="<c:url value="/order/updateOrder.action" />" method="post" enctype="multipart/form-data">
<table border="1" width="60%">
    <tr>
       <td>订单号</td>
        <td><input type="text" name="torder.id" value="${torder.id}"/> </td>
        <input type="hidden" name="torder.uid" value="${torder.uid}"/>
    </tr>
    <tr>
       <td>商品图片</td>
        <td>
            <c:if test="${torder.pic!=null}">
                <img src="${pageContext.request.contextPath }/images/${torder.pic}" width="100" height="100"/>
                <br>
            </c:if>

            <input type="file" name="picFile"/>
        </td>
    </tr>
    <tr>
        <td>名称</td>
        <td><input type="text" name="torder.note" value="${torder.note}"/> </td>
    </tr>
    <tr>
        <td>时间</td>
        <td><input type="text" name="torder.createTime"
                   value="<fmt:formatDate value="${torder.createTime}"/>"/> </td>
    </tr>
    <tr>
        <td><input type="submit"  value="修改"/> </td>
    </tr>
</table>
</form>
</body>
</html>
