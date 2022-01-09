package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SpringEmail {
	@Autowired
	private JavaMailSender mailSender;
	public void sendEmail(String toEmail,String subject,String body) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom("ritik.srivastava305@gmail.com");
		msg.setTo("ritik.sri30@gmail.com");
		msg.setText(body);
		msg.setSubject(subject);
		mailSender.send(msg);
		System.out.println("Success");
	}
}
