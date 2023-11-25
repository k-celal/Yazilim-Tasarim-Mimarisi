public class EmailServices {
    public void SendMail(IMailServer mailServer, String to, String body)
    {
        mailServer.Send(to, body);
    }
}
