/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidad.Estudiante;
import Entidad.RegistroNota;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class Escrituratxt {
    public void registrarEstudiante(Estudiante estudiante) {
        String rutaArchivo = "estudiante.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(estudiante.getDni()+ "," +
                         estudiante.getNombre()+ "," +
                         estudiante.getDniApoderado()+ "," +
                         estudiante.getSexo()+ "," +
                         estudiante.getGradoAcademico()+ "," +
                         estudiante.getEdad()+ "," +
                         estudiante.getDireccion()+ "," +
                         estudiante.getNumeroContacto()+ "," + "\n");

            System.out.println("Registro guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
    public void registrarNota(RegistroNota nota) {
        String rutaArchivo = "notas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(nota.getDni() + "," +
                         nota.getCurso() + "," +
                         nota.getNota1() + "," +
                         nota.getNota2() + "," +
                         nota.getNota3() + "," +
                         nota.getNota4() + "\n");

            System.out.println("Nota registrada exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
}
