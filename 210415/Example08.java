package example;

import java.io.IOException;

public class Example08 {
	public static void main(String[] args) throws IOException {
//		재구조화 (while, for)
		
//		int input = 0;
//		System.out.println("문장을 입력하세요.");
//		System.out.println("입력을 마치려면 x를 입력하세요.");
//		do {
//			input = System.in.read();
//			System.out.println((char)input);
//		} while(input != -1 && input != 'x');
		
//		while문
		int input = 0;
		
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		
		input = getInput();
		
		while(input!= -1 && input != 'x') {
			input = getInput();
		}
		
//		for문
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		
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
