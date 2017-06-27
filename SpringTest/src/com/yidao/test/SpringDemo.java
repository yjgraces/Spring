package com.yidao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yidao.vo.User;

public class SpringDemo {

	public static void main(String[] args) {
		//读取配置文件
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		User user=(User) ac.getBean("u3");
		System.out.println(user);
		
		
	}
}
