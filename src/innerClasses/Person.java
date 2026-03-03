package innerClasses;

public class Person {
	
	private String name;
	
	public Person (String name) {
		this.name = name;
	}
	
	public class Details {
		public void showName() {
			System.out.println(Person.this.name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Noah");
		Details d = p.new Details();
		d.showName();
	}

}
