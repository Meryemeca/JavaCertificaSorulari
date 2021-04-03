package Q069;

import java.util.ArrayList;
import java.util.List;

public class Q069 {

	public static void main(String[] args) {
		List<Integer>even=List.of();
		
		even.add(0,-1);
		even.add(1,-2);
		even.add(2,-3);
		System.out.println(even);

	}

}

/*What is the output?
A. The compilation fails.
B. [-1, -2, -3]
C. [-3, -2, -1]
D. A runtime exception is thrown.

*
*Cevap D.  List.of() 

*
*/
