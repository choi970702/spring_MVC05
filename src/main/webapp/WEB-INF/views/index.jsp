<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{width: 600px; margin: 0 auto; border-collapse: collapse;}
	table, th, td
	{
		border: 1px solid gray;
		text-align: center;
	}
	fieldset{width: 600px; margin: auto;}
	div{margin: auto;}
	input{padding: 5px;}
</style>
</head>
<body>
	<div>
		<form action="res.do">
			<fieldset>
				<label>계산기</label>
				<table>
					<tbody>
						<tr>
							<td colspan="2">
								<input type="radio" name="oper" value="+">더하기
								<input type="radio" name="oper" value="-">빼기
								<input type="radio" name="oper" value="*">곱하기
								<input type="radio" name="oper" value="/">나누기
							</td>
						</tr>
						<tr>
							<td><input type="number" name="a" placeholder="숫자입력"></td>
							<td>
								<input type="number" name="b" placeholder="숫자입력">
								<input type="submit" value="결과보기">
							</td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</form>
	</div>
</body>
</html>