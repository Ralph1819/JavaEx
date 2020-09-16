package practice2;

class Rectangle extends Shape{
	int radius;
	int height;
	
	public Rectangle(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	public void draw() {
		System.out.println("원기둥을 그리다.");
	}
	
	public double findArea() {
		return height*pi*radius*radius;
	}
	

}