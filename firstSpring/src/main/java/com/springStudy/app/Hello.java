package com.springStudy.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static ����
	
	// 2. URL�� �޼��� ���� 
	@RequestMapping("/hello")
	private void main() { // �ν��Ͻ� �޼���
		System.out.println("Hello - private");
		System.out.println("cv");
	}
	
	public static void main2() { //static �޼��� - cv�� ��밡��
		System.out.println(cv);
	}
}
