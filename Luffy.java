import java.util.*;
public class Luffy{
    public static void main(String[] args)
    {

		float a;
		float area,vol,perimeter;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side of square");
		a = s.nextFloat();
		area = a*a;
		vol = a*a*a;
		perimeter = 4*a;
		System.out.println("area of square :"+area);
		System.out.println("vol of the square :"+vol);
		System.out.println("perimeter of the square :"+perimeter);       

}
}
