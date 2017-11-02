package com.project.ProjektKoncowy.controller;

import com.project.ProjektKoncowy.model.CustomerRepository;
import com.project.ProjektKoncowy.model.Entity.Customer;
import com.project.ProjektKoncowy.model.Result.CustomerResult;
import com.project.ProjektKoncowy.model.Result.GreetingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/greeting")
    public GreetingResult greeting(Model model) {
        GreetingResult result = new GreetingResult();
        result.setResult("result");

        return result;
    }

    @RequestMapping("/customerOperations")
    public CustomerResult customerOperations(Model model) {

        customerRepository.save(new Customer("Jack", "Bauer"));
        customerRepository.save(new Customer("Chloe", "O'Brian"));
        customerRepository.save(new Customer("Kim", "Bauer"));

        Customer customer = customerRepository.findOne(4L);

        CustomerResult result = new CustomerResult();
        result.setFirstName(customer.getFirstName());
        result.setLastName(customer.getLastName());
        return result;
    }




}
