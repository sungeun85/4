
public class Sol17 {
	private String[] name = {"ȫ?浿", "??????", "??????", "?̼???", "?谩??"}; 
	private int[][] score = {{90, 80, 70}, {80, 90, 60}, { 80, 30, 60}, {80, 20, 60}, {70, 90, 60}};
	private int[] sum = new int[5];
	private double[] avg = new double[5];
	
	void resultScore() {
		
		System.out.println("-----------------------------------");
		System.out.println(" ?̸?   C#  java html5  ??    ????");
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "  ");
			
			for (int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
				System.out.print(score[i][j] + "   ");
			}
			
			avg[i] = (double)sum[i] / score[i].length;
			System.out.printf("%d   %.02f", sum[i], avg[i]);
			System.out.println();
		}
    }
	
	void totalScore() {
		System.out.println("-----------------------------------");
		System.out.print("???? : ");
		
		int totalScore = 0; 
		int sumTotalScore = 0; 
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < score.length; i++) {
				totalScore += score[i][j];
			}
			sumTotalScore += totalScore;
			System.out.print(totalScore + "  ");
			totalScore = 0;
		}
		System.out.println(sumTotalScore + "     -");
		System.out.println("-----------------------------------");
	}
}