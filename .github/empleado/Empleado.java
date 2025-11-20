package empleado;

/*

Cálculo y devolución del complemento correspondiente a las horas extra realizadas.
Cálculo y devolución del sueldo bruto.
Cálculo y devolución de las retenciones, teniendo en cuenta que el porcentaje de retención que hay que
aplicar es 10% del sueldo base si el empleado está casado más 1% por cada hijo que tenga.
 */

public class Empleado {
    /*
     Crear una clase Empleado que modele la información que una empresa mantiene sobre cada empleado:
     número de legajo, sueldo base, pago por hora extra, horas extra realizadas en el mes, casado o no y número de
     hijos. Los servicios que deberán proporcionar los objetos de la clase serán los siguientes: 
     */
    private String legajo;
    private int sueldoBase;
    private double pagoHorasExtras;
    private boolean casado;
    private int hijos;

    public Empleado(String legajo, int sueldoBase, double pagoHorasExtras, boolean casado, int hijos) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
        this.pagoHorasExtras = pagoHorasExtras;
        this.casado = casado;
        this.hijos = hijos;
    }
    
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public String getLegajo(){
        return legajo;
    }
    public int getSueldoBase(){
        return sueldoBase;
    }
    public void setSueldoBase(int sueldoBase){
        this.sueldoBase = sueldoBase;
    }
    public double getPagoHorasExtras(){
        return pagoHorasExtras;
    }
    public void setPagoHorasExtras(double pagoHorasExtras){
        this.pagoHorasExtras = pagoHorasExtras;
    }
    public boolean getCasado(){
        return casado;
    }
    public void setCasado(boolean casado){
        this.casado = casado;
    }
    public int getHijos(){
        return hijos;
    }
    public void setHijos(int hijos){
        this.hijos = hijos;
    }
    
    // Sueldo bruto = sueldo base + horas extras
    public double calcularSueldoBruto(){
        return this.sueldoBase + this.getPagoHorasExtras();
    }
    // Retenciones
    public double calcularRetenciones(){
        double porcentaje = 0;
        if (this.casado) {
            porcentaje += 10;
        }
        porcentaje += this.hijos; // 1% por cada hijo
        return (this.sueldoBase * porcentaje) / 100;
    }
    public double calcularSueldoNeto(){
       return calcularSueldoBruto() - calcularRetenciones();
    }
    


}
