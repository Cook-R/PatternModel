package AbstractFactory;

public class AbFactoryTest {
    public static void main(String[] args) {
        UserData userData = new UserData();
        DepartmentData departmentData = new DepartmentData();

//        User sqlUser = new SqlUser();

//        Department sqlDepartment = new SqlDepartment();

        Factory sqlFactory = new SqlFactory();

        Department department = sqlFactory.department();
        User user = sqlFactory.user();

        user.Insert(userData);
        user.GetUser(userData);

        department.Insert(departmentData);
        department.GetDepate(1);



    }
}
