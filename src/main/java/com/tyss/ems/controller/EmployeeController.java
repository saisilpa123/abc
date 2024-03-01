package com.tyss.ems.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.ems.entity.Employee;

@Controller
public class EmployeeController {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	@RequestMapping("/save")
	public ModelAndView saveEmployee(@RequestParam String name, @RequestParam String email, @RequestParam long phone,
			@RequestParam String password, @RequestParam double sal, Model m, ModelAndView mv) {

		Employee e = new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setPassword(password);
		e.setSal(sal);
		e.setPhone(phone);
		transaction.begin();
		manager.persist(e);
		transaction.commit();
		String msg = "Employee details saved....";
		m.addAttribute("msg", msg);
		return fetchAllemployeeModel(mv);
	}

	// fetchall--> Fetch all the employees and move to view.jsp
	// Model and view is a class
	@RequestMapping("/fetchall")
	public ModelAndView fetchAllemployeeModel(ModelAndView mv) {
		Query query = manager.createQuery("from Employee");
		List<Employee> employees = query.getResultList();

		mv.setViewName("view.jsp");
		mv.addObject("employees", employees);
		return mv;

	}

	/*
	 * <% for(int i=0;i<n;i++) sysout("hello") %> <!-- Scriplet tag to write java
	 * code--> <%! %> <!-- Declaration tag to declare methods--> <%= %> <!--
	 * Expression tag to fetxch the variables-->
	 */

	// delete?id=1-->delete the employee of the id coming in request param
	@RequestMapping("/delete")
	public ModelAndView deleteEmployeeById(@RequestParam int id, ModelAndView mv) {
		Employee employee = manager.find(Employee.class, id);
		if (employee != null) {
			transaction.begin();
			manager.remove(employee);
			transaction.commit();

		}
		return fetchAllemployeeModel(mv);
	}

	@RequestMapping("/update")
	public ModelAndView updatemployee(@RequestParam int id, ModelAndView mv) {
		Employee employee = manager.find(Employee.class, id);
		mv.addObject("employee", employee);
		mv.setViewName("update.jsp");
		return mv;
	}

	@RequestMapping("/updateemp")
	public ModelAndView updateEmp(@RequestParam int id, @RequestParam String name, @RequestParam String email,
			@RequestParam long phone, @RequestParam String password, @RequestParam double sal, ModelAndView mv) {
		Employee e =manager.find(Employee.class, id);
		e.setName(name);
		e.setPassword(password);
		e.setSal(sal);
		e.setPhone(phone);
		e.setEmail(email);
		
		if(e!=null)
		{
			transaction.begin();
			manager.merge(e);
			transaction.commit();
		}
		return fetchAllemployeeModel(mv);

	}

}
