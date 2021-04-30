package javaCampDayThreeHomework;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engind@gmail.com");
		instructor1.setCourse("Java Kamp");
		instructor1.setInstructorNumber("12345");

		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Varış");
		instructor2.setEmail("keremv@gmail.com");
		instructor2.setCourse("C# Kamp");
		instructor2.setInstructorNumber("78910");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Esra");
		student1.setLastName("Keleş");
		student1.setEmail("esrak@gmail.com");
		student1.setCourse("Java Kamp");
		student1.setStudentNumber("45678");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
	
		System.out.println();
		
		User[] user = {instructor1, instructor2, student1};
		
		userManager.multipleAdd(user);

	}

}
