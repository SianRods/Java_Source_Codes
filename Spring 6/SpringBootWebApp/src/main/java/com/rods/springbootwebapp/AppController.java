package com.rods.springbootwebapp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HttpServletBean;

@Controller
public class AppController {


    @RequestMapping("/")
    public String getHome() {
        return "index";
    }

    // here in the spring way of handling the data i will be receiving the parameters directly
    @RequestMapping("/acknowledge")
    public String acknowledge(@RequestParam("name") String fullname, Model model) {
        model.addAttribute("fullname");
        return "acknowledge";
    }


    /*

     The whole point of using a ModelViewController(MVC) architecture is to have a manageable code
     where each of the part is responsible for processing request , updating model and redenring the
     view ==> Decoupling from httpservletrequest can be done using ==> request parameter

    Decoupling from session part ==> using a model object which acts/behaves in a similar way to
    that of an object

    Use of the ModelView object ==> we can also use the model view object for better view rendering
    management  ==>

    @RequestMapping("/acknowledge")
    public ModelView acknowledge(@RequestParam("name") String fullname, ModelView mv) {
        mv.addAttribute("fullname");
        mv.addView("acknowledge");
    }

    */

    

    /*
       Note that one of the drawbacks of the above method is that we are constantly returning
       string of index.jsp and hence the code losses it's maintainability and becomes very
       tightly coupled ==> Solved by using Prefix and Suffix in app.properties

     */

    /*

      Notice that the below methods are Servlet way of handling data and request
     In case of springboot way we can use a requestparam property in order to request the values


     Acknowledging the user the response has been received in the backend
    @RequestMapping("/acknowledge")
    public String acknowledge(HttpServletRequest req, HttpSession session) {
        // session and res object has been created by spring and we will use it
        // in order to store the data of the user for a given session
        System.out.println("post method called ");
        String name =
                req.getParameter("name");
        session.setAttribute("fullname", name);

        // Whenever i add the above data to an ongoing session the same data can be accessed through the session in jsp files
    return "acknowledge.jsp";
    }


     */

}
