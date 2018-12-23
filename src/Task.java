public class Task {

    public Task(int hours, String taskDescription) {
        this.hours = hours;
        this.taskDescription = taskDescription;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    private int hours;
    private String taskDescription;
}
