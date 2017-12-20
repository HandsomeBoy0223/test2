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
 public DB(){
		String url = "jdbc:mysql://localhost:3306/keshe";
		String name = "root";
		String password = "mysql";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,password);
			
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
	 return queryList(sql,new String[] {});
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
		 pps = conn.prepareStatement(sql); 
		 for (int i = 0; i < param.length; i++) {
			pps.setString(i+1,param[i]);
		}	
		 rs = pps.executeQuery();
		
		 mt = rs.getMetaData();
		
		 while(rs.next())
		 {
			 HashMap<String,String> map = new HashMap<String,String>();
			 for (int i = 0; i < mt.getColumnCount(); i++) {
				String col = mt.getColumnName(i+1);
				String val = rs.getString(col);
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
			stmt = conn.createStatement();
			for (int i = 0; i < sql.size(); i++) {
				stmt.addBatch(sql.get(i));
			}
			stmt.executeBatch();
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
		 pps = conn.prepareStatement(sql); 
		 for (int i = 0; i < param.length; i++) {
			pps.setString(i+1,param[i]);
		}
		 pps.executeUpdate();
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
		 if(rs!=null){
			 rs.close();	 
		 }
		 
	 }catch(SQLException e){
		 e.printStackTrace();
	 }
	 try{
		 if(stmt!=null){
			 stmt.close(); 
		 }
	 }catch(SQLException e){
		 e.printStackTrace();
	 }
	 try{
		 if(pps!=null){
			 pps.close(); 
		 }
	 }catch(SQLException e){
		 e.printStackTrace();
	 }
	 try{
		 if(conn!=null){
			 conn.close();	 
		 }
	 }catch(SQLException e){
		 e.printStackTrace();
	 }
	 
 }
 
}
