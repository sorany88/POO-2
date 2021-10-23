package co.Desafio2.app;

import co.Desafio2.domain.Empleado;
import co.Desafio2.domain.Nomina;
import co.Desafio2.domain.tipoEmpleado.Directo;
import co.Desafio2.domain.tipoEmpleado.Freelance;
import co.Desafio2.domain.tipoEmpleado.Promotor;
import co.Desafio2.domain.tipoEmpleado.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class AppNomina {
    public static void main(String[] args) {
            List<Empleado> empleados = new ArrayList<>();

            Empleado empleado1 = new Directo("Juan", 6812000);
            Empleado empleado2 = new Vendedor("Julian",2410000,62106200);
            Empleado empleado3 = new Freelance("Johana",120000,79);
            Empleado empleado4 = new Vendedor("Carolina",998000,71589600);
            Empleado empleado5 = new Promotor("Pedro",974,190,68);
            Empleado empleado6 = new Directo("David",3578000);
            Empleado empleado7 = new Freelance("Gustavo",70500,64);

            empleados.add(empleado1);
            empleados.add(empleado2);
            empleados.add(empleado3);
            empleados.add(empleado4);
            empleados.add(empleado5);
            empleados.add(empleado6);
            empleados.add(empleado7);


            empleados.forEach(empleado -> {
                if (empleado instanceof Directo) {
                    Directo empleadoDirecto = (Directo) empleado;
                    System.out.println("El empleado:"+ empleadoDirecto.getNombre() + " tiene un salario de: " + empleadoDirecto.calcularSalario() + " y es de tipo: " + empleadoDirecto.getClass().toString());
                }
            });
        empleados.forEach(empleado -> {
            if (empleado instanceof Freelance) {
                Freelance empleadoFreelance = (Freelance) empleado;
                System.out.println("El empleado:"+ empleadoFreelance.getNombre() + " tiene un salario de: " + empleadoFreelance.calcularSalario() + " y es de tipo: " + empleadoFreelance.getClass().toString());
            }
        });
        empleados.forEach(empleado -> {
            if (empleado instanceof Promotor) {
                Promotor empleadoPromotor = (Promotor) empleado;
                System.out.println("El empleado:"+ empleadoPromotor.getNombre() + " tiene un salario de: " + empleadoPromotor.calcularSalario() + " y es de tipo: " + empleadoPromotor.getClass().toString());
            }
        });

    }
}
