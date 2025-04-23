package oop.basketball;

public class Player {

    public String name;
    public String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    void shoot() {
        System.out.println("기본 슛");
    }

}

class Sg extends Player {

    public Sg(String name) {
        super(name, "Shooting Guard");
    }

    @Override
    void shoot() {
        System.out.println("Shooting Guard 슛");
    }

}

class Pg extends Player {

    public Pg(String name) {
        super(name, "Point Guard");
    }

    @Override
    void shoot() {
        System.out.println("Point Guard 슛");
    }

}

class Sf extends Player {

    public Sf(String name) {
        super(name, "Small Forward");
    }

    @Override
    void shoot() {
        System.out.println("Small Forward 슛");
    }

}

class Pf extends Player {

    public Pf(String name) {
        super(name, "Power Forward");
    }

    @Override
    void shoot() {
        System.out.println("Power Forward 슛");
    }

}

class Center extends Player {

    public Center(String name) {
        super(name, "Center");
    }

    @Override
    void shoot() {
        System.out.println("Center 슛");
    }

}