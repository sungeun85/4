public class Sol12 {

	public static void main(String[] args) {
		int sum = 0; //총점을 저장하기 위한 변수
		int[] score = {100, 88, 100, 100, 90};
		
		System.out.println("------------------------------");
		System.out.println("i " + "\t score[i] " + " \tsum ");
		System.out.println("------------------------------");
		
		sum = 0; 
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.println(i + "\t   " + score[i] + "\t\t" + sum);
	}
	}
}