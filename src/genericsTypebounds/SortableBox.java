package genericsTypebounds;

public class SortableBox<T extends Comparable<T>> {
	
	private T content;
	
	public SortableBox(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	public int compareToOtherBox(SortableBox<T> sb) {
		return this.content.compareTo(sb.getContent());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortableBox<Integer> sb1 = new SortableBox<>(10);
		SortableBox<Integer> sb2 = new SortableBox<>(20);
		
		System.out.println(sb1.compareToOtherBox(sb2));
		System.out.println(sb2.compareToOtherBox(sb1));
		System.out.println(sb1.compareToOtherBox(sb1));
		
		SortableBox<String> sb3 = new SortableBox<>("Hallo");
		SortableBox<String> sb4 = new SortableBox<>("Guten Tag");
		
		System.out.println(sb3.compareToOtherBox(sb4));
		System.out.println(sb4.compareToOtherBox(sb3));

		
	}

}
