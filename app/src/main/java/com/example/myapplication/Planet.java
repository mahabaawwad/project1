package com.example.myapplication;

public class Planet {
    private String Name ;
    private String size ;
    private String orbit;

    public Planet (String name,String Size,String Orbit){
        Name=name;
        size=Size;
        orbit=Orbit;
    }

    public String getName() {
        return Name;
    }

    public String getOrbit() {
        return orbit;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "Name='" + Name + '\'' +
                ", size='" + size + '\'' +
                ", orbit='" + orbit + '\'' +
                '}';
    }
}
