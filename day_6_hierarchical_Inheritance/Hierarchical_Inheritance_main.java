package day_6_hierarchical_Inheritance;
/*

						A
						^
						|
					 ___|___
					|	|	|      Class B,C and D are extend to A
					B	C	D
					
					That is Hierarchical Inheritance

 */
public class Hierarchical_Inheritance_main {

	public static void main(String[] args) {
		
		Class_B obj1 = new Class_B();
		Class_C obj2 = new Class_C();
		Class_D obj3 = new Class_D();
		
		obj1.display1();
		obj2.display1();
		obj3.display1();
	}
}
