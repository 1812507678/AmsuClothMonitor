$(document).ready(
			function() {
				//alert("ss");
				
				var height = $(window).height();
				//alert(height); 
				$('.page_head').height(height*0.1);
				$('.page_body').height(height*0.8);
				$('.page_foot').height(height*0.1);
				
				alert( txt);
				/*$.ajax({
					url : "http://localhost:8080/AmsuClothMonitor/UserInfoAction",
					data   : {
						"pageNumber" : currIndex
					},
					type : "post",
					dataType : "json",//设置需要返回的数据类型
					success : function(data){
						alert(data);
						$.each(data.list,function(index,value){
							$(".consult_article_text").children("a").get(index).href=value.link;
							$("#cdiv"+index).children("div").get(0).innerHTML=value.monthAndDay;
							$("#cdiv"+index).children("div").get(1).innerHTML=value.year;
							$("#cdiv"+index).children("div").get(2).innerHTML=value.title;
							$("#cdiv"+index).children("div").get(3).innerHTML=value.synopsis;
						})
						
					},
					error : function(data) {
						alert(data);
                    }
				});*/

				
				/*var json_data = {
					    page: "1",
					    records: "3",
					    data: [{
					        url: "images/1.jpg",
					        content: "content1"
					    },{
					         url: "images/2.jpg",
					        content: "content2"
					    },{
					         url: "images/3.jpg",
					        content: "content3"
					    },{
					         url: "images/1.jpg",
					        content: "content4"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },{
					         url: "images/1.jpg",
					        content: "content5"
					    },]
					};
*/
				var htmlList = '',
			    htmlTemp = $("#list_box script[data-id='list_tpl']").html();
			    
			    json_data.data.forEach(function(object) {
			        htmlList += htmlTemp.tmp(object);
			    });

			    $("#list_box").html(htmlList);
								
			});
			
			String.prototype.tmp = function(obj) {
				    return this.replace(/\$\w+\$/g, function(matchs) {
				        var returns = obj[matchs.replace(/\$/g, "")];
				        return (returns + "") == "undefined"? "": returns;
				    });
				};

