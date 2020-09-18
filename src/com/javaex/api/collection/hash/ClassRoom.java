//package com.javaex.api.collection.hash;
//
//public class ClassRoom {
//	//	필드
//	
//	private String subject;
//	private String roomName;
//	
//	//	생성자
//	public ClassRoom(String subject) {
//		this.subject = subject;
//				
//	}
//	
//	public ClassRoom(String subject , String roomName) {
//		this.roomName = roomName;
//	}
//
//	@Override
//	public String toString() {
//		
//		return super "ClassRoom [subject=" + subject + ", roomName=" + roomName +"]";
//	}
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return subject.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof ClassRoom) {
//			ClassRoom other = (ClassRoom)obj;
//			return subject.equals(other.subject) && roomName.contentEquals(other.roomName);
//		}
//		return super.equals(obj);
//	}
//
//}
