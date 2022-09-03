import java.util.*;
public class Cone{
    public static void main(String[] args)
    {
		
		int r,h;
		double pi = 3.14,sa,sh,vol;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radious of cone");
		r = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the height of cone");
		h = s1.nextInt();
		sh = Math.sqrt(r*r+h*h);
		sa = pi*r*(sh+r);
		vol = pi*r*r*h*1/3;
		System.out.println("sa of cone :"+sa);
		System.out.println("sh of cone :"+sh);       
		System.out.println("vol of the cone :"+vol);
}
}

		