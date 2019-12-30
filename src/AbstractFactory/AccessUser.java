package AbstractFactory;

public class AccessUser implements User {
    @Override
    public void Insert(UserData user) {
        System.out.println("在Access中给User新增了一条信息");
    }

    @Override
    public void GetUser(UserData user) {
        System.out.println("在Access中根据ID给User得到一条信息");
    }
}
