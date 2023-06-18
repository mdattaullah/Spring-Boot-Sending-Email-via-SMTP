package com.demo.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	JavaMailSender javaMailSender;
	
	@GetMapping("email")
	public String sendMail() {
		
		SimpleMailMessage mailMessage
        = new SimpleMailMessage();

    // Setting up necessary details
	    mailMessage.setFrom("linkedin@noreply.com"); 
	    mailMessage.setTo("noreply@gmail.com");//put own your mail id 
	    mailMessage.setText("dfghjk");
	    mailMessage.setSubject("fghjk");

    // Sending the mail
    javaMailSender.send(mailMessage);
		
		return "Email Sent";
	}
}
