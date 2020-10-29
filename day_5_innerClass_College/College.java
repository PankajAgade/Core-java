package day_5_innerClass_College;

public class College {
	
	double collegeTime=11.00;
	
	void printcollege()
	{
		System.out.println("~~~~~~~~~~~ In College ~~~~~~~~~~~~");
		System.out.println(" college time => "+collegeTime);
	}
	
	class Department
	{
		String hod = "Pallavi mam";
		void IT_Depatment()
		{
			System.out.println("~~~~~~~~~~~ In Department ~~~~~~~~~~~~");
			System.out.println(" college time => "+collegeTime);
			System.out.println(" Department HOD => "+hod);
		}
	}
}
