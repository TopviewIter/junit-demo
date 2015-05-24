package com.zluo.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ParameterizedTest.class,
	WithParameterDemoTest.class,
	SimpleDemoTest.class
})
public class SuiteTest {

}
