package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUploadDao;
import com.app.model.UploadFile;
import com.app.service.IUploadService;

@Service
public class UploadServiceImpl implements IUploadService {
	@Autowired
	private IUploadDao dao;

	@Override
	public int saveUploadFile(UploadFile file) {
		int id = (Integer) dao.saveUploadFile(file);
		return id;
	}

	@Override
	public List<Object[]> getFileIdandName() {
		List<Object[]> listObj = dao.getFileIdandName();
		return listObj;
	}

	@Override
	public UploadFile getFileObjByid(int fileId) {

		return dao.getFileObjByid(fileId);
	}

@Override
public void deletebyid(int fileId) {
dao.deletebyid(fileId);	
}
}
