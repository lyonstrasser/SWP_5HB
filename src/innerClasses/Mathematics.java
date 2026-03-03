package innerClasses;

public class Mathematics {
	
	public static class Factorial{
		public double berechne(int n) {
			double erg = 1;
			for(int i = 1; i <= n; i++) {
				erg *= i;
			}
			return erg;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Mathematics.Factorial();
		System.out.println(f.berechne(5));
	}

}
