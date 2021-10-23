package co.Desafio2.domain.tipoEmpleado;

import co.Desafio2.domain.Empleado;

public class Promotor extends Empleado {
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;
    private final long VALOREXTRA = 17000;

    public Promotor(String nombre, int volantesRepartidos,long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }
    @Override
    public long calcularSalario(){
        long salarioTotal = getVolantesRepartidos()*getValorVolante() + VALOREXTRA*getComprasVolante();
        return salarioTotal;
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }
}
