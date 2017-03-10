package com.webservice.cxf;

import javax.jws.WebService;

@WebService(name="server")
public interface MyService {
	public int add(int a,int b);
}
