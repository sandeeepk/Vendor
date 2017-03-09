package com.app.dao;

import java.util.List;

import com.app.model.Vendor;

public interface IVenDao {
public int saveven(Vendor ven);
public List<Vendor> getAllVendor();
public void deletevenById(int venId);
public Vendor getvenById(int venId);
public void updateven(Vendor ven);
}
