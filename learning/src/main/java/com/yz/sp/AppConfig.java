package com.yz.sp;

import com.yz.sp.beans.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhun.yang
 * @date 2019-11-23 10:31
 * <br></br>
 **/
@ComponentScan("com.yz.sp")
public class AppConfig {

	public static void main(String[] args){
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext();



		ac.register(AppConfig.class);
		ac.refresh();

		System.out.println(ac.getBean(UserService.class));
	}





}
