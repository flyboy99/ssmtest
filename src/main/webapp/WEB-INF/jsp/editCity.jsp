<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add or edit city page</title>
</head>
<body>
  <c:if test="${empty city}">
    <form action="addCity.jthml" method="post">
  </c:if>
  <c:if test="${not empty city}">
    <form action="updateCity.jthml" method="post">
      <input type="hidden" value="${city.id}" name="id">
  </c:if>
            <table>
               <tr>
                   <td>城市名：</td>
                   <td><input type="text" name="name" value="${city.name}"></td>
               </tr>
               <tr>
                   <td>编码：</td>
                   <td><input type="text" name="countrycode" value="${city.countrycode}"></td>
               </tr>
               <tr>
                  <td>district：</td>
                  <td><input type="text" name="district" value="${city.district}"></td>
               </tr>
               <tr>
                   <td>人口：</td>
                   <td><input type="text" name="population" value="${city.population}"></td>
               </tr>
               <tr>
                   <td colspan="2" align="center"><input type="submit" value="提交"></td>
               </tr>
            </table>
    </form>
</body>
</html>