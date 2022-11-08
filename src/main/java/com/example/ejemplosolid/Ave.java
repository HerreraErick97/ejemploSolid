package com.example.ejemplosolid;

import com.example.ejemplosolid.interfaces.IVolar;

public class Ave extends Animals implements IVolar {
    @Override
    public void setName(String name) {
        super.setName("Paloma");
    }

    public void Volar() {
        System.out.println("El ave vuela");
    }
}
