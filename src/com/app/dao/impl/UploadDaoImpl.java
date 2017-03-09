package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUploadDao;
import com.app.model.UploadFile;

@Repository
public class UploadDaoImpl implements IUploadDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int  saveUploadFile(UploadFile file) {
	int id=(Integer)ht.save(file);
return id;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getFileIdandName() {
		String hql = "select fileId,fileName from com.app.model.UploadFile";
		return (List<Object[]>) ht.find(hql);
	}

	@Override
	public UploadFile getFileObjByid(int fileId) {
		UploadFile fileObj = ht.get(UploadFile.class, fileId);
		return fileObj;
	}
@Override
public void deletebyid(int fileId) {
ht.delete(new UploadFile(fileId));	
}
}
