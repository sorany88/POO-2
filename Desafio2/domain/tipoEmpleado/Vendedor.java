package co.Desafio2.domain.tipoEmpleado;

public class Vendedor extends Directo{
    private long ventasDelMes;
    private final long SALARIOREFMENOR=999999;
    private final long SALARIOREFMAYOR=1000000;
    
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }
    public long calcularComision() {
        long comision = 0;
        if (this.getSalario()<=SALARIOREFMENOR){
            comision = (long) (this.getVentasDelMes()*0.055);
        }if (this.getSalario()>=SALARIOREFMAYOR){
            comision = (long) (this.getVentasDelMes()*0.045);
        }
        return comision;
    }
    @Override
    public long calcularSalario(){
        long salario = getSalario();
        long salarioTotal = salario - calcularPension() - calcularSalud() + calcularComision();
        return salarioTotal;
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }
}
