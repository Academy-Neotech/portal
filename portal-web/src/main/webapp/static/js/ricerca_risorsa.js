$(document).ready(function){
$('#nominativo').autocomplete({
  resolverSettings:{
     url:'api/autocompleteNominativo'
  }
});
$('#nominativo').autocomplete();

var clienti=fire_ajax_pathvar("../api/clienteDropDown");
 $.each(clienti.responseJSON, function (i, cliente) {
    $('#cliente').append($('<option>', {
        value: cliente.cliente_id,
        text : cliente.cliente_name
    }));
});

var stati=fire_ajax_pathvar("../api/statoDropDown");
 $.each(stati.responseJSON, function (i, stato) {
    $('#stato').append($('<option>', {
        value: stato.stato_id,
        text : stato.stato_name
    }));
});

$('#skill').tagator({
  autocomplete: ['first', 'second', 'third'],
  useDimmer: true,
  prefix:                'tagator_',
  height:                'auto',
  showAllOptionsOnFocus: false,
  allow<a href="https://www.jqueryscript.net/tags.php?/autocomplete/">Autocomplete</a>Only: false,
});





$("#btn_ricerca").click(function (event){

var requestData={
     "nominativo":$("#nominativo").val().toLowerCase(),
     "skill":$("#skill").val().toLowerCase(),
     "cliente":$("#cliente option:selected").text(),
     "stato":$("#stato option:selected").text()
};
var response_object=fire_ajax_post("api/ricercaRisorsa", requestData);

$("#listaRisorse tr.res").remove();

$each(response_object.responseJSON.risorse, function(i, responseList){
   var riga="<tr class='res'>";
         riga+="<td>"+responseList.risorsa_id+"</td>";
         riga+="<td>"+responseList.nominativo+"</td>";
         riga+="<td>"+responseList.stato+"</td>";
         riga+="<td>"+responseList.termineOccupazione+"</td>";
         riga+="<td>"+responseList.clienteAssociato+"</td>";
         riga+="<td>"+responseList.cv+"</td>";
   riga+="</tr>";
$("#listaRisorse").append(riga);

});
});
});