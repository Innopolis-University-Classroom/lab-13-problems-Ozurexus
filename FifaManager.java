package com.company;

import java.util.Scanner;

public class FifaManager {

    private final Scanner scanner;
    private Fifa fifa;

    public FifaManager() {
        this.fifa = new Fifa();
        scanner = new Scanner(System.in);
    }
    public void addGame() {
        System.out.println("Enter Place");
        String place = scanner.nextLine();
        System.out.println("Enter Date");
        String date = scanner.nextLine();
        System.out.println("Enter Plan");
        String plan = scanner.nextLine();
        System.out.println("Enter Ticket");
        String ticket= scanner.nextLine();
        Game game = new Game();
        game.place = place;
        game.date = date;
        game.plan= plan;
        game.ticket=ticket;
        fifa.notify(game);

    }

    public void subscribeToPlaystaion(Observer<Game> fan) {
        fifa.subscribe(fan);
    }
}
