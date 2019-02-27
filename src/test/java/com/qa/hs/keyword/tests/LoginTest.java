package com.qa.hs.keyword.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeywordEngine;

public class LoginTest {
	
	public KeywordEngine keywordengine;
	
	@Test(enabled=false)
	public void loginTestScenario() throws IOException {
		
		keywordengine=new KeywordEngine();
		keywordengine.startExecution("login");
	}
	
	@Test(enabled=false)
	public void signUpTestScenario() throws IOException {
		
		keywordengine=new KeywordEngine();
		keywordengine.startExecution("signup");
	}
	
	@Test
	public void FreeCRMLogin() throws IOException {
		
		keywordengine=new KeywordEngine();
		keywordengine.startExecution("FreeCRMLogin");
	}

}
