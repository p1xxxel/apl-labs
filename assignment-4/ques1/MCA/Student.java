import java.util.*;

class Student{
	String name;
	int marksTotal;
	double perEng;
	double perMath;
	double perScience;

	Student(String name, int marksEng, int marksMath, int marksScience, int maxMarks){
		marksTotal = marksEng + marksMath + marksScience;
		perEng = (((double)marksEng)/maxMarks)*100;
		perMath = (((double)marksMath)/maxMarks)*100;
		perScience = (((double)marksScience)/maxMarks)*100;
		this.name = name;
	}

	void display(){
		System.out.printf("===========STUDENT REPORT FOR %s===========\n", name);
		System.out.printf("English Percentage : %f%%\nMaths Percentage : %f%%\nScience Percentage: %f%%\n",perEng,perMath,perScience);
	}
}

//class main{
//	public static void main(String[] args){
//		Student s1 = new Student("test", 40, 50, 60, 80);
//		s1.display();
//	}
//}
