package com.singleton;

/**
 * RULES:
 * 1) Debemos tener un constructor privado / We need to have a private constructor
 * 2) Debems tener un atributo privado estatico / We need to have an static private attribute
 * 3) Debemos tener un metodo estatico que devuelva la instancia / We need to have a public static method that returns the instace
 */
public class DatabaseConnector {
    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("Creating object");
    }

    /**
     * la palabra reservada synchronized sirve para sincronizar hilos y que no se genere mas de una instancia en desarrollos multihilo
     * @return
     */
    public static synchronized DatabaseConnector getInstance(){
        if(databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    }

    public void connectDatabase(){
        System.out.println("Connecting database = "+ databaseConnector);
    }

    public void disconnectDatabase(){
        System.out.println("Disconnect database = "+ databaseConnector);
    }
}
