package javaCampDayThreeHomework;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println("Eðitmen " + user.getFirstName() + " " + user.getLastName() + 
							" " + user.getCourse() + " kursuna kaydedildi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Eðitmen " + user.getFirstName() + " " + user.getLastName() + 
							" " + user.getCourse() + " kursundan silindi.");
	}

}
