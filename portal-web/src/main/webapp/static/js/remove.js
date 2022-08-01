$('#record_nav ul li').on('click', function(e){
      $('#record_nav ul li.selected').removeClass('selected');
      $(this).addClass('selected');
      $('.content').hide();
      var id = $(this).data('target');
      $(id).show();
  });