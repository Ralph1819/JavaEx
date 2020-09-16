package com.javaex.shape.v1;

public class Circle extends Shape{ // 추상 메서드에서는 실제로 구현을 하지 않기 때문에 오류 나옴 
	// 밑에 메서드 오버라이드 하는 순간 오류 사라짐 
	
	// 	필드
	protected double radius;	//	반지름
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x,y);	//	부모 생성자(초기화)
		this.radius = radius;
	}
	//	추상 클래스를 상속받은 실체 클래스는 추상 메서드를 반드시 구현해줘야 함 
	@Override
	public double area() {
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public void draw() {
		
		System.out.printf("월[x=%d, y=%d, area=%f]을 그렸어요%n",
				x,y,area());
		
	}
	
}
