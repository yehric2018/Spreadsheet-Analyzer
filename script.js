$(document).ready(function() {
	$("#display").click(function() {
		var reader = new FileReader();
		reader.onload = function(event) {
			var rows = event.target.result.split("\n");
			for (var i = 0; i < rows.length - 1; i++) {
				var cols = rows[i].split(',');
				for (var j = 0; j < cols.length; j++) {
					if (j == 0) {
						$("#table1").append("<tr id = 'row'+i>");
					}
					$("#table1").append("<td>" + cols[j] + "</td>");
					if (j == cols.length - 1) {
						$("#table1").append("</tr>");
					}
				}
			}
		}
		reader.readAsText($("#sheet1")[0].files[0]);
		
		var reader2 = new FileReader();
		reader2.onload = function(event) {
			var rows = event.target.result.split("\n");
			for (var i = 0; i < rows.length - 1; i++) {
				var cols = rows[i].split(',');
				for (var j = 0; j < cols.length; j++) {
					if (j == 0) {
						$("#table2").append("<tr id = 'row'+i>");
					}
					$("#table2").append("<td>" + cols[j] + "</td>");
					if (j == cols.length - 1) {
						$("#table2").append("</tr>");
					}
				}
			}
		}
		reader2.readAsText($("#sheet2")[0].files[0]);
	});
});
