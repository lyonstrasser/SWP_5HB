package lambdaExpressions;

import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

public class LambdaExpressionsDevelops {
	
	DoubleSupplier ds = () -> {return 20.2;};
	
	LongToDoubleFunction ltdf = (long value) -> {return value; };
	
	UnaryOperator<String> up = (String s) -> {return "Hello";};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	