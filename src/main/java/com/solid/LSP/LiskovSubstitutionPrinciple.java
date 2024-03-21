package com.solid.LSP;

import com.solid.LSP.bird.Bird;
import com.solid.LSP.bird.Ostrich;
import com.solid.LSP.bird.Parrot;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        parrot.walk();
        parrot.fly();

        ostrich.walk();
        ostrich.fly();  //  LSP Violation



    }

}
