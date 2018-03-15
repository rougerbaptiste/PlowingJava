
public class Field {
	int fieldWidth;
	int fieldHeight;
	Soil m_soils[][];
	
	public Field(int fieldWidth, int fieldHeight) {
//		int fieldWidth = 10;
//		int fildHeight = 10;
		Soil[][] m_soils = new Soil [fieldWidth][fieldHeight];
	}
	
	public boolean getSoilWheatExists(int x, int y) {
		return m_soils[x][y].getWheatExists();
	}
	

}
