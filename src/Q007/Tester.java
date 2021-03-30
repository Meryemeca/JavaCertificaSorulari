package Q007;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {
	

	public static void main(String[] args) {
	try {
		doA();
		doB();
	
		
	} catch (IOException e) {
		System.out.println("c");
		return;
	}	finally {
		System.out.println("d");
		
	}
	System.out.println("f");

	}
	
	private static void doA() {
		System.out.println("a");;
		if(false) {
			throw new IndexOutOfBoundsException();
		}
	}
	private static void doB() throws FileNotFoundException{
		System.out.println("b");
		if(true) {
			throw new FileNotFoundException();
		}
	}
/*
 Notes:what is the meaning of false and true in if statements?
 -true olunca execute ediyor. ikinci if execute edecek ama birinci etmeyecek. O sebepten alti sari 
 underline olmus.
 -Burda hangi harfin yazilacagini enson belirleyen return key word; finaly de execute edip islemi sonlandiriyor
 neden oldugunu bilmiyorum bulamadim. 
 * 
 * 
 * 
 * 
What is the result?
A. The compilation fails. B. abdf
C. abd
D. adf
E. abcd

cevap E
 * */
}
