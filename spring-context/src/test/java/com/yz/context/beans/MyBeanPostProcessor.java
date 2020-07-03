package com.yz.context.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author zhun.yang
 * @date 2020-07-03 16:52
 * <br></br>
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof TestBean){
			System.out.println("TestBean initialize before");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof TestBean){
			System.out.println("TestBean initialize after");
		}
		return bean;
	}
}
