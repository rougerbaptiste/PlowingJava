
public class Field {
	int m_fieldWidth;
	int m_fieldHeight;
	Soil[][] m_soils = new Soil[10][10];
	
	public Field(){
		m_fieldWidth = 10;
		m_fieldHeight = 10;
		for(int i=0; i < m_fieldWidth; i++) {
			for(int j = 0; j < m_fieldHeight; j++) {
				m_soils[i][j] = new Soil();
			}
		}
	}
	
	///////
	// Field Methods
	
	public int getFieldWidth() {
		return m_fieldWidth;
	}
	
	public int getFieldHeight() {
		return m_fieldHeight;
	}
	
	public String getInfoOnSoil(int x, int y) {
		return "Pos : " + x + ", " + y + " :\n" + m_soils[x][y].getInfosOnSoil();
	}
	
	///////
	// Soil Methods
	
	public double getSoilFertility(int x, int y) {
		return m_soils[x][y].getFertility();
	}
	
	public void setSoilFertility(int x, int y, double newFert) {
		m_soils[x][y].setFertility(newFert);
	}
	
	public int getSoilStock(int x, int y) {
		return m_soils[x][y].getStock();
	}
	
	public void setSoilStock(int x, int y, int newStock) {
		m_soils[x][y].setStock(newStock);
	}
	
	///////
	// Wheat Methods
	
	public boolean getFieldWheatExists(int x, int y) {
		return m_soils[x][y].getWheatExists();
	}
	
	public void setFieldWheatExists(int x, int y, boolean exists) {
		m_soils[x][y].setWheatExists(exists);
	}
	
	public double getFieldWheatGrowth(int x, int y) {
		return m_soils[x][y].getWheatGrowth();
	}
	
	public void setFieldWheatGrowth(int x, int y, double newGrowth) {
		m_soils[x][y].setWheatGrowth(newGrowth);
	}
	
	public int getFieldWheatProduction(int x, int y) {
		return m_soils[x][y].getWheatProduction();
	}
	
	public void setFieldWheatProduction(int x, int y, int newProd) {
		m_soils[x][y].setWheatProduction(newProd);
	}
	
	public void changeFieldWheatGrowth(int x, int y, double growthChange) {
		m_soils[x][y].changeWheatGrowth(growthChange);
	}
	
	public void changeFieldWheatProduction(int x, int y, int prodChange) {
		m_soils[x][y].changeWheatProduction(prodChange);
	}
	
	///////
	// Grass Methods
	
	public boolean getFieldGrassExists(int x, int y) {
		return m_soils[x][y].getWheatExists();
	}
	
	public void setFieldGrassExists(int x, int y, boolean exists) {
		m_soils[x][y].setWheatExists(exists);
	}
	
	public double getFieldGrassGrowth(int x, int y) {
		return m_soils[x][y].getWheatGrowth();
	}
	
	public void setFieldGrassGrowth(int x, int y, double newGrowth) {
		m_soils[x][y].setWheatGrowth(newGrowth);
	}
	
	public int getFieldGrassProduction(int x, int y) {
		return m_soils[x][y].getWheatProduction();
	}
	
	public void setFieldGrassProduction(int x, int y, int newProd) {
		m_soils[x][y].setWheatProduction(newProd);
	}
	
	public void changeFieldGrassGrowth(int x, int y, double growthChange) {
		m_soils[x][y].changeWheatGrowth(growthChange);
	}
	
	public void changeFieldGrassProduction(int x, int y, int prodChange) {
		m_soils[x][y].changeWheatProduction(prodChange);
	}

}
