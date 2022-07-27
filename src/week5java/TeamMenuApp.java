package week5java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner scanner  = new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>() ;

	public static void main(String[] args) {
		
		int decision = 0;
		
		while (true) {
			printOptions();
			decision = scanner.nextInt();
			if(decision == 1) {
				teams.add(createNewTeam());
			}else if(decision == 2) {
				addPlayerToTeam();
			}else if(decision == 3) {
				removePlayerFromTeam();
			}else if(decision == 4) {
				describeTeam();
			}else {
				System.out.println("Please Pick a Valid Option");
		}
	}
}
	private static void printOptions() {
		System.out.println("1)Create New Team");
		System.out.println("2) Add New Player To Team");
		System.out.println("3) Remove Player From Team");
		System.out.println("4) View Team Info");
	}
	
	private static Team createNewTeam() {
		System.out.println("Enter name of the team you want to create: ");
		String name = scanner.nextLine();
		return new Team(name);
	}
	
	private static void addPlayerToTeam() {
		printTeamNames();
		System.out.println("Enter the Nmae of the Team you Wish to add a player to: ");
		String teamName = scanner.nextLine();
		Team foundTeam = findTeamByName(teamName);
	}
	
	private static void printTeamNames() {
		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}	
		private static Team findTeamByName(String name) {
			for(Team team : teams) {
				if (team.getName().equals(name)) {
				return team;
				}
			}
		}
}
			
		
//		throw new Exception ("Team Not Found: " + name);
		
	
		
		//Player p1 = new Player ("Thomas ", " FullBack ",   " Running Fast");
		//Player p2 = new Player ("Johnny ", " QuarterBack ",   " Throwing far");
		
		//Team team = new Team("Really Good Football Team !!");
		//team.addPlayer(p1);
		//team.addPlayer(p2);
		//team.describe();
		
		//team.removePlayer("Thomas");
		//team.describe();
				
				

	

	
	