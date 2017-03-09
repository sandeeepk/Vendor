package com.app.dao;

import java.util.List;

import com.app.model.UploadFile;

public interface IUploadDao {
	public int saveUploadFile(UploadFile file);

	public List<Object[]> getFileIdandName();

	public UploadFile getFileObjByid(int fileId);
	public void deletebyid(int fileId);
}
