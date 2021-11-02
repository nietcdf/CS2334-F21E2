
public abstract class Location  {
	private Double x;
	private Double y;
	private static Double DELTA = 0.00001;

	protected Location(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public abstract Double calculatePropertyTax(Double taxRate);

	public Double distanceFromCenter() {
		return Math.sqrt(x * x + y * y);
	}

	protected static boolean compareDouble(Double a, Double b) {
		if (Math.abs(a - b) < DELTA)
			return true;
		return false;
	}

	/*
	@Override
	public int compareTo(Object o) {
		if (o instanceof Location) {
		Double otherDistance = ((Location)o).distanceFromCenter();
		Double distance = distanceFromCenter();
		if( compareDouble(distance, otherDistance) ) return 0;
		return Double.compare(distance, otherDistance);
		}
		else
			return -1;
	}
	*/

}
