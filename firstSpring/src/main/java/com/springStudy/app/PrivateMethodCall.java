package com.springStudy.app;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Hello hello = new Hello();
//		hello.main();
		
		// Reflection API�� ��� - Ŭ���� ������ ��� �ٸ� �� �ִ� ������ ��� ����
		// java.lang.reflect ��Ű���� ����
		// Hello Ŭ������ Class��ü (Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.springStudy.app.Hello");
		Hello hello = (Hello) helloClass.newInstance(); // CLass��ü�� ���� ������ ��ü����
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true);
		
		main.invoke(hello);
	}

}
