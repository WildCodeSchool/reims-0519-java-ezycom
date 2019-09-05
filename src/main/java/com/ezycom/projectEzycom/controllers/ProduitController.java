import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProduitController{

    @PostMapping("/viewSales")
    public String produit(){
        return "/viewSales";
    }
}