package com.example.ejemplosolid;

import com.example.ejemplosolid.interfaces.Acciones;
import com.example.ejemplosolid.interfaces.ICaminar;

public class Perro extends Animals implements ICaminar {
    @Override
    public void setName(String name) {
        super.setName("Winnie");
    }

    public void Caminar() {
        System.out.println("El perro camina");
    }
}
