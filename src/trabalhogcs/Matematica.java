package trabalhogcs;
public class Matematica {
		
	public int somatorio(int... values) {
		
		int result = 0;
		
		for (int i : values) {
			result += i;
		}
				
		return result;
	}
	
	
}
