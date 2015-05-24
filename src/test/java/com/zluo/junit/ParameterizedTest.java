package com.zluo.junit;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * 项目名称：junit-demo <br> 
 * 类名称：ParameterizedTest  <br>
 * 类描述：  参数化设置测试<br>
 * 创建人：louzhangjie  <br>
 * 创建时间：2015年5月24日 下午12:01:16  <br>
 * 修改人：louzhangjie <br>
 * 修改时间：2015年5月24日 下午12:01:16  <br>
 * 修改备注：  要注意运行测试的方式,如果只是选中某个方法来运行,这样会报初始化错误<br>
 * @version 1.0  <br>
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {

	private int expected = 0;
	private int input_01 = 0;
	private int input_02 = 0;
	
	public ParameterizedTest(int expected, int input_01, int input_02){
		this.expected = expected;
		this.input_01 = input_01;
		this.input_02 = input_02;
	};
	
	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][]{
				{3, 2, 1},
				{4, 2, 2}
		});
	}
	
	@Test
	public void testAdd(){
		Assert.assertEquals(expected, new WithParameterDemo().add(input_01, input_02));
	}
	
}
