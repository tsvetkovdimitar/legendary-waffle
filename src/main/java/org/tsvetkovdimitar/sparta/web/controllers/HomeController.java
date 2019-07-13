package org.tsvetkovdimitar.sparta.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.tsvetkovdimitar.sparta.domain.models.binding.AddPostBindingModel;

@Controller
public class HomeController extends BaseController {

    @GetMapping("/")
    public ModelAndView home(ModelAndView modelAndView, @ModelAttribute(name = "addPostBindingModel") AddPostBindingModel addPostBindingModel){

       modelAndView.addObject("addPostBindingModel", addPostBindingModel);
       return super.view("index", modelAndView);

   }

}
