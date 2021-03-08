import java.util.Scanner;

public class LPapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int prijsToken1 = 0;
		int prijsToken2 = 0;
		int reserveToken1 = 0;
		int reserveToken2 = 0;
		int supplyLP = 0;
		
		System.out.println("Geef de prijs van de eerste coin: ");
		prijsToken1 = s.nextInt();
		System.out.println("Geef de prijs van de tweede coin: ");
		prijsToken2 = s.nextInt();
		System.out.println("Geef de reserve van de eerste coin: ");
		reserveToken1 = s.nextInt();
		System.out.println("Geef de reserve van de tweede coin: ");
		reserveToken2 = s.nextInt();
		System.out.println("Geef het aantal LP tokens in omloop: ");
		supplyLP = s.nextInt();
		
		LP lp = new LP(prijsToken1,prijsToken2,reserveToken1,reserveToken2, supplyLP);
		System.out.println("De waarde van uw LP is:"+ lp.berekenWaarde(prijsToken1, prijsToken2, reserveToken1, reserveToken2, supplyLP));
		

			
		
				

	}

}
