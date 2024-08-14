package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Example {
	static final String DB_URL="jdbc:mysql://127.0.0.1:3306/book";
	static final String USER="root";
	static final String PASS="Nte#25";
	static final String QUERY="Select book_no,title,sub_code,author from book_detl";
	
	public static void main(String args[])
	{
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(QUERY);
			){
			while(rs.next()) {
				System.out.print("Bno:"+rs.getString("book_no"));
				System.out.print("Tit:"+rs.getString("title"));
				System.out.print("Scode:"+rs.getString("sub_code"));
				System.out.println("Auth:"+rs.getString("author"));
			}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
