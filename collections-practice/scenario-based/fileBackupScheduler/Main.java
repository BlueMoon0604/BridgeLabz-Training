package fileBackupScheduler;

public class Main {
    public static void main(String[] args) {
        FileBackupScheduler scheduler = new FileBackupScheduler();
        try {
            scheduler.addTask("/critical/db", 10);
            scheduler.addTask("/logs/app", 5);
            scheduler.addTask("/user/docs", 3);
            scheduler.addTask("", 7);  
        } catch (InvalidBackupPathException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scheduler.showPendingTasks();
        scheduler.executeTasks();
    }
}

