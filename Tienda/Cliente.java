package Tienda;

public class Cliente {

    //DECLARAMOS VARIABLES
    private String nombres;
    private String apellidos;
    private Integer dni;


    //CREAMOS UN CONSTRUCTOR
    public Cliente(String nombres, String apellidos, Integer dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }


    //GETTER nota: SETTER no usado
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getDni() {
        return dni;
    }

}
