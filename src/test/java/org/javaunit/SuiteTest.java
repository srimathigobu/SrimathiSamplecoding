package org.javaunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


	@RunWith(Suite.class)
	@SuiteClasses({JavaUnit.class,A.class,B.class,C.class})
	public class SuiteTest{

}
