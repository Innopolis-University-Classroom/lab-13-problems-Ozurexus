package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

    }
}

interface Observer<T> {
    default void update(T data) {
    }
}
class RealMadridFan implements Observer<Game>{
    @Override
    public void update(Game data) {
        System.out.println("Real Madrid is playing right now!!!");
    }
}
class BarcelonaFan implements Observer<Game>{
    @Override
    public void update(Game data) {
        System.out.println("Barcelona is playing right now!!!");
    }
}

