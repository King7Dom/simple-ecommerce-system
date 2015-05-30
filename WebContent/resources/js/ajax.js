$(document).ready(function(){
	$("#catalogue").click(function(e) {
		e.preventDefault();
		$("#content").load($(this).attr("href"));
	});
	$("#orders").click(function(e) {
		e.preventDefault();
		$("#content").load($(this).attr("href"));
	});
});