


	
	package com.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;


	import com.beans.Hospital_Beans;
	import com.util.DatabaseUtil;

	public class Methods {
			
		DatabaseUtil util=new DatabaseUtil();
		
		public int daoHome(String username,String password) throws Exception
		{
			Connection con=util.getConnection();
			int count=0;
			ArrayList<Hospital_Beans> name=new ArrayList<Hospital_Beans>();
			try
			{
				System.out.println("hekkkk");
				String query="select user_name,password from hospital ";
				PreparedStatement pst=con.prepareStatement(query);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					if(username.equals(rs.getString(1))&&(password.equals(rs.getString(2))))
					{
						count=1;
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return count;
		}
		public ArrayList<Hospital_Beans> daoSuccess(String username) throws Exception
		{
			Connection con=util.getConnection();
			ArrayList<Hospital_Beans> alist=new ArrayList<Hospital_Beans>();
			
			
			
				
				try
				{
					String query="select * from hospital where user_name=?";
					PreparedStatement pst=con.prepareStatement(query);
					pst.setString(1, username);
					System.out.println("user:"+username);
					
					ResultSet rs=pst.executeQuery();
					while(rs.next())
					{
						alist.add(new Hospital_Beans(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getLong(6),rs.getString(7)));
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return alist;
		}
		public int daoCreate(String name,int age,String gender,String marital_status,long phone_number,String disease_type,String username,String password) throws Exception
		{
			Connection con=util.getConnection();
			int count=0;
			try
			{
				String query="insert into hospital values(h_name.nextval,?,?,?,?,?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1, name);
				pst.setInt(2, age);
				pst.setString(3, gender);
				pst.setString(4, marital_status);
				pst.setLong(5, phone_number);
				pst.setString(6, disease_type);
				pst.setString(7,username);
				pst.setString(8,password);
				count=pst.executeUpdate();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return count;
		}
		
	}


