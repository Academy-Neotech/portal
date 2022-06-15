
function getConfig(){
var clientId=localStorage.getItem('clientId');
if (clientId==null || clientId=="undefined"){
   var appConfig=fire_ajax_pathvar("/getAppConfig");
   localStorage.setItem('clientId', appConfig.clientId);
   localStorage.setItem('APIBaseUrl', appConfig.APIBaseUrl);
   }
}


$(document).ready(function() {
    getConfig();
});