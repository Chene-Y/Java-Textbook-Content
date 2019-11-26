public class Rectangle {
private double width;
private double height;
public Rectangle(){
}
public Rectangle(double width,double height){
	this.width = width;
	this.height = height;
}
public Rectangle(
		double width,double height,String color,boolean filled){
	this.width = width;
	this.height = height;
	setColor(color);
	setFilled(filled);
}
private void setFilled(boolean filled) {
	// TODO Auto-generated method stub
	
}
private void setColor(String color) {
	// TODO Auto-generated method stub
	
}
/*Return width*/
public double getWidth(){
	return width;
}
/*set a new width*/
public void setWidth(double width){
	this.width = width;
}
/*Return height*/
public double getHeight(){
	return height;
}
/**Set a new height*/
public void setHeight(double height){
	this.height = height;
}
/**Return area */
public double getArea(){
	return width * height;
}
/**Return perimeter*/
public double getPerimeter(){
	return 2 *(width + height);
}
}
