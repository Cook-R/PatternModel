package AbstractFactory;

public class SqlUser implements User {


    @Override
    public void Insert(UserData user) {
        System.out.println("在sql中给User新增了一条信息");

    }

    @Override
    public void GetUser(UserData user) {
        System.out.println("在sql中根据ID得到User一条记录");

    }
}
