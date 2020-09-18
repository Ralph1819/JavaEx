package com.javaex.thread.synchronize;

public class User extends Thread {
	//	필드
	private SharedMemory memory;
	private int data;
	
	//	새성자
	public User(String name, SharedMemory memory, int data) {
		//	쓰레드의 이름
		this.setName(name);
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		if(memory !=null) {
			memory.setMemory(data);
		}
//		System.out.println(getName()+":" + memory.getMemory());
	}
	
	

}
