package com.webservice.cxf.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AddHeaderInterceptor extends AbstractPhaseInterceptor<SoapMessage>{
	private String username;
	private String password;
	public AddHeaderInterceptor(String username, String password) {
		super(Phase.PRE_PROTOCOL);
		this.username=username;
		this.password=password;
	}
	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers = message.getHeaders();
        Document document = DOMUtils.createDocument();
        Element rootElement = document.createElement("atguigu");
        Element usernameElement = document.createElement("username");
        usernameElement.setTextContent(username);
        rootElement.appendChild(usernameElement);
        Element passwordElement = document.createElement("password");
        passwordElement.setTextContent(password);
        rootElement.appendChild(passwordElement);
        headers.add(new Header(new QName("atguigu"), rootElement));
        System.out.println("拦截...");
	}

}
