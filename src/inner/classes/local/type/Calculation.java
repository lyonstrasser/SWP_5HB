package inner.classes.local.type;

public class Calculation {
	
	public static double calculateAverage(int[] numbers) {
		
		class AverageCalculator {
			
			public double calculateAverage() {
				double sum = 0;
				for(int i = 0; i < numbers.length; i++) {
					sum = sum + numbers[i];
				}
				return sum / numbers.length;
			}
			
		}
		
		return new AverageCalculator().calculateAverage();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3};
		
		System.out.println(calculateAverage(arr));
		
	}

}
