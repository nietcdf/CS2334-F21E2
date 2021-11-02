import java.util.Comparator;

public class HouseTaxValueComparator implements Comparator<House>{

	@Override
	public int compare(House o1, House o2) {
		
		double firstPrice = o1.calculatePropertyTax(10.0);
		double secondPrice = o2.calculatePropertyTax(10.0);
		
		if (Location.compareDouble(firstPrice, secondPrice)) return 0;
		
		return Double.compare(firstPrice, secondPrice);

	}
}
