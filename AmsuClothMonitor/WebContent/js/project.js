$(document).ready(
			function() {
				//alert("ss");
				
				var height = $(window).height();
				//alert(height); 
				$('.page_head').height(height*0.1);
				$('.page_body').height(height*0.8);
				$('.page_foot').height(height*0.1);
				
				
				$.ajax({
					url : "http://localhost:8080/AmsuClothMonitor/UserInfoAction",
					type : "post",
					data:{
						"parm" : "hhhhh"
					},
					dataType : "text",//设置需要返回的数据类型
					success : processResponse,  
					error: function(data) {
						 alert("失败"+data);
					}
				});
				
				function processResponse(data){
					//alert("成功 "+data);
					var json_data = eval("(" + data + ")");
				    //alert("成功 "+json_data.userList[0].iconUrl);
				    
				    var htmlList = '',
				    htmlTemp = $("#list_box script[data-id='list_tpl']").html();
				    
				    json_data.userList.forEach(function(object) {
				        htmlList += htmlTemp.tmp(object);
				    });

				    $("#list_box").html(htmlList);
				}  	
			});
			
			String.prototype.tmp = function(obj) {
				    return this.replace(/\$\w+\$/g, function(matchs) {
				        var returns = obj[matchs.replace(/\$/g, "")];
				        return (returns + "") == "undefined"? "": returns;
				    });
				};

