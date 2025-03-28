package Testcase;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class TC_001 {
	
	  @Test
	    public void login(){
	        LoginPage Login = new LoginPage();
	        Login.enterUserName().enterPassword().clickLoginButton().verify();
	    }
	}


