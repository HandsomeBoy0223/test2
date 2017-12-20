package com.ccu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class DB {

	/****************************************************************************************************************************/
	private ResultSet rs;
	private PreparedStatement pps;
	private Connection conn;
	private Statement stmt;
	private ResultSetMetaData mt;

	/****************************************************************************************************************************/
	/**
	 *
	 */
	public ppppppppp
	public DB(){
		String url = "jdbc:mysql://localhost:3306/keshe";
		String name = "root";
		String password = "mysql";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.conn = DriverManager.getConnection(url,name,password);

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}


	/****************************************************************************************************************************/
	/**
	 *
	 *
	 * @param ִ
	 * @return
	 */
	public ArrayList<HashMap<String,String>> queryList(String sql){
		return this.queryList(sql,new String[] {});
	}




	/****************************************************************************************************************************/
	/**
	 *
	 * @param ִ
	 * @param
	 * @return
	 */
	public ArrayList<HashMap<String,String>> queryList(String sql,String[] param){

		ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		try{
			this.pps = this.conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				this.pps.setString(i+1,param[i]);
			}
			this.rs = this.pps.executeQuery();

			this.mt = this.rs.getMetaData();

			while(this.rs.next())
			{
				HashMap<String,String> map = new HashMap<String,String>();
				for (int i = 0; i < this.mt.getColumnCount(); i++) {
					String col = this.mt.getColumnName(i+1);
					String val = this.rs.getString(col);
					map.put(col,val);
				}
				list.add(map);
			}
			return list;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;

	}
	/****************************************************************************************************************************/
	/**
	 *
	 * @param
	 */

	/****************************************************************************************************************************/
	/**
	 *
	 * @param
	 */
	public void batch(ArrayList<String> sql){
		try {
			this.stmt = this.conn.createStatement();
			for (int i = 0; i < sql.size(); i++) {
				this.stmt.addBatch(sql.get(i));
			}
			this.stmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/****************************************************************************************************************************/
	/**
	 *
	 *
	 */
	public void update(String sql,String[] param){
		try{
			this.pps = this.conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				this.pps.setString(i+1,param[i]);
			}
			this.pps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ;
	}


	/****************************************************************************************************************************/
	/**
	 *
	 */
	public void close(){
		try{
			if(this.rs!=null){
				this.rs.close();
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			if(this.stmt!=null){
				this.stmt.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			if(this.pps!=null){
				this.pps.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			if(this.conn!=null){
				this.conn.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
