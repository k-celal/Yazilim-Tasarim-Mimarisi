public class MSSQLAdapter implements DB{
    private MSSQL mssql;
    public MSSQLAdapter(){
        mssql=new MSSQL();
    }
    @Override
    public User selectUserById(int id) {
        return mssql.USERSELECET(id);
    }

    @Override
    public void insertUser(User user) {
        mssql.userıntest(user);
    }
    
}
