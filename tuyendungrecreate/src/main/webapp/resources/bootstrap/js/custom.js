$(".nopHoSo").click(function(){
	debugger;
	var maTinTuyenDung = $("#maTinTuyenDung").val();
	$.ajax({
		url:"http://localhost:8084/tuyendungrecreate/apiController",
		type:"POST",
		data: {
			maTinTuyenDung:maTinTuyenDung
		},
		success:function(value){
			$('.nopHoSo').attr("disabled", "disabled");
		}
	})
});

$("#viecquantam").click(function(event){
	event.preventDefault();
	var maTinTuyenDung = $("#maTinTuyenDung").val();
	$.ajax({
		url:"http://localhost:8084/tuyendungrecreate/apiController/quantam",
		type:"POST",
		data: {
			maTinTuyenDung:maTinTuyenDung
		},
		success:function(value){}
	})
});