let optionValues =[];
$("#sale option").each(function(){
    if($.inArray(this.getAttribute('commercial') , optionValues) >-1){
        $(this).hide();
    }
    else {
        optionValues.push(this.getAttribute('commercial'));
    }
});
$("#month option").each(function(){
    if($.inArray(this.getAttribute('month') , optionValues) >-1){
        $(this).hide();
    }
    else {
        optionValues.push(this.getAttribute('month'));
    }
});

function updateTable() {
    filter("commercial_list", 0);
    filter("sales_list", 3);
}
function filter(tableId, commercialColumnNumber) {
    let myFilterSelect = document.getElementById("sale");
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
}