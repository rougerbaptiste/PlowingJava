
public class Grass {
	double m_growth = 0;
	int m_production = 0;
	boolean m_exists = false;
	
	public double getGrowth() {
		return m_growth;
	}
	
	public void setGrowth(double growth) {
		m_growth = growth;
	}
	
	public int getProduction() {
		return m_production;
	}
	
	public void setProduction(int prod) {
		m_production = prod;
	}
	
	public boolean getExists() {
		return m_exists;
	}
	
	public void setExists(boolean exists) {
		m_exists = exists;
	}
	
	public void changeGrowth(double growthChange) {
		m_growth += growthChange;
		if(m_growth > 100) {
			m_growth = 100;
		}
	}
	
	public void changeProduction(int productionChange) {
		m_production += productionChange;
	}

}
