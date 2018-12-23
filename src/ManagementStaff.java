import java.util.ArrayList;
import java.util.List;

public class ManagementStaff extends Employee {
    ManagementStaff(String name){
        super(Workplace.MANAGEMENTSTAFF);
        this.name = name;
    }

    public List<LineWorkers> getWorkers() {
        return workers;
    }
    public void addTask(LineWorkers t) {
        workers.add(t);
    }
    public void setWorkers(List<LineWorkers> workers) {
        this.workers = workers;
    }

    private List<LineWorkers> workers = new ArrayList<>();
}
