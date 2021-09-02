import java.util.*;
class vehicle{
	String type;
	String name;
	int year;
	vehicle(String type, String name, int year){
		this.type = type;
		this.name = name;
		this.year = year;
	}

	void printInfo(){
		System.out.println("=========================VEHICLE INFO=========================");
		System.out.printf("Vehicle type : %s\nVehicle name : %s\nVehicle year : %d\n",type,name,year);
	}
}
