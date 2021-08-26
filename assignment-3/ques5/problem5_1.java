import java.util.*;
class OverLoading {
    int add(int a,int b){
	    System.out.println("====================\nAdding integers\n====================\n");
    return a+b;
    }
    double add(double a,double b,double c){
	    System.out.println("====================\nAdding doubles\n====================\n");
    return a+b+c;
    }
}
class Q5OverLoading
{
    public static void main(String[] args)
    {
     OverLoading o = new OverLoading();
     int ans1; double ans2;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter integers to add :");
     int int1 = sc.nextInt();
     int int2 = sc.nextInt();
     System.out.println("Enter doubles to add :");
     double d1 = sc.nextDouble();
     double d2 = sc.nextDouble();
     double d3 = sc.nextDouble();
     ans1=o.add(int1,int2);
     ans2=o.add(d1,d2,d3);
     System.out.printf("Result : %d\nResult : %.5f\n",ans1,ans2);
    }
}
