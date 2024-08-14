package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlSelectCommand {
	public static void main(String args[]) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book","root","Nte#25");
		Statement stmt=con.createStatement();
		String s="Select * from book_detl";
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
		{
			String Bno=rs.getString("book_no");
			String tit=rs.getString("title");
			String sc=rs.getString("sub_code");
			String auth=rs.getString("author");
			String pub=rs.getString("publisher");
			String sts=rs.getString("status");
			String yop=rs.getString("yop");
			String prc=rs.getString("price");
			
			System.out.println(Bno+" "+tit+" "+sc+" "+auth+" "+pub+" "+sts+" "+yop+" "+prc);
		}
		con.close();
		System.out.println("Statement executed:Query Executed");
		
	}
}
