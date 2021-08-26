interface Teacher {
	void print();
}

interface Teaching{
	void show();
}

class Detail implements Teacher,Teaching{
	public void print(){
		System.out.println("Mr. Aanand Tiwari is the class teacher of class 12th");
	}
	public void show(){
		System.out.println("He teaches Accounts to class 11th");
	}
}

class MultiInherit{
	public static void main(String args[]){
		Detail dt= new Detail();
		dt.print();
		dt.show();
	}
}
