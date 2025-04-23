package utils;
 
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
 
public class Emails {
    public static void sendEmail() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("gladiatorprojectteam05@gmail.com", "kdiz hrwq ehog fopx");
            }
        });
 
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("gladiatorprojectteam05@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("arunkumar900@gmail.com"));
            message.setSubject("Automated Test Report");
 
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find the attached test report.");
 
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
 
            messageBodyPart = new MimeBodyPart();
            String filename = System.getProperty("user.dir") + "/reports/cleveland_Report.html";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
 
            message.setContent(multipart);
 
            Transport.send(message);
 
            System.out.println("Email sent successfully.");
 
        } catch (MessagingException e) {
            e.printStackTrace();
        }
 
    }
}