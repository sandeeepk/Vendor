package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IVenDao;
import com.app.model.Vendor;
import com.app.service.IVenService;

@Service
public class VenServiceImpl implements IVenService {
	@Autowired
	private IVenDao dao;

	@Override
	public int saveven(Vendor ven) {
		int id = dao.saveven(ven);
		return id;
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> listven = dao.getAllVendor();
		return listven;
	}

	@Override
	public void deletevenById(int venId) {
		dao.deletevenById(venId);
	}

	@Override
	public Vendor getvenById(int venId) {
		Vendor ven = dao.getvenById(venId);
		return ven;
	}

	@Override
	public void updateven(Vendor ven) {
		dao.updateven(ven);
	}

}
