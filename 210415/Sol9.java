
public class Sol9 {

	public static void main(String[] args) {
		// while ������ �籸��ȭ
		int sum = 0;
		int i = 1;
		
		while(i <= 10){
			sum += i;
			i++;
		}
		
		System.out.println(i-1 + " ������ ��: " + sum);
		
		
		// do while������ �籸��ȭ
		sum = 0;
		i = 1;
		do{
			sum += i;
			i++;
		}while(i <= 10);
		
		System.out.println(i-1 + " ������ ��: " + sum);
	}
}