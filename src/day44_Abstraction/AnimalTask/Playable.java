package day44_Abstraction.AnimalTask;

public interface Playable {
    //abstract void play(); // abstract keyword is given by default (before JDK 8 it was the only keyword that can be given to the interface)
    // hence no need to write the word abstract

    boolean isFriendly = true; // any variable declared in the interface is static and final by default

   void play(); // abstract by default



}

