import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Driver {
	public static void createSome() throws InvalidIdException, InvalidAreaException {
		try {
			House house = new House(1., 1.9, 23, 8000., LocalDate.now());
			System.out.println(house);
		} catch (InvalidIdException e) {
			System.out.println(e);
		}
		
		
		Double[] sqFootage = {Double.valueOf(800.), Double.valueOf(1456.0),  Double.valueOf(3000.0)};
		Double[] taxRate = {Double.valueOf(0.08), Double.valueOf(0.1), Double.valueOf(0.075)};
		Double[] pricePerSquareFoot = {Double.valueOf(123.0), Double.valueOf(99.1), Double.valueOf(80.075)};
		
		try {
			House house = new House(0.1, 1.1, 123, 8000., LocalDate.now());
			Random random = new Random();
			ArrayList<Integer> selection = new ArrayList<>();
			
			for(int i = 0; i < 18; ++i) selection.add(random.nextInt(3));
			
			for(Integer i:selection) System.out.println("i: " + i);
			System.out.println(house);
			
			List<House> list = new LinkedList<>();
			for(int i = 0; i < 6; ++i) {
				int year = 2021;
				int month = 6;
				int day = 10;
				House h = new House(0.1 + i, 0.1 + i, 124 + i, 
						sqFootage[selection.get(i)], LocalDate.of(year+i, month+i, day+i));
				list.add(h);
			}
			

			
			System.out.println("======");
			
		} catch (InvalidIdException e) {
			System.out.println(e);
		}
	}

	
	public static void sortSome() throws InvalidIdException, InvalidAreaException {
		try {
			House house = new House(1., 1.9, 23, 8000., LocalDate.now());
			System.out.println(house);
		} catch (InvalidIdException e) {
			System.out.println(e);
		}
		
		
		Double[] sqFootage = {Double.valueOf(800.), Double.valueOf(1456.0),  Double.valueOf(3000.0)};
		Double[] taxRate = {Double.valueOf(0.08), Double.valueOf(0.1), Double.valueOf(0.075)};
		Double[] pricePerSquareFoot = {Double.valueOf(123.0), Double.valueOf(99.1), Double.valueOf(80.075)};
		
		try {
			House house = new House(0.1, 1.1, 123, 8000., LocalDate.now());
			Random random = new Random();
			ArrayList<Integer> selection = new ArrayList<>();
			
			for(int i = 0; i < 18; ++i) selection.add(random.nextInt(3));
	
			
			List<House> list = new LinkedList<>();
			for(int i = 0; i < 6; ++i) {
				int year = 2021;
				int month = 6;
				int day = 10;
				House h = new House(0.1 + i, 0.1 + i, 124 + i,
						sqFootage[selection.get(i)], LocalDate.of(year - i, month + i, day + i));
				list.add(h);
			}
			
			Collections.sort(list, new HouseAgeComparator());
			
			System.out.println("======");
			list.forEach(h -> System.out.println(h));
			
		} catch (InvalidIdException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InvalidIdException, InvalidAreaException {
		createSome();
		sortSome();
	}
}
