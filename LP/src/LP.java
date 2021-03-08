
public class LP {
	private int prijsToken1;
	private int prijsToken2;
	private int reserveToken1;
	private int reserveToken2;
	private int supplyLP;

	public LP(int prijsToken1,int prijsToken2,int reserveToken1,int reserveToken2,int supplyLP) {
		this.prijsToken1 = prijsToken1;
		this.prijsToken2 = prijsToken2;
		this.reserveToken1 = reserveToken1;
		this.reserveToken2 = reserveToken2;
		this.supplyLP = supplyLP;		
	}
	public int setPrijsToken1(int prijsToken1) {
		return prijsToken1;
	}
	public int setPrijToken2(int prijsToken2) {
		return prijsToken2;
	}
	public int setReserveToken1(int reserveToken1) {
		return reserveToken1;
	}
	public int setSupplyLP(int supplyLP) {
		return supplyLP;
		
	}public int berekenWaarde(int prijsToken1, int prijsToken2, int reserveToken1, int reserveToken2, int supplyLP) {
		return ((prijsToken1*reserveToken1)+(prijsToken2*reserveToken2))/supplyLP;
	}
}
	
