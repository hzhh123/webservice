package com.webservice.cxf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.webservice.cxf.bean.Role;
import com.webservice.cxf.bean.User;
@Component("server")
@WebService(name="service")
public class MyServiceImpl implements MyService {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public List<Role> getRolesByUser(User user) {
		List<Role>roleList=new ArrayList<Role>();
		if(user.getUsername().equals("jack")&&user.getPassword().equals("123456")){
			roleList.add(new Role(1,"架构师"));
			roleList.add(new Role(2,"技术总监"));
		}else if(user.getUsername().equals("java")&&user.getPassword().equals("123456")){
			roleList.add(new Role(3,"程序员"));
		}
		return roleList;
	}
	
	@Override
	public Map<String, List<Role>> getRoles() {
		Map<String,List<Role>>map=new HashMap<String,List<Role>>();
		List<Role>roleList1=new ArrayList<Role>();
		roleList1.add(new Role(1,"架构师"));
		roleList1.add(new Role(2,"技术总监"));
		List<Role>roleList2=new ArrayList<Role>();
		roleList2.add(new Role(3,"程序员"));
		map.put("jack", roleList1);
		map.put("java", roleList2);
		return map;
	}

}
