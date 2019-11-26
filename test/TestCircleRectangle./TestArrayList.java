import java.util.ArrayList;

public class Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
	cityList.add(Lodion);
	cityList.add(Denver);
	cityList.add("Paris");
	cityList.add("Miami");
	cityList.add("Seoul");
	cityList.add("Tokyo");
	System.out.println("List size?"+cityList.size());
	System.out.println("Is Miami in the list?"+cityList.contains("Miami"));
	System.out.println("The location of Denver in the list?"+cityList.indexOf("Denver"));
	System.out.println("Is the list empty?"+cityList.isEmpty());
	cityList.add(2,"Xian");
  cityList.remove("Miami");
  cityList.remove(1);
  System.out.println(cityList.toString());
  for(int i = city.size() - 1; i>=0;i--)
  System.out.println();
  ArrayList<CircleFormSimpleGeometricObject> list = new ArrayList<>();
  list.add(new CircleFormSimpleGeometricObject(2));
  list.add(new CircleFormSimpleGeometricObject(3));
  System.out.println("The area of the circle?"+list.get(0).getArea());
	}
	

}
