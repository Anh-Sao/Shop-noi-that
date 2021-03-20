$(document).ready(function () {
  $('[data-toggle="tooltip"]').tooltip();
  $('table .delete').on('click', function () {
    var id = $(this).parent().find('#id').val();
    var name = $(this).parent().find('#name').val();
    $('#deleteModal #id').val(id);
    $('#deleteModal #name').text(name);
  });

  $('table .edit').on('click', function (event) {
    event.preventDefault();
    var href = $(this).attr('href');

    $.get(href, function(customerUpdate, status){
        $('#updateModal #id').val(customerUpdate.id);
        $('#updateModal #name').val(customerUpdate.name);
        $('#updateModal #phone').val(customerUpdate.phone);
        $('#updateModal #gender').val($('#updateModal #gender option').eq(customerUpdate.gender).val());
        $('#updateModal #email').val(customerUpdate.email);
        $('#updateModal #address').val(customerUpdate.address);
    });
    $('#updateModal').modal('show');

  });
});


var totalPage = [[${totalPage}]];
var currentPage = [[${currentPage}]];
$(function () {
  window.pagObj = $('#pagination').twbsPagination({
    totalPages: totalPage,
    visiblePages: 7,
    startPage: currentPage,
    onPageClick: function (event, page) {
      if (currentPage != page) {
        $('#page').val(page);
        $('#formSubmit').submit();
      }
    }
  });
});
