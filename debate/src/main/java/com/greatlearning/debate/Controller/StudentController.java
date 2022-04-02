package com.greatlearning.debate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.debate.Entity.Students;
import com.greatlearning.debate.Service.StudentService;

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

			Students student = new Students();
			theModel.addAttribute("student", student);

			// send over to our form
			return "StudentForm";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

			// get the student from the service
			Students std = studentservice.findById(theId);

			// set Student as a model attribute to pre-populate the form
			theModel.addAttribute("student", std);

			// send over to our form
			return "StudentForm";
		}

		@PostMapping("/save")
		public String saveStudent(@RequestParam("id") int id, @RequestParam("name") String name,
				@RequestParam("department") String department, @RequestParam("country") String country) {

			Students std;
			if (id != 0) {
				std = studentservice.findById(id);
				std.setName(name);
				std.setDepartment(department);
				std.setCountry(country);
			} else
				std = new Students(name, department, country);
			// save the Student
			studentservice.save(std);

			// use a redirect to prevent duplicate submissions
			return "redirect:/students/list";

		}

		@RequestMapping("/delete")
		public String delete(@RequestParam("id") int theId) {

			// delete the student
			studentservice.deleteById(theId);

			return "redirect:/students/list";

		}

}
