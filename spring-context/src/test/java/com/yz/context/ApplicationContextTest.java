package com.yz.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhun.yang
 * @date 2020-07-02 18:03
 * <br></br>
 **/
@Configuration
@ComponentScan(basePackages = {"com.yz.context.beans"})
public class ApplicationContextTest {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ApplicationContextTest.class);
		context.refresh();

		System.out.println(context.getBeanDefinitionCount());

	}
}
