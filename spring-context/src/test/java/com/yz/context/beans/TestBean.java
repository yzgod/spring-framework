package com.yz.context.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zhun.yang
 * @date 2020-07-02 18:05
 * <br></br>
 **/
@Component
public class TestBean implements InitializingBean , SmartLifecycle {

	private boolean running;

	public TestBean() {
	}

	@PostConstruct
	public void init(){
		System.out.println("init...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet...");
	}

	@Override
	public void start() {
		System.out.println("testBean start");
		running = true;
	}

	@Override
	public void stop() {
		System.out.println("testBean stop");
		running = false;
	}

	@Override
	public boolean isRunning() {
		return running;
	}

	// 单位ms
	@Override
	public int getPhase() {
		return 500;
	}
}
