package com.eduardo.web.demo3.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SomeUserDaoService {
	/* Some comment */

	private static List<SomeUser> users = new ArrayList<SomeUser>();
	
	private static Integer userQty = 3;
	
	static {
		users.add(new SomeUser(1, "One", new Date()));
		users.add(new SomeUser(2, "Two", new Date()));
		users.add(new SomeUser(3, "Three", new Date()));
	}
	
	public List<SomeUser> findAll() {
		return users;
	}
	
	public SomeUser saveSomeUser(SomeUser someUser) {
		if (someUser.getId() == null) {
			
		}
		users.add(someUser);
		return someUser;
		
	}
	
	public SomeUser findSomeUser(Integer id) {
		return users.get(id);
	}
	
}
