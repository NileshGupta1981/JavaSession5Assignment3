import java.util.Scanner;

public class overload extends areaoverload{
	public static void main (String args[]){
		
		Scanner scnr = new Scanner (System.in);
		areaoverload ao= new areaoverload();
		System.out.println ("Enter the base of rectangle");
		int b = scnr.nextInt();
		
		System.out.println ("Enter the height of rectangle");
		int c = scnr.nextInt();
		
		System.out.println ("Enter the base of triangle");
		double d = scnr.nextDouble();
		
		System.out.println ("Enter the height of triangle");
		double e = scnr.nextDouble();
		
		System.out.println ("Area of rectangle is: "+ ao.area(b, c));
		System.out.println ("Area of triangle is: "+ ao.area(d, e));
		scnr.close();
	}
	

	
	
	
}