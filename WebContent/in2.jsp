<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	function add(){
		alert("OK!");
		var url = "<%=request.getContextPath()%>/test";
		var args = null ; //{"brand":brand , "desc":desc};	
		
		$.post(url,args,function(data){
			
			alert(data);
			/* if(data == "1"){
    	    	alert("提示消息");
    	    }else{
    	      alert("操作失败，该用户名已存在");
    	    } */
			
		});
	}
</script>

</head>
<body>
<h1>Hello~</h1>
<input type="Button" onclick="add()" value="Button">

</body>
</html>