import java.util.Random;
import java.time.*;

public class MatrixTransposition{

   	
	private static final Integer column =22134;
    private static final Integer row =22134;
	
	public static void main(String[] args) {
	  
	  Matrix matrix = new Matrix (row, column);
	  
	  Instant start_time = Instant.now();
      Transpose( matrix.init( ) );
      Instant stop_time = Instant.now();

    System.out.println("calculation time in ms: " + Duration.between(start_time, stop_time).toMillis());
	}
	
	private static void Transpose(double[][] elevation) {
		
		for (int i = 0; i < row; i++){
			for (int j = 0; j < column; j++){
				elevation[i][j] = elevation[j][i];
			}
		}
		
	}




}