package NonMandatorySections.Sekcja10.Lesson;

public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer mary = new BaseballPlayer("Mary");
        SoccerPlayer larry = new SoccerPlayer("Larry");

        Team<FootballPlayer> mlemMlemBalls = new Team<>("Mlem Mlem Balls Trow Long");
        mlemMlemBalls.addPlayer(joe);
//        mlemMlemBalls.addPlayer(mary);
//        mlemMlemBalls.addPlayer(larry);
        System.out.println(mlemMlemBalls.numPlayers());

        Team<BaseballPlayer> morthysSwifts = new Team<>("Morty goes Swifty");
        morthysSwifts.addPlayer(mary);
        System.out.println(morthysSwifts.numPlayers());

        Team<SoccerPlayer> stalMielec = new Team<>("Stal Mielec");
        stalMielec.addPlayer(larry);
        System.out.println(stalMielec.numPlayers());

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> tarnow = new Team<>("Tarnow");

        melbourne.matchResult(tarnow,1,0);
        melbourne.matchResult(mlemMlemBalls,3,8);

        mlemMlemBalls.matchResult(tarnow,6,6);

        System.out.println("Rankings");
        System.out.println(mlemMlemBalls.getName() + ": " + mlemMlemBalls.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(tarnow.getName() + ": " + tarnow.ranking());

        System.out.println(mlemMlemBalls.compareTo(melbourne));
    }
}
