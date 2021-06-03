
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setEmail("cagataybaydar59@hotmail.com");
		student1.setPassword("deneme123");
		student1.setAge(21);
		student1.setFirstName("Çağatay");
		student1.setLastName("Baydar");	
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setEmail("hasan35@gmail.com");
		student2.setPassword("deneme1323");
		student2.setAge(19);
		student2.setFirstName("Hasan");
		student2.setLastName("Yılmaz");	
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setAbout("...");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Mehmet");
		instructor2.setLastName("Yurdakul");
		instructor2.setAbout("....");
		
		Student[] students = {student1,student2};
		
		Instructor[] instructors = {instructor1,instructor2};
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerMultiple(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		
		
	}

}
