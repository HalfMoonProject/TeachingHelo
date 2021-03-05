package ui;

import java.util.Scanner;

import domein.Rechthoek;

public class RechthoekApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int lengte = 0;
		int breedte = 0;
		
		
		System.out.println("Geef de lengte van uw rechthoek: ");
		lengte = s.nextInt();
		System.out.println("Geef de breedte van uw rechthoek: ");
		breedte = s.nextInt();
		Rechthoek r = new Rechthoek (lengte,breedte);
		
	System.out.printf("lengte : %d%n",r.getLengte());
	System.out.printf("breedte: %d%n", r.getBreedte());
	System.out.printf("omtrek: %d%n", r.berekenOmtrek(lengte,breedte));
	System.out.printf("oppervlakte: %d%n", r.berekenOppervlakte( lengte,breedte));

	}
	
}