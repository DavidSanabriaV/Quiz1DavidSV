/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1davidsanabriav;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz1DavidSanabriaV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int CantidadEmpleados;
        double salarioIndividual;
        double suma = 0;
        double montoSEM;
        double montoIVM;
        double sumafinal;
        //Solicitud de cantidad de empleados
        String lectura1;
        lectura1 = JOptionPane.showInputDialog("Ingrese la cantidad de empleados que tiene la empresa: ");
        CantidadEmpleados = Integer.parseInt(lectura1);
        //Solicitud del salario dependiendo de la cantidad de empleados
        for (int i = 0; i < CantidadEmpleados; i++) {
            //Solicitud de salario de cada empleado
            String lectura2;
            lectura2 = JOptionPane.showInputDialog("Ingrese el salario del empleado: ");
            salarioIndividual = Double.parseDouble(lectura2);
            //Suma de todos los salarios
            suma += salarioIndividual;
        }
        //Calculo de cantidad que tiene que pagar la empresa por los salarios de los empleados
        montoSEM = suma * 0.0925;
        montoIVM = suma * 0.0508;
        //Calculo del total a pagar por la empresa a la CCSS
        sumafinal = montoSEM + montoIVM;
        //Muestra del resultado final
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de: " + sumafinal + "  por concepto de SEM y IVM");
    }
    
}
