class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class CircularTaskScheduler {
    private TaskNode head;
    private TaskNode current;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeById(int id) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        TaskNode prev = null;
        do {
            if (temp.taskId == id) {
                if (temp == head && temp.next == head) {
                    head = current = null;
                    System.out.println("Task removed");
                    return;
                }
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    temp = head;
                } else {
                	prev.next = temp.next;
                }
                if (current.taskId == id) {
                    current = temp.next;
                }
                System.out.println("Task is removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        }while(temp != head); 
        
        System.out.println("Task is not found");
    }
    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks scheduled");
            return;
        }
        System.out.println("Current Task:");
        displayTask(current);
        current = current.next;
    }
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found)
            System.out.println("No task found with priority " + priority);
    }
    private void displayTask(TaskNode task) {
        System.out.println("Task ID: " + task.taskId +", Name: " + task.taskName +", Priority: " + task.priority +", Due Date: " + task.dueDate);
    }
}
public class TaskScheduler {
    public static void main(String[] args) {
        CircularTaskScheduler list = new CircularTaskScheduler();
        list.addAtEnd(1, "Design BluePrint", 1, "20-01-2026");
        list.addAtEnd(2, "Gather Raw Material", 2, "06-02-2026");
        list.addAtBeginning(3, "Find Machinery", 1, "25-03-2026");

        System.out.println("All Tasks:");
        list.displayAllTasks();

        System.out.println("View Current Task:");
        list.viewCurrentTask();

        System.out.println("Search Priority 1:");
        list.searchByPriority(1);

        System.out.println("Remove Task ID 2:");
        list.removeById(2);

        System.out.println("Final Task List:");
        list.displayAllTasks();
    }
}
