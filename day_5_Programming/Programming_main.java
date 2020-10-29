package day_5_Programming;
/*
Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I want to learn language" 
should be printed. If some String is passed it, then in place of " ” the name 
of that String variable should be printed. For example, while Creating object 
if we pass "Java", then " I want to learn Java" should be printed.
 */
public class Programming_main {

	public static void main(String[] args) {
		
		Programming obj1 = new Programming();
		Programming obj2 = new Programming("HTML");
	}

}
