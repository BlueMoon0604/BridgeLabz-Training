package DataSerializationforBackup;

public class Main {
	public static void main(String[] args) {

        Employee emp = new Employee(1231, "Nova");
        TempData temp = new TempData("WEE123");

        BackupProcessor.backup(emp);   
        BackupProcessor.backup(temp);  
    }
}
