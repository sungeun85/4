package example;

import java.io.IOException;

public class Example08 {
	public static void main(String[] args) throws IOException {
//		�籸��ȭ (while, for)
		
//		int input = 0;
//		System.out.println("������ �Է��ϼ���.");
//		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
//		do {
//			input = System.in.read();
//			System.out.println((char)input);
//		} while(input != -1 && input != 'x');
		
//		while��
		int input = 0;
		
		System.out.println("������ �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
		
		input = getInput();
		
		while(input!= -1 && input != 'x') {
			input = getInput();
		}
		
//		for��
		System.out.println("������ �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
		
		input = getInput();
		
		for (input = getInput(); input!= -1 && input != 'x';) {
			input = getInput();
		}
		
	}
	
	static int getInput() throws IOException {
		int input;
		input = System.in.read();
		System.out.println((char)input);
		return input;
	}

}
