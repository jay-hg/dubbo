package com.hgc.provider.user;

import com.hgc.common.dto.UserProviderResponse;
import com.hgc.entity.User;

import java.util.List;

/**
 * 统一返回结果类型的好处：
 * provider开发者，有统一的目标，在实现过程中，会主动的去封装对应的返回结果，而不是随意的
 *  根据自己的想象和业务的具体需求去定义五花八门的返回类型。
 * consumer开发者，有统一的规范，在调用的过程中，有一个具体的处理目标。知道provider返回的结果代表
 *  什么。不需要去猜测provider开发者的意图。
 * @author Administrator
 *
 */
public interface UserProviderService {

	UserProviderResponse saveUser(User user);
	UserProviderResponse removeUserById(Long id);
	UserProviderResponse removeUserByExample(User example);
	UserProviderResponse removeUsersById(List<Long> ids);
	UserProviderResponse modifyUser(User user);
	// 分页查询，分页操作使用pagehelper实现
	UserProviderResponse findUserByPage(int page, int rows);
	UserProviderResponse findUserById(Long id);
	
}
