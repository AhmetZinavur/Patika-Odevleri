public class TestBoxMatch {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc", 15, 100, 90, 70);

        Fighter alex = new Fighter("Alex", 10, 95, 100, 60);

        StartFight r = new StartFight(marc, alex, 90, 100);

        r.startFight();
    }
}
