package com.sportsleague.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;
import com.sportsleague.model.Player;
import com.sportsleague.service.ClubServiceImpl;
import com.sportsleague.service.ClubServiceIntf;
import com.sportsleague.service.PlayerServiceImpl;
import com.sportsleague.service.PlayerServiceIntf;

public class SportsLeagueApplication {

	public static void main(String[] args) {

		// ***************************************************************************************
		// Populating Players Data
		
		List<Player> evePlayers = new ArrayList<>();		//		Using Collection Framework (List --> ArrayList)
		
		//evePlayers.add(new Player(playerId, playerName, playerJerseyNumber, playerAge, playerPosition));
		evePlayers.add(new Player(101, "Jordan", 1, 27, "Goalkeeper"));
		evePlayers.add(new Player(102, "Ben", 22, 23, "Centre-Back"));
		evePlayers.add(new Player(103, "Tom", 26, 23, "Central-Midfield"));
		evePlayers.add(new Player(104, "Kean", 1, 27, "Forward"));
		
		List<Player> livPlayers  = new ArrayList<>();
		
		livPlayers.add(new Player(105, "Alisson", 1, 28, "Goalkeeper"));
		livPlayers.add(new Player(106, "Matip", 32, 30, "Centre-Back"));
		livPlayers.add(new Player(107, "Jordan", 14, 31, "Central-Midfield"));
		livPlayers.add(new Player(108, "Jota diago", 20, 24, "Forward"));
		
		
		
		// ***************************************************************************************
		// Populating Clubs Data
		
		List<Club> clubs1 = new ArrayList<>();
		
		//clubs1.add(new Club(clubId, clubName, players));
		clubs1.add(new Club(1111, "Everton FC", evePlayers));
		clubs1.add(new Club(2222, "Liverpool FC", livPlayers));
		
		
		// ***************************************************************************************
		// Aggregating Club into Players.
		
		for (Player player: evePlayers) {
			player.setClub(clubs1.get(0));
		}
		
		for (Player player: livPlayers) {
			player.setClub(clubs1.get(1));
		}
		
		/*for (Player player : evePlayers) {
			System.out.println(player);
		}*/
		
		// ************************************************************************************************************
		// ************************************************************************************************************

		// <<<<<<<<<<<<<<<<<<<<<<<< Menu Loop : For Main Application Menu >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		// Application Banner
		
		String appBanner = "\r\n" + 
				" _____                  _           _                                       ___              _ _           _   _             \r\n" + 
				"/  ___|                | |         | |                                     / _ \\            | (_)         | | (_)            \r\n" + 
				"\\ `--. _ __   ___  _ __| |_ ___    | |     ___  __ _  __ _ _   _  ___     / /_\\ \\_ __  _ __ | |_  ___ __ _| |_ _  ___  _ __  \r\n" + 
				" `--. \\ '_ \\ / _ \\| '__| __/ __|   | |    / _ \\/ _` |/ _` | | | |/ _ \\    |  _  | '_ \\| '_ \\| | |/ __/ _` | __| |/ _ \\| '_ \\ \r\n" + 
				"/\\__/ / |_) | (_) | |  | |_\\__ \\   | |___|  __/ (_| | (_| | |_| |  __/    | | | | |_) | |_) | | | (_| (_| | |_| | (_) | | | |\r\n" + 
				"\\____/| .__/ \\___/|_|   \\__|___/   \\_____/\\___|\\__,_|\\__, |\\__,_|\\___|    \\_| |_/ .__/| .__/|_|_|\\___\\__,_|\\__|_|\\___/|_| |_|\r\n" + 
				"      | |                                             __/ |                     | |   | |                                    \r\n" + 
				"      |_|                                            |___/                      |_|   |_|                                    \r\n" + 
				"";
		
		System.out.println(appBanner);
		
		Scanner input = new Scanner(System.in);
		
		boolean primaryLoopVar = true;
		
		while (primaryLoopVar) {
			System.out.println("------------------------------------------");
			System.out.println("Sports League Application");
			System.out.println("------------------------------------------");
			System.out.println("1. Access Players");
			System.out.println("2. Access Clubs");
			System.out.println("0. Exit the Application");
			System.out.println("------------------------------------------");
			System.out.println("Choose the option to be accessed (1, 2, 0) : ");

			int switchKey = input.nextInt();

			switch (switchKey) {

			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<< 1st Case : Access Players.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			case 1:

				boolean playerLoopVar = true;

				while (playerLoopVar) {

					System.out.println("------------------------------------------");
					System.out.println("Access Players");
					System.out.println("------------------------------------------");
					System.out.println("1. Find By Player ID");
					System.out.println("2. Find By Player Name");
					System.out.println("0. Return to Sports Application Menu");
					System.out.println("------------------------------------------");
					System.out.println("Choose the option to be accessed (1, 2, 0) : ");

					int playerSwitchKey = input.nextInt();

					PlayerServiceIntf playerServiceIntf = new PlayerServiceImpl();

					switch (playerSwitchKey) {

					case 1:

						try {

							System.out.println("Enter the Player Id (3 Digit) to Search : ");
							int playerIdKey = input.nextInt();

							Player playerIDOutput = playerServiceIntf.findPlayerById(clubs1, playerIdKey);

							if (playerIDOutput != null) {
								Club tempClub = playerIDOutput.getClub();

								System.out.println("=================================================");
								System.out.println("Player Found, Details are: \n");
								System.out.println("Player ID             : " + playerIDOutput.getPlayerId());
								System.out.println("Player Name           : " + playerIDOutput.getPlayerName());
								System.out.println("Player Age            : " + playerIDOutput.getPlayerAge());
								System.out.println("Player Jersey No.     : " + playerIDOutput.getPlayerJerseyNumber());
								System.out.println("Player Field Position : " + playerIDOutput.getPlayerPosition());
								System.out.println("Player plays for Club : " + tempClub.getClubName());
								System.out.println("=================================================");

								tempClub = null;
							} 
							else
							{
								throw new CustomException("Player Not Found : No Such Player Exists !!!");
							}
						} 
						catch (CustomException exception) 
						{
							System.out.println("=================================================");
							System.err.println(exception.getMessage());
							System.out.println("=================================================");
						}

						break;

					case 2:

						try {
							
							input.nextLine();
							
							System.out.println("Enter the Player Name to Search : ");
							String playerNameKey = input.nextLine();

							List<Player> playerNameOutput = playerServiceIntf.findPlayerByName(clubs1, playerNameKey);

							if (playerNameOutput.size() > 0) {
								
								System.out.println("=================================================");
								System.out.println("Players Found : " + playerNameOutput.size());
								
								int playerCounter = 1;

								for (Player player : playerNameOutput) {

									Club tempClub = player.getClub();

									System.out.println("=================================================");
									System.out.println("Player " + playerCounter + " Details are: ");
									System.out.println("Player ID             : " + player.getPlayerId());
									System.out.println("Player Name           : " + player.getPlayerName());
									System.out.println("Player Age            : " + player.getPlayerAge());
									System.out.println("Player Jersey No.     : " + player.getPlayerJerseyNumber());
									System.out.println("Player Field Position : " + player.getPlayerPosition());
									System.out.println("Player plays for Club : " + tempClub.getClubName());
									System.out.println("=================================================");

									playerCounter += 1;
									tempClub = null;
								}

							} 
							else 
							{
								throw new CustomException("Player Not Found : No Such Player Exists !!!");
							}
						} 
						catch (Exception exception) 
						{
							System.out.println("=================================================");
							System.err.println(exception.getMessage());
							System.out.println("=================================================");
						}

						break;

					case 0:

						System.out.println("------------------------------------------");
						System.out.println("Exit Access Player");
						System.out.println("------------------------------------------");

						playerLoopVar = false;

						break;

					default:
						System.out.println("==========================================");
						System.out.println("Please enter the correct value (1, 2, 0) : ");
						System.out.println("==========================================");
						break;
					}

				}

				break;
			
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<< 2nd Case : Access Clubs.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			case 2:
				
				boolean clubLoopVar = true;
				
				while (clubLoopVar) {
					
					System.out.println("------------------------------------------");
					System.out.println("Access Clubs");
					System.out.println("------------------------------------------");
					System.out.println("1. Find By Club ID");
					System.out.println("2. Find By Club Name");
					System.out.println("0. Return to Sports Application Menu");
					System.out.println("------------------------------------------");
					System.out.println("Choose the option to be accessed (1, 2, 0) : ");
					
					int clubSwitchKey = input.nextInt();
					
					ClubServiceIntf clubServiceIntf = new ClubServiceImpl();
					
					switch (clubSwitchKey) {
					case 1:
						
						try {
							
							System.out.println("Enter the Club Id (4 Digit) to Search : ");
							int clubIdKey = input.nextInt();
							
							Club clubIdOutput = clubServiceIntf.findClubById(clubs1, clubIdKey);
							
							if (clubIdOutput != null)
							{
								System.out.println("=================================================");
								System.out.println("Club Found, Details are: \n");
								System.out.println("Club ID   : " + clubIdOutput.getClubId());
								System.out.println("Club Name : " + clubIdOutput.getClubName());
								System.out.println("=================================================");

							}
							else
							{
								throw new CustomException("Club Not Found : No Such Club Exists !!!");
							}
							
						} 
						catch (Exception exception) 
						{
							System.out.println("=================================================");
							System.err.println(exception.getMessage());
							System.out.println("=================================================");
						}

						break;
						
					case 2:
						
						try {
							
							input.nextLine();
							
							System.out.println("Enter the Club Name to Search : ");
							String clubNameKey = input.nextLine();

							List<Club> clubNameOutput = clubServiceIntf.findClubByName(clubs1, clubNameKey);

							if (clubNameOutput.size() > 0)
							{
								System.out.println("=================================================");
								System.out.println("Clubs Found : " + clubNameOutput.size());
								
								int clubCounter = 1;
								
								for (Club club : clubNameOutput) {
									
									System.out.println("=================================================");
									System.out.println("Club " + clubCounter + " Details are: ");
									System.out.println("Club ID   : " + club.getClubId());
									System.out.println("Club Name : " + club.getClubName());
									System.out.println("=================================================");
									
									clubCounter += 1;
									
								}
								
							} 
							else 
							{
								throw new CustomException("Club Not Found : No Such Club Exists !!!");
							}

						} 
						catch (Exception exception)
						{
							System.out.println("=================================================");
							System.err.println(exception.getMessage());
							System.out.println("=================================================");
							//exception.printStackTrace();
						}
						
						break;
						
					case 0:
						
						System.out.println("------------------------------------------");
						System.out.println("Exit Access Player");
						System.out.println("------------------------------------------");
						
						clubLoopVar = false;

						break;

					default:
						System.out.println("==========================================");
						System.out.println("Please enter the correct value (1, 2, 0) : ");
						System.out.println("==========================================");
						break;
					}
					
				}

				System.out.println("------------------------------------------");
				System.out.println("Access Club");
				System.out.println("------------------------------------------");

				break;
			
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<< 0th Case : Exit Application.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			case 0:

				System.out.println("------------------------------------------");
				System.out.println("Exit Program");
				System.out.println("------------------------------------------");

				primaryLoopVar = false;

				break;
			
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<< Default Case.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			default:
				System.out.println("==========================================");
				System.out.println("Please enter the correct value (1, 2, 0) : ");
				System.out.println("==========================================");
				break;

			} // End of Outer Switch Statement. --------------------------------------------

		} // End of Outer While Loop. -------------------------------------------------------
		
		System.out.println("==================================================");
		System.out.println("Thank You for using Sports League Application !!");
		System.out.println("==================================================");
		
		System.out.println(appBanner);
		
		input.close();
		
	}	// 	End of main() method

}	// End of Application class
