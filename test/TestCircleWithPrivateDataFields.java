public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		Circle myCircle = new Circle(5.0);
		System.out.println("The area of the circle of radius"+myCircle.getRadius()+"is"+myCircle.getArea());
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius"+myCircle.getRaidus()+"is"+myCircle.getArea());
System.out.println("The number of objects created is"+Circle.getNumberOfObjects());
	}
}
