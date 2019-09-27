$("#sale").on("change", function() {
    let sale = $(this).val(); 
    $("#month").find("option").hide();
    $("#month").val('Sélectionnez...');
    $("#commercial").find("option").hide();
    $("#commercial").val('Sélection du commercial');
    if (sale) {
        $("#month").find("option[filter='" + sale + "']")
                .show();

        let optionValues =[];
        $("#month option").each(function(){
            if (this.getAttribute('filter') == $("#sale").val()) {
                if($.inArray(this.value, optionValues) >-1){
                    $(this).hide();
                }
                else {
                    optionValues.push(this.value);
                }
            }
        });
    }
});

$("#month").on("change", function() {
    let sale = $("#sale").val();
    let month = $(this).val().toLowerCase();
    $("#commercial").find("option").hide();
    $("#commercial").val('Sélectionnez...');
    if (month) {
        $("#commercial").find("option[filter='" + sale + " " + month + "']")
                    .show()
                    .prop('selected', true);
    }
});