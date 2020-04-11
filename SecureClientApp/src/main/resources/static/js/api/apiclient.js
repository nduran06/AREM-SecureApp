var apiclient = (function () {
	var appUrl = "https://localhost:8080/client";
	var serviceUrl = "https://localhost:14790";

	return {

		loginUser: function (user, callback) {
			$.ajax({
				url: appUrl + "/user",
				type: 'POST',
				data: user,
				contentType: "application/json",
				success: function (respuesta) {
					callback(respuesta);
				},
				error: function () {
					alert("Error: " + "You are not authenticated")
				}
			})
		},

		getService: function (token) {
			jQuery.ajax({
				beforeSend: function (request) {
					request.setRequestHeader("Authorization", token);
				},
				url: appUrl + "/hello",
				type: "GET",
				success: function (res) {
					alert(res)
					location.replace(serviceUrl + "/square.html");
				},
				error: function () {
					location.replace(appUrl + "/notFound");

				}

			});
		}

	};
})();