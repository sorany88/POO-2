package co.Desafio2.domain;

import co.Desafio2.domain.tipoEmpleado.Directo;
import co.Desafio2.domain.tipoEmpleado.Freelance;
import co.Desafio2.domain.tipoEmpleado.Promotor;
import co.Factura.domain.Factura;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;
    public Nomina(){
        this.empleados = new ArrayList<>();
    }

    public void calcularNomina(){
        empleados.forEach(empleado -> {
            empleado.calcularSalario();
        });
    }
    public void listarDirectos(){
        empleados.forEach(empleado -> {
            if (empleado instanceof Directo) {
                Directo empleadoDirecto = (Directo) empleado;
                System.out.println("El empleado:"+ empleadoDirecto.getNombre() + " tiene un salario de: " + empleadoDirecto.calcularSalario() + " y es de tipo: " + empleadoDirecto.getClass().toString());
            }
        });
    }
    public void listarFreelance(){
        empleados.forEach(empleado -> {
            if (empleado instanceof Freelance) {
                Freelance empleadoFreelance = (Freelance) empleado;
                System.out.println("El empleado:"+ empleadoFreelance.getNombre() + " tiene un salario de: " + empleadoFreelance.calcularSalario() + " y es de tipo: " + empleadoFreelance.getClass().toString());
            }
        });
    }
    public void Promotores(){
        empleados.forEach(empleado -> {
            if (empleado instanceof Promotor) {
                Promotor empleadoPromotor = (Promotor) empleado;
                System.out.println("El empleado:"+ empleadoPromotor.getNombre() + " tiene un salario de: " + empleadoPromotor.calcularSalario() + " y es de tipo: " + empleadoPromotor.getClass().toString());
            }
        });
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}