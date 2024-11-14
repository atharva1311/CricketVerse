package com.aj.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.aj.entity.Player;
import com.aj.service.IPLService;

public class IPLController {

	static IPLService service = null;

	public static List<Player> getAllPlayersController() {
		return IPLService.getAllPlayersService();
	}

	public List<Player> getSpecificTeamPlayers(Scanner sc) {
		service = new IPLService();
		return service.getSpecificTeamPlayersService(sc);
	}
	
	public Set<String>getAllTeamNamesController()
	{
		service = new IPLService();
		return  service.getAllTeamNamesService();
	}
	
	public Player getPlayerStatsController(Scanner sc)
	{
		service = new IPLService();
		return service.getPlayerStatsService(sc);
	}
	public List <Player> getAllBatsmenController(Scanner sc)
	{
		service = new IPLService();
		return service.getAllBatsmenService(sc);
	}
	public List <Player> getAllBowlersController(Scanner sc)
	{
		service = new IPLService();
		return service.getAllBowlersService(sc);
	}
	public List <Player> getBestBatsmenController()
	{
		service = new IPLService();
		return service.getBestBatsmenService();
	}
	public List <Player> getBestBowlersController()
	{
		service = new IPLService();
		return service.getBestBowlersService();
	}
	public void addPlayerController(Scanner sc)
	{
		service = new IPLService();
		service.addPlayerService(sc);
	}
	public void removePlayerController(Scanner sc)
	{
		service = new IPLService();
		service.removePlayerService(sc);
	}

}
