package com.hb.ehcache.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceManagerImpl implements ServiceManager {

	@Override
	public List getObject() {
		List<Integer> list=new ArrayList<Integer>(){{add(0);add(1);}};
		return list;
	}

	@Override
	public void updateObject(Object Object) {
	}

}