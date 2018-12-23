import java.util.ArrayList;
import java.util.List;

public class LineWorkers extends Employee {
    public LineWorkers(String name) {
        super(Workplace.LINEWORKERS);
        this.name = name;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public void addTask(Task t) {
        tasks.add(t);
    }

    private List<Task> tasks = new ArrayList<>();
}
