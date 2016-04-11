<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>李璇4945----考试专用</title>
	</head>

	<body>
		<table align="center" width="800px">
			<tr>
				<td colspan="7">
					<h1 align="center">
						客户列表信息
					</h1>
				</td>
			</tr>
			<tr>
				<td>
					客户ID
				</td>
				<td>
					客户名称
				</td>
				<td>
					客户地址
				</td>
				<td>
					客户邮箱
				</td>
				<td>
					邮政编码
				</td>
				<td>
					修改
				</td>
				<td>
					删除
				</td>
			</tr>
			<s:iterator value="list" var="custom">
				<tr>
					<td>
						${custom.customid }

					</td>

					<td>
						${custom.cname}
					</td>

					<td>
						${custom.caddress}
					</td>

					<td>
						${custom.cemail}
					</td>

					<td>
						${custom.cpost}
					</td>
					<td>

						<a href="toUpdate?id=${custom.customid }">修改</a>

					</td>
					<td>
						<a href="del?id=${custom.customid }">删除</a>
					</td>
				</tr>
			</s:iterator>

		</table>

		<s:debug></s:debug>
	</body>
</html>
