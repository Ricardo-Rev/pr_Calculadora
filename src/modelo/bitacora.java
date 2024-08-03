/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bitacora {
    private static final String ARCHIVO_BITACORA = "bitacoraCalculadora.txt";

    public static void escribirEnBitacora(String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_BITACORA, true))) {
            writer.write(texto);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
