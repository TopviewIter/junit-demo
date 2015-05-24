package com.zluo.junit;

/**
 * 
 * 项目名称：junit-demo <br> 
 * 类名称：Demo  <br>
 * 类描述：  <br>
 * 创建人：louzhangjie  <br>
 * 创建时间：2015年5月24日 上午11:45:26  <br>
 * 修改人：louzhangjie <br>
 * 修改时间：2015年5月24日 上午11:45:26  <br>
 * 修改备注：  <br>
 * @version 1.0  <br>
 *
 */
public class SimpleDemo {

	public void timeOut(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void exception(){
		System.out.println(1/0);
	}
	
	public void ignore(){
		System.out.println("ignore...");
	}
}
