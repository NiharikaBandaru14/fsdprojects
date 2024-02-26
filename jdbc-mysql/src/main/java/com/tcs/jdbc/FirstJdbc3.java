package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class FirstJdbc3 {
	
	public static void main(String[] args) throws SQLException {
		
		// 1. establish connection = 3 (url,username,pwd or database)
		// url = "jdbc:mysql://localhost:3306:schemaname/dbname"
		// 2. Obtain statement reference
		// 3. Prepare SQL statement as string 
		// 4. execute statement
		// 5. Fetch results
		
		
		// Class.forName("mysql.jdbc.cj.MysqlDriver"); // previously we need to load explicitly . from java 8 no need 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Root123$");
		System.out.println("connected...");
		
		Statement st = con.createStatement(); //it  is like a pipeline - able to perform all sql operations dml,dcl etc
		
		//String sql = "select * from EMP";
		
		/* *String sql = "insert into EMP values("+"1013,'abc','MANAGER',7839,'1999-01-01',2300,null,10)";
		int count = st.executeUpdate(sql);
		System.out.println("Records inserted count#" +count);*/
		
		String update = "update EMP set sal=sal+0 where deptno in(10,20,30)";
		int count = st.executeUpdate(update);
		System.out.println("Records updated count#"+count);
		
	    String sql = "select * from EMP where EMPNO=1013";
		ResultSet rs = st.executeQuery(sql);
		
		ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnName(3));
		
		while(rs.next()) {
			// columns according to the datatype
			System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
		}
	}

}
