package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singletion(); //	오류 : 생성자가 priavate라.. 생성자 하고 싶으면 우회접근
		Singleton s1 = Singleton.getInstance(); // 1개 생성
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2); //?????????????????????주소가 왜 같은거야 ???
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); // '==' 주소의 비교 
			//두 객체는 동일 객체임 . 


	}

}
