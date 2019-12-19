package PRIMAv5;

import org.junit.Test;

public class PRIMAv5Test {

	@Test
	public void testGetPrima() {
		PRIMAv5 prima = new PRIMAv5();
		PRIMAv5.getPrima(30, -1);
		PRIMAv5.getPrima(20, 28);
		PRIMAv5.getPrima(50, 10);
		PRIMAv5.getPrima(30, 10);
		PRIMAv5.getPrima(40, 30);
		PRIMAv5.getPrima(40, 10);
		PRIMAv5.getPrima(30, 40);
		PRIMAv5.getPrima(15, 10);
		PRIMAv5.getPrima(20, 30);
		PRIMAv5.getPrima(50, 30);
		PRIMAv5.getPrima(65, 30);
		PRIMAv5.getPrima(65, 10);
		PRIMAv5.getPrima(91, 30);
		PRIMAv5.getPrima(30, 30);
	}
	
	@Test
	public void testGetPrima2() {
		PRIMAv5 prima = new PRIMAv5();
		PRIMAv5.getPrima(20, 28);
	}

}
