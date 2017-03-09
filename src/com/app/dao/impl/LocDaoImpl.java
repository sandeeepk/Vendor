package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILocDao;
import com.app.model.Location;

@Repository
public class LocDaoImpl implements ILocDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveloc(Location loc) {
		int id = (Integer) ht.save(loc);
		return id;
	}

	@Override
	public List<Location> getAllLocation() {
		List<Location> listloc = ht.loadAll(Location.class);
		return listloc;
	}

	@Override
	public void deleteloc(int locId) {
		ht.delete(new Location(locId));
	}

	@Override
	public Location getlocationbyId(int locId) {
		return (Location) ht.get(Location.class, locId);
	}

	@Override
	public void updateloc(Location loc) {
		ht.update(loc);
	}
}
