package com.javaex.oop.point.v4;

//	v4. Point 클래스를 상속받은 자식 클래스 

public class ColorPoint extends Point { //여기까지만 작성하면 오류가 생기는데 ,이유는 부모클래스인 Point에 기본생성자가 없으므로 임의로 기본 생성자를 적용시키지 못함 
		private String color;
		
		//	생성자
		public ColorPoint(int x, int y ) {
			//	명시하지 않으면 javac가 부모의 기본 생성자를 임의로 추가
			super(x,y);	//	명시적으로 부모 생성자 호출
			System.out.println(this.getClass().getSimpleName() + "의 생성자(x,y)");
	}
		
		public ColorPoint(int x, int y, String color) {
			this(x,y);
			this.color = color;
			System.out.println(this.getClass().getSimpleName() + "의 생성자(x,y,color)");
		}
		
		// Getter
		public String getColor() {
			return color;
		}

		@Override
		public void draw(boolean bDraw) {
			// 	연습: Point 클래스의 draw(boolean) 메서드를 오버라이드 해보자 
			super.draw(bDraw);
		}

		public void setColor(String color) {
			this.color = color;
		}
		//부모 Point는 draw 메서드를 가지고 있다 .
		@Override
		public void draw() {
			if (color != null) {
//				System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", x, y, color); //x,y,에서 오류나는데 이유는 부모의 클래서에 있는 x,y가 private
				//해소 방법 1 super로 받아오기 
//				System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", super.getX(), super.getY(), color); //	Solution 1
				//해소 방법 2 부모의 필드를 protected로 변경
				System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", x,y, color); //	Solution 2
				//Point Class에 가서 필드에 있는 x,y를 private -> protected 했더니 오류 사라짐 
			}	else {
				System.out.printf("색깔점[x=%d, y=%d]을 그렸습니다.", x,y);
				
		

			}	
			
	}
}
	