package com.company;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
@Singleton
public class EJB {
    private static Terre instance = null;
    public int age;
    public int population;

    public static Terre getInstance(){

        return instance;
    }

    @PostConstruct
    void intit(){

        this.instance= new Terre();
    }

    public void afficher(){
        System.out.println("L'age de la terre est "+this.age+" et sa population est "+this.population);
    }
    synchronized public void ajouter(int pluspop) {

        this.population+= pluspop;
    }
}

