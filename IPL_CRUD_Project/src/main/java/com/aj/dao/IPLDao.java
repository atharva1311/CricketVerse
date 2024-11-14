package com.aj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aj.entity.Player;
import com.aj.utility.IPLUtility;

public class IPLDao {
	Player player= null;
	String sqlQuery ="SELECT * FROM players";
	
	List<Player> allPlayerList = new ArrayList<Player>();
	public List<Player> getAllPlayers() {
		
		try {
			Statement statement = IPLUtility.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sqlQuery);
			
			while(rs.next())
			{
				int jn = rs.getInt("jersy_no");
				String pname=rs.getString("name");
				int pruns=rs.getInt("runs");
				int pwickets=rs.getInt("wickets");
				String pteam=rs.getString("team");
				Player obj =new Player(jn,pname,pruns,pwickets,pteam);
				allPlayerList.add(obj);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allPlayerList;
	}
	
	public void addPlayerDao(Scanner sc)
	{
		System.out.println("Enter player jersy no: ");
		int jn=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player name: ");
		String name=sc.nextLine();
		System.out.println("Enter total runs of player: ");
		int runs=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter total wickets of player: ");
		int wickets=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter team name of player: ");
		String team=sc.nextLine();
		
		
		String sqlQuery2 = "INSERT INTO players(jersy_no,name,runs,wickets,team) VALUES (?,?,?,?,?)";
	  try {
		  PreparedStatement preparedStatement  = IPLUtility.getConnection().prepareStatement(sqlQuery2);
		  
		  preparedStatement.setInt(1, jn);
		  preparedStatement.setString(2, name);
		  preparedStatement.setInt(3, runs);
		  preparedStatement.setInt(4, wickets);
		  preparedStatement.setString(5, team);
		  
		  int rowInserted =preparedStatement.executeUpdate();
		  
		  if(rowInserted>0)
		  {
			  System.out.println("A new player inserted successfully...!");
		  }
		  
		  
	  }
	  catch(SQLException e)
	  {
		  e.printStackTrace();
	  }
	
	}
	
	public void removePlayer(Scanner sc)
	{
		System.out.println("Enter player name: ");
		String name=sc.nextLine();
		
		String sqlQuery3="DELETE FROM players WHERE name=? ";
		try {
			PreparedStatement preparedStatement= IPLUtility.getConnection().prepareStatement(sqlQuery3);
			preparedStatement.setString(1,name);
			
			int rowDeleted=preparedStatement.executeUpdate();
			if(rowDeleted>0)
			{
				System.out.println("A player deleted successfully...!");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
