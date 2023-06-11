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

    public void ventaDeBoleto(Cliente p1,Ticket d2){
        if(p1.getEvento() == "Museo"){
            d2.museoPagar();
            cantidadMuseo++;
            boletosVendidos++;
        }else if(p1.getEvento() == "Cine"){
            d2.cinePagar();
            cantidadCine++;
            boletosVendidos++;
        }else if(p1.getEvento() == "Teatro"){
            d2.teatroPagar();
            cantidadTeatro++;
            boletosVendidos++;
        }

        System.out.println(d2);
    }

    public void generaFilaNoOrdenada(){
        Random aleatorios = new Random();
        for(int i =0;i<(aleatorios.nextInt(20)+2);i++){
            Cliente c1 = new Cliente();
            filaNoOrdenada.agregarAlInicio(c1);
        }
    }

    public void ventaGeneral(){
            int indice=0;
            for(Cliente c : filaOrdenada){
                Cliente c2 = filaOrdenada.getElemento(indice);
                Ticket tk1 =new Ticket(c2);
                ventaDeBoleto(c2, tk1);
                filaOrdenada.dequeue();
        }
    }

    public void ordenarFila(){
        generaFilaNoOrdenada();
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
            }
        }
        for(Cliente c : filaNoOrdenada){
            if(c.getTipoDeCliente()=='c'){
                Cliente f = c;
                filaOrdenada.queue(f);
            }
        }
        for(Cliente c : filaNoOrdenada){
            if(c.getTipoDeCliente()=='d'){
                Cliente f = c;
                filaOrdenada.queue(f);
            }
        }
    }

}