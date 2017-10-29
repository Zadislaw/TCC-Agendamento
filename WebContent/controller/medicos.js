var medicosModulo = angular.module('medicosModulo',[]);

medicosModulo.controller("medicosController", function ($scope, $http){
	
	urlMedico = 'http://localhost:8080/AgendamentoHttpJax/rest/medicos';
		$scope.listarMedicos = function(){
			$http.get(urlMedico).success(function(medicos){
				$scope.medicos = medicos;
		
			}).error (function (erro){
				alert(erro);
			});
   	
		}	
		//executa
		$scope.listarMedicos();
});