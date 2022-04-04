package com.greatlearning.StudentManagement.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.StudentManagement.Entity.Students;
import com.greatlearning.StudentManagement.Service.StudentService;

@Controller
@RequestMapping("/students")

public class StudentController {
	
		@Autowired
		private StudentService studentservice;
		
		@GetMapping("/list")
		public String listStudents(Model model) {
			List<Students> students = studentservice.findAll();
			model.addAttribute("students", students);
			return "StudentList";
		}
		
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {

			// get the customer from the service

			Students student = new Students();
			//student.setId(0);
			// set Customer as a model attribute to pre-populate the form
			theModel.addAttribute("student", student);

			return "StudentForm";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

			Students std = studentservice.findById(theId);

			theModel.addAttribute("student", std);

			return "StudentForm";
		}

		@PostMapping("/save")
		public String saveStudent(@RequestParam("id") int id, @RequestParam("name") String name,
				@RequestParam("department") String department, @RequestParam("country") String country) {

			
			
			Students student;
			if (id != 0) {
				student = studentservice.findById(id);
				student.setName(name);
				student.setDepartment(department);
				student.setCountry(country);
			} else
				student = new Students(name, department, country);
			// save the Customer
			studentservice.save(student);

			// use a redirect to prevent duplicate submissions
			return "redirect:/students/list";

		}

		@DeleteMapping("/delete")
		public String delete(@RequestParam("id") int theId) {

			// delete the customer
			studentservice.deleteById(theId);

			return "redirect:/students/list";

		}
		

		@GetMapping(value = "/403")
		public ModelAndView accesssDenied(Principal user) {

			ModelAndView model = new ModelAndView();

			if (user != null) {
				model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
			} else {
				model.addObject("msg", "You do not have permission to access this page!");
			}

			model.setViewName("403");
			return model;

		}

	}


