/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
    
    // Calcula el siguiente código de cualquier objeto
    public <T extends ConCodigo> int obtenerSiguienteCodigo(String ruta, Class<T[]> clase) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File archivo = new File(ruta);

            if (!archivo.exists()) {
                return 1;
            }

            T[] array = mapper.readValue(archivo, clase);
            List<T> lista = new ArrayList<>(List.of(array));

            return lista.stream()
                        .mapToInt(T::getCodigo)
                        .max()
                        .orElse(0) + 1;

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo para obtener el siguiente código: " + e.getMessage());
            return 1;
        }
    }
}
