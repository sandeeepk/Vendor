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
import com.app.service.ILocService;

@Controller
public class LocController {
	@Autowired
	private ILocService service;

	@RequestMapping("/regLoc")
	public String ShowPage() {
		return "LocReg";

	}

	@RequestMapping(value = "/insertloc", method = RequestMethod.POST)
	public String saveloc(@ModelAttribute("location") Location loc, ModelMap map) {
		int id = service.saveloc(loc);
		map.addAttribute("msg", "SuccessFully added to database  id:" + id);
		return "LocReg";

	}

	@RequestMapping("/viewAllloc")
	public String getAllloc(ModelMap map) {
		List<Location> list = service.getAllLocation();
		map.addAttribute("listObj", list);
		return "LocData";

	}

	@RequestMapping("/delete")
	public String deleteloc(@RequestParam("locId") int locId) {
		service.deleteloc(locId);
		return "redirect:viewAllloc";

	}

	@RequestMapping("/edit")
	public String getlocationById(@RequestParam("locId") int locId, ModelMap map) {
		Location loc = service.getlocationbyId(locId);
		map.addAttribute("locObj", loc);
		return "LocEdit";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Updateloc(@ModelAttribute("location") Location loc) {
		service.updateloc(loc);
		return "redirect:viewAllloc";

	}

	/*		@RequestMapping("/ExcelView")
public String ExportExcel(ModelMap map) {
		List<Location> listobj = service.getAllLocation();
		map.addAttribute("", listobj);
		return "locExcel";

	}

	@RequestMapping("/PdfView")
	public String ExportPdf() {

		return "locPdf";*/

	}

