package Q064;

import java.nio.file.Path;
import java.util.Collection;

public interface A {
    public Iterable a();
}

public interface B extends A{
    public Collection a();
}
public interface C extends A{
    public Path a();
}

public interface D extends B,C {

}



/*
Why does D cause a compilation error?
A. D inherits a() only from C.
B. D inherits a() from B and C but the return types are incompatible.
C. D extends more than one interface.
D. D does not define any method.
Answer: B

 */