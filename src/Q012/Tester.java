package Q012;

public class Tester {
private int x;
private static int y;

public static void main(String[] args) {
	Tester t1=new Tester();
	t1.x=2;
	Tester.y=3;
	Tester t2=new Tester();
	t2.x=4;
	t2.y=5;
	System.out.println(t1.x+","+t1.y);
    System.out.println(t2.x+" "+Tester.y);
    System.out.println(t2.x+","+t1.y);
}
}
/*What is the result?
A. 2,34,34,5 
B. 2,34,54,5 
C. 2,54,54,5 
D. 2,34,54,3*/
//Cevap C