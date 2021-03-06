package com.javaex.oop.staticmember;

//어떤 상황에서든 단 하나의 인스턴스만 유지해야 하는 경우 
public class Singleton {
	
	private static Singleton instance = new Singleton();

	//	생성자 -> 하나의 인스턴스만..
	private Singleton() {
		//	'private'을 통해 new 호출 불가 
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
