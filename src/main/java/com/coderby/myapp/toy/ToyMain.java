package com.coderby.myapp.toy;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.toy.controller.ToyController;

public class ToyMain {

	public static void main(String[] args) {
		//bean container와 main간 통신을 위한 context 변수 생성
		String[] path = {"application-config.xml",};
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(path);
		
		//getBean 메서드는 첫 번째에 xml파일 내의 id, 두 번째는 실제 클래스 파일의 이름.class
		ToyController toy = context.getBean("toyController", ToyController.class);
		
		toy.playToy();
		
		//context는 다 사용했으면 .close()로 메모리 회수
		context.close();
	}
}
