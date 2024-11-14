package com.aj.client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.aj.controller.IPLController;
import com.aj.entity.Player;

public class IPLClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IPLController controller = new IPLController();

		int choice;
		do {
			System.out.println("  ** Welcome to Our Website **   ");
			System.out.println();
			System.out.println("***** IPL Teams Management *****");
			System.out.println();
			System.out.println("1. View Teams");
			System.out.println("2. View Players");
			System.out.println("3. Add Player");
			System.out.println("4. Remove Player");
			System.out.println("5. View Player Statistics");
			System.out.println("6. View Batsmen of specific team");
			System.out.println("7. View Bowlers of specific team ");
			System.out.println("8. View Best Batsmen");
			System.out.println("9. View Best Bowlers");
			System.out.println("10. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				Set<String> s1 = controller.getAllTeamNamesController();
//					System.out.println(s1);
				System.out.println("-----------------");
				System.out.printf("| %-12s |\n", "Name of Teams");
				System.out.println("-----------------");

				for (String name : s1) {
					System.out.printf("| %-12s  |\n", name);
				}

				System.out.println("-----------------");
				System.out.println();
				break;
			case 2:
				List<Player> l1 = controller.getSpecificTeamPlayers(sc);
				System.out.println("-------------------");
				System.out.printf("| %-15s |\n", "Name of Players");
				System.out.println("-------------------");

				for (Player name : l1) {
					System.out.printf("| %-15s |\n", name.getPname());
				}

				System.out.println("-------------------");
				System.out.println();
				break;
			case 3:
				controller.addPlayerController(sc);
				break;
			case 4:
				controller.removePlayerController(sc);
				break;
			case 5:
				Player p1 = controller.getPlayerStatsController(sc);
//					System.out.println(p1);
				System.out.println("----------------------------------------------------------------------");
				System.out.printf("| %-15s | %-9s | %-10s | %-15s | %-5s |\n", "Name", "Jersy No.", "Total runs",
						"Total wickets", "Team");
				System.out.println(" --------------------------------------------------------------------");
				System.out.printf("| %-15s | %-9s | %-10s | %-15s | %-5s |\n", p1.getPname(), p1.getJersy_no(),
						p1.getRuns(), p1.getWickets(), p1.getTname());
				System.out.println("----------------------------------------------------------------------");
				System.out.println();
				break;
			case 6:
				List<Player> l2 = controller.getAllBatsmenController(sc);
				System.out.println("-------------------");
				System.out.printf("| %-15s |\n", "Name of Players");
				System.out.println("-------------------");

				for (Player name : l2) {
					System.out.printf("| %-15s |\n", name.getPname());
				}

				System.out.println("-------------------");
				System.out.println();
				break;
			case 7:
				List<Player> l3 = controller.getAllBowlersController(sc);
//					System.out.println(s4);
				System.out.println("-------------------");
				System.out.printf("| %-15s |\n", "Name of Players");
				System.out.println("-------------------");

				for (Player name : l3) {
					System.out.printf("| %-15s |\n", name.getPname());
				}

				System.out.println("-------------------");
				System.out.println();
				break;
			case 8:
				List<Player> l4 = controller.getBestBatsmenController();
//					System.out.println(s4);
				System.out.println("-------------------");
				System.out.printf("| %-15s |\n", "Name of Players");
				System.out.println("-------------------");

				for (Player name : l4) {
					System.out.printf("| %-15s |\n", name.getPname());
				}

				System.out.println("-------------------");
				System.out.println();
				break;
			case 9:
				List<Player> l5 = controller.getBestBowlersController();
//					System.out.println(s4);
				System.out.println("-------------------");
				System.out.printf("| %-15s |\n", "Name of Players");
				System.out.println("-------------------");

				for (Player name : l5) {
					System.out.printf("| %-15s |\n", name.getPname());
				}

				System.out.println("-------------------");
				System.out.println();
				break;
			case 10:
				System.out.println("Thank You for visiting our site..!");
				System.out.println();

				return;
			default:
				System.out.println("Invalid choice. Try again..!");

			}

			if (choice == 10) {
				break;
			}

		} while (true);
	}
}
