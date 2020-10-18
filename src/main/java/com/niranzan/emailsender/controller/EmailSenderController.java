/**
 * 
 */
package com.niranzan.emailsender.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niranzan.emailsender.model.Mail;
import com.niranzan.emailsender.service.EmailSenderService;

/**
 * @author Niranjan
 *
 */

@RestController
@RequestMapping("/email")
public class EmailSenderController {
	@Autowired
    private EmailSenderService emailService;
	private static Logger log = LoggerFactory.getLogger(EmailSenderController.class);
	
	@GetMapping
	public String sendMail() {
		log.info("START... Sending email");

        Mail mail = new Mail();
        mail.setFrom("sender@email.com");
        mail.setMailTo("receiver@email.com");
        mail.setSubject("Email with Spring boot and thymeleaf template!");

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", "Developer!");
        model.put("location", "India");
        model.put("sign", "Java Developer");
        mail.setProps(model);

        try {
			emailService.sendEmail(mail);
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        log.info("END... Email sent success");
        return "Email Sent";
	}
}