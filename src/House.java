import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class House extends Location implements Comparable<House>{
	private static final int MINIUMUM_VALID_ID = 100;
	private static final double MINIUMUM_VALID_AREA = 1.0;
	private Integer id;
	private Double area;
	private Double pricePerSquareFoot = 100.0;
	private java.time.LocalDate buildOn;

	public House(Double x, Double y, Integer id, Double area, LocalDate buildOn) throws InvalidIdException, InvalidAreaException {
		super(x, y);
		setId(id);
		setArea(area);
		this.buildOn = buildOn;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", area=" + area + ", buildOn=" + buildOn + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) throws InvalidIdException {
		if (id < MINIUMUM_VALID_ID)
			throw new InvalidIdException("Invalid id");
		this.id = id;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) throws InvalidAreaException {
		if (area < 100.0)
			throw new InvalidAreaException("Invalid area");
		this.area = area;
	}

	public java.time.LocalDate getBuildOn() {
		return buildOn;
	}

	public void setBuildAd(java.time.LocalDate buildOn) {
		this.buildOn = buildOn;
	}
	
	public int compareTo(House house) {
		if (Location.compareDouble(calculateValue(), house.calculateValue())) return 0;
		return  (int)(calculateValue() - house.calculateValue());
	}

	private Double calculateValue() {
		return area * pricePerSquareFoot;

	}
	@Override
	public Double calculatePropertyTax(Double taxRate) {
		return calculateValue() * taxRate;
	}

	
}
