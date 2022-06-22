package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		
		long timerStart = System.currentTimeMillis();
		
		for(int i = 1; i <= 100_000; i++) {
			builder.append(i);
		}
		
		@SuppressWarnings("unused")
		String str1 = builder.toString();
		
		long timerEnd = System.currentTimeMillis();
		
		System.out.println(String.format("L'opération avec le StringBuilder a mis %d millisecondes à s'être effectuée", timerEnd - timerStart));
		System.out.println();
		timerStart = System.currentTimeMillis();
		
		@SuppressWarnings("unused")
		String str2 = "";
		
		for(int i = 1; i <= 100_000; i++) {
			str2 += i;
		}
		
		timerEnd = System.currentTimeMillis();
		
		System.out.println(String.format("L'opération avec l'opérateur '+' a mis %d millisecondes à s'être effectuée", timerEnd - timerStart));

	}

}
