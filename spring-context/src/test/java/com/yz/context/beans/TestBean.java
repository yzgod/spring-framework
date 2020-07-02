package com.yz.context.beans;

import org.springframework.stereotype.Component;

/**
 * @author zhun.yang
 * @date 2020-07-02 18:05
 * <br></br>
 **/
@Component
public class TestBean {

	public TestBean() {
		System.out.println("test");
	}
}
