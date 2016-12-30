package woods.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import woods.phone.fanera.Fanera;
import woods.phone.fanera.FaneraJDBCTemplate;
import woods.phone.fanera.SelectFanera;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by MagicDeCore on 01.12.2016.
 */

@Controller
public class ControllerFanera {

    @Autowired
    FaneraJDBCTemplate faneraJDBCTemplate;


    @RequestMapping(value = "/fanera", method = RequestMethod.GET)   // /iphones
    public ModelAndView mcf(HttpSession session) {
        ModelAndView mvfanera = new ModelAndView("ru_fanera_all");

        int shlef = 0;
        int no_shlef = 0;
        String sort = "n";
        String depth = "n";
        int page_nomber = 1;

        try {

            shlef = (int) session.getAttribute("shlef");
            no_shlef = (int) session.getAttribute("no_shlef");
            sort = (String) session.getAttribute("sort");
            depth = (String) session.getAttribute("depth");
            page_nomber = (int) session.getAttribute("page_nomber");


        } catch (Exception e) {
        }

        String page;
        try {
            page = (String) session.getAttribute("page");
        } catch (Exception e) {
            page = "index";
        }

        SelectFanera select = new SelectFanera();

        select.setShlef(shlef);
        select.setNo_shlef(no_shlef);
        select.setSort(sort);
        select.setDepth(depth);


        List<Fanera> listFanera = faneraJDBCTemplate.listFanera(select, page_nomber);


        mvfanera.addObject("listFanera", listFanera);

        session.setAttribute("page", "faneras");
        return mvfanera;
    }

}
