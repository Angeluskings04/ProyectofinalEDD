public class CCU{

   public static void timer(){
     try {
       Thread.sleep(2000);
     } catch (InterruptedException ie) {
         Thread.currentThread().interrupt();
        }
      }

    public static void main(String[] args) {

        Taquilla taquilla1 = new Taquilla();
        //System.out.println(dos);
        for(int i = 3;i<5;i++){
        System.out.println();
        taquilla1.generaFilaNoOrdenada();

        System.out.println("\u001B[36m" +"              FECHA: " + i + "/06/2023     \n" + "\u001B[0m");
        System.out.println("\u001B[31m" + "LLEGADA DE CLIENTES SIN ORDEN: \n" + "\u001B[0m");
        System.out.println(taquilla1.filaNoOrdenada);

        timer();

        System.out.println("\u001B[31m" + "COMPRA DE BOLETOS DADO EL ORDEN DE MEMBRESIA:" + "\u001B[0m");
        timer();
        taquilla1.ordenarFila();

        timer();

        System.out.println();

        System.out.println("\u001B[33m" + "DATOS TOTALES DEL DIA:" + "\u001B[0m");

        System.out.println("El boleto mas vendido fue: "+taquilla1.elMasVendido());

        System.out.println("Boletos vendidos en todo el dia: " + taquilla1.boletosVendidos);

        System.out.println("Ganancias del dia: $" + taquilla1.ganancias);

        timer();


        taquilla1.reinicioDeDia();

        System.out.println();
    }



    }
}
