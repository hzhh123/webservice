package com.webservice.cxf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.webservice.cxf.bean.MyRole;
import com.webservice.cxf.bean.Role;

public class MyAdapter extends XmlAdapter<MyRole[], Map<String,List<Role>>>{
	/**
	 * 适配转换Array->Map
	 */
	@Override
	public Map<String, List<Role>> unmarshal(MyRole[] v) throws Exception {
		 Map<String,List<Role>>map=new HashMap<String,List<Role>>();
		 for(int i=0;i<v.length;i++){
			 MyRole r=v[i];
			 map.put(r.getKey(), r.getRoles());
		 }
		return map;
	}
	/**
	 * 适配转换Map->Array
	 */
	@Override
	public MyRole[] marshal(Map<String, List<Role>> v) throws Exception {
		MyRole[] myroles=new MyRole[v.size()];
		int i=0;
		for(String key:v.keySet()){
			myroles[i]=new MyRole();		
			myroles[i].setKey(key);
			myroles[i].setRoles(v.get(key));
			i++;
		}
		return myroles;
	}

}
