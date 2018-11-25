<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page isELIgnored="false"%>


<div style="margin:0px auto; width:500px">


<form action="updateStudent" method="post">

name: <input name="student.name" value="${student.name}"> <br>
n_um: <input name="student.num" value="${student.num}"> <br>

<input name="student.id" type="hidden" value="${student.id}"> 
<button type="submit">提交</button>

</form>
</div>