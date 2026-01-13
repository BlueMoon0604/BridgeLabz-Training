package lib_Management;

class Student extends Member {

    public Student(int userId, String name) {
        super(userId, name);
    }
    public double calculateFine(int lateDays) {
        return lateDays * 2;  
    }
    public String getUserType() {
        return "Student";
    }
}

