package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		//	사용(참조)
		Goods notebook = new Goods("LG Gram", 1600000);
		//	필드에 접근(
//		notebook.name = "LG Gram"; (우회 접근을 위해 주석처리)
//		notebook.price = 1500000;

		
		//	Read Only로 바꿔줬기 때문에 주석처리 
//		notebook.setName("LG Gram");
//		notebook.setPrice(1500000);
//		
		
		
		
		Goods smartphone = new Goods("iPhone",600000);
//		smartphone.name = "iPhone SE";
//		smartphone.price = 600000;
		
		//	Read Only로 바꿔줘서 필요 없음 		
//		smartphone.setName("iPhone SE");
//		smartphone.setPrice(600000);
		//	출력
//		System.out.printf("%s,%d원%n", 
//				notebook.getName(),notebook.getPrice());
//		System.out.printf("%s,%d원%n", 
//				smartphone.getName(),smartphone.getPrice());   //Goods에 showInfo라는 출력 코드가 있으니까 없어도 된다 .
		
		notebook.showInfo();
		smartphone.showInfo();
		
	}

}
