package inheritanceExample;

public class person {
	String name;
	int phone;
	
	public void Showaddress() {
		
		
		System.out.println("name="+name);
		System.out.println("phone="+phone);
	}
	

}
class Teachers extends person {
	
	
}
class student extends person {
	
	
}
class staff extends person{
	
}