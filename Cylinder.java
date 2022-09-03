import java.util.*;
public class Cylinder{
    public static void main(String[] args)
    {
		
		int r,h;
		double pi = 3.14,tsa,csa,vol;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radious of cylinder");
		r = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the height of cylinder");
		h = s.nextInt();
		tsa = 2*pi*(r+h);
		csa = 2*pi*r*h; 
		vol = pi*r*r*h;
		System.out.println("tsa of cylinder :"+tsa);
		System.out.println("csa of the cylinder :"+csa);       
		System.out.println("vol of the cylinder :"+vol);
}
}

		