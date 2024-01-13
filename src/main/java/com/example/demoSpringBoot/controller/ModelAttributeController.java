package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.entity.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttributeController {

    @RequestMapping("/commentForm")
    public String commentForm() {

        return "commentForm";
    }

//    @RequestMapping(value = "/commentSubmission", method = RequestMethod.POST)
//    public String submitForm(
//            @RequestParam("name") String name,
//            @RequestParam("comment") String comment,
//            ModelMap model
//    ) {
//        Comment cmt = new Comment(name, comment);
//        model.put("msg", cmt);
//
//        return "commentSubmissionForm";
//    }

    @RequestMapping(value = "/commentSubmission", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("msg") Comment comment) {

        return "commentSubmissionForm";
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg2", "Polytechnic");
    }
}
