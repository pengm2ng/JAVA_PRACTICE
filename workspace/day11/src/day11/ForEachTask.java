package day11;

public class ForEachTask {
	static int sum =0;
	public static void main(String[] args) {
		int[][] arScore = {
				{10, 20 , 30},
				{11,23,45},
				{22,45,12},
				{13,27,37},
				{14,25,45}
		};
		
		for(int[] i : arScore) {
				sum=0;
						for(int j : i) {
							 
							sum += j;
						
						}
						System.out.println(sum +"\n"+ (double)(sum/3));
		}
		
		
		
		
		
	}
}
