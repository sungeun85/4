
public class Sol8_2 {

	public static void main(String[] args) throws java.io.IOException {
		// for������ �籸��ȭ
		int input = 0;
		
		System.out.println("������ �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
		
		for(;input != -1 && input != 'x';){
			input = System.in.read();
			System.out.print((char)input);
		}
	}
}