import java.time.*;

public class Area {
	
	private static final Integer column =22134;
    private static final Integer row =22134; 

  public static void main (String[] args) {
	
	Matrix matrix = new Matrix (row, column);
	
	Instant start_time = Instant.now();
    System.out.println("Average: " + getAvg( matrix.init( ) ) );
    Instant stop_time = Instant.now();

    System.out.println("calculation time in ms: " + Duration.between(start_time, stop_time).toMillis());
	

  }
  
  private static double getAvg(double[][] elevation){
	double sum = 0;
	for (int i =0; i < column; i++) {
		for(int j = 0; j < row; j++ ){
			//sum += elevation[j][i]; // takes about 3x longer than:
			sum += elevation[i][j];
		}
	}
	
	return sum/(row * column);
  }

}