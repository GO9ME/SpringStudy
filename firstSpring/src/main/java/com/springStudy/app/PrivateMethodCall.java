package com.springStudy.app;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Hello hello = new Hello();
//		hello.main();
		
		// Reflection API를 사용 - 클래스 정보를 얻고 다를 수 있는 강력한 기능 제공
		// java.lang.reflect 패키지를 제공
		// Hello 클래스의 Class객체 (클래스의 정보를 담고 있는 객체)를 얻어온다.
		Class helloClass = Class.forName("com.springStudy.app.Hello");
		Hello hello = (Hello) helloClass.newInstance(); // CLass객체가 가진 정보로 객체생성
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true);
		
		main.invoke(hello);
	}

}
