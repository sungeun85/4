
public class Sol10 {
	public static void main(String[] args) {
		//while ������ �籸��ȭ
		int i = 2;
		while(i <= 9){
			int j = 1;
			while(j <= 9){
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			i++;
		}
		
		// do while ������ �籸��ȭ
		i = 2;
		do{
			int j = 1;
			do{
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}while(j <= 9);
			i++;
		}while(i <= 9);
	}
}