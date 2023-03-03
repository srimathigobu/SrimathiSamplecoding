package org.testng;


import org.test.BaseClass;
import org.testng.annotations.Test;

public class Demo extends BaseClass {
	@Test
	private void tc5() {
		browserLaunch();
		urlLaunch("http://www.amazon.in");
	}

}
