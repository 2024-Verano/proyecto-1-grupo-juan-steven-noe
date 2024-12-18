/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Steven Umaña
 */
public class Archivo {

    public void guardarArchivo(String ruta, Object data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(ruta), data);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public Object leerArchivo(String ruta, Class<?> clase) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(ruta), clase);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
    }
}
