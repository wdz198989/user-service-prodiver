package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

/**
 *  测试
 * @author: wudazhong
 * @Description: TODO
 * @Date : 2019年10月18日 下午11:04:02
 */
public class UserServiceImpl implements UserService{
    @Override
	public List<UserAddress> getUserAddressList(String userId) {
    	UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		
		return Arrays.asList(address1,address2);
	}
    
	

}
