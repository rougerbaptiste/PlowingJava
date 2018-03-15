
public class main {

	public static void program(final String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow boyos");
		
		Wheat ble = new Wheat();
		ble.setExists(true);
		System.out.println("Growth = " + ble.getGrowth());
		ble.changeGrowth(12);
		System.out.println("Growth = " + ble.getGrowth());
		
		Soil sol = new Soil();
		sol.setWheatExists(true);
		System.out.println("Growth = " + sol.getWheatExists());
		System.out.println("Growth = " + sol.getWheatGrowth());
		sol.changeWheatGrowth(12);
		System.out.println("Growth = " + sol.getWheatGrowth());

	}

}
