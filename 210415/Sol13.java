
public class Sol13 {

	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		int max = score[0]; //배열의 첫번째 값으로 최대값을 초기화 한다.
		int min = score[0]; //배열의 첫번째 값으로 최소값을 초기화 한다.

		
		 //end of for
		System.out.println("-------------------------------");
		System.out.println("i   score[i]   max    min");
		System.out.println("-------------------------------");
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
				System.out.println(i + "\t" + score[i] + "\t"+ max + "\t"+ min);
			}
	} //end of main
} //end of class
