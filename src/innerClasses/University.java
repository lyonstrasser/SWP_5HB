package innerClasses;

public class University {
	
	public class Student {
		public void showData(String name, int id) {
			System.out.println(name + id);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u = new University();
		Student s = u.new Student();
		s.showData("Noah", 67);
	}

}
