
public class Lot extends Location implements Habitable{
	private static final double LOT_MINIMUM_AREA = 500.;
	private Double area;

	protected Lot(Double x, Double y, Double area) throws InvalidAreaException {
		super(x, y);
		if (area < Lot.LOT_MINIMUM_AREA)
			throw new InvalidAreaException("Lot area too small");
		this.area = area;
	}

	@Override
	public Double calculatePropertyTax(Double taxRate) {
		// TODO taxRate * area
		if (taxRate > 1. || taxRate <= 0.0) 
			throw new InvalidTaxRateExcpetion("Tax rate was set to " + taxRate)
		return taxRate * area;
	}

	@Override
	public boolean isHabitable() {	
		return false;
	}

}
