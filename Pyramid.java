import java.util.*;
public class Pyramid{
    public static void main(String[] args)
    {
		
		float l,w,h,vol;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of pyramid");
		l = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the weigth of pyramid");
		w = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the heigth of pyramid");
		h = s2.nextInt(); 
		vol = l*w*h*1/3;       
		System.out.println("vol of the pyramid :"+vol);
}
}

		