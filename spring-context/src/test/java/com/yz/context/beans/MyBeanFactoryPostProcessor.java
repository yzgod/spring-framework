package com.yz.context.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhun.yang
 * @date 2020-07-02 19:52
 * <br>
 *		BeanFactoryPostProcessor可以对bean的定义（配置元数据）进行处理。
 *		也就是说，Spring IoC容器允许BeanFactoryPostProcessor在容器实际
 *		实例化任何其它的bean之前读取配置元数据，并有可能修改它。如果你愿意，
 *		你可以配置多个BeanFactoryPostProcessor。你还能通过设置'order'属性
 *		来控制BeanFactoryPostProcessor的执行次序。
 * </br>
 **/
@Order(1)
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor: postProcessBeanFactory");
	}

}
