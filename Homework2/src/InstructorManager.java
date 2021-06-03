
public class InstructorManager {
	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Baþarýlý bir þekilde giriþ yaptý.");
		
	}
	
	public void loginMultiple(Instructor[] instructors) {
		for(Instructor instructor : instructors) {
			login(instructor);
		}
	}
}
