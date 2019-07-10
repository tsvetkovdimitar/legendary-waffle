package org.tsvetkovdimitar.sparta.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/posts")
public class PostController extends BaseController {

    @GetMapping("/submit")
    public ModelAndView submit(){

        return super.view("post");

    }

}
