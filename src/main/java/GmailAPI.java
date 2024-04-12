//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.services.gmail.Gmail;
//import com.google.api.services.gmail.model.ListMessagesResponse;
//import com.google.api.services.gmail.model.Message;
//import com.google.api.services.gmail.model.MessagePartHeader;
//
//import java.io.File;
//import java.io.IOException;
//import java.security.GeneralSecurityException;
//import java.util.List;
//
//public class GmailAPI {
//
//    private static final String APPLICATION_NAME = "Gmail API Java Quickstart";
////    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//    private static final String USER_ID = "me";
//    private static final String LABEL_NAME = "INBOX";
//    private static final long MAX_RESULTS = 10;
//
//    private static String CREDNTIALS_FILE = "";
//
//    public static void main(String[] args) throws GeneralSecurityException, IOException {
//
//        CREDNTIALS_FILE= System.getProperty("user.dir")+ File.separator +"src"+
//                File.separator+"main"+ File.separator+"resources"+File.separator+
//                "credentials";
//
//
//        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//        Credential credential = GoogleCredential.fromStream(GmailAPI.class.getResourceAsStream(CREDNTIALS_FILE))
//                .createScoped(List.of("https://www.googleapis.com/auth/gmail.readonly"));
//        Gmail gmailService = new Gmail.Builder(httpTransport, "JSON_FACTORY", credential).setApplicationName(APPLICATION_NAME).build();
//
//        ListMessagesResponse response = gmailService.users().messages().list(USER_ID)
//                .setLabelIds(List.of(LABEL_NAME))
//                .setMaxResults(MAX_RESULTS)
//                .execute();
//
//        List<Message> messages = response.getMessages();
//        for (Message message : messages) {
//            Message msg = gmailService.users().messages().get(USER_ID, message.getId()).execute();
//            List<MessagePartHeader> headers = msg.getPayload().getHeaders();
//
//            // Get the email address of the sender
//            for (MessagePartHeader header : headers) {
//                if (header.getName().equals("From")) {
//                    String sender = header.getValue();
//                    break;
//                }
//            }
//
//            // Get the subject of the email
//            for (MessagePartHeader header : headers) {
//                if (header.getName().equals("Subject")) {
//                    String subject = header.getValue();
//                    break;
//                }
//            }
//
//            // Process the message body here
//            // ...
//        }
//    }
//}
