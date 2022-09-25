package com.company;

public class Terre {
    private long age;
    private long population;
    private static Terre instance=null;
    private void Terre(){
        this.age =50000;
        this.population=60000;
    }
    public Terre getInstance(){
            if (instance == null)
                instance = new Terre();

        return instance;

    }
    public void afficher(){
        System.out.println("L'age de la terre est "+this.age+" et sa population est "+this.population);
    }
}