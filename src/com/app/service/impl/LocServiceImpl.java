package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocDao;
import com.app.model.Location;
import com.app.service.ILocService;

@Service
public class LocServiceImpl implements ILocService {
	@Autowired
	private ILocDao dao;

	@Override
	public int saveloc(Location loc) {
		int id = dao.saveloc(loc);
		return id;
	}

	@Override
	public List<Location> getAllLocation() {
		List<Location> lLoc = dao.getAllLocation();
		return lLoc;
	}

	@Override
	public void deleteloc(int locId) {
		dao.deleteloc(locId);
	}

	@Override
	public Location getlocationbyId(int locId) {

		return dao.getlocationbyId(locId);

	}

	@Override
	public void updateloc(Location loc) {
		dao.updateloc(loc);
	}
}
