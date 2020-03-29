package com.seliverstov;

import com.seliverstov.jaxb.Game;
import com.seliverstov.service.Transformation;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Game game = new Game();
        game.setId(1l);
        game.setName("Dota");
        game.setDate("01.05.1998");
        game.setDeveloper("Valve");
        /*Transformation.marshall(game);*/
        Transformation.unmarshall(game,"./src/com/seliverstov/xml/Game.xml");
    }
}
