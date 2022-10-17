/*3. Implement a class for a “Person”. Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’,
‘address’ with proper reader/write methods etc. Now create two subclasses “Employee” and “Student”.
Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ etc. Student has data
members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’. Again create two sub-classes
“Technician” and “Professor” from Employee. Professor has data members ‘courses’, ‘listOfAdvisee’ and
their add/remove methods. Write a main() function to demonstrate the creation of objects of different
classes and their method calls.
@006_Akash Kadbhane_JH
*/
import java.util.*;

abstract class Person{
	public Strint type;
	private int age;
	private double weight , height;
	private String dateOfBirth,address;
	public Person () {
		
	}
	public Person(int age, double weight, double height, String dateOfBirth, String address) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	
}
class Empolyee extends Person{
	private double salary;
	private int experience;
	private String dateOfJoining;
	public Empolyee() {
		}
	public Empolyee(int age, double weight, double height, String dateOfBirth, String address, double salary,
			int experience, String dateOfJoining) {
		super(age, weight, height, dateOfBirth, address);
		this.salary = salary;
		this.experience = experience;
		this.dateOfJoining = dateOfJoining;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @return the dateOfJoining
	 */
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	
}
class Student extends Person{
	int s = 0;
	String type = "Student";
	private String name;
	private int rollNo;
	private int sub1,sub2,sub3,sub4,sub5;
	public Student() {
		
	}
	
	public Student(int age, double weight, double height, String dateOfBirth, String address,String name, int rollNo, int sub1,
			int sub2, int sub3, int sub4, int sub5) {
		super(age, weight, height, dateOfBirth, address);
		this.name=name;
		this.rollNo = rollNo;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}
	List <Student> s1 =new ArrayList<Student>();
	
	void addStudent() {
		s1.add(new Student(12,56.7,5.4,"08/01/1998","XXX ZZZ  INDEX1  YYY pin-12334","Akash K",13,89,89,89,89,89));
		s1.add(new Student(17,45.89,6.7,"3/1/18","sfdgf ZZZ sddfbgn  INDEX2  Y pi-14","kadbhaen",15,9,9,9,9,9));
	}
	void removeStudent(int index) {
		s1.remove(index);
	}
	void printStudent() {
		for(Student s : s1) {
			System.out.println(s);
		}
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @return the sub1
	 */
	public int getSub1() {
		return sub1;
	}
	/**
	 * @return the sub2
	 */
	public int getSub2() {
		return sub2;
	}
	/**
	 * @return the sub3
	 */
	public int getSub3() {
		return sub3;
	}
	/**
	 * @return the sub4
	 */
	public int getSub4() {
		return sub4;
	}
	/**
	 * @return the sub5
	 */
	public int getSub5() {
		return sub5;
	}

	public String calculateGrade() {
		String s = null;
		int avg=(sub1+sub2+sub3+sub4+sub5)/5;
		if(avg>75){
			s="Gred is First class with distiction";
		}else if(avg>60){
			s="Gred is First class";
		}else if(avg>40){
			s="Gred is secound class";
		}else{
			s="Failed";
		}
		return s;
	}
	@Override
	public String toString() {
		System.out.println("======================================================================");
		return "Student [getName()=" + getName() + ",\n getRollNo()=" + getRollNo() + ",\n getSub1()=" + getSub1()
				+ ",\n getSub2()=" + getSub2() + ",\n getSub3()=" + getSub3() + ",\n getSub4()=" + getSub4() + ",\n getSub5()="
				+ getSub5() + ",\n calculateGrade()=" + calculateGrade() + ",\n getAge()=" + getAge() + ",\n getWeight()="
				+ getWeight() + ",\n getHeight()=" + getHeight() + ",\n getDateOfBirth()=" + getDateOfBirth()
				+ ",\n getAddress()=" + getAddress() + "]";
	}
	
}
class Professor extends Empolyee{
	String type ="Professor";
	private String name,courese,listOfAdvice;
	public Professor() {}

