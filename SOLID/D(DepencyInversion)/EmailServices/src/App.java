public class App {
    public static void main(String[] args) throws Exception {
        EmailServices2 ems = new EmailServices2();
        ems.SendMail(new Gmail2());
        //ems.SendMail(new Hotmail2()); hata verecektir
        EmailServices mailService = new EmailServices();
        mailService.SendMail(new Gmail(), "...", "...");
        mailService.SendMail(new Hotmail(), "...", "...");


    }
}
