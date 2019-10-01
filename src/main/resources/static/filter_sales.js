let optionValues =[];
$("#sale option").each(function(){
    if($.inArray(this.getAttribute('commercial') , optionValues) >-1){
        $(this).hide();
    }
    else {
        optionValues.push(this.getAttribute('commercial'));
    }
});
optionValues =[];
$("#month option").each(function(){
    if($.inArray(this.getAttribute('month') , optionValues) >-1){
        $(this).hide();
    }
    else {
        optionValues.push(this.getAttribute('month'));
    }
});

function updateTableCommercial() {
    filterCommercial("commercial_list", 0);
    filterCommercial("sales_list", 3);
}
function filterCommercial(tableId, commercialColumnNumber) {
    console.log('here');
    let myFilterSelect = document.getElementById('commercial');
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

function updateTableMonth() {
    filterMonth("sales_list", 2);
}
function filterMonth(tableId, monthColumnNumber) {
    let myFilterSelect = document.getElementById('month');
    let month = myFilterSelect.options[myFilterSelect.selectedIndex].text;
    let table = document.getElementById(tableId);
    let tr = table.getElementsByTagName("tr");
    let td, i, txtValue;
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[monthColumnNumber];
        if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue == month) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }       
    }
}