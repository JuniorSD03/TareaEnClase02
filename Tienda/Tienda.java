package Tienda;

public class Tienda {

    //DECLARAMOS VARIABLES
    private Cliente cliente[];
    private int contadorCliente;
    private String nombre;
    private String direccion;


    //GENERAMOS NUESTROS CONSTRUCTORES
    public Tienda() {
        this.cliente = new Cliente[4];
        this.contadorCliente = 0;
    }

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


    //METODOS PARA AGREGAR CLIENTE
    public void agregarCliente(Cliente cliente){
        this.cliente[contadorCliente++] = cliente;
    }


    //METODO PARA RETORNAR CLIENTE
    public Cliente[] getCliente(){
        return this.cliente;
    }


    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
