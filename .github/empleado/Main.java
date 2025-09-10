package empleado;

public class Main {
    
    public static void main(String[] args) {
    Empleado e1 = new Empleado("03696", 450000, 10, true, 2);
    System.out.println("Se mostrara las retenciones, sueldo bruto y el sueldo neto de este empleado.");
    System.out.println(e1.calcularRetenciones());
    e1.calcularRetenciones();
    System.out.println(e1.calcularSueldoBruto());
    e1.calcularSueldoBruto();
    System.out.println(e1.calcularSueldoNeto());
    e1.calcularSueldoNeto();
}
}
