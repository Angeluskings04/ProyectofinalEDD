import java.util.Random;
public class Cliente{

    private String nombre;
    private char tipoDeCliente;
    private String evento="";

    String[] nombres = {"Leonardo", "Rene", "Jose", "Pablo", "Zai", "Brenda", "Itzamara", "Daniela", "Norbert", "Alejandro", "Keth", "Jeros"};

    String[] apellidos = {"Ruiz", "Medina", "Ledesma", "Maya", "Avila", "Mora", "MonteCarlo", "Granada", "Ortega", "Hernandez", "Paredes"};

    String[] eventos = {"Museo","Teatro","Cine"};

    public Cliente(){
      this.nombre = crearNombre();
      this.tipoDeCliente = tipoAleatorio();
      this.evento = tipoDeEvento() ;
    }

    public String getEvento(){
        return evento;
    }

    public String getNombre(){
      return nombre;
    }

    public char getTipoDeCliente(){
      return tipoDeCliente;
    }

    public void setEvento(String eve){
        this.evento = eve;
    }

    public String tipoDeEvento(){
        Random s = new Random();
        String evto = eventos[s.nextInt(3)];
        return evto;
    }

    /*
     * a es para miembros
     * b es para estudiantes de la unam
     * c estudiantes normales
     * d visitante
     */
    public char tipoAleatorio(){
        Random aleatorio = new Random();
        int as = aleatorio.nextInt(4);
        if(as == 0){
            return 'a';
        }else  if(as == 1){
            return 'b';
        }else if(as == 2){
            return 'c';
        }
        return 'd';
    }

    public String crearNombre(){
        String nombreReal="";
        Random aleatorio = new Random();
        nombreReal+= nombres[aleatorio.nextInt(12)] + " "+ apellidos[aleatorio.nextInt(11)];;
        return nombreReal;
    }

    @Override
    public String toString(){
        return "Cliente: " + nombre + "  Tipo de cliente: "+ tipoDeCliente +"  Evento:" + evento + "\n";
    }

  }
