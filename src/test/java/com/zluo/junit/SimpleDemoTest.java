package com.zluo.junit;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * 项目名称：junit-demo <br> 
 * 类名称：TestDemo  <br>
 * 类描述：  对Test注解的一些测试<br>
 * 创建人：louzhangjie  <br>
 * 创建时间：2015年5月24日 上午11:52:03  <br>
 * 修改人：louzhangjie <br>
 * 修改时间：2015年5月24日 上午11:52:03  <br>
 * 修改备注：  <br>
 * @version 1.0  <br>
 *
 */
public class SimpleDemoTest {

	@Test(timeout = 1000)
	public void testTimeOut(){
		new SimpleDemo().timeOut();
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException(){
		new SimpleDemo().exception();
	}
	
	@Ignore
	@Test
	public void testIgnore(){
		new SimpleDemo().ignore();
	}
	
}
