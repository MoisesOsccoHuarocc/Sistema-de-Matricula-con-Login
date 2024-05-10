/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidad.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Logica {
    public boolean buscarEstudiantePorDni(String dniBuscado) {
        Lecturatxt leer=new Lecturatxt();
        
    for (Estudiante estudiantes : leer.leerEstudiantes()) {
        if (estudiantes.getDni().equals(dniBuscado)) {
            return true;
        }
    }

    return false;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}
    public String buscarNombreestudiantePorDni(String dniBuscado) {
    Lecturatxt leer =new Lecturatxt();
    for (Estudiante estudiantes : leer.leerEstudiantes()) {
        if (estudiantes.getDni().equals(dniBuscado)) {
            return estudiantes.getNombre();
        }
    }
    
    return null;  
}
    public int calcularPromedio(int nota1, int nota2, int nota3,int nota4){
        return (((nota1+nota2+nota3)/3)+nota4)/2;
    }
    public String estado(double promedio){
        if(promedio>10.5)
            return "Aprobado";
        return " Desaprobado";
    }
}
