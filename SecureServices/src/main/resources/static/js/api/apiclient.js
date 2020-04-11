var apiclient = (function () {
	var appUrl = "https://localhost:14790/math";
	return {
		getSquare: function (number, callback) {
			
			jQuery.ajax({
                url: appUrl + "/square?number="+number,
                success: function (result) {
                    callback(result);
                },
                async: true
            });

		}
	};
})();