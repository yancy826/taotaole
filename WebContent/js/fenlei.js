$('.has_children button').click(function(){
	if($(this).parent().hasClass("highlight")){
		$(this).parent().children("button").css("opacity","0.5");
		$(this).parent().removeClass("highlight").children("a").hide();
	}else{
		$(this).parent().children("button").css("opacity","1.0");
		$(this).parent().addClass("highlight").children("a").show()
		.end().siblings().removeClass("highlight").children("a").hide();
	}
})
