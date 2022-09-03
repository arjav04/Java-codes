import java.util.*;
public class Triangle{
    public static void main(String[] args)
    {
		
		float a,b,c,h,area,perimeter;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the a of triangle");
		a = s.nextFloat();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the b of triangle");
		b = s1.nextFloat();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the c of trangle");
		c = s2.nextFloat(); 
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the h of trangle");
		h = s3.nextFloat();
		area = b*h*1/2; 
		perimeter = a+b+c;      
		System.out.println("area of the triangle :"+area);
		System.out.println("perimeter of the triangle :"+perimeter);
}
}

		