import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Scanner;
public class SMTP {
            public static void main(String[] args) {
                        Scanner scn = new Scanner(System.in);
                        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
                        Properties props = System.getProperties();
                        props.setProperty("mail.smtp.host", "smtp.gmail.com");
                        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
                        props.setProperty("mail.smtp.socketFactory.fallback", "false");
                        props.setProperty("mail.smtp.port", "465");
                        props.setProperty("mail.smtp.socketFactory.port", "465");
                        props.put("mail.smtp.auth", "true");
                        props.put("mail.debug", "false");
                        props.put("mail.store.protocol", "pop3");
                        props.put("mail.transport.protocol", "smtp");
                        System.out.println("SMTP\n");
                        System.out.println("------------------------------------------------------------------\n");
                        System.out.print("Enter Username: ");
                        final String username = scn.nextLine();
                        System.out.print("Enter Password: ");
                        final String password = scn.nextLine();
                        System.out.println("------------------------------------------------------------------\n");
                        try {
                                    Session session = Session.getDefaultInstance(props, new Authenticator() {
                                                protected PasswordAuthentication getPasswordAuthentication() {
                                                            return new PasswordAuthentication(username, password);
                                                }
                                    });
                                    Message msg = new MimeMessage(session);
                                    msg.setFrom(new InternetAddress(username));
                                    System.out.print("To: ");
                                    String to = scn.nextLine();
                                    System.out.println("------------------------------------------------------------------\n");
                                    System.out.print("Subject : ");
                                    String subject = scn.nextLine();
                                    System.out.print("Body: ");
                                    String body = scn.nextLine();
                                    System.out.println("------------------------------------------------------------------\n");
                                    msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
                                    msg.setSubject(subject);
                                    msg.setText(body);
                                    msg.setSentDate(new Date());
                                    Transport.send(msg);
                                    System.out.println("Message sent.");
                        } catch (MessagingException e) {
                                    System.out.println("Invalid Username or Password");
                                                            }
            }
}

