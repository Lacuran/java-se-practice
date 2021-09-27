package NonMandatorySections.Sekcja10.Challenge;



public class ChallengeTest {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> mlemMlemBalls = new Team<>("Mlem Mlem Balls Trow Long");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> tarnow = new Team<>("Tarnow");
        Team<FootballPlayer> stalMielec = new Team<>("Stal Mielec");

        footballLeague.addTeam(mlemMlemBalls);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(tarnow);
        footballLeague.addTeam(stalMielec);

        footballLeague.showLeagueTable();
    }
}
