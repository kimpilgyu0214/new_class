<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑모르</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
    	a{ 
    		text-decoration : none;
    		color : white;
    	}
    	
    	#kh-bg{
    		width : 800px;
    		height : 450px;
    		background-image : url('https://img1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/2YEF/image/AItVXMrmI1ktbeuv2GwME7x2LVw.jpg');
    		margin-top : 100px;
    		margin : auto;
    		background-repeat : no-reapeat;
    		background-size : cover;
    		border-radius:20px;
    	}
    	
    	.items{
    		width : 1000px;
    		margin : auto;
    		display : flex;
    		flex-wrap : wrap;
    		gap : 20px;
    		}
    </style>
</head>

<body>

	<nav class = "navbar navbar-expand-lg bg-dark">
	<div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://e7.pngegg.com/pngimages/373/372/png-clipart-logo-brand-rolex-watch-design-rolex-label-text.png" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
      rolex
    </a>
     <div class="container-fluid">
	    <form class="d-flex" role="search" >
	      <input class="form-control me-2" type="search" id = "keyword" placeholder="Search" aria-label="Search">
	      <button id="search-btn"  stytle = "width 300px;"  class="btn btn-outline-success" type="button">검색</button>
	    </form>
  </div>
  </div>
	</nav>
	
	<br>
	
	<div id="kh-bg">
	
	</div>
	
	<hr/>
	<br />
	<div id="total-count" style="display:none; padding : 30px; text-align:right;">
	</div>
	<br/>
	<br/> <br/>
	
	<button class ="btn btn-lg" style="background:lightgreen; color:white; font-weight:bold;" onclick="nextPage()">다음상품</button>	
	<div class = "items">
	
	
	</div>
	
	
	<script>
	
		$('#search-btn').click(() =>{
			searchItem();
		});
		
		  	function nextPage()
		  		startNo += 9;
		  		searchItem();
		
			var startNo = 1;
		
			function searchItem(){
				
				const $keyword = $('#keyword').val();
				
				$.ajax({
					url : 'product',
					type : 'get',
					data : {
						keyword : $keyword,
						start : startNo
					},
					success : product =>{
					
						#('#total-count').fadeOut(300)
						console.log(product);
						$('#totla-count').html('총<b>' + product.total + '</b>건의'
											+'<label style = "color:red; font-weight:bold;">' +$keyword +<'/label>이(가) 검색되었습니다')
											.fadeIn(1000);
						
						const items = product.items;
						
						let item = '';
						
						for(let i in items){
									item += '<div class="card" style="width: 18rem;">'
										+		 '<img src="' + items[i].image +'"class="card-img-top" alt="...">'
											+  '<div class="card-body">''
											  +  '<h5 class="card-title">' + items[i].brand + '</h5>''
											  +  '<p class="card-text">' + item[i].tile + '</p>''
											 + '</div>'
											 + '<ul class="list-group list-group-flush">'
											 +   '<li class="list-group-item">가격</li>'
											 +   '<li class="list-group-item">' +items[i].lprice '</li>''									  
											 + </ul>
											 + <div class="card-body">
											  +  <a href="#" class="card-link">Card link</a>
											  +  <a href="#" class="card-link">Another link</a>
											  </div>
											</div>						
							
						}
					}
					
				});		
				
			};
	
	</script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>