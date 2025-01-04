/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1.Facturas;

import com.mycompany.proyecto1.Archivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noe
 */

// Clase para buscar una factura de producto o de mantenimiento
public class BuscarFactura {

    public static List<Factura> buscarFactura(String tipoFactura, String criterio, String valor) {
        Archivo archivo = new Archivo();
        List<Factura> resultados = new ArrayList<>();

        // Determinar el archivo según el tipo de factura seleccionado
        String ruta = tipoFactura.equals("Producto") ? "facturas_productos.json" : "facturas_mantenimiento.json";

        // Leer facturas desde el JSON
        Factura[] facturas = (Factura[]) archivo.leerArchivo(ruta, Factura[].class);

        if (facturas != null) {
            for (Factura factura : facturas) {
                if (coincideConCriterio(factura, criterio, valor)) {
                    resultados.add(factura);
                }
            }
        }

        return resultados;
    }

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
