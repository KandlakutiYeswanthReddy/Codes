package Java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		SupplierDemo supplierDemo = new SupplierDemo();
		System.out.println(supplierDemo.fetchCurrentDate());
		
		Supplier<Date> currentDate = () -> new Date();
		System.out.println(currentDate.get());

	}

	private Date fetchCurrentDate() {
		return new Date();
	}

}
