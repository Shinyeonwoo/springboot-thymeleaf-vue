package com.example.demo.DAO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class testDAO {
	
	private String userId;
	private String userPwd;
	private String userName;
	
	public testDAO(String userId, String userName, String userPwd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}

}
