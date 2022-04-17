package com.greatlearning.EmployeeManagement.Entity;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import lombok.AllArgsConstructor;
	import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
	
	@Entity
	

	public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String firstName;
		
		private String lastName;
		
		private String email;

				public Employee(int id, String firstName, String lastName, String email) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

				public Employee() {
					// TODO Auto-generated constructor stub
				}

				public Employee(String firstName2, String lastName2, String email2) {
					// TODO Auto-generated constructor stub
				}

				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
				}

				public String getFirstName() {
					return firstName;
				}

				public void setFirstName(String firstName) {
					this.firstName = firstName;
				}

				public String getLastName() {
					return lastName;
				}

				public void setLastName(String lastName) {
					this.lastName = lastName;
				}

				public String getEmail() {
					return email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

		
	}
