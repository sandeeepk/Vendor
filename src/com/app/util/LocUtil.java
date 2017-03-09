package com.app.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Location;
import com.app.service.ILocService;

@Component
public class LocUtil {
	@Autowired
	private ILocService service;

	public List<Location> getAllLocation() {
		List<Location> listloc = service.getAllLocation();
		return listloc;

	}
}
