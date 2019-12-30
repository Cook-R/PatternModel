package AbstractFactory;

public class AccessDepartment implements Department {
    @Override
    public void Insert(DepartmentData departmentData) {
        System.out.println("Access在department表新增一条记录");
    }

    @Override
    public DepartmentData GetDepate(int id) {
        System.out.println("在access中根据ID得到department的一条数据");
        return null;
    }

}