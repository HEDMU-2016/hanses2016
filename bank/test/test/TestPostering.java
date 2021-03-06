package test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import domain.Postering;

public class TestPostering {

	public static void main(String[] args) {
		Postering[] posteringer = new Postering[10];
		posteringer[0] = new Postering(LocalDateTime.now(),new BigDecimal("-900.00"), 1, 1, "Til Hans");
		posteringer[1] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 2, "Fra Hans" );
		posteringer[2] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 3, "Fra Hans" );
		posteringer[3] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 4, "Fra Hans" );
		posteringer[4] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 5, "Fra Hans" );
		posteringer[5] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 6, "Fra Hans" );
		posteringer[6] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 7, "Fra Hans" );
		posteringer[7] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 8, "Fra Hans" );
		posteringer[8] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 9, "Fra Hans" );
		posteringer[9] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 1, 10, "Fra Hans" );
		
		for (int i=0; i<posteringer.length; i++) {
			System.out.println(posteringer[i]);
		}
		
		for (Postering postering : posteringer) {
			System.out.println(postering);
		}
	}

}
