package oop.basketball;

public class BasketMain {
    public static void main(String[] args) {

        Player[] team = {
                new Sg("Kobe Bryant"),
                new Pg("Magic Johnson"),
                new Sf("LeBron James"),
                new Pf("Kevin Garnett"),
                new Center("Shaquille O'Neal")
        };

        System.out.println("슛 연습");

        for (Player p : team) {
            p.shoot();
        }
    }
}
