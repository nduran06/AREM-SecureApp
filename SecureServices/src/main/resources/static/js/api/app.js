var apiclient = apiclient;
var app = (function () {

	var con = 0;

	var prueba = function () {
		alert("esto es una prueba")
	}


	var hiddenResult = function (number) {
		if (con<=2) {
			var el = document.getElementById("resultDiv");
			el.style.display = (el.style.display == 'none') ? 'block' : 'none';
			con++;
		}

		getSquare(number);
	}

	var onload = function () {
		hideBlue();
	}

	var hideBlue = function () {
		$('#hideB').click();
		con++;

	}

	var setResultValue=function(result){
		$("#result").text(result);
	}

	var getSquare = function (number) {
		apiclient.getSquare(number, setResultValue);
	}

	return {
		onload: onload,
		hideBlue: hideBlue,
		hiddenResult: hiddenResult,
		getSquare: getSquare,
		prueba: prueba
	};
})();