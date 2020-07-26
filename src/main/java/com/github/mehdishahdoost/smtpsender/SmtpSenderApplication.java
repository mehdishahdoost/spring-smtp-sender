package com.github.mehdishahdoost.smtpsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class SmtpSenderApplication implements CommandLineRunner {

    @Autowired
    private JavaMailSender javaMailSender;

    public static void main(String[] args) {
        SpringApplication.run(SmtpSenderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("Test");
        simpleMailMessage.setText(" Test");
        simpleMailMessage.setFrom("XXX");
        simpleMailMessage.setTo("XXX");
        javaMailSender.send(simpleMailMessage);
    }
}
