
public class Sol15 {

	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", ".",
				"..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---",
				".--.", "--.-", ".-.", "...", "-",
				"..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		String result="";
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("i \tsource  \tsource.charAt(i) \tsource.charAt(i)-'A'  \tmorse[i] \tresult");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(int i=0; i<source.length(); i++) {
			result = result + morse[source.charAt(i)-'A'];
	
			System.out.println(i + "\t" + source + "\t\t" + source.charAt(i) + "\t\t\t" + (source.charAt(i)-'A') + "\t\t\t" + morse[source.charAt(i)-'A'] + "\t\t" + result);
		}
	}
}