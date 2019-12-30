package AbstractFactory;

public class AccessFactory implements  Factory {
    @Override
    public User user() {
        return new AccessUser();
    }

    @Override
    public Department department() {

        return new AccessDepartment();
    }
}
