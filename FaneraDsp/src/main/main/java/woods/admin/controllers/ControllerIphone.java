/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woods.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import woods.phone.compare_phone.CompareCart;
import woods.phone.iphone.Iphone;
import woods.phone.iphone.IphoneJDBCTemplate;
import woods.phone.iphone.SelectIphone;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Admin
 */

@Controller
public class ControllerIphone {

    @Autowired
    IphoneJDBCTemplate iphoneJDBCTemplate;


    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public ModelAndView userSorexInfo(HttpSession session) {
        ModelAndView mv = new ModelAndView("index_iphone");

//     List<Hmc> listHmc = hmcJDBCTemplate.listHmc();
////        printInFile(listHmc.toString());
//        mv.addObject("listHmc", listHmc);
        session.setAttribute("page", "index");

        return mv;
    }

    @RequestMapping(value = "/woods/admin", method = RequestMethod.GET)
    public ModelAndView admin_iphone(HttpSession session) {
        ModelAndView mv = new ModelAndView("admin_iphone");

        session.setAttribute("page", "index");
        return mv;
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView p403(HttpSession session) {
        ModelAndView mv = new ModelAndView("403");

//        session.setAttribute("page", "index");
        return mv;
    }

    @RequestMapping(value = "/login1", method = RequestMethod.GET)
    public ModelAndView login1() {
        ModelAndView mv = new ModelAndView("login1");


        return mv;
    }

//            @RequestMapping(value = "/iphones" , method = RequestMethod.GET)
//    public ModelAndView iphones(HttpSession session) {
// ModelAndView mv = new ModelAndView("ru_all_iphone");
//
//     List<Iphone> listIphone = iphoneJDBCTemplate.getListIphone();
//        mv.addObject("listIphone", listIphone);
//        session.setAttribute("page", "iphones");
//        return mv;
//    }


    ////////////////////// #uoO Go

    @RequestMapping(value = "/dsp", method = RequestMethod.GET)   // /iphones
    public ModelAndView mc(HttpSession session) {
// ModelAndView mv = new ModelAndView("hmc/allmachine");
        ModelAndView mv = new ModelAndView("ru_all_iphone");
//
//        int chIphone5c = 0;
//        int chIphone5s = 0;
//        int chIphone6 = 0;
//        int chIphone6plus = 0;
        int chIphone6s = 0;
        int chIphone6splus = 0;
        String color = "n";
        String memory = "n";
        int page_nomber = 1;

        try {
//            chIphone5c = (int) session.getAttribute("chIphone5c");
//            chIphone5s = (int) session.getAttribute("chIphone5s");
//            chIphone6 = (int) session.getAttribute("chIphone6");
//            chIphone6plus = (int) session.getAttribute("chIphone6plus");


            chIphone6s = (int) session.getAttribute("chIphone6s");
            chIphone6splus = (int) session.getAttribute("chIphone6splus");
            color = (String) session.getAttribute("color");
            memory = (String) session.getAttribute("memory");
            page_nomber = (int) session.getAttribute("page_nomber");


        } catch (Exception e) {
        }

        String page;
        try {
            page = (String) session.getAttribute("page");
        } catch (Exception e) {
            page = "index";
        }

        SelectIphone select = new SelectIphone();
//        select.setChIphone5c(chIphone5c);
//        select.setChIphone5s(chIphone5s);
//        select.setChIphone6(chIphone6);
//        select.setChIphone6plus(chIphone6plus);
        select.setChIphone6s(chIphone6s);
        select.setChIphone6splus(chIphone6splus);
        select.setColor(color);
        select.setMemory(memory);

//   List <Hmc> listHmc= hmcJDBCTemplate.listHmc(select);
        List<Iphone> listIphone = iphoneJDBCTemplate.listIphone(select, page_nomber);
//     List <Iphone> listIphone = iphoneJDBCTemplate.getListIphone();


//        printInFile("HMC exeption2.txt", listVmc.toString());
        mv.addObject("listIphone", listIphone);
//        mv.addObject("kol_vo_page", iphoneJDBCTemplate.getKol_vo_page_itogo());
//        mv.addObject("kol_vo_prod", iphoneJDBCTemplate.getKol_vo_product());
////        mv.addObject("page_nomber", page_nomber);
//        mv.addObject("kol_vo_on_page", iphoneJDBCTemplate.getNOMBER_PRODUCTS_ON_PAGE());

        session.setAttribute("page", "iphones");

//           printInFile("basket.txt", "Index = " + (String)session.getAttribute("page") ); 
        return mv;
    }


//    @RequestMapping(value = "/fanera", method = RequestMethod.GET)   // /iphones
//    public ModelAndView mcf(HttpSession session) {
//// ModelAndView mv = new ModelAndView("hmc/allmachine");
//        ModelAndView mv = new ModelAndView("ru_fanera_all");
////
////        int chIphone5c = 0;
////        int chIphone5s = 0;
////        int chIphone6 = 0;
////        int chIphone6plus = 0;
//        int chIphone6s = 0;
//        int chIphone6splus = 0;
//        String color = "n";
//        String memory = "n";
//        int page_nomber = 1;
//
//        try {
////            chIphone5c = (int) session.getAttribute("chIphone5c");
////            chIphone5s = (int) session.getAttribute("chIphone5s");
////            chIphone6 = (int) session.getAttribute("chIphone6");
////            chIphone6plus = (int) session.getAttribute("chIphone6plus");
//
//            chIphone6s = (int) session.getAttribute("chIphone6s");
//            chIphone6splus = (int) session.getAttribute("chIphone6splus");
//            color = (String) session.getAttribute("color");
//            memory = (String) session.getAttribute("memory");
//            page_nomber = (int) session.getAttribute("page_nomber");
//
//
//        } catch (Exception e) {
//        }
//
//        String page;
//        try {
//            page = (String) session.getAttribute("page");
//        } catch (Exception e) {
//            page = "index";
//        }
//
//        Select select = new Select();
////        select.setChIphone5c(chIphone5c);
////        select.setChIphone5s(chIphone5s);
////        select.setChIphone6(chIphone6);
////        select.setChIphone6plus(chIphone6plus);
//        select.setChIphone6s(chIphone6s);
//        select.setChIphone6splus(chIphone6splus);
//        select.setColor(color);
//        select.setMemory(memory);
//
////   List <Hmc> listHmc= hmcJDBCTemplate.listHmc(select);
//        List<Iphone> listIphone = iphoneJDBCTemplate.listIphone(select, page_nomber);
////     List <Iphone> listIphone = iphoneJDBCTemplate.getListIphone();
//
//
////        printInFile("HMC exeption2.txt", listVmc.toString());
//        mv.addObject("listIphone", listIphone);
////        mv.addObject("kol_vo_page", iphoneJDBCTemplate.getKol_vo_page_itogo());
////        mv.addObject("kol_vo_prod", iphoneJDBCTemplate.getKol_vo_product());
//////        mv.addObject("page_nomber", page_nomber);
////        mv.addObject("kol_vo_on_page", iphoneJDBCTemplate.getNOMBER_PRODUCTS_ON_PAGE());
//
//        session.setAttribute("page", "iphones");
//
////           printInFile("basket.txt", "Index = " + (String)session.getAttribute("page") );
//        return mv;
//    }

    /////////


    @RequestMapping(value = "/iphones_from_any_page", method = RequestMethod.GET)
    public String vmc_from_any_page(
            @RequestParam(value = "page_nomber") int page_nomber, HttpSession session) {
        session.setAttribute("page_nomber", page_nomber);
        return "redirect:/dsp";
    }


    @RequestMapping(value = "/iphones_select", method = RequestMethod.GET)
    public String vmc_select(
//                 @RequestParam(value = "page") String page,
            @RequestParam(value = "checkbox_iphone5c", defaultValue = "0") int chIphone5c,
            @RequestParam(value = "checkbox_iphone5s", defaultValue = "0") int chIphone5s,
            @RequestParam(value = "checkbox_iphone6", defaultValue = "0") int chIphone6,
            @RequestParam(value = "checkbox_iphone6plus", defaultValue = "0") int chIphone6plus,
            @RequestParam(value = "checkbox_iphone6s", defaultValue = "0") int chIphone6s,
            @RequestParam(value = "checkbox_iphone6splus", defaultValue = "0") int chIphone6splus,
//                @RequestParam(value = "checkboxUsa",   defaultValue = "0") int chUsa, 
//                @RequestParam(value = "checkboxGermany",   defaultValue = "0") int chGermany     
            @RequestParam(value = "color", defaultValue = "n") String color,
            @RequestParam(value = "memory", defaultValue = "n") String memory,
            HttpSession session
    ) {

        session.setAttribute("chIphone5c", chIphone5c);
        session.setAttribute("chIphone5s", chIphone5s);
        session.setAttribute("chIphone6", chIphone6);
        session.setAttribute("chIphone6plus", chIphone6plus);
        session.setAttribute("chIphone6s", chIphone6s);
        session.setAttribute("chIphone6splus", chIphone6splus);
        session.setAttribute("color", color);
        session.setAttribute("memory", memory);
        session.setAttribute("page_nomber", 1);

        return "redirect:/dsp";
    }


    @RequestMapping(value = "/iphone-{id}", method = RequestMethod.GET)
    public ModelAndView iphine(@PathVariable("id") int id, HttpSession session) {

//     ModelAndView mv = new ModelAndView("one_iph");
        ModelAndView mv = new ModelAndView("ru_one_iphone");
        Iphone iphone = iphoneJDBCTemplate.getIphone(id);
//        printInFile("HMC exeption2.txt", hmc.toString());
        mv.addObject("iphone", iphone);
        session.setAttribute("page", "iphone-" + id);

        return mv;
    }


    /// ------------ Compare : Start ----------------- 

    @RequestMapping(value = "/compare", method = RequestMethod.GET)
    public ModelAndView compare(HttpSession session) {
        ModelAndView mv = new ModelAndView("ru_compare");

        CompareCart compareCart = (CompareCart) session.getAttribute("compareCart");
        if (compareCart == null) compareCart = new CompareCart();

        mv.addObject("compareCart", compareCart);

        session.setAttribute("page", "compare");
        return mv;
    }


    @RequestMapping("/add-product-to-compare-list")
    public String addProductToCompareList(@RequestParam(value = "id") int id, HttpSession session) {
//            @RequestParam(value = "page") Integer page,           
        CompareCart compareCart = (CompareCart) session.getAttribute("compareCart");
        if (compareCart == null) compareCart = new CompareCart();

        Iphone iphone = iphoneJDBCTemplate.getIphone(id);
        compareCart.addItem(iphone);
        session.setAttribute("compareCart", compareCart);

        String page;
        try {
            page = (String) session.getAttribute("page");
        } catch (Exception e) {
            page = "index";
        }
        return "redirect:/" + page + ".htm";

    }


    //                @RequestMapping(value = "/comparedel-{id}", method = RequestMethod.GET)
    @RequestMapping(value = "/delete-woods.phone-{id}-from-compare", method = RequestMethod.GET)
    public String delfromcompare(@PathVariable("id") int id, HttpSession session) {
//       ModelAndView mv = new ModelAndView("hmc/compare");

        CompareCart compareCart = (CompareCart) session.getAttribute("compareCart");
        if (compareCart == null) compareCart = new CompareCart();
        Iphone iphone = iphoneJDBCTemplate.getIphone(id);
        compareCart.update(iphone, "0"); // delete from compare
        session.setAttribute("compareCart", compareCart);

        return "redirect:/compare.htm";
    }


}
