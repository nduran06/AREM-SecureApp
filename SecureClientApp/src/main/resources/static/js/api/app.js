var apiclient = apiclient;
var app = (function () {

	var token;
	
	var prueba = function(){
		alert("esto es una prueba")
	}
	    
	var loginUser = function(username, pass) {
		var user = {
			user : username,
			password : pass,
			token : ""
		};
		apiclient.loginUser(JSON.stringify(user), printAns);
	}
	
	var printAns=function(ans){
		token=ans;
		apiclient.getService(ans);
	}

    return {
    	loginUser : loginUser,
		prueba: prueba
    };
})();