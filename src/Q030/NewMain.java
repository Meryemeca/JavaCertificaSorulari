package Q030;

import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {

	public static void main(String[] args) {
		String [] fruiteNames= {"apple","orange","grape","lemon","apricot","watermelon"};
		
		var furites=new ArrayList<>(Arrays.asList(fruiteNames));
		furites.sort((var a,var b)-> -a.compareTo(b));
        furites.forEach(System.out::println);
	}

}
//What is the result?
//A. watermelonorangelemongrapeapricotapple
/*B. nothing
  C. appleapricotgrapelemonorangewatermelon 
  D. appleorangegrapelemonapricotwatermelon
  compareTo nun basina - koyduklari icin tersten sort yapacak cevap A
  */
