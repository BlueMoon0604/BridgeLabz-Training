package lib_Management;

class Staff extends Member {
    public Staff(int userId, String name) {
        super(userId, name);
    }
    public double calculateFine(int lateDays) {
        return lateDays * 1;  
    }
    public String getUserType() {
        return "Staff";
    }
}
