package com.emailmessage.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;

	@Autowired
	public NotificationService(JavaMailSender jms) {
		this.javaMailSender = jms;
	}

	public void SendNotification() throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("csbsvits@gmail.com");
		mail.setSubject("Sample subject");
		mail.setText("This is sample body");

		javaMailSender.send(mail);
	}
}
