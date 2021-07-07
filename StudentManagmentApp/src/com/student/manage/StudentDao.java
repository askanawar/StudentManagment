package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st)
	{
		boolean f=false;
		try {
			//JDBC code
			Connection con=CP.createC();
			String q="insert into students(sname,semail,sphone,scollage,sroll,sgender,s10th,s12th,sgra) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentEmail());
			pstmt.setString(3, st.getStudentPhone());
			pstmt.setString(4, st.getStudentCollage());
			pstmt.setString(5, st.getStudentRoll());
			pstmt.setString(6,st.getStudentGender());
			pstmt.setInt(7, st.getStudentTenPercent());
			pstmt.setInt(8, st.getStudentTwelvePercent());
			pstmt.setInt(9, st.getStudentGraduationPercent());
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(String userRoll) {
		

		boolean f=false;
		try {
			//JDBC code
			Connection con=CP.createC();
			String q="delete from students where sroll=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1,userRoll);
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudent() {
		try {
			//JDBC code
			Connection con=CP.createC();
			String q="select * from students";
			Statement stmt=(Statement) con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			
			//Printing ResultSet.....
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String email=set.getString(3);
				String phone=set.getString(4);
				String collage=set.getString(5);
				String roll=set.getString(6);
				String gender=set.getString(7);
				int ten=set.getInt(8);
				int twelve=set.getInt(9);
				int graduation=set.getInt(10);
				System.out.println("ID: "+id );
				System.out.println("NAME: "+name);
				System.out.println("EMAIL: "+email);
				System.out.println("PHONE: "+phone);
				System.out.println("COLLAGE: "+collage);
				System.out.println("ROLL: "+roll);
				System.out.println("GENDER: "+gender);
				System.out.println("10TH PERCENT: "+ten);
				System.out.println("12TH PERCENT: "+twelve);
				System.out.println("GRADUATION PERCENT: "+graduation);
				System.out.println("++++++++++++++++++++++++++++++++++++++");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void showStudent(String displayRoll) {
		try {
			//JDBC code
			Connection con=CP.createC();
			String q="select * from students where sroll=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1,displayRoll);
			ResultSet set=pstmt.executeQuery();
			//Printing ResultSet.....
			if(set.next()==false)
			{
				System.out.println("No Student Exists Of Roll "+displayRoll);
			}
			else
			{
				
				 do	{
						int id=set.getInt(1);
						String name=set.getString(2);
						String email=set.getString(3);
						String phone=set.getString(4);
						String collage=set.getString(5);
						String roll=set.getString(6);
						String gender=set.getString(7);
						int ten=set.getInt(8);
						int twelve=set.getInt(9);
						int graduation=set.getInt(10);
						System.out.println("ID: "+id );
						System.out.println("NAME: "+name);
						System.out.println("EMAIL: "+email);
						System.out.println("PHONE: "+phone);
						System.out.println("COLLAGE: "+collage);
						System.out.println("ROLL: "+roll);
						System.out.println("GENDER: "+gender);
						System.out.println("10TH PERCENT: "+ten);
						System.out.println("12TH PERCENT: "+twelve);
						System.out.println("GRADUATION PERCENT: "+graduation);
					}while(set.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
