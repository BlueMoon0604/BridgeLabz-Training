class StudentNode{
	int rollNo;
	String name;
	int age;
	String grade;
	StudentNode next;
	
	StudentNode(int rollNo, String name , int age , String grade){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}
class StudentList{
	private StudentNode head;
	public void addAtBeginning(int rollNo, String name, int age, String grade) {
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		newNode.next = head;
		head = newNode;
	}
	public void addAtEnd(int rollNo, String name, int age, String grade) {
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		if(head == null) {
			head = newNode;
			return;
		}
		StudentNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
		if(position == 1) {
			addAtBeginning(rollNo, name, age, grade);
			return;
		}
		StudentNode newNode = new StudentNode(rollNo, name, age, grade);
		StudentNode temp = head;
		for(int i = 1 ; i < position - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Invalid Position");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public void searchByRollNo(int rollNo) {
		StudentNode temp= head;
		while(temp != null) {
			if(temp.rollNo == rollNo) {
				System.out.println("Student Found : ");
				displayStudent(temp);
				return;
			}
			temp=temp.next;
		}
		System.out.println("Student not found ");
	}
	public void updateStudentGrade(int rollNo, String newGrade) {
		StudentNode temp = head;
		while(temp != null) {
			if(temp.rollNo == rollNo) {
				temp.grade = newGrade;
				System.out.println("Student grade is updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student not found");
	}
	public void deleteByRollNo(int rollNo) {
		if(head == null) {
			System.out.println("No List is available");
			return;
		}
		if(head.rollNo == rollNo) {
			head = head.next;
			System.out.println("Student record is deleted");
			return;
		}
		StudentNode temp = head;
		while(temp.next != null && temp.rollNo != rollNo) {
			temp = temp.next;
		}
		if(temp.next == null) {
			System.out.println("Student not found");
			
		}else {
			temp.next = temp.next.next;
			System.out.println("Student record is deleted");
		}
	}
	public void displayAll() {
		if(head == null) {
			System.out.println("Records not available");
			return;
		}
		StudentNode temp = head;
		while(temp != null) {
			displayStudent(temp);
			temp = temp.next;
		}
	}
	private void displayStudent(StudentNode student) { 
		System.out.println("Roll No " + student.rollNo + ", Name " +student.name+ ", Age "+student.age+", Grade "+student.grade);
	}
	
}
public class StudentRecord {
	public static void main(String[] args) {
		StudentList list = new StudentList();
		list.addAtBeginning(6, "Nova" , 22, "A+");
		list.addAtEnd(14, "Aaron", 21, "A");
		list.addAtPosition(3, 24, "Karen", 22, "B+");
		
		System.out.println("Students Record");
		list.displayAll();
		
		System.out.println("Search Student Record By Roll No. 6");
		list.searchByRollNo(6);
		
		System.out.println("Update Student Grade Based On Thier Roll No. 14 ");
		list.updateStudentGrade(14,"A+");
		
		System.out.println("Delete Student Record By Roll No. 24");
		list.deleteByRollNo(24);
		
		System.out.println("Final Records");
		list.displayAll();
		
	}

}
