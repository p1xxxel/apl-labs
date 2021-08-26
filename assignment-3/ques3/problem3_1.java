interface Teacher {
	void print();
}
interface teaching extends Teacher{
	void show();
}
class display implements teaching
{
	public void print(){
		System.out.println("Miss. Sunita is the class teacher of class6th");
	}
	public void show(){
		System.out.println("She teaches maths and physics to class 6th");
	}
}
class InterfaceInherit {
	public static void main(String args[]) {
	display dp = new display();
	dp.print();
	dp.show();
	}
}
