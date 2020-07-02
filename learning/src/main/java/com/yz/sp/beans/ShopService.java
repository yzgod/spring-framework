package com.yz.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhun.yang
 * @date 2019-11-23 10:35
 * <br></br>
 **/
@Service
public class ShopService {

	@Autowired
	UserService userService;

	public ShopService() {
		System.out.println(getClass());
	}




}
