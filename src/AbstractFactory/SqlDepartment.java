package AbstractFactory;

public class SqlDepartment implements Department {
    @Override
    public void Insert(DepartmentData departmentData) {
        System.out.println("sql在department表新增一条记录");
    }

    @Override
    public DepartmentData GetDepate(int id) {
        System.out.println("在sql中根据ID得到department的一条数据");
        return null;
    }

}
