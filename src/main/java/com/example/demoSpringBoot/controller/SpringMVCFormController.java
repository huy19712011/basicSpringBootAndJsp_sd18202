package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCFormController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeForm", "employee", new Employee(1000L, "unknown", "123456"));
    }

    @RequestMapping(value = "addEmployee", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
//            return "error";
            return "employeeForm";
        }

        return "employeeView";
    }
}
