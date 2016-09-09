package com.saq.as;

import com.as.helpers.AppBasics;

public class JavaApp {

	public static void main(String[] args) {
		JavaApp myApp = new JavaApp();
		start(myApp);
	}

	private static void start(JavaApp myApp) {
		myApp.init();
		myApp.main();
		myApp.tearDown();
	}

	private String appName = "Basic Java App";

	private String user;

	public String getAppName() {
		return this.appName;
	}

	public String getUser() {
		return this.user;
	}

	public void main() {
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setUser(String user) {
		this.user = user;
	}

	private void init() {
		this.user = AppBasics.welcomeUserAndGetUsersName(this.appName);
	}

	private void tearDown() {
		AppBasics.farewellUser(this.user, this.appName);
	}
}

