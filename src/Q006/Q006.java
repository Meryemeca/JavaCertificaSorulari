package Q006;

import java.util.Arrays;

public class Q006 {

	public static void main(String[] args) {
		int [] secA= {2,4,6,8,10};
		int [] secB= {2,4,8,6,10};
		int res1=Arrays.mismatch(secA, secB);
		int res2=Arrays.compare(secA, secB);
		System.out.println(res1+" : "+res2);
/*
 * What is the result?
A. -1 : 2 
B. 2 : -1 
C. 2 : 3 
D. 3 : 0

*mismatch methodu ilk eslesmeyen elemanin indexini print eder.
*compare -1 olur galiba ayni degilse aciklmadan anlamadim bidaha bak.
*
*/
	}

}
