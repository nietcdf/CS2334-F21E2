import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Street{
	public Street(Double x, Double y) {
		lots = new LinkedHashMap<String, Habitable>();
		
	}
	
	public void add(String address, Habitable location) {
		lots.put(address, location);
	}
	
	public ArrayList<House> getHouses(){
		var houses = new ArrayList<House>();
		for(Habitable xy: lots) {
			if (xy.isHabitable())
				houses.add((House)xy);
		}
		return houses;
	}
	
	public ArrayList<Lot> getLots() {
		var xys = new ArrayList<Lot>();
		return xys;
	}

	private LinkedHashMap<String, Habitable> lots;


}
