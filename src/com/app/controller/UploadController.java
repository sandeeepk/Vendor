package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.UploadFile;
import com.app.service.IUploadService;

@Controller
public class UploadController {
	@Autowired
	private IUploadService service;

	@RequestMapping("/regFile")
	public String ShowUploadPage(ModelMap map) {
		List<Object[]> listObj = service.getFileIdandName();
		map.addAttribute("ListObj", listObj);
		return "FileUpload";
	}

	@RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
	public String doUpload(@RequestParam("fileId") int fid,
			@RequestParam("filessobj") CommonsMultipartFile fileobj) {
		if (fileobj != null) {
			// convert obj to bytes
			String fileName = fileobj.getOriginalFilename();
			byte[] arr = fileobj.getBytes();
			UploadFile upObj = new UploadFile();
			upObj.setFileId(fid);
			upObj.setFileName(fileName);
			upObj.setFileData(arr);

			service.saveUploadFile(upObj);

		}
		return "redirect:regFile";
	}

	@RequestMapping("/downloadfile")
	public void FileDownload(@RequestParam("fileId") int fileId,
			HttpServletResponse res) {
		UploadFile file = service.getFileObjByid(fileId);
		res.setHeader("Content-Disposition",
				"attachement;fileName=" + file.getFileName());
		try {
			FileCopyUtils.copy(file.getFileData(), res.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/deletefile")
	public String deletebyid(@RequestParam("fileId")int fileId){
		service.deletebyid(fileId);
		return "redirect:regFile";
		
	}
}
