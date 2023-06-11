public class CCU{
    public static void main(String[] args) {

        Taquilla taquilla1 = new Taquilla();
        //System.out.println(dos);
        for(int i = 3;i<5;i++){
        System.out.println();
        taquilla1.generaFilaNoOrdenada();
        System.out.println("Fila no ordenada.");
        System.out.println(taquilla1.filaNoOrdenada);

        System.out.println("Compra de boletos.");
        System.out.println("Fecha: " + i + "/06/2023");
        taquilla1.ordenarFila();

        System.out.println();

        System.out.println("El boleto mas vendido fue: "+taquilla1.elMasVendido());

        System.out.println("Boletos vendidos en todo el dia: " + taquilla1.boletosVendidos);

        System.out.println("Ganancias del dia: " + taquilla1.ganancias);

        taquilla1.reinicioDeDia();
        
        System.out.println();
    }

        //System.out.println(taquilla1.filaOrdenada);

        //System.out.println(taquilla1.filaOrdenada.esVacia());

        //System.out.println("simulacion");

       // taquilla1.ventaGeneral();

        //System.out.println(taquilla1.filaOrdenada);


    }
}
