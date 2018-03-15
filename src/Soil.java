
public class Soil {
	double m_fertility = 100;
	int m_stock = 0;
	Wheat m_wheat;
	Grass m_grass;
	
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
	
	// TODO : Grass , same stuff
	

}
