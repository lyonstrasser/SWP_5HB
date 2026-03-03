package wildcards;

public class Box<T extends Comparable<T>> {
	
	private T content;
	
	public Box(T content){
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}


	public int compareBoxes(Box<?> content2) {
		return this.content.compareTo(content2.getContent());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> box1 = new Box<>("Hallo");
		Box<String> box2 = new Box<>("Tschüss");
		
		System.out.println(box1.compareBoxes(box2));
		
	}

}
