
public class Cliente{

    private String nombre;
    private String tipoDeCliente;
    private String evento;
  
    public Cliente(String nombre, String tipoDeCliente, String evento){
      this.nombre = nombre;
      this.tipoDeCliente = tipoDeCliente;
      this.evento = evento;
    }
  
    public String getNombre(){
      return nombre;
    }
  
    public String getTipoDeCliente(){
      return tipoDeCliente;
    }
  
  }

