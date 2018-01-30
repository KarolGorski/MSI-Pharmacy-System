angular.module('app.services', []).factory('medicine', function($resource) {
  return $resource('/api/v1/medicines/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).factory('stockin', function($resource){
    return $resource('/api/v1/stockins/:id', {id: '@id'}, {
        update: {
            method: 'PUT'
        }
    });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
