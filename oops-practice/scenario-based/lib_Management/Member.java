package lib_Management;

abstract class Member extends User implements FineCalculator {

    public Member(int userId, String name) {
        super(userId, name);
    }
    public String toString() {
        return userId + " | " + name + " | " + getUserType();
    }
}

