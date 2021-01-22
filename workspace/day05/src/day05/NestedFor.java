package day05;

public class NestedFor {
public static void main(String[] args) {
	
//	for(int i=0; i<9; i++) {
//		
//		
//		
//		System.out.print(" "+(i+1)*1);
//		System.out.print(" "+(i+1)*2);
//		System.out.print(" "+(i+1)*3);
//		System.out.print(" "+(i+1)*4);
//		System.out.print(" "+(i+1)*5);
//		System.out.print(" "+(i+1)*6);
//		System.out.print(" "+(i+1)*7);
//		System.out.print(" "+(i+1)*8);
//		System.out.print(" "+(i+1)*9+"\n");
//		
//		
//	}
//	
//	for (int i = 1; i < 90; i++) {
//		
//		if(i %10==0) {
//			System.out.println();
//			continue;
//		}
//		System.out.printf("%d*%d=%d\n", i/10+1, i%10,(i/10+1)*(i%10));
//		
//	}
//	
//	

	for(int i =0; i<9; i++) {
		
		for(int j =0; j<9; j++) {
			
			System.out.println((i+1)*(j+1));
			
			
		}
		System.out.println();
		
	}
	
	
	
	
}
}
