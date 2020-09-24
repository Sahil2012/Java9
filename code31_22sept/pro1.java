
import java.io.*;

class IPLTeam {

	String teamName,franchiseOwner,captain;
	int jerseyNo,countOfTrophies;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		IPLTeam team = new IPLTeam();

		System.out.print("Team Name : ");
		team.teamName = br.readLine();	

		System.out.print("Captain : ");	
		team.captain = br.readLine();

		System.out.print("Jersey No : ");
		team.jerseyNo = Integer.parseInt(br.readLine());

		System.out.print("Franchise Owner : ");
		team.franchiseOwner = br.readLine();

		System.out.print("No of trophies : ");
		team.countOfTrophies = Integer.parseInt(br.readLine());

		System.out.println("----------------------------------");
		System.out.println("Team : "+ team.teamName);
		System.out.println("Captain : " + team.captain + " " + team.jerseyNo);	
		System.out.println("Owned By : " + team.franchiseOwner);
		System.out.println("No Of Trophies : " + team.countOfTrophies);	
	}
}
