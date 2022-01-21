package workshop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager studentManager=new StudentManager();
		Student student1=new Student(1,"Zümra","Girgin","123456");
		Student student2=new Student(2,"Ali","Girgin","1321332");
		Student student3=new Student(3,"Veli","Girgin","654654");
		Student student4=new Student(4,"Mehmet","Girgin","987987");
		
		Student studentx=new Student(2,"Aaa","Girgin","1231");
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		
		studentManager.update(studentx);
		
		studentManager.delete(2);
		studentManager.delete(3);
		
		System.out.println(studentManager.getAll().size());
	}

}
