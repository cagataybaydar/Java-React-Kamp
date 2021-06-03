
public class StudentManager {
	public void register(Student student) {
		System.out.println("Öğrenci kayıt olmuştur : " + student.getEmail());
	}
	
	
	public void registerMultiple(Student[] students) {
		for(Student student : students) {
			register(student);
		}
	}
}
