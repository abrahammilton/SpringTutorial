package com.aby;

public class UserValiationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("aby") && password.equals("milty")) {
			return true;
		} else {
			return false;
		}
	}
}
