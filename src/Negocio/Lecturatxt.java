/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidad.Estudiante;
import Entidad.RegistroNota;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Lecturatxt {
    public List<Estudiante> leerEstudiantes() {
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("estudiante.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Estudiante estudiante = new Estudiante(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7]);
                listaEstudiantes.add(estudiante);
            }
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo estudiante.txt");
        }

        return listaEstudiantes;
    }
    public List<RegistroNota> leerNotas() {
        List<RegistroNota> listaNotas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                RegistroNota nota = new RegistroNota(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                listaNotas.add(nota);
            }
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo notas.txt");
        }

        return listaNotas;
    }
}
