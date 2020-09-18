package com.javaex.api.collection.generic.v2;


//	Generic 이용
//	설계시에는 Type 을 지정하지 않고 
//	실제 객체화 될 때 외부에서 내부 데이터 타입을 결정해 주는 방법 



//	타입 파라미터 
//	T: Type
//	K: key
//	R: Return Type
//	V: value

public class Box<T> {
	//정수를 담을 수 있는 box를 하나 만들자
	
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(Object content) {
//		this.content = content
	}

}
