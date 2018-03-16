
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
	
	public int getFieldWidth() {
		return m_fieldWidth;
	}
	
	public boolean getWheatExists(int x, int y) {
		return m_soils[x][y].getWheatExists();
	}

}
