package com.webservice.cxf.client;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.webservice.cxf.MyServiceImplService;
import com.webservice.cxf.Role;
import com.webservice.cxf.Service;
import com.webservice.cxf.User;
import com.webservice.cxf.interceptor.AddHeaderInterceptor;

public class Client {
public static void main(String[] args) {
	MyServiceImplService myservice=new MyServiceImplService();
	Service service=myservice.getServicePort();
		//客户端添加日志拦截器
		org.apache.cxf.endpoint.Client client=ClientProxy.getClient(service);
		client.getOutInterceptors().add(new AddHeaderInterceptor("jack","123456"));
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		System.out.println("10+2="+service.add(10, 2));
		
		User user=new User();
		user.setId(1);
		user.setUsername("jack");
		user.setPassword("123456");
		List<Role>roles=service.getRolesByUser(user);
		for(Role r:roles){
			System.out.println(r.getId()+","+r.getRoleName());
		}
}
}
