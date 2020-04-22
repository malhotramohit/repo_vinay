
public class ThisExample {
	
	
	int age = 23;
	
	// both instance var and local var same 
	// 'this' : current instance
	private void changeAge(int ageP) {
		age = ageP;
	}
	
	
	
	public static void main(String[] args) {
		
		
		ThisExample example1= new ThisExample();
		System.out.println("age before changeAge() ");

		System.out.println(example1.age);
		
		example1.changeAge(25);
		
		ThisExample example2= new ThisExample();
		example2.changeAge(28);

		
		System.out.println("age after changeAge() ");
		
		System.out.println(example1.age);
		
		System.out.println(example2.age);


	}

}
