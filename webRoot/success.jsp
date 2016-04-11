<%@ page language="java" import="java.util.*"contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>李璇4945----考试专用</title>
  </head>
  
  <body>
    用户登陆成功！！！！！！！！！！！！！！！！！！
    请转帐！！！！！！！
    您的金额为：
    
   <s:form action="taccountTransfer" method="post" namespace="/">
       <table bgcolor="lightgreen" align="center"  width="350px">
       <tr>
       <td colspan="2"><h1 align="left">用户转账</h1></td>
       </tr>
   		<tr>
   		<td></td>
   		<td><s:textfield name="account2.accountNo" label="转账帐号"/></td>
   		</tr>
   		<tr>
   		<td></td>
   		<td><s:textfield name="account2.accountName" label="转账账户名"/></td>
   		</tr>
   			<tr>
   		<td></td>
   		<td><s:textfield name="accountChange" label="转账金额"/>
   		 <input type="hidden" name="tuser.username" value="<s:property value='tuser.username'/>"> 
   		</td>
   		</tr>
   		<tr>
   		<td></td>
   		
   		</tr>
   		<tr>
   		<td><s:submit value="转账"/></td>
   		<td>注册---暂未实现</a></td>
   		</tr>
   		
   		</table>
   		</s:form>
    
    <s:debug></s:debug>
  </body>
</html>
