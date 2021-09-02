import vehicle.*;

class car extends vehicle{
	car(){
		super("CAR","Honda AQUATRAX R-12", 2004);
	};
	public static void main(String args[]){
		vehicle car1 = new vehicle("CAR", "Honda AQUATRAX R-12", 2004);
		car1.printInfo();
		String carPlate = "HR 51 2B 7007";
		System.out.printf("Car number : %s", carPlate);
	}
}


