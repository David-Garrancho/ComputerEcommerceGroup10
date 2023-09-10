package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import za.ac.cput.domain.Customer;
import za.ac.cput.service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.getAll();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/customers/new")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/add-customer";
    }

    @PostMapping("/customers")
    public String createCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.create(customer);
        return "redirect:/customer/customers";
    }
}
