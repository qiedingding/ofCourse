<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>李璇4945----考试专用</title>

		<script type="text/javascript" src="js/jquery-1.3.2.min.js">
</script>
		<script type="text/javascript" src="js/easy_validator.pack.js">
</script>
		<script type="text/javascript" src="js/jquery.bgiframe.min.js">
</script>

		<link href="css/validate.css" rel="stylesheet" type="text/css" />

	</head>

	<body>


		<!--  
		<form action="update" method="post">
			<table width="800" border="0" class="ad" cellpadding="0"
				cellspacing="1" bgcolor="#999999" id="testTable">
				<tr bgcolor="#ffffff">
					<td align="right" bgcolor="#EEEEEE" width="150px"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						客户名称 :
					</td>
					<td align="left"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						<input name="custom.cname" type="text" id="custom.cname"
							reg="^\w{1,100}$" tip="不能有重复的用户名" value="${custom.cname}"
							/>
							 url="validate_user"  
							url="validate_user.php"
							
						&nbsp; ( 6-20个字符)
					</td>
				</tr>
				<tr bgcolor="#ffffff">
					<td align="right" bgcolor="#EEEEEE" width="150px"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						客户地址:
					</td>
					<td align="left"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						<input name="custom.caddress" type="password" id="custom.caddress"
							value="${custom.caddress}" />
					</td>
				</tr>
				<tr bgcolor="#ffffff">
					<td align="right" bgcolor="#EEEEEE" width="150px"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						客户邮箱:
					</td>
					<td align="left"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						<input name="custom.caddress" type="text" id="custom.caddress"
							value="${custom.caddress}" />
					</td>
				</tr>
				<tr bgcolor="#ffffff">
					<td align="right" bgcolor="#EEEEEE" width="150px"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						custom.cpost:
					</td>
					<td align="left"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						<input name="custom.cpost" type="text" id="custom.cpost"
							reg="^\w{6}$" value="${custom.cpost}" tip="邮箱规范是6个数字" />
					</td>
				</tr>

				<tr bgcolor="#ffffff">
					<td colspan="2" align="left"
						style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
						<a href="findAll">取消修改</a>
						<input type="submit" name="submit" value=" 修改 " id="submit" />
					</td>
				</tr>
			</table>
		-->

		<s:form action="update" method="post">
		<table align="center" width="400px">
			<tr>
				<td colspan="2">
					<h1 align="center">
						客户修改
					</h1>
				</td>
			</tr>
			<tr>
				<td>
					客户名称
				</td>
				<td>
					<input type="text" name="custom.cname" value="${custom.cname}"
						tip="必填 不能为空" id="custom.cname" reg="^\w{1,100}\d+$"
					 />
					 <s:property value="is_is_exsit"/>
					 <!-- 	url="validate_user" -->

				</td>
			</tr>

			<tr>
				<td>

				</td>
				<td>
					<s:textfield name="custom.caddress" label="客户地址"
						value="%{custom.caddress}" />
				</td>
			</tr>
			<tr>
				<td>

				</td>
				<td>
					<s:textfield name="custom.cemail" label="客户邮箱"
						value="%{custom.cemail}" />
				</td>
			</tr>

			<tr>
				<td>
					邮箱
				</td>
				<td align="left"
					style="padding-left: 5px; padding-top: 4px; padding-bottom: 4px; padding-right: 18px;">
					<input name="custom.cpost" type="text" id="custom.cpost"
						reg="^\w{6}$" value="${custom.cpost}" tip="邮箱规范是6个数字" />
				</td>
			</tr>

			<tr>
				<td>
					<a href="findAll">取消修改${custom.customid}</a>
					<input type="hidden" name="custom.customid"
						value="${custom.customid}" />
					<s:submit value="修改"></s:submit>
				</td>
				<td>

				</td>
			</tr>


		</table>
		</s:form>
	</body>
</html>
