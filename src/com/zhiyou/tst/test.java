package com.zhiyou.tst;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou.controller.MyDataSource;

/**
* @author 		laosun
* @version 		创建时间：2018年9月27日 下午2:48:57
* @ClassName 	类名称
* @Description 	类描述
*/
public class test {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) throws SQLException {
		applicationContext = new ClassPathXmlApplicationContext("springmvc-config.xml");
	    MyDataSource myDataSource =(MyDataSource)applicationContext.getBean("myDataSource");
	    myDataSource.select();
	
	
	}
}
