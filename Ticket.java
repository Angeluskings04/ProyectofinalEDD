

public class Ticket{
    //Atributos de un boleto
    private double costo = 0;
    String horaDeCompra;
    String fecha;
    String evento;
    Cliente clien;

    public Ticket(Cliente fulanito){
        clien = fulanito;
    }

    public double ganacia(){
        return costo;
    }

    //Privilegios de los tipos de clientes.
    public double museoPagar(){
        char a = clien.getTipoDeCliente();
        this.costo=50;
        if(a == 'a'){
            costo = costo - (0.2 * costo);
        } else if(a == 'b'){
            costo = -1*((0.15* costo) - costo);
        } else if(a == 'c'){
            costo = -1*((0.10* costo) - costo);
        }
        return costo;
    }

    public double cinePagar(){
        char a = clien.getTipoDeCliente();
        costo=70;
        if(a == 'a'){
            costo = -1*((0.20* costo) - costo);
        } else if(a == 'b'){
            costo =-1*((0.15* costo) - costo);
        } else if(a == 'c'){
            costo =-1*((0.10* costo) - costo);
        }
        return costo;
    }

    public double teatroPagar(){
        char a = clien.getTipoDeCliente();
        costo=100;
        if(a == 'a'){
            costo = -1*((0.20* costo) - costo);
        } else if(a == 'b'){
            costo = -1*((0.15* costo) - costo);
        } else if(a == 'c'){
            costo = -1*((0.10* costo) - costo);
        }
        return costo;
    }

    public void asignarHoraCompra(String hora){
        horaDeCompra = hora;
    }

    public void asignarFecha(String fecha){
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        return "Propietario: " + clien + " Total a pagar: " + costo;
    }
}
