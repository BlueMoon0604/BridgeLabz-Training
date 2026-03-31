package fileBackupScheduler;

import java.util.*;

public class FileBackupScheduler {
    private PriorityQueue<BackupTask> tasks;
    
    public FileBackupScheduler() {
        tasks = new PriorityQueue<>();
    }
    
    public void addTask(String folderPath, int priority) throws InvalidBackupPathException {
        if (folderPath == null || folderPath.trim().isEmpty() || !folderPath.contains("/") && !folderPath.contains("\\")) {
            throw new InvalidBackupPathException("Invalid backup path: " + folderPath);
        }
        tasks.add(new BackupTask(folderPath, priority));
        System.out.println("Task added: " + folderPath + " (Priority: " + priority + ")");
    }
    
    public void executeTasks() {
        System.out.println("Executing backups in priority order:");
        while (!tasks.isEmpty()) {
            BackupTask task = tasks.poll();
            System.out.println("Backing up: " + task);
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public void showPendingTasks() {
        List<BackupTask> copy = new ArrayList<>(tasks);
        System.out.println("Pending tasks (priority order):");
        copy.forEach(System.out::println);
    }
}

