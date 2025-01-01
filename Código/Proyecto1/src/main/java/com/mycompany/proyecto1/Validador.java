/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author noe
 */
// Clase para validaciones de entrada
public class Validador {

    // Valida que la entrada contenga solo caracteres alfabéticos
    public static boolean validarAlfabetico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    // Valida que la entrada contenga solo caracteres numéricos
    public static boolean validarNumerico(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("\\d+");
    }

    // Valida que la entrada sea un correo electrónico válido
    public static boolean validarCorreo(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false;
        }
        return entrada.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    // Valida que no haya espacios vacíos en los extremos
    public static boolean validarSinEspaciosExtremos(String entrada) {
        if (entrada == null) {
            return false;
        }
        return entrada.equals(entrada.trim());
    }
    /**
    * Verifica si un número de teléfono es válido.
    *
    * @param telefono El número de teléfono a validar.
    * @return true si el número de teléfono tiene 8 dígitos y comienza con 2, 4, 6 o 8; de lo contrario, false.
    */
    public static boolean validarTelefono(int telefono){
        String telefonoStr = String.valueOf(telefono);
        return telefonoStr.length() == 8 && "2468".contains(telefonoStr.substring(0, 1));
    }
}

