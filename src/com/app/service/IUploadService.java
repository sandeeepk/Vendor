package com.app.service;

import java.util.List;

import com.app.model.UploadFile;

public interface IUploadService {
	public int  saveUploadFile(UploadFile file);

	public List<Object[]> getFileIdandName();

	public UploadFile getFileObjByid(int fileId);
	public void deletebyid(int fileId);
}
