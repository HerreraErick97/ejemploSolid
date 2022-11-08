package com.example.ejemplosolid;

import com.example.ejemplosolid.interfaces.IConexion;

public class AnimalsDB implements IConexion {

    @Override
    public void getDatos() {
        //Aqui iria un codigo...
    }
    
    @Override
    public void setDatos() {
        //Aqui iria un codigo...
    }

    public void GuardarAnimalDB(Animals animal){
        //Funcionalidad
        System.out.println("Se ha guarado el animal en la BD");
    }

    /*public void GuardarAnimalXML(Animals animal){

    }*/
}
