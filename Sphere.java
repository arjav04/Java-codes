import java.util.*;
public class sphere{
    public static void main(String[] args)
    {
		
		int r;
		double pi = 3.14,sa,d,vol;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radious of sphere");
		r = s.nextInt();
		sa =  4*pi*r*r;
		d = 2*r;
		vol = (4/3)*r*r*r;
		System.out.println("sa of sphere :"+sa);
		System.out.println("d of the sphere :"+d);       
		System.out.println("vol of the sphere :"+vol);
}
}

		