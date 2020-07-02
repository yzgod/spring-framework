package com.yz.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhun.yang
 * @date 2019-11-23 10:35
 * <br></br>
 **/
@Service
public class UserService {

	@Autowired
	ShopService shopService;

	public UserService() {
		System.out.println(getClass());
	}





}
