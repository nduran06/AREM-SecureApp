var apiclient = (function () {
	var appUrl = "http://localhost:8080";
	return {

		loginUser: function (user, callback) {
			alert(user)
			$.ajax({
				url: appUrl + "/client/user",
				type: 'POST',
				data: user,
				contentType: "application/json",
				success: function (respuesta) {
					callback(respuesta);
				},
				error: function (res) {
					alert("error: " + res)
				}
			});

		},

		getService: function (token) {
			jQuery.ajax({
				beforeSend: function (request) {
					request.setRequestHeader("Authorization", token);
				},
				url: appUrl + "/client/hello",
				type: "GET",
				success:function(res){
					alert(res)					
					location.replace("http://localhost:8080/client/hello");

				}

			});
		}



	};
})();