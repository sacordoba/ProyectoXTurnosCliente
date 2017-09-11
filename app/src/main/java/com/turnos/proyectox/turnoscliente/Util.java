package com.turnos.proyectox.turnoscliente;

import android.app.Application;
import android.content.Context;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sebastian on 21/08/2017.
 */

public final class Util extends Application {
    public static List<String> getEspecialidades(Context aContext) {

        //TO DO: traer datos desde BD
        return Arrays.asList(aContext.getResources().getStringArray(R.array.especialidades)) ;
    }

    public static List<String> getUsers(Context aContext) {

        //TO DO: traer datos desde BD
        return null ;
    }

    public static List<String> getAvailableDays(Context aContext) {

        //TO DO: traer datos desde BD
        return null ;
    }

}
