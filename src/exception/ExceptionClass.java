package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionClass {
				
	public static void main(String[] args) {
//This is an example. remember you don't want to try and check for unchecked exceptions. | 					
		try {
			System.out.println("Hey");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			FileReader fileReader = new FileReader("ex.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		System.out.println("after the try/catch");
		
/*
 *Exceptions: Unchecked and Checked. Must be "handled" or else your program will crash during compile time after it's ran. 
 * 	
 * Unchecked: Errors in your code. Java does not verify unchecked exceptions at compile-time. So you need to write good code. Examples: ArithmeticException,
 * ArrayIndexOutOfBounds, NullPointerException (run-time.when a declared variable for an object is "null" or "empty" and shouldn't be)
 * InputMisMatchException, ArithmeticException(ex: / by 0), IllegalArgumentException, IndexOutOfBoundsException
 * 
 * 	Checked: Unplanned errors. Outside our control. We want to check for these when a user puts in input, for example.
 *  (ex: is the user putting in a double when we want an int? are we able to connect our IDE to our db?)
 *  We can plan for these by the following: creating try/catch blocks, throwing (throws) exceptions.
 *  Checked exceptions are checked at compile time to ensure you are handling them, either by catching them 
 *  or declaring the containing method throws the exception. At runtime, there is no distinction between checked 
 *  and unchecked exceptions: they are treated identically by the JVM.
 *******  Examples: FileNotFoundException, ClassNotFoundException (when a class can't be found in the classpath),
 * NoSuchMethodException,  
 * IOException, EOFException (NullPointerException altho its a runtime exception)
*/
				
	}
}	