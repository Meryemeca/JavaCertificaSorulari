package Q009;



public class Tester {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);
		sb.append("HOWDY");
		
		sb.insert(0, ' ');

		sb.replace(3, 5, "LL");
		
		sb.insert(6, "COW");
		
		sb.delete(2, 7);
		System.out.println(sb.length());

	}

}



/*What is the result?
A. 4
B. 3
C. An exception is thrown at runtime. 
D. 5
tek tek her islemden sonra lenghtini yazdirirsak daha iyi anlasilir*/