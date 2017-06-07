package com.myweb.dao;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.myweb.model.User;

public class UserDao extends JdbcDaoSupport{

	public void save(User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String sql = "insert into t_user(username,password) values('"+username+"','"+password+"');";
		getJdbcTemplate().update(sql);
		
	}
	public void delete(User user) {
		int id = user.getId();
		
		String sql = "delete from t_user where id="+id+";";
		getJdbcTemplate().update(sql);
		
	}
	public void update(User user) {
		int id = user.getId();
		String username = user.getUsername();
		String password = user.getPassword();
		String sql = "update t_user set username='"+username+"',password='"+password+"' where id="+id+";";
		getJdbcTemplate().update(sql);
		
	}
	
	/**
	 * 查询所有信息
	 * @return
	 */
	public ArrayList<Map<String,Object>> query(){
		String sql = "select * from t_user";
		ArrayList<Map<String,Object>> users = (ArrayList<Map<String, Object>>) getJdbcTemplate().queryForList(sql);
		return users;
	
	}
	
	/**
	 * 查询单条信息
	 */
	public Map<String,Object> queryOne(User user){
		int id = user.getId();
		String sql = "select * from t_user where id="+id+";";
//		ArrayList<Map<String,Object>> users = (ArrayList<Map<String, Object>>) getJdbcTemplate().queryForList(sql);
		Map<String, Object> user1 = getJdbcTemplate().queryForMap(sql);
		return user1;
	
	}
	
	
}
