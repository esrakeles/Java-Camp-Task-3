package javaCampDayThreeHomework;

public class StudentManager extends UserManager{
	
	
	@Override
	public void add(User user) {
		System.out.println("Öğrenci " + user.getFirstName() + " " + user.getLastName() + 
							" " + user.getCourse() + " kursuna kaydedildi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Öğrenci " + user.getFirstName() + " " + user.getLastName() + 
							" " + user.getCourse() + " kursundan silindi.");
	}

}
