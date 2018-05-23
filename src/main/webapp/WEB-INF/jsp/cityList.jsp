<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User List</title>
</head>
<body>
<a href="addOrEditCity.jhtml"/>新加city</a>
<br/>
<br/>
<span >所有city</span>
<br/>
<br/>
    <table border="2px" width="800" >
       <tbody>
         <tr>
            <th>id</th>
            <th>名称</th>
            <th>countrycode</th>
            <th>district</th>
            <th>population</th>
            <th>操作</th>
         </tr>
         <c:forEach items="${list}" var="city">
            <tr>
              <td>${city.id}</td>
              <td>${city.name}</td>
              <td>${city.countrycode}</td>
              <td>${city.district}</td>
              <td>${city.population}</td>
              <td>
                 <a href="delCity.jhtml?id=${city.id}">删除</a>
                 <a href="addOrEditCity.jhtml?id=${city.id}">编辑</a>
              </td>
            </tr>
         </c:forEach>
       </tbody>
    </table>
</body>
</html>