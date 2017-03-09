package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class commonUtil {
	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String toAddr,String bcc, String subject, String text) {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(toAddr);
			helper.setBcc(bcc);
			helper.setSubject(subject);
			helper.setText(text);

			mailSender.send(message); // to send mail we used
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
