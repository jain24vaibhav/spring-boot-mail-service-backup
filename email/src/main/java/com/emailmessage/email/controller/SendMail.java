package com.emailmessage.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailmessage.email.service.NotificationService;


@RestController
public class SendMail {
	
	@Autowired
	private NotificationService notification;
	
	@RequestMapping("sendmail")
	public String sendmail(){
		try {
			notification.SendNotification();
		}
		catch (MailException e) { 
			System.out.println("Error sending mail" + e.getMessage());
		}
		return "Thank you for regisitering";
	}

}