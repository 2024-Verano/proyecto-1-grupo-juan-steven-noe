/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.mycompany.proyecto1.Archivo;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite la búsqueda de facturas de productos o de mantenimiento
 * en archivos JSON almacenados.
 *
 * <p>Proporciona un método para buscar facturas según un criterio específico.</p>
 *
 * @author noe
 */
public class BuscarFactura {

    /**
     * Busca facturas de productos o mantenimiento según un criterio específico.
     *
     * <p>Este método busca en los archivos de facturas correspondientes según el
     * tipo de factura especificado, filtrando por el criterio y el valor proporcionado.</p>
     *
     * @param tipoFactura el tipo de factura a buscar, puede ser "Producto" o "Mantenimiento"
     * @param criterio el criterio de búsqueda, puede ser "Num. Factura", "Fecha" o "Nombre cliente"
     * @param valor el valor a comparar con el criterio de búsqueda
     * @return una lista de facturas que coincidan con el criterio de búsqueda, o una lista vacía si no hay coincidencias
     */
    public static List<Factura> buscarFactura(String tipoFactura, String criterio, String valor) {
        Archivo archivo = new Archivo();
        List<Factura> resultados = new ArrayList<>();

        // Determinar la ruta del archivo según el tipo de factura seleccionado
        String ruta = tipoFactura.equals("Producto") ? "facturas_productos.json" : "facturas_mantenimiento.json";

        // Leer facturas desde el archivo JSON
        Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);

        // Filtrar facturas según el criterio
        if (facturas != null) {
            for (Factura factura : facturas) {
                if (coincideConCriterio(factura, criterio, valor)) {
                    resultados.add(factura);
                }
            }
        }

        return resultados;
    }

    /**
     * Verifica si una factura cumple con el criterio de búsqueda especificado.
     *
     * <p>Compara el valor de la factura con el valor buscado según el criterio definido.</p>
     *
     * @param factura la factura a evaluar
     * @param criterio el criterio de búsqueda ("Num. Factura", "Fecha" o "Nombre cliente")
     * @param valor el valor a comparar con el campo correspondiente de la factura
     * @return {@code true} si la factura cumple con el criterio, {@code false} en caso contrario
     */
    private static boolean coincideConCriterio(Factura factura, String criterio, String valor) {
        switch (criterio) {
            case "Num. Factura":
                return String.valueOf(factura.getEncabezado().getNumeroFactura()).equals(valor);
            case "Fecha":
                return factura.getEncabezado().getFechaRecibido().equals(valor);
            case "Nombre cliente":
                return String.valueOf(factura.getEncabezado().getCodigoCliente()).equals(valor);
            default:
                return false;
        }
    }
}
