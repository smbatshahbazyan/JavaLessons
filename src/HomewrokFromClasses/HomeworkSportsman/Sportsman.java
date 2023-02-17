package HomewrokFromClasses.HomeworkSportsman;

import org.w3c.dom.ls.LSOutput;

public class Sportsman {
    private int competition2020;
    private int competition2021;
    private int competition2022;
    private int competition2023;

    // constrictor for sportsman
    Sportsman(int c2020, int c2021, int c2022, int c2023) {
        setCompetition2020(c2020);
        setCompetition2021(c2021);
        setCompetition2022(c2022);
        setCompetition2023(c2023);
    }

    void setCompetition2020(int competition2020) {
        if (competition2020 >= 50 && competition2020 <= 100) {
            this.competition2020 = competition2020;
        } else {
            this.competition2020 = 0;
            System.out.println("For this calculation enable point is from 50 to 100, your point didn't count");
        }
    }

    public int getCompetition2020() {
        return competition2020;
    }

    void setCompetition2021(int competition2021) {
        if (competition2021 >= 50 && competition2021 <= 100) {
            this.competition2021 = competition2021;
        } else {
            this.competition2021 = 0;
            System.out.println("For this calculation enable point is from 50 to 100, your point didn't count");
        }
    }

    public int getCompetition2021() {
        return competition2021;
    }


    void setCompetition2022(int competition2022) {
        if (competition2022 >= 50 && competition2022 <= 100) {
            this.competition2022 = competition2022;
        } else {
            this.competition2022 = 0;
            System.out.println("For this calculation enable point is from 50 to 100, your point didn't count");
        }
    }

    public int getCompetition2022() {
        return competition2022;
    }

    void setCompetition2023(int competition2023) {
        if (competition2023 >= 50 && competition2023 <= 100) {
            this.competition2023 = competition2023;
        } else {
            this.competition2023 = 0;
            System.out.println("For this calculation enable point is from 50 to 100, your point didn't count");
        }
    }

    public int getCompetition2023() {
        return competition2023;
    }

    public int scoreAverage() {
        int count = 0;
        count = (competition2020 + competition2021 + competition2022 + competition2023) / 4;
        return count;
    }

    public void comparisonSportsman(int a, int b) {
        if (a > b) {
            System.out.println(1);
        }
        if (a < b) {
            System.out.println(-1);
        }
        if (a == b) {
            System.out.println(0);
        }

    }
}