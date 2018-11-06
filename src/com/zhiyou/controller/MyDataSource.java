package com.zhiyou.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

/**
* @author 		laosun
* @version 		创建时间：2018年9月27日 下午2:43:37
* @ClassName 	类名称
* @Description 	类描述
*/
@Repository
public class MyDataSource {
	
	@Resource
	private DataSource dataSource;
	public void select() throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement pStatement = connection.prepareStatement("select * from t_user");
		ResultSet  rSet = pStatement.executeQuery();
		while (rSet.next()) {
			System.out.println(rSet.getString(2));
		}
	}

}
