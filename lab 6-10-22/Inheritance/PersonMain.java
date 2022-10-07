package lab5;

public class PersonMain 
{

	public static void main(String[] args)
      {
		Student stud = new Student(300, "Vedant", 299);
		Employee emp = new Employee(299, "Prathamesh", 200);
		System.out.println(stud.toString());
		System.out.println(emp.toString());
	}

}