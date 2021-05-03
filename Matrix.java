import java.util.Random;

public class Matrix{

  private static Integer row;
  private static Integer column;

  public Matrix(int row, int column){
    this.row = row;
	this.column = column;
  }
  
  public double[][] init() {
    // Double is 8 bytes
    double[][] elevation = new double[this.row][this.column];
	
	Random rand = new Random();
	
	for(int i = 0; i < this.column; i++){
		for (int j = 0; j < this.row; j++){
			elevation[i][j] = rand.nextDouble();
		}
	}	  
	
    return elevation;  
  }

}