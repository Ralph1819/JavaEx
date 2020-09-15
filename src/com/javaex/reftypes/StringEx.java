package com.javaex.reftypes;

public class StringEx {

	public static void main(String[] args) {
		stringEx();
		stringFormatEx();
		
	}

	public static void stringFormatEx() {
		//	%d(����), %s(���ڿ�), %n(����), %f(�Ǽ�), %%(%)
		// 00���� 00�߿��� 00���� �Ծ��� . 
		String fmt = "%d���� %s�߿��� %d���� �Ծ����.%n";
		String fruit = "���";
		int total = 10;
		int eat =3;
		
		String result = String.format(fmt,total,fruit,eat);
		System.out.println(result);
		
		//	printf 메서드
		System.out.printf(fmt,10,"오렌지",5);
		
		//	%f
		float rate =1.234f;
		//	현재 이자율은 0.00%입니다.
		System.out.printf("현재 이자율을 %f%%입니다%n", rate);
		System.out.printf("현재 이자율은 %.2f%%입니다." , rate);
	}
	public static void stringEx() {
		//	������ ����
		String str;	//	����
		str = "Java";	//	�Ҵ� : Literal
		String str2 = "Java";	//	Literal
		String str3 = new String("Java");
		System.out.println(str);
		
		//	�� ������ ��� ���� ������
		System.out.println(str == str2);	//	Literal == Literal
		System.out.println(str2 == str3);	//	Literal == Literal
		//	���� ������ �ּ� ���� �����ϰ� �ִ�. 
		//	���� ������ �������� ���ϼ��� �� �ϱ����ؼ��� .equals() �޼��� ���
		
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
	}
}
