public class App {
    public static void main(String[] args) throws Exception {
        User user=new User();
        user.setId(0);
        DBFacade dbFacade=new DBFacade(new Oracle());
        dbFacade.addUser(user);
        User user2=new User();
        DBFacade dbFacade2=new DBFacade(new MSSQLAdapter());
        dbFacade2.addUser(user2);

    }
}
