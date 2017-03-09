package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.model.Vendor;
import com.app.service.IVenService;
import com.app.util.LocUtil;
import com.app.util.commonUtil;

@Controller
public class VendorController {
	@Autowired
	private IVenService service;
	@Autowired
	private LocUtil locutil;
	@Autowired
	private commonUtil commonutil;

	@RequestMapping("/regVen")
	public String ShowVenPage(ModelMap map) {
		List<Location> listlocu = locutil.getAllLocation();
		map.addAttribute("loclistObj", listlocu);
		return "VenReg";

	}

	@RequestMapping(value = "/insertVen", method = RequestMethod.POST)
	public String Saveven(@ModelAttribute("vendor") Vendor ven, ModelMap map) {
		int id = service.saveven(ven);
		String msg = "Successfully registered By Mail id:" + id+"     "+ven.getVenName();
		map.addAttribute("msg", "Successfully saved by id:" + id);
		commonutil.sendEmail(ven.getVenEmail(), "sandeepkottagundu@gmail.com",
				"Registered Vendor", msg);
		return "VenReg";

	}

	@RequestMapping("/viewAllVen")
	public String getAllVen(ModelMap map) {
		List<Vendor> listven = service.getAllVendor();
		map.addAttribute("listvenObj", listven);
		return "VenData";

	}

	@RequestMapping("/deleteven")
	public String deleteven(@RequestParam("venId") int venId) {
		service.deletevenById(venId);

		return "redirect:viewAllVen";

	}

	@RequestMapping(value = "/editven")
	public String getAllvenById(@RequestParam("venId") int venId, ModelMap map) {
		Vendor ven = service.getvenById(venId);
		map.addAttribute("venObj", ven);
		return "VenEdit";

	}

	@RequestMapping(value = "/updateven", method = RequestMethod.POST)
	public String UpdateVen(@ModelAttribute("vendor") Vendor ven) {
		service.updateven(ven);
		return "redirect:viewAllVen";

	}
}
