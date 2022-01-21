package workshop1;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students=new ArrayList<Student>();
	
	public StudentManager() {
		
	}
	
	public void add(Student addedStudent) 
	{
		for (Student student : students) {
			if(student.getIdentityNumber()==addedStudent.getIdentityNumber()) {
				System.out.println("Bir öğrenci iki kere kayıt edilemez.");
				return;
			}
		}
		System.out.println(addedStudent.getId() +" ID No'lu Öğrenci eklendi");
		this.students.add(addedStudent);
	}
	
	public void update(Student updatedStudent)
	{
		for(Student student: students) {
			if(student.getId()==updatedStudent.getId()) {
				student.setIdentityNumber(updatedStudent.getIdentityNumber());
				student.setFirstName(updatedStudent.getFirstName());
				student.setLastName(updatedStudent.getLastName());
				System.out.println(student.getId()+" ID No'lu öğrenci güncellendi.");
				return;
			}
		}
		System.out.println(updatedStudent.getId()+" ID No'lu öğrenci güncellenemedi");
	}
	
	public void delete(int id) 
	{
		Student studentToDelete=new Student();
		for (Student student : students) {
			if(student.getId()==id) {
				studentToDelete=student;
			}
		}
		System.out.println(id+" ID No'lu öğrenci silindi.");
		students.remove(studentToDelete);
	}
	
	public ArrayList<Student> getAll(){
		return this.students;
	}
	
}
