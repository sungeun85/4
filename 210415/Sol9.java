
public class Sol9 {

	public static void main(String[] args) {
		// while 문으로 재구조화
		int sum = 0;
		int i = 1;
		
		while(i <= 10){
			sum += i;
			i++;
		}
		
		System.out.println(i-1 + " 까지의 합: " + sum);
		
		
		// do while문으로 재구조화
		sum = 0;
		i = 1;
		do{
			sum += i;
			i++;
		}while(i <= 10);
		
		System.out.println(i-1 + " 까지의 합: " + sum);
	}
}