package com.cv.sharding;

public class UserLog {

	long date;
	Priority priority;
	String user_login;
	String action;

	enum Priority {
		HIGHEST(0), HIGH(1), MEDIUM(2), LOW(3);
		private int value;

		private Priority(int value) {
			this.value = value;
		}
	}

}
