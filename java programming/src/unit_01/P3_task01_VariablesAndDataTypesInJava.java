package unit_01;
/*
Variable in Java is a data container that saves the data values during Java program executed

Types of variables:
-In Java,there are three types of variables:
    >Local Variables-declared inside the body of a methods
     
     >Instance Variables-Instances variables are defined without the static keyword.
       -They are defined outside a method declaration
       -They are object specific and are known as instance variables.
     
     
     >Static Variables:
      
      -Static Variables-Instances variables are defined with the static keyword.
      -Static variables are initialized only once,at the start of the program execution.
      -These static variables should be insitialized first,before the initialization of any instance variable
     
-Data Types in Java?
.Reference OneNote
     
*/

public class P3_task01_VariablesAndDataTypesInJava {
	
	static int q = 11;
	int p = 10;

	public static void main(String[] args) {
		
		// Valid Declarations
		int a, b, c;
		float pi;
		double d;
		char e;
		
		// Valid Initializations
		pi = 3.14f;
		d = 20.22d;
		e = 'v';
		
		a = 10;
		b = 10;
		c = 10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5; // Integer (whole number)
		float myFloatNum = 5.99f; // Floating point number
		char myLetter = 'D'; // Character
		boolean myBool = true; // Boolean
		String myText = "Hello"; // String
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java Variable Type Conversion & Type Casting: 
		 * Variable of smaller capacity can be assigned to another variables of bigger capacity 
		 *   >This process is automatic and non explicit known as type conversion
		 * When variables of larger capacity is to be assigned to another variable of smaller capacity.
		 *  >We explicitly specify the type cast operator.This process is called type casting
		 */
		
		double f;
		int i = 10;
		f = i; // Type Conversion
		
		double g = 10;
		int j;
		j = (int) g; // Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k = 10; // 1 byte
		boolean l = true; // 1 bit = true or false only
		long m = 10L;
		float n = 1.2f;
		double o = 1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC1.j); //data + function/methods
		// ABC.display();
		
		ABC1 obj1 = new ABC1();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC1 obj2 = new ABC1();
		System.out.println(obj2.i);
		
		//System.out.println(obj1.j++);
		//System.out.println(obj1.j);
		//System.out.println(obj2.j);
		
		System.out.println(ABC1.j++);
		System.out.println(ABC1.j);
		
		ABC1.typeconversionAndtypeCasting();
		
	}
	
	int r = 10;
	
	void display() {
		
		int a = 5; // local Variable
		System.out.println("This is Display Method");
		System.out.println(a);
		
	}

}

class ABC1{
	
	static int j = 10; // class variable/static variable
	int i = 10; // Instance Variable
	
	static void display() {
		
		int a = 5; // local Variable
		System.out.println("This is Display Method");
		System.out.println(a);
		
	}
	
	static void typeconversionAndtypeCasting() {
		
		/*
		 * double f; //8 bytes = 64 bits/slots "int" i = 10; // 4 bytes = 32 bits/slots f
		 * = i; //Type Conversion System.out.println(f);
		 * 
		 *  double g = 10; //64 int j; //32 j = (int)g;
		 */
		
		double f; //64 slots
		int i = 10; //32 slots
		f = i; //Type Conversion
		System.out.println(f);
		
		double g = 10; //64
		int j; //32
		j = (int)g; // Type Casting
		
		//32 bits = 64 bits
		
		System.out.println(i);
		System.out.println(j);
	}
}

