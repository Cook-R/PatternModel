package AbstractFactory;

public class SqlFactory implements Factory {
    @Override
    public User user() {
        return new SqlUser();
    }

    @Override
    public Department department() {
        return new SqlDepartment();
    }
}
