<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page isELIgnored="false"%>


<div style="margin:0px auto; width:500px">
<table cellspacing="0" border="1" width="100%">
	<tr>
		<td>id</td>
		<td>name</td>
		<td>stu_num</td>
		<td>编辑</td>
		<td>删除</td>
		
	</tr>
	    	    
<s:iterator value="students" var="p">
	<tr>
		<td>${p.id}</td>
		<td>${p.name}</td>
		<td>${p.num}</td>
		<td><a href="editStudent?student.id=${p.id}">编辑</a></td>
		<td><a href="deleteStudent?student.id=${p.id}">删除</a></td>		
	</tr>
</s:iterator>

</table>

<br>
<br>

<form action="addStudent" method="post">

name: <input name="student.name"> <br>
n_um: <input name="student.num"> <br>
<button type="submit">提交</button>

</form>
</div>