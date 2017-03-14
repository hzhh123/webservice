package com.webservice.cxf.interceptor;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	public AuthInterceptor() {
		 super(Phase.PRE_PROTOCOL);// 准备协议化时拦截
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		Header header = message.getHeader(new QName("atguigu"));
        if (header != null) {
            Element element = (Element) header.getObject();
            String username = element.getElementsByTagName("username").item(0).getTextContent();
            String password = element.getElementsByTagName("password").item(0).getTextContent();
            if (username.equals("jack")&&password.equals("123456")) {
                System.out.println("通过拦截器...");
                return;
            }
        }
        //不能通过
        System.out.println("没有通过拦截器");
        throw new Fault(new RuntimeException("用户名或密码不正确"));
	}

}
