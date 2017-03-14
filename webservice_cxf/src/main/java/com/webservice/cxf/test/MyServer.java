package com.webservice.cxf.test;

//import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.webservice.cxf.MyService;
import com.webservice.cxf.MyServiceImpl;
import com.webservice.cxf.interceptor.AuthInterceptor;

public class MyServer {
public static void main(String[] args) {
	System.out.println("webservice start");
	MyService myService=new MyServiceImpl();
	//暴露请求地址
	String address="http://localhost:8080/service";
	//暴露webservice接口
	//Endpoint.publish(address, myService);
	
	//cxf start
	//创建webservice的工厂bean
	JaxWsServerFactoryBean factoryBean=new JaxWsServerFactoryBean();
	//添加暴露webservice地址
	factoryBean.setAddress(address);
	//添加webservice接口类
	factoryBean.setServiceClass(MyService.class);
	//添加webservice的具体实现类实例
	factoryBean.setServiceBean(myService);
	//添加自定义拦截器
	factoryBean.getInInterceptors().add(new AuthInterceptor());
	//服务器端添加日志拦截器
	factoryBean.getInInterceptors().add(new LoggingInInterceptor());//添加in日志拦截器
	factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());//添加out日志拦截器
	//创建webservice实例
	factoryBean.create();
	System.out.println("webservice start..");
}
}
