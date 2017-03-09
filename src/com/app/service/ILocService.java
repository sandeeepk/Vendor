package com.app.service;

import java.util.List;

import com.app.model.Location;

public interface ILocService {
	public int saveloc(Location loc);

	public List<Location> getAllLocation();

	public void deleteloc(int locId);

	public Location getlocationbyId(int locId);

	public void updateloc(Location loc);

}
