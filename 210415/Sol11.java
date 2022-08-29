
public class Sol11 {

	public static void main(String[] args) {
		for(int i=1; i<=16; i++){
			if(i<=16){
				System.out.print(" "+ i);
			} else {
				System.out.print(i);
			}
			
			if(i%3 == 0){
				System.out.print(" foo");
			}
			if(i%5 == 0){
				System.out.print(" bar");
			}
			if(i%7 == 0){
				System.out.print(" baz");
			}
			System.out.println();
		}
		System.out.println("\n\n and so on.");
	}
}