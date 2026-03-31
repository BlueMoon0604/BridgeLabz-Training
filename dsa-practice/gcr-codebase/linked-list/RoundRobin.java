class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    ProcessNode next;

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}
class CpuScheduler {
    private ProcessNode head;
    private ProcessNode current;
    private int timeQuantum;
    private int totalTime = 0;
    private int processCount = 0;

    CpuScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }
    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        processCount++;
    }
    private void removeProcess(int id) {
        if (head == null)
            return;
        ProcessNode temp = head;
        ProcessNode prev = null;
        do {
            if (temp.processId == id) {
                if (temp == head && temp.next == head) {
                    head = current = null;
                } else {
                    if (temp == head) {
                        ProcessNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = temp.next;
                    }
                    if (current == temp) {
                        current = temp.next;
                    }
                }
                processCount--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    public void simulate() {
        if (head == null) {
            System.out.println("No processes are  available");
            return;
        }
        System.out.println("Round Robin Scheduling started at (Time Quantum = " + timeQuantum + ")");
        while (processCount > 0) {
            displayProcesses();
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= execTime;
                totalTime += execTime;
                ProcessNode temp = current.next;
                while (temp != current) {
                    if (temp.remainingTime > 0) {
                        temp.waitingTime += execTime;
                    }
                    temp = temp.next;
                }
                System.out.println("Process " + current.processId + " executed for " + execTime + " units");
            }
            if (current.remainingTime == 0) {
                current.turnaroundTime = totalTime;
                System.out.println("Process " + current.processId + " completed");
                removeProcess(current.processId);
            } else {
                current = current.next;
            }
        }
        calculateAverageTimes();
    }
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes are  left");
            return;
        }
        ProcessNode temp = head;
        System.out.println("Current Process Queue:");
        do {
            System.out.println("PID: " + temp.processId + ", Remaining Time: " + temp.remainingTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
    private void calculateAverageTimes() {
        double totalWT = 0, totalTAT = 0;
        int completed = 0;
        System.out.println("Scheduling is Done");
        System.out.println("Total Time: " + totalTime);
        System.out.println("Average Waiting Time = Total Waiting Time / Number of Processes");
        System.out.println("Average Turnaround Time = Total Turnaround Time / Number of Processes");
    }
}
public class RoundRobin {
    public static void main(String[] args) {
        CpuScheduler scheduler = new CpuScheduler(3);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.simulate();
    }
}
