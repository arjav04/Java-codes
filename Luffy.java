import java.util.*;
public class Luffy{
    public static void main(String[] args)
    {
		
		int r;
		double pi = 3.14,area,circumference;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radious of circle");
		r = s.nextInt();
		area = pi*r*r;
		circumference = 2*pi*r;
		System.out.println("area of circle :"+area);
		System.out.println("circumference of the circle :"+circumference);       

}
}

		