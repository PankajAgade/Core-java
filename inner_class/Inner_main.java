package inner_class;

public class Inner_main {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.print();
		Student.hefshine s1 = s.new hefshine();
		s1.print2();

	}

}
