
public class Sol7{

	public static void main(String[] args) {
		
		// for������ �籸��ȭ
		int sum = 0;
		
		for(int i=0 ; i<=100 ; i++){
			sum += i;
			System.out.println(i + " - " + sum);
		}

		// do while������ �籸��ȭ
		sum = 0;
		int i = 0;
		
		do{
			sum += i;
			System.out.println(i + " - " + sum);
			i++;
		}while(i<=100);
	}
}