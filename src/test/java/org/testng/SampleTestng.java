package org.testng;

import org.test.BaseClass;
import org.test.LoginPojo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestng extends BaseClass {
	@DataProvider(name="loginData")
	private String [][] testData(){
		return new String[][] {
			{"srirupenzil@gmail.com","banumathiak47"},
			{"akilanudaya@gmail.com","akilansri@1"},
			{"yashveer19@gmail.com","sriakilan22"},
			{"rubycrazy@gmail.com","rubiniyashveer"},
			{"srimathiakilan22@gmail.com","srimathiyashveer19"},
		};
	}
	@Test(dataProvider="loginData")
	private void tc2(String txtEmail,String txtPass) throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		LoginPojo lp=new LoginPojo();
		fillText(lp.getTxtEmail(),txtEmail);
		fillText (lp.getTxtPass(),txtPass);
		btnClick(lp.getBtnClick());
		Thread.sleep(2000);
	

}}
