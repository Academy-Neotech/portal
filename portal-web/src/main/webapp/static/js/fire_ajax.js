//Chiama l'API e ritorna il JSON
var fire_ajax_post = function (send_url, send_data) {
    var retValue = null;
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: send_url,
        data: JSON.stringify(send_data),
        dataType: 'json',
        cache: false,
        async:false,
       // 200
        success: function (data) {
            retValue= jQuery.parseJSON(data);
        },
        error: function (e) {
            console.log(e);
        }
    });
     return retValue;
};



var fire_ajax_pathvar = function(send_url) {
    var retValue = null;
    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: send_url,
        beforeSend: function(xhr){
                           xhr.setRequestHeader('clientId', localStorage.getItem("clientId"));
                           xhr.setRequestHeader('request-id', localStorage.getItem("request-id"));
                           },
        cache: false,
        async:false,
        success: function (data) {
            retValue= jQuery.parseJSON(data);
        },
        error: function (e) {
            console.log("ERROR : ", e);
        }
    });
    return retValue;
 };