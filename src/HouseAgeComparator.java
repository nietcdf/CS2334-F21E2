import java.util.Comparator;

public class HouseAgeComparator implements Comparator<House>{

	@Override
	public int compare(House o1, House o2) {

		return ((House)o1).getBuildOn().compareTo( ((House)o2).getBuildOn());
		//return 0;
	}


}
