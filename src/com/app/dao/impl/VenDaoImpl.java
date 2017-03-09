package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVenDao;
import com.app.model.Vendor;

@Repository
public class VenDaoImpl implements IVenDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveven(Vendor ven) {
		int id = (Integer) ht.save(ven);
		return id;
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> listven = ht.loadAll(Vendor.class);
		return listven;
	}

	@Override
	public void deletevenById(int venId) {
		ht.delete(new Vendor(venId));
	}

	@Override
	public Vendor getvenById(int venId) {
		
		return (Vendor)ht.get(Vendor.class, venId);
	}

	@Override
	public void updateven(Vendor ven) {
		ht.update(ven);
	}

}
