package ThreadApp2;

import java.util.concurrent.Callable;

public class PriceCalculator implements Callable<Double> {

	@Override
	public Double call() throws Exception {
		return 15.1;
	}

}
