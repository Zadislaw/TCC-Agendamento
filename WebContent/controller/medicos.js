var medicosModulo = angular.module('medicosModulo',[]);

<<<<<<< HEAD
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
=======
medicosModulo.controller("medicosController", function ($scope){
   $scope.especialidades = [
    {cdEspecialidade: 1, nmEspecialidade:'Pediatria'},
    {cdEspecialidade: 2, nmEspecialidade:'Oftalmo'},
    {cdEspecialidade: 3, nmEspecialidade:'Psiquiatra'}
   ];

	$scope.medicos = [
		{crmMedico: 1, nmMedico:'Jorge',  Especialidade:{cdEspecialidade: 1, nmEspecialidade:'Pediatria'}},
		{crmMedico: 2, nmMedico:'Angela', Especialidade:{cdEspecialidade: 2, nmEspecialidade:'Oftalmo'}},
		{crmMedico: 3, nmMedico:'Brian',  Especialidade:{cdEspecialidade: 3, nmEspecialidade:'Psiquiatra'}}
	];

	$scope.selecionaMedico = function(medicoSelecionado){
		$scope.medico = medicoSelecionado;
	}

   	$scope.limparCampos = function(){
   		$scope.medico = {};
   	}

   	$scope.salvar = function(){
   		$scope.medicos.push($scope.medico);
   		$scope.limparCampos();
   	}

   	$scope.excluir = function(){
   		$scope.medicos.splice($scope.medicos.indexOf($scope.medico,1));

   	}
>>>>>>> 1239b07494365c982214e1ab8095698f3dec55f1
});