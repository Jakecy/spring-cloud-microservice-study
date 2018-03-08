package com.myfeignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * 使用Feign完成调用
 * @author chihaojie
 * @date  2018年3月4日
 *
 */
@FeignClient(value="microservice-user",fallback=UserClientFallBack.class)
public interface UserClient {
	
	@RequestMapping(value = "/user/query", method = RequestMethod.GET)
	public  String query() ;

}

@Component
class UserClientFallBack  implements UserClient  {

	/**
	 * fallback对应的代码
	 * 
	 */
	public String query() {
		
		return "failture";
	}

}
