package com.webservice.cxf;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.webservice.cxf.bean.Role;
import com.webservice.cxf.bean.User;

@WebService(name="service")
public interface MyService {
	public int add(int a,int b);
	public List<Role>getRolesByUser(User user);
	//cxf不能直接处理Map类型的数据，需要添加注解定义一个适配器转换数据类型
	@XmlJavaTypeAdapter(MyAdapter.class)
	public Map<String,List<Role>>getRoles();
}
