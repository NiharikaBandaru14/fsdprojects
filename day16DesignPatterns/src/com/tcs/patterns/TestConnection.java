package com.tcs.patterns;

public class TestConnection {


	public static void main(String[] args) {
		
		Connection con = Connection.getConnection();
		System.out.println(con);
		
		con=Connection.getConnection();
		System.out.println(con);
		
//		Connection con = new Connection();
//		System.out.println(con);
//		
//		Connection con1 = new Connection();
//		System.out.println(con1);
//		
//		Connection con2 = new Connection();
//		System.out.println(con2);
		
		
	}
}
