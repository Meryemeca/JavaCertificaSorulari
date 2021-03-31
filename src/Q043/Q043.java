package Q043;

import java.util.function.Supplier;

public class Q043 {
    void myLambda () {
        int i = 25;
        Supplier<Integer> foo = () -> i;
        i++;
        System.out.println(foo.get());
    }
}

/*
Which is true?
A. The code compiles but does not print any result.
B. The code prints 25.
C. The code does not compile.
D. The code throws an exception at runtime.

ANSWER: C
 */
