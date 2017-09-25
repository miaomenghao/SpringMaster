package com.xgj.dao.transaction.nestedCall.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * 
 * @ClassName: BaseDao
 * 
 * @Description: 抽象类，封装一些通用的功能，希望被继承
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017年9月24日 下午5:02:42
 */

public abstract class BaseDao {

	public JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
