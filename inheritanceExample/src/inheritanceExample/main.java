package inheritanceExample;

public class main {
	public static void main(String ar[]) {
		
	Teachers t1=new Teachers();
	t1.name="ashwin";
	t1.phone=123456;
	 student s1=new student();
	 s1.name="vishnu";
	 s1.phone=9563284;
	 
	 staff f1=new staff();
	 f1.name="manaf";
	 f1.phone=985632;
	 
	
     t1.Showaddress();
     s1.Showaddress();
     f1.Showaddress();
	}

}
