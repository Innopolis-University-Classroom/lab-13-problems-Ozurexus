package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fifa {

    List<Observer<Game>> mObservers;

    public Fifa() {
        this.mObservers = new ArrayList<>();
    }

    public void subscribe(Observer<Game> observer) {
        mObservers.add(observer);
    }

    public void notify(Game game) {
        mObservers.forEach(observer -> observer.update(game));
    }


}
