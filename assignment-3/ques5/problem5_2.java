class Mother{
void carrierChoice(){
	System.out.println("Doctor");
	}
}
class Son extends Mother{
	void carrierChoice(){
		System.out.println("Astronaut");
	}
}
class Q5Overriding{
	public static void main(String args[]){
		Mother m1 = new Mother();
		System.out.println("Mother's carrier choice :");
		m1.carrierChoice();
		Son s1 = new Son();
		System.out.println("Son's carrier choice :");
		s1.carrierChoice();
	}
}
