package co.Desafio2.domain.tipoEmpleado;

import co.Desafio2.domain.Empleado;

public class Directo extends Empleado {
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    public long calcularSalud() {
        long salud;
        salud = (long) (this.getSalario()*0.04);
        return salud;
    }
    public long calcularPension() {
        long pension;
        pension = (long) (this.getSalario()*0.065);
        return pension;
    }
    @Override
    public long calcularSalario(){
        long salario = getSalario();
        long salarioTotal = salario - calcularPension() - calcularSalud();
        return salarioTotal;
    }
    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}
