
public class Sol8_1 {

	public static void main(String[] args) throws java.io.IOException {
		// while������ �籸��ȭ
		
		int input = 0;
		System.out.println("������ �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
		while(input != -1 && input != 'x'){
			input = System.in.read();
			System.out.print((char)input);
		}
	}
}