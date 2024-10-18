package chapter_4;

public class Switch {
    public static void main(String[] args) {

        String myTeam = "samsung";

        switch (myTeam) {
            case "samsung":
                System.out.println("최강 삼성");
                break;
            case "lg":
                System.out.println("엘지");
                break;
            default:
                System.out.println("이 외");
        }

        int bar = 2;

        switch (bar) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }

        String day = "토요일";

        switch (day) {
            case "토요일":
            case "일요일":
                System.out.println("주말");
                break;
            default:
                System.out.println("평일");
        }
    }
}
