package com.zluo.junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * 项目名称：junit-demo <br> 
 * 类名称：WithParameterDemoTest  <br>
 * 类描述：  断言的使用<br>
 * 创建人：louzhangjie  <br>
 * 创建时间：2015年5月24日 下午12:00:05  <br>
 * 修改人：louzhangjie <br>
 * 修改时间：2015年5月24日 下午12:00:05  <br>
 * 修改备注：  <br>
 * @version 1.0  <br>
 *
 */
public class WithParameterDemoTest {

	@Test
	public void testAdd(){
		assertEquals(3, new WithParameterDemo().add(1, 2));
	}
	
}
