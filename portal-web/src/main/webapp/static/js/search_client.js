$(document).ready(function () {
    // registro evento pulsante ricerca
   $("#btn_ricerca").click(function (event) {
        // preparo la request in json
    var requestData= {
	       "cliente": {
	       'Id_cliente': $('#text-cliente').val(),
           "nome_cliente":$('#text-cliente').val().toLowerCase(),
           "Id_stato": $('#text-cliente').val()
        }
     };

        //chiamo il server
       var response_object=fire_ajax_post("../api/searchClientsBy",requestData);
       if(response_object.code=="KO") alert(response_object.descr);
       //var response_object = response.responseJSON;
       //elaboro la risposta in formato testo
       //var response_text = response.responseText;
       //$('#text-feedback').text(response_text);
       // elaboro la risposta in formato oggetto
       $("#cliente_tabella tr.mia").remove();
       $.each(response_object.clienti, function(i, item){
                  var riga="<tr class='mia'>";
                  riga+="<td>"+item.Id_cliente+"</td>";
                  riga+="<td>"+item.nome_cliente+"</td>";
                  riga+="<td>"+item.Id_stato+"</td>";
                  riga+="<td><button> <a href='searching(\""+item.Id_cliente+"\")' type='button' class='btn btn-primary'>Ricerca</a></button></td>";
                  riga+="</tr>";
                  $("#cliente_tabella").append(riga);
       });
        });
       });











