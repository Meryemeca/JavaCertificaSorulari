package Q098;


// ANSWER AB


//Examine this code fragment:
// /*Loc1*/ class ProcessOrders{...}
//Which two annotations may be applied at Loc1 in the code fragment? (Choose two.)


//A. @Resource(priority=100)
//B. @Resource(priority=0)
//C. @Resource(name=“Customer1”, priority=100) D. @Resource(name=“Customer1”)
//E. @Resource



public interface Resource {
	
	String name();
	
	int priority() default 0;

}
