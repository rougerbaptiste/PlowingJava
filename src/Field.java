
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
	
	///////
	// Grass Methods

}
