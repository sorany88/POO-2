package co.Desafio2.domain.tipoEmpleado;

import co.Desafio2.domain.Empleado;

public class Freelance extends Empleado {
    private long valorHora;
    private int horasTrabajadas;

    public Freelance(String nombre, long valorHora,int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public long getValorHora() {
        return valorHora;
    }
    @Override
    public long calcularSalario(){
        long salarioTotal = getHorasTrabajadas()*getValorHora();
        return salarioTotal;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
