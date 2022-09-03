import java.util.*;
public class Rectangle{
    public static void main(String[] args)
    {

		float l,b,h;
		float area,vol,perimeter;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the breath of rectangle");
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the height of rectangle");
		l = s.nextFloat();
		b = s1.nextFloat();
		h = s2.nextFloat();
		area = l*b;
		vol = l*b*h;
		perimeter = 2*(l+b);
		System.out.println("area of rectangle :"+area);
		System.out.println("vol of the rectangle :"+vol);
		System.out.println("perimeter of the rectangle :"+perimeter);       

}
}
