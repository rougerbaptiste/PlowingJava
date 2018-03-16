
public class program {

	public static void main(final String[] args) {
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
		
		Soil[][] champsTest = new Soil[10][10];
		int i = 0, j = 0;
		for(Soil rang[] : champsTest) {
			i = 0;
			for(Soil sol2 : rang) {
				j = 0;
				champsTest[i][j] = new Soil();
			}
		}
		
		Field champs = new Field();
		System.out.println(champs.getFieldWidth());
		System.out.println(champs.getWheatExists(1, 2));
		

	}

}
