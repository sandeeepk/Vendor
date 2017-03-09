package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VENTAB")
public class Vendor {
	@Id
	private int venId;
	private String venName;
	private String venEmail;
	@ManyToOne
	@JoinColumn(name = "locId_fk")
	private Location loc;

	public Vendor() {
		super();
	}

	public Vendor(int venId) {
		super();
		this.venId = venId;
	}

	public Vendor(int venId, String venName, String venEmail, Location loc) {
		super();
		this.venId = venId;
		this.venName = venName;
		this.venEmail = venEmail;
		this.loc = loc;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName
				+ ", venEmail=" + venEmail + ", loc=" + loc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		result = prime * result
				+ ((venEmail == null) ? 0 : venEmail.hashCode());
		result = prime * result + venId;
		result = prime * result + ((venName == null) ? 0 : venName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		if (venEmail == null) {
			if (other.venEmail != null)
				return false;
		} else if (!venEmail.equals(other.venEmail))
			return false;
		if (venId != other.venId)
			return false;
		if (venName == null) {
			if (other.venName != null)
				return false;
		} else if (!venName.equals(other.venName))
			return false;
		return true;
	}

}
