import java.util.*;
public class Cube{
    public static void main(String[] args)
    {

		float a;
		float tsa,lsa,vol,perimeter;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side of cube");
		a = s.nextFloat();
		tsa = 6*a*a;
		lsa = 4*a*a;
		vol = a*a*a;
		perimeter = 12*a;
		System.out.println("tsa of cube :"+tsa);
		System.out.println("lsa of cube :"+lsa);
		System.out.println("vol of the cube :"+vol);
		System.out.println("perimeter of the cube :"+perimeter);       

}
}
