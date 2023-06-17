package com.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.Funit_Dao;
import com.spring.model.FunitModel;

@Controller
public class FunitController {
	@Autowired
	Funit_Dao functionalUnitDao;

	public FunitController() {
		// TODO Auto-generated constructor stub
	}

	FunitModel functionalUnit;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String funit(Model m,@RequestParam("modl_id)Integer modl_id) {
		ArrayList<FunitModel> f1 = (ArrayList<FunitModel>) functionalUnitDao.getfunitbyid(modl_id);
		m.addAttribute("f1", f1);
		System.out.println(f1 + " " + "controller");
		return "funit";
	}

	@RequestMapping(value = "/create")
	public String createfunit() {
		return "create";
	}

	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public String targetPage(HttpSession session, Model model) {
	// // Retrieve the ID from the session
	// int id = (int) session.getAttribute("id");
	//
	// // Pass the ID to the DAO to retrieve data
	// ArrayList<FunitModel> f1 = (ArrayList<FunitModel>) p.getfunitbyid(id);
	//
	// // Add the retrieved data to the model
	// model.addAttribute("f1", f1);
	//
	// // Return the view name for the target page
	// return "targetPage";
	// }
	@PostMapping("/newfunit")
	public String newfunit(@RequestParam("modl_id") int modl_id, @RequestParam("f_unit_id") int funit_id) {
		functionalUnitDao.createmodel(modl_id, funit_id); // Modify the method call as per your DAO implementation
		return "redirect:/"; // Redirect back to the main page after form submission
	}
	// Other controller methods

}
