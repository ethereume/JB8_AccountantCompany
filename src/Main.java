import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        LineWorkers lw1 = new LineWorkers("Adam");
        LineWorkers lw2 = new LineWorkers("Pawel");
        LineWorkers lw3 = new LineWorkers("Mateusz");
        LineWorkers lw4 = new LineWorkers("Krysia");
        LineWorkers lw5 = new LineWorkers("Michal");
        LineWorkers lw6 = new LineWorkers("Sylwia");

        ManagementStaff s1 = new ManagementStaff("Wieslaw");
        ManagementStaff s2 = new ManagementStaff("Piotr");

        Accouting a1 = new Accouting("Agnieszka");

        lw1.addTask(new Task(8,"Zadanie 1"));
        lw1.addTask(new Task(2,"Zadanie 2"));
        lw1.addTask(new Task(4,"Zadanie 3"));

        lw2.addTask(new Task(2,"Zadanie 4"));
        lw2.addTask(new Task(2,"Zadanie 5"));
        lw2.addTask(new Task(2,"Zadanie 6"));
        lw2.addTask(new Task(2,"Zadanie 7"));

        lw3.addTask(new Task(2,"Zadanie 8"));

        lw4.addTask(new Task(2,"Zadanie 9"));

        lw5.addTask(new Task(2,"Zadanie 10"));
        lw5.addTask(new Task(2,"Zadanie 11"));
        lw5.addTask(new Task(2,"Zadanie 12"));
        lw5.addTask(new Task(2,"Zadanie 13"));

        lw6.addTask(new Task(2,"Zadanie 14"));
        lw6.addTask(new Task(2,"Zadanie 15"));

        s1.addTask(lw1);
        s1.addTask(lw2);
        s1.addTask(lw3);
        s1.addTask(lw4);
        s2.addTask(lw5);
        s2.addTask(lw6);

        listOfEmployere.add(lw1);
        listOfEmployere.add(lw2);
        listOfEmployere.add(lw3);
        listOfEmployere.add(lw4);
        listOfEmployere.add(lw5);
        listOfEmployere.add(lw6);
        listOfEmployere.add(a1);
        listOfEmployere.add(s1);
        listOfEmployere.add(s2);

        /*List all employers*/
        for (EmployeeI emp : listOfEmployere) {
            emp.getFullName();
        }

        /*List task for Menadzer*/
        System.out.println("Employers for Menadzers "+s1.getName());
        for(LineWorkers workers : s1.getWorkers()){
            System.out.println("Task for Line Workers "+workers.getName());
            for (Task t : workers.getTasks()){
                System.out.println("Task take "+t.getHours()+" hours and task description is "+t.getTaskDescription());
            }
        }
    }
    private static List<EmployeeI> listOfEmployere = new ArrayList<>();
}