	public Professor(int age, double weight, double height, String dateOfBirth, String address, double salary,
			int experience, String dateOfJoining,String name, String courese, String listOfAdvice) {
		super(age, weight, height, dateOfBirth, address, salary, experience, dateOfJoining);
		this.name=name;
		this.courese = courese;
		this.listOfAdvice = listOfAdvice;
	}
	List <Professor> p1 =new ArrayList<Professor>();
	void addProfessor() {
		p1.add(new Professor(34,56.88,5.3,"12/12/2345","QQQQ,WWINDEX INDEX1 1WW,EER098765",150009.90,3,"30/2/1234","ravinkumar","mech","advice \n adbhic\n hjkdl\n dfghfdgf"));
		p1.add(new Professor(54,59.8,5,"1/1/25","QdfgQQQ,WWWasdfn  INDEX2 cW,INDEX2EER065",19.90,3,"10/2/6543","ssrao","mech","advice \n adbhic\n hjkdl\n dfghfdgf"));
	}
	void removeProfessor(int index) {
		p1.remove(index);
	}
	void printProfessor() {
		for(Professor s : p1) {
			System.out.println(s);
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the courese
	 */
	public String getCourese() {
		return courese;
	}

	/**
	 * @return the listOfAdvice
	 */
	public String getListOfAdvice() {
		return listOfAdvice;
	}

	@Override
	public String toString() {
		System.out.println("======================================================================");
		return "Professor [getName()=" + getName() + ",\n getCourese()=" + getCourese() + ",\n getListOfAdvice()="
				+ getListOfAdvice() + ",\n getSalary()=" + getSalary() + ",\n getExperience()=" + getExperience()
				+ ",\n getDateOfJoining()=" + getDateOfJoining() + ", getAge()=" + getAge() + ", getWeight()="
				+ getWeight() + ",\n getHeight()=" + getHeight() + ",\n getDateOfBirth()=" + getDateOfBirth()
				+ ",\n getAddress()=" + getAddress() + "]";
	}
	
}
class Technician extends Empolyee{
	String type ="Technician";
	private String name;
	public Technician(){}
	public Technician(int age, double weight, double height, String dateOfBirth, String address, double salary,
			int experience, String dateOfJoining,String name) {
		super(age, weight, height, dateOfBirth, address, salary, experience, dateOfJoining);
		this.name=name;
	}
	List <Technician> t1 =new ArrayList<Technician>();
	void addTechnician () {
		t1.add(new Technician(45,66,7,"2/3/45","aaaaaaaaaaa  INDEX1  aaa09876",123456,5,"31/12.4321","skraman"));
		t1.add(new Technician(55,76,6,"12/3/65","aaccccccccccb  INDEX2  v23456",12654,2,"1/1231","skiranraman"));
	}
	void removeTechnician(int index) {
		t1.remove(index);
	}
	void printTechnician() {
		for(Technician s : t1) {
			System.out.println(s);
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		System.out.println("======================================================================");
		return "Technician [getName()=" + getName() + ",\n getSalary()=" + getSalary() + ",\n getExperience()="
				+ getExperience() + ",\n getDateOfJoining()=" + getDateOfJoining() + ",\n getAge()=" + getAge()
				+ ",\n getWeight()=" + getWeight() + ",\n getHeight()=" + getHeight() + ",\n getDateOfBirth()="
				+ getDateOfBirth() + ",\n getAddress()=" + getAddress() + "]";
	}
	
	
}
public class PersonOops {

	public static void main(String[] args) {
		
		Student pp1 = new Student();
		pp1.addStudent();
		Professor pp2 = new Professor();
		pp2.addProfessor();
		Technician pp3 = new Technician();
		pp3.addTechnician();
		pp1.printStudent();
		pp2.printProfessor();
		pp3.printTechnician();
		pp1.removeStudent(0);
		pp2.removeProfessor(0);
		pp3.removeTechnician(0);
		pp1.printStudent();
		pp2.printProfessor();
		pp3.printTechnician();
		

	}

}
