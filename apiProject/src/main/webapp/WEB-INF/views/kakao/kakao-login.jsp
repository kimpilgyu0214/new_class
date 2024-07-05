<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그이느</title>
</head>

<style>
	a{
		display : inline-block;
	}
</style>
<body>

	<a id="login-btn">
		<img alt ="로그인 버튼" src ="resources/img/kakao_login_medium_narrow.png" >
	</a>
	
	<br><br>
	<button id="logout">로그아웃</button>
	
	${ loginUser.id }님 환영
	${ loginUser.nickName } 노노
	

	
	
	
	
	<script>
		document.getElementById('login-btn').onclick = () =>{
			location.href = 'https://kauth.kakao.com/oauth/authorize?' + 'client_id=6c35fcf6a3c71f8b6a46c65a8e55deb9' + '&redirect_uri=http://localhost/api/oauth' + '&response_type=code'
							+'&scope=profile_nickname,profile_image';
		}
		
		
		document.getElementById('login-btn').onclick = () =>{
			location.href = 'logout';
		
		
	
	</script>
	











<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>