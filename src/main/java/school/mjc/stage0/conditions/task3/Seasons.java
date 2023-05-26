package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String season;
        if (month == 1 || month == 2 || month == 12) {
            season = "Winter";
            System.out.println(season);
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
            System.out.println(season);
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
            System.out.println(season);
        } else if (month == 9 || month == 10 || month == 11){
            season = "Autumn";
            System.out.println(season);
        } else {
                System.out.println("wrong number!");
        }
    }
}
