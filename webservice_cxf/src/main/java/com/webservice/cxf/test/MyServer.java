package com.webservice.cxf.test;

//import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.webservice.cxf.MyService;
import com.webservice.cxf.MyServiceImpl;

public class MyServer {
public static void main(String[] args) {
	MyService myService=new MyServiceImpl();
	//暴露请求地址
	String address="http://localhost:8880/server";
	//暴露webservice接口
	//Endpoint.publish(address, myService);
	
	//cxf start
	JaxWsServerFactoryBean factoryBean=new JaxWsServerFactoryBean();
	factoryBean.setAddress(address);
	factoryBean.setServiceClass(MyService.class);
	factoryBean.setServiceBean(myService);
	factoryBean.create();
	System.out.println("webservice start..");
}
}
