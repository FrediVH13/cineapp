$(document).ready(function() {
	$('#movies').DataTable({
		"language": {
			"sProcessing":     "Procesando...",
            "sLengthMenu":     "Mostrando _MENU_ registros",
            "sZeroRecords":    "No se encontraron registros.",
            "sEmptyTable":     "Ningún dato disponible en esta tabla =(",
            "sInfo":           "_START_ al _END_ de _TOTAL_ registros",
            "sInfoEmpty":      "Sin registros",
            "sInfoFiltered":   "",
            "sInfoPostFix":    "",
            "sSearch":         "Buscar:",
            "sUrl":            "",
            "sInfoThousands":  ",",
            "sLoadingRecords": "Cargando...",
            "oPaginate": {
                "sFirst":    "Primero",
                "sLast":     "Último",
                "sNext":     "Siguiente",
                "sPrevious": "Anterior"
            },
            "oAria": {
                "sSortAscending":  ": Activar para ordenar la columna de manera ascendente",
                "sSortDescending": ": Activar para ordenar la columna de manera descendente"
            },
            "buttons": {
                "copy": "Copiar",
                "colvis": "Visibilidad"
            }
		}
	});
});
$(function() {
	$('[data-toggle="tooltip"]').tooltip()
})