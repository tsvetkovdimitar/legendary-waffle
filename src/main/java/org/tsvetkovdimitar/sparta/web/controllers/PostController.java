package org.tsvetkovdimitar.sparta.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.tsvetkovdimitar.sparta.domain.models.binding.AddPostBindingModel;

import javax.validation.Valid;


@Controller
@RequestMapping("/posts")
public class PostController extends BaseController{

//   @GetMapping("/")
//   public ModelAndView add(ModelAndView modelAndView, @ModelAttribute(name = "addPostBindingModel") AddPostBindingModel addPostBindingModel){
////
////       modelAndView.addObject("addPostBindingModel", addPostBindingModel);
////       return super.view("add-post", modelAndView);
////
////   }

   @PostMapping("/add")
   public ModelAndView validate(@Valid @ModelAttribute(name = "addPostBindingModel") AddPostBindingModel addPostBindingModel, BindingResult bindingResult, ModelAndView modelAndView){

        if(bindingResult.hasErrors()){

            modelAndView.addObject("addPostBindingModel", addPostBindingModel);

            return super.view("add-post", modelAndView);

        }

        return super.redirect("/");

   }

}
