package com.example.ejemplosolid.interfaces;

public interface IConexion {
    public void getDatos();
    public void setDatos();
}

class AccesoDatos{
    private IConexion _conexion;

    public AccesoDatos(IConexion conexion){
        _conexion = conexion;
    }

    public void getDatos(){
        _conexion.getDatos();
    }
}

