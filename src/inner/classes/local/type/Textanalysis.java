package inner.classes.local.type;

public class Textanalysis {
	
	public static void analyseText(String text) {
		
		class TextStatistic {
			
			public int countAmountOfWords() {
				 String[] words = text.trim().split("\\s+");
				    return words.length;
			}
			
			public int countAmountOfCharacters() {
				return text.length();
			}
			
		}
		
		TextStatistic stats = new TextStatistic();
		
		System.out.println(stats.countAmountOfCharacters());
		System.out.println(stats.countAmountOfWords());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HTL-Schüler lernen Java";
		analyseText(s);
	}

}
