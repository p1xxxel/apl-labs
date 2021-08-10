import java.util.*;
class findValues{
	public static void main(String[] args){
		int z = 8;
		int a = z++ + ++z;
		int b = z-- + --z;
		int c = z++;
		int d = ++z;
		int e = z--;
		int f = --z;
		System.out.println("The value of z : "+z);
		System.out.println("The value of z++ + ++z : "+a);
		System.out.println("The value of z-- + --z : "+b);
		System.out.println("The value of z++ : "+c);
		System.out.println("The value of ++z : "+d);
		System.out.println("The value of z-- : "+e);
		System.out.println("The value of --z : "+f);
	}
}

