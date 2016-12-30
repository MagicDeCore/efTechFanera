package woods.admin.controllers;

import woods.admin.productmanage.model.FaneraAdding;
import woods.admin.productmanage.service.FaneraAddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MagicDeCore on 26.12.2016.
 */

@Controller
public class FaneraAddingController {

    @Autowired
    private FaneraAddingService faneraAddingService;

    @RequestMapping(value = "/addfanera", method = RequestMethod.GET)
    public String addfanera(Model model){
        model.addAttribute("faneraForm", new FaneraAdding());

        return "addfanera";
    }

    @RequestMapping(value = "/addfanera", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String createfanera(@ModelAttribute("faneraForm")FaneraAdding faneraAdding, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            System.out.println("FAaaaaanera addding ERRRROOOR");
            System.out.println("FAaaaaanera addding ERRRROOOR");
            System.out.println("FAaaaaanera addding ERRRROOOR");
            System.out.println("FAaaaaanera addding ERRRROOOR");

            return "redirect:/welcome";
        }

        System.out.println("FAaaaaanera addding PIIIIDOR");

        faneraAddingService.save(faneraAdding);

        return "redirect:/welcome";
    }

}
