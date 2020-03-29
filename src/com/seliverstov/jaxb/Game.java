package com.seliverstov.jaxb;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "Game")
@XmlType(propOrder = { "id", "name", "date","developer" })
public class Game {

    private Long id;
    private String name;
    private String date;
    private String developer;

    public Game() {
    }

    public Long getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    @XmlElement(name = "date")
    public void setDate(String date) {
        this.date = date;
    }

    public String getDeveloper() {
        return developer;
    }

    @XmlElement(name = "developer")
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
