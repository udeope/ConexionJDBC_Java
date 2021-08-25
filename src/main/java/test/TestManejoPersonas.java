package test;

import datos.*;
import java.util.*;
import domain.Persona;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertar un nuevo objeto de tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "678123456");
//        personaDao.insertar(personaNueva);

//        Persona personaModificada = new Persona("Pepito", "Esparza", "cesparza@mail.com", "678123456");
//
//        System.out.println(personaDao.actualizar(personaModificada, 4));

        Persona personaEliminada = new Persona(4);
       personaDao.eliminar(personaEliminada, 4);

        List<Persona> personas = personaDao.seleccionar();
//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }

}
