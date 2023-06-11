import java.util.Random;
public class Taquilla{
    //Atributos
    int cantidadCine;
    int cantidadTeatro;
    int cantidadMuseo;
    double ganancias;
    int boletosVendidos;
    //Boletos Vendidos de cada uno

    Lista<Cliente> filaNoOrdenada = new Lista<Cliente>();
    Cola <Cliente> filaOrdenada = new Cola<Cliente>();

    public String elMasVendido(){
        String resultado = "Empate";
        if(cantidadCine<cantidadMuseo && cantidadTeatro < cantidadMuseo){
            return "Museo " + cantidadMuseo;
        } else if(cantidadCine>cantidadMuseo && cantidadTeatro < cantidadCine){
            return "Cine " + cantidadCine;
        }else if(cantidadTeatro>cantidadMuseo && cantidadTeatro > cantidadCine){
            return "Teatro " + cantidadTeatro;
        }
        return resultado;
    }

    /*
     * Metodo que vende un boleto dependiendo las preferencias del cliente.
     */
    public void ventaDeBoleto(Cliente p1,Ticket d2){
        if(p1.getEvento() == "Museo"){
            ganancias+= d2.museoPagar();
            cantidadMuseo++;
            boletosVendidos++;
        }else if(p1.getEvento() == "Cine"){
            ganancias += d2.cinePagar();
            cantidadCine++;
            boletosVendidos++;
        }else if(p1.getEvento() == "Teatro"){
            ganancias += d2.teatroPagar();
            cantidadTeatro++;
            boletosVendidos++;
        }

        System.out.println(d2);
    }

    /*
     * Metodo que genera una fila de espera con personas random y con su tipo de cliente.
     */
    public void generaFilaNoOrdenada(){
        Random aleatorios = new Random();
        for(int i =0;i<(aleatorios.nextInt(20)+2);i++){
            Cliente c1 = new Cliente();
            filaNoOrdenada.agregarAlInicio(c1);
        }
    }

    public void reinicioDeDia(){
        cantidadCine = 0;
        cantidadTeatro = 0;
        cantidadMuseo = 0;
        ganancias = 0;
    }


    /*
     * Metodo que ordena por tipo de cliente para poder pasar a pagar.
     */
    public void ordenarFila(){
        //generaFilaNoOrdenada();
        for(Cliente c : filaNoOrdenada){
            if(c.getTipoDeCliente()=='a'){
                Cliente f = c;
                filaOrdenada.queue(f);
                Ticket m2 = new Ticket(f);
                ventaDeBoleto(f, m2);
            }
        }
        for(Cliente c : filaNoOrdenada){
            if(c.getTipoDeCliente()=='b'){
                Cliente f = c;
                filaOrdenada.queue(f);
                Ticket m2 = new Ticket(f);
                ventaDeBoleto(f, m2);
            }
        }
        for(Cliente c : filaNoOrdenada){
            if(c.getTipoDeCliente()=='c'){
                Cliente f = c;
                filaOrdenada.queue(f);
                Ticket m2 = new Ticket(f);
                ventaDeBoleto(f, m2);
            }
        }
        for(Cliente c : filaNoOrdenada){
            if(c.getTipoDeCliente()=='d'){
                Cliente f = c;
                filaOrdenada.queue(f);
                Ticket m2 = new Ticket(f);
                ventaDeBoleto(f, m2);
            }
        }
        //System.out.println(filaOrdenada);
    }

}