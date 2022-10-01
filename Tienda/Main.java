package Tienda;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAMOS
        Tienda tienda = new Tienda();


        //ARGUMENTOS DE LA TIENDA
        tienda.setNombre("Abarrotes Arturo");
        tienda.setDireccion("Avenida Olivos");


        //DATOS DEL ARREGLO CLIENTE
        tienda.agregarCliente(new Cliente("David", "Rocano Sandoval", 1212121212));
        tienda.agregarCliente(new Cliente("Angelica Xiomara", "Torres Santiago", 56565656));
        tienda.agregarCliente(new Cliente("Melissa", "Dominguez Tuanama", 78787878));
        tienda.agregarCliente(new Cliente("Carlos Gabriel", "Solis Canchaya", 69696969));
        System.out.println("Nombre de la tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());

        //USAMOS EL FOREACH DE JAVA PARA IMPRIMIR EL ARREGLO
        for (Cliente cli: tienda.getCliente()){
            System.out.println("  _" + cli.getNombres() + " " + cli.getApellidos() + ", DNI: " + cli.getDni());
        }
    }
}
