package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarcketBahaviour {
    public void acceptToMarket(iActorBehaviour actor);
    public void releaseFromMarket(List<Actor> actors);
    public void update();


}