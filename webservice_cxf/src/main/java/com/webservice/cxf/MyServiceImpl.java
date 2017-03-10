package com.webservice.cxf;

import javax.jws.WebService;

@WebService(name="server")
public class MyServiceImpl implements MyService {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
