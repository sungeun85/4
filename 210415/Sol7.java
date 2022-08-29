
public class Sol7{

	public static void main(String[] args) {
		
		// for문으로 재구조화
		int sum = 0;
		
		for(int i=0 ; i<=100 ; i++){
			sum += i;
			System.out.println(i + " - " + sum);
		}

		// do while문으로 재구조화
		sum = 0;
		int i = 0;
		
		do{
			sum += i;
			System.out.println(i + " - " + sum);
			i++;
		}while(i<=100);
	}
}