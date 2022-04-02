package com.greatlearning.crm.Controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.crm.Entity.Customer;
import com.greatlearning.crm.Service.CustomerService;


	@Controller
	@RequestMapping("/customers")
	public class CustomerController {

		@Autowired
		private CustomerService customerService;

		@RequestMapping("/list")
		public String listCustomers(Model model) {
			List<Customer> customers = customerService.findAll();

			model.addAttribute("Customers", customers);

			return "CustomerList";
		}

		@RequestMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {

			// get the customer from the service

			Customer customer = new Customer();
			// set Customer as a model attribute to pre-populate the form
			theModel.addAttribute("Customer", customer);

			// send over to our form
			return "CustomerForm";
		}

		@RequestMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

			// get the customer from the service
			Customer theCustomer = customerService.findById(theId);

			// set Customer as a model attribute to pre-populate the form
			theModel.addAttribute("Customer", theCustomer);

			// send over to our form
			return "CustomerForm";
		}

		@PostMapping("/save")
		public String saveBook(@RequestParam("id") int id, @RequestParam("f_name") String firstName,
				@RequestParam("l_name") String lastName, @RequestParam("email") String email) {

			Customer theCustomer;
			if (id != 0) {
				theCustomer = customerService.findById(id);
				theCustomer.setFirstName(firstName);
				theCustomer.setLastName(lastName);
				theCustomer.setEmail(email);
			} else
				theCustomer = new Customer(firstName, lastName, email);
			// save the Customer
			customerService.save(theCustomer);

			// use a redirect to prevent duplicate submissions
			return "redirect:/customers/list";

		}

		@RequestMapping("/delete")
		public String delete(@RequestParam("id") int theId) {

			// delete the customer
			customerService.deleteById(theId);

			return "redirect:/customers/list";

		}

	}

