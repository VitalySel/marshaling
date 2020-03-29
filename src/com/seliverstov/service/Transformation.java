package com.seliverstov.service;

import com.seliverstov.jaxb.Game;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Transformation {
    public static void marshall(Object input) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(input.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        marshaller.marshal(input, new File("./src/com/seliverstov/xml/"+input.getClass().getSimpleName()+".xml"));
    }

    public static void unmarshall(Object input, String path) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(input.getClass());
        context.createUnmarshaller().unmarshal(new FileReader("" + path));
        File f = new File("./src/com/seliverstov/classes/" + context.createUnmarshaller().unmarshal(new FileReader("" + path)) + ".java");
    }
}
