<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


		<h1>var, let, const</h1>
		
		<h2> 변수 선언 시 사용할 수 있는 키워드들</h2>
		
		<button onclick="defDeclare()">버튼</button>
		
		
		<script>
			function defDeclare(){
				
				var userId = 'user01';
				console.log(userId);
				
				var userId = 'user02';
				console.log(userId);
				
				userId = 'user03';
				console.log(userId);
				
				console.log('------');
				
				let userName = '홍길동';
				console.log(userName);
				
				console.lot('--------');
				
				const userPwd 123;
				console.log(123);
			
				
				const titleEl = ducument.getElementById('title');
				
			}
		
		
		</script>
		
		<h1 id="title"> 요소 </h1>

		<button onclick="keywordScope()">버튼데스</button>
		
		<script>
		
			function keywordScope() {
				
				if(1){
					let gender = 'M';
					const hobby = '취미';
					
			
				
				
				}
				
				
				for(var i=0; i< 5; i++){
					
				}
				
				console.log(i);
			}
			
			
		
		</script>
</body>
</html>