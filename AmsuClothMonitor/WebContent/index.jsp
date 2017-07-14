<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  

<!DOCTYPE html>
<html>
<head>

	
<meta charset="utf-8">
<title>智能运动衣监控</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/project.js"></script>
<link href="css/project.css" rel="stylesheet" />
<link rel="icon" href="${pageContext.request.contextPath}/images/logo_icon.png" type="image/x-icon"/>





</head>
	
<body>
	<div class="page_head">
		<h2 >智能运动衣监控 <h2><s:property value="message"/></h2>  </h2>
	</div>

	<div class="page_body">
		<div class="body_left">
			
		</div>
		<div class="body_right">
			    <div class="list_box" id="list_box">
			        <script type="text/template" data-id="list_tpl">
			            <div class="right_icon_list_item">
			                <img src="$iconUrl$" class="right_usericon" />
			                <p>$username$</p>
			            </div>
			        </script>
			    </div>
			</div>

		</div>
	</div>

	<div class="page_foot">

	</div>
	
	 
</body>

</html>
