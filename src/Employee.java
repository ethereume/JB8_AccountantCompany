public class Employee implements EmployeeI {

    public Employee() {}

    public Employee(String name, Workplace workplace) {
        this.name = name;
        this.workplace = workplace;
    }

    public Employee(Workplace workplace) {
        this.workplace = workplace;
    }

    @Override
    public void getFullName() {
        System.out.println("Employe name is "+name+" and work station is "+workplace.getTypeOfWork());
    }

    public String getName() {
        return name;
    }

    public Workplace getWorkplace() {
        return workplace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkplace(Workplace workplace) {
        this.workplace = workplace;
    }

    protected String name;
    protected Workplace workplace;
}
