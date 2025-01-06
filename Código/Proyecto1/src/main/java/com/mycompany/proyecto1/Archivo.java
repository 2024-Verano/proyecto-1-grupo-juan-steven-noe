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
 * Clase encargada de la gestión de archivos, permitiendo su almacenamiento y lectura 
 * en formato JSON utilizando la biblioteca Jackson.
 * 
 * <p>Proporciona métodos para guardar y leer objetos desde archivos, además de obtener 
 * un identificador único basado en los registros almacenados.</p>
 * 
 * @author Steven Umaña
 */
public class Archivo {

    /**
     * Guarda un objeto en un archivo en formato JSON.
     *
     * <p>Este método serializa el objeto proporcionado y lo almacena en la 
     * ruta especificada.</p>
     *
     * @param ruta la ruta del archivo donde se almacenará el objeto
     * @param data el objeto que será almacenado en el archivo
     * @throws IOException si ocurre un error durante la escritura del archivo
     */
    public void guardarArchivo(String ruta, Object data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(ruta), data);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    /**
     * Lee un archivo en formato JSON y lo convierte en un objeto del tipo especificado.
     *
     * <p>Este método deserializa el archivo JSON en la ruta especificada y devuelve 
     * un objeto de la clase indicada.</p>
     *
     * @param ruta la ruta del archivo que se leerá
     * @param clase la clase del objeto que se espera recuperar
     * @return el objeto deserializado, o {@code null} si ocurre un error durante la lectura
     * @throws IOException si ocurre un error al leer el archivo
     */
    public Object leerArchivo(String ruta, Class<?> clase) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(ruta), clase);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * Obtiene el siguiente código disponible basado en el conjunto de objetos almacenados.
     *
     * <p>Este método lee un archivo JSON que contiene una lista de objetos que implementan 
     * la interfaz {@code ConCodigo}, y calcula el siguiente código disponible 
     * incrementando el mayor valor encontrado en el conjunto.</p>
     *
     * @param <T> el tipo de objetos almacenados en el archivo, que deben implementar {@code ConCodigo}
     * @param ruta la ruta del archivo JSON a leer
     * @param clase la clase del array de objetos a deserializar
     * @return el siguiente código disponible, comenzando desde 1 si el archivo está vacío o no existe
     * @throws IOException si ocurre un error al leer el archivo
     */
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
