angular.module('app.controllers', [

]).controller('medicineListController', function($scope, $state, popupService, $window, medicine) {
  $scope.medicines = medicine.query(); //fetch all medicines. Issues a GET to /api/vi/medicines

  $scope.deletemedicine = function(medicine) { // Delete a medicine. Issues a DELETE to /api/v1/medicines/:id
    if (popupService.showPopup('Really delete this?')) {
      medicine.$delete(function() {
        //$scope.medicine = medicine.query();
        //  $state.go('medicines');
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
}).controller('medicineSearching', function($scope, $state, $stateParams, medicine) {
    $scope.medicine = new medicine();  //create new medicine instance. Properties will be set via ng-model on UI

    $scope.searchmedicine = function() { //create a new medicine. Issues a POST to /api/v1/medicines
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

}).controller('stockinListController', function($scope, $state, popupService, $window, stockin) {
    $scope.stockins = stockin.query(); //fetch all stockins. Issues a GET to /api/vi/stockins

    $scope.deletestockin = function(stockin) { // Delete a stockin. Issues a DELETE to /api/v1/stockins/:id
        if (popupService.showPopup('Really delete this?')) {
            stockin.$delete(function() {
                $scope.stockins = stockin.query();
                $state.refresh('stockins');
            });
        }
    };
}).controller('stockinViewController', function($scope, $stateParams, stockin) {
    $scope.stockin = stockin.get({ id: $stateParams.id }); //Get a single stockin.Issues a GET to /api/v1/stockins/:id
}).controller('stockinCreateController', function($scope, $state, $stateParams, stockin) {
    $scope.stockin = new stockin();  //create new stockin instance. Properties will be set via ng-model on UI

    $scope.addstockin = function() { //create a new stockin. Issues a POST to /api/v1/stockins
        $scope.stockin.$save(function() {
            $state.go('stockins'); // on success go back to the list i.e. stockins state.
        });
    };
}).controller('stockinEditController', function($scope, $state, $stateParams, stockin) {
    $scope.updatestockin = function() { //Update the edited stockin. Issues a PUT to /api/v1/stockins/:id
        $scope.stockin.$update(function() {
            $state.go('stockins'); // on success go back to the list i.e. stockins state.
        });
    };

    $scope.loadstockin = function() { //Issues a GET request to /api/v1/stockins/:id to get a stockin to update
        $scope.stockin = stockin.get({ id: $stateParams.id });
    };

    $scope.loadstockin(); // Load a stockin which can be edited on UI
});

