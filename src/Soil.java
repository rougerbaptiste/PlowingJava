
public class Soil {
	double m_fertility;
	int m_stock;
	Wheat m_wheat;
	Grass m_grass;
	
	public Soil() {
		m_fertility = 100;
		m_stock = 0;
		m_wheat = new Wheat();
		m_grass = new Grass();
	}
	
	public double getFertility() {
		return m_fertility;
	}
	
	public void setFertility(double newFertility) {
		m_fertility = newFertility;
		if(m_fertility < 0) {
			m_fertility = 0;
		}
	}
	
	public int getStock() {
		return m_stock;
	}
	
	public void setStock(int newStock) {
		m_stock = newStock;
	}
	
	public boolean getWheatExists() {
		return m_wheat.getExists();
	}
	
	public void setWheatExists(boolean exists) {
		m_wheat.setExists(exists);
	}
	
	public double getWheatGrowth() {
		return m_wheat.getGrowth();
	}
	
	public void setWheatGrowth(double growth) {
		m_wheat.setGrowth(growth);
	}
	
	public int getWheatProduction() {
		return m_wheat.getProduction();
	}
	
	public void setWheatProduction(int prod) {
		m_wheat.setProduction(prod);
	}
	
	public void changeWheatGrowth(double growthChange) {
		m_wheat.changeGrowth(growthChange);
	}
	
	public void changeWheatProduction(int productionChange) {
		m_wheat.changeProduction(productionChange);
	}
	
	public boolean getGrassExists() {
		return m_grass.getExists();
	}
	
	public void setGrassExists(boolean exists) {
		m_grass.setExists(exists);
	}
	
	public double getGrassGrowth() {
		return m_grass.getGrowth();
	}
	
	public void setGrassGrowth(double newGrowth) {
		m_grass.setGrowth(newGrowth);
	}
	
	public int getGrassProduction() {
		return m_grass.getProduction();
	}
	
	public void setGrassProduction(int prod) {
		m_grass.setProduction(prod);
	}
	
	public void changeGrassGrowth(double growthChange) {
		m_grass.changeGrowth(growthChange);
	}
	
	public void changeGrassProduction(int productionChange) {
		m_grass.changeProduction(productionChange);
	}	

}
