package com.aj.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.aj.controller.IPLController;
import com.aj.dao.IPLDao;
import com.aj.entity.Player;

public class IPLService {

	static IPLDao dao = null;
	

	public static  List<Player> getAllPlayersService() {
		dao = new IPLDao();
		List<Player> allPlayerList = new ArrayList<Player>();
		allPlayerList = dao.getAllPlayers();
		return allPlayerList;
	}
	public List<Player> getSpecificTeamPlayersService(Scanner sc) {
		System.out.println("Enter team name: ");
		String team=sc.nextLine();
		List<Player> specificTeamPlayer= new ArrayList<Player>();
		for(Player p1:IPLService.getAllPlayersService())
		{
			if (p1.getTname().equalsIgnoreCase(team))
			{
				specificTeamPlayer.add(p1);
			}
		}
		return specificTeamPlayer;
	}
	
	public Set<String> getAllTeamNamesService()
	{
		Set<String> getallteams = new TreeSet<String>();
		for(Player p1:IPLService.getAllPlayersService())
		{
			getallteams.add(p1.getTname());
		}
		return getallteams;
	}
	
	public Player getPlayerStatsService(Scanner sc)
	{
		System.out.println("Enter player name: ");
		String name=sc.nextLine();
		Player player=null;
		for(Player p1:IPLService.getAllPlayersService())
		{
			if(p1.getPname().equalsIgnoreCase(name))
			{
				player=p1;
				break;
			}
		}
		return player;
		
	}
	
	public List<Player> getAllBatsmenService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team =sc.nextLine();
		List<Player> allbastsmen=new ArrayList<Player>();
		for(Player p1:IPLService.getAllPlayersService())
		{
			if(p1.getTname().equalsIgnoreCase(team) && p1.getRuns()>2000)
			{
				allbastsmen.add(p1);
			}
		}
		return allbastsmen;
		
	}
	public List<Player> getAllBowlersService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team =sc.nextLine();
		List<Player> allbowlers=new ArrayList<Player>();
		for(Player p1:IPLService.getAllPlayersService())
		{
			if(p1.getTname().equalsIgnoreCase(team) && p1.getWickets()>50)
			{
				allbowlers.add(p1);
			}
		}
		return allbowlers;
		
	}
	public List<Player> getBestBatsmenService()
	{
	
		List<Player> bestbatsmen=new ArrayList<Player>();
		for(Player p1:IPLService.getAllPlayersService())
		{
			if(p1.getRuns()>=4000)
			{
				bestbatsmen.add(p1);
			}
			
		}
		return bestbatsmen;
		
	}
	public List<Player> getBestBowlersService()
	{
		List<Player> bestbowlers=new ArrayList<Player>();
		for(Player p1:IPLService.getAllPlayersService())
		{
			if(p1.getWickets()>100)
			{
				bestbowlers.add(p1);
			}
		}
		return bestbowlers;
		
	}
	
	public void addPlayerService(Scanner sc)
	{
		dao = new IPLDao();
		dao.addPlayerDao(sc);
	}
	public void removePlayerService(Scanner sc)
	{
		dao = new IPLDao();
		dao.removePlayer(sc);
		
	}

}
