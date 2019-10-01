optionValues =[];
$("#commercial option").each(function(){
    if($.inArray(this.getAttribute("commercial") , optionValues) >-1){
        $(this).hide();
    }
    else {
        optionValues.push(this.getAttribute("commercial"));
    }
});

function updateTableCommercial() {
    filterCommercial("totaux_list", 0);
    filterCommercial("sales_list", 3);
}
function filterCommercial(tableId, commercialColumnNumber) {
    let myFilterSelect = document.getElementById("commercial");
    let commercial = myFilterSelect.options[myFilterSelect.selectedIndex].text;
    let table = document.getElementById(tableId);
    let tr = table.getElementsByTagName("tr");
    let td, i, txtValue;
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[commercialColumnNumber];
        if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue == commercial) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }       
    }
    $("#month").val("Select").show();
}

$("#button").click(function() {
    $("#commercial").val("Select");
    $("#month").val("Select");
});