package wizut.tpsi.ogloszenia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import wizut.tpsi.ogloszenia.services.OffersService;

@Controller
public class HomeController {
    @Autowired
    private OffersService offersService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("carmodel", offersService.getModel(3));
        model.addAttribute("manufacturer", offersService.getCarManufacturer(2));
        return "home";
    }
}
