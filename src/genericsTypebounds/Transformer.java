package genericsTypebounds;

import java.util.function.Function;

public class Transformer<T extends Number, R> {
	
	public R transform(T value, Function<T, R> converter) {
		return converter.apply(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transformer<Integer, String> intoString = new Transformer<>();
		String result = intoString.transform(42, Object::toString);
		
	}

}
