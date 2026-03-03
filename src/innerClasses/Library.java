package innerClasses;

public class Library {
	
	private static String name = "Stadtbibliothek";
	
	public static class Book{
		public static void showLibrary() {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Library.Book();
		b.showLibrary();
	}

}
