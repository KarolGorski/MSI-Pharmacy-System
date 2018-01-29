angular.module('app.controllers', []).controller('medicineListController', function($scope, $state, popupService, $window, medicine) {
  $scope.medicines = medicine.query(); //fetch all medicines. Issues a GET to /api/vi/medicines

  $scope.deletemedicine = function(medicine) { // Delete a medicine. Issues a DELETE to /api/v1/medicines/:id
    if (popupService.showPopup('Really delete this?')) {
      medicine.$delete(function() {
        $scope.medicines = medicine.query();
        $state.refresh('medicines');
      });
    }
  };
}).controller('medicineViewController', function($scope, $stateParams, medicine) {
  $scope.medicine = medicine.get({ id: $stateParams.id }); //Get a single medicine.Issues a GET to /api/v1/medicines/:id
}).controller('medicineCreateController', function($scope, $state, $stateParams, medicine) {
  $scope.medicine = new medicine();  //create new medicine instance. Properties will be set via ng-model on UI

  $scope.addmedicine = function() { //create a new medicine. Issues a POST to /api/v1/medicines
    $scope.medicine.$save(function() {
      $state.go('medicines'); // on success go back to the list i.e. medicines state.
    });
  };
}).controller('medicineEditController', function($scope, $state, $stateParams, medicine) {
  $scope.updatemedicine = function() { //Update the edited medicine. Issues a PUT to /api/v1/medicines/:id
    $scope.medicine.$update(function() {
      $state.go('medicines'); // on success go back to the list i.e. medicines state.
    });
  };

  $scope.loadmedicine = function() { //Issues a GET request to /api/v1/medicines/:id to get a medicine to update
    $scope.medicine = medicine.get({ id: $stateParams.id });
  };

  $scope.loadmedicine(); // Load a medicine which can be edited on UI
});
