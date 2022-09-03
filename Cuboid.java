import java.util.*;
public class Cuboid{
    public static void main(String[] args)
    {

		float l,b,h;
		float lsa,tsa,vol,perimeter;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of cuboid");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the breath of cuboid");
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the height of cuboid");
		l = s.nextFloat();
		b = s1.nextFloat();
		h = s2.nextFloat();
		lsa = 2*h*(l+b);
		tsa = 2*(l*b+b*h+h*l);
		vol = l*b*h;
		perimeter = 4*(l+b+h);
		System.out.println("las of cuboid :"+lsa);
		System.out.println("tas of cuboid :"+tsa);
		System.out.println("vol of the cuboid :"+vol);
		System.out.println("perimeter of the cuboid :"+perimeter);       

}
}
