public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Pepe";
        cliente.edad = 42;
        cliente.telefono ="666666666";
        cliente.credito = 500;

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Carlos";
        trabajador.edad = 50;
        trabajador.telefono = "777777777";
        trabajador.salario = 12000;

        System.out.println("Este es el cliente " + cliente.nombre + " de edad "
                + cliente.edad + ", con telefono " + cliente.telefono + " y credito " + cliente.credito);
        System.out.println("Este es el trabajador " + trabajador.nombre + " de edad "
                + trabajador.edad + ", con telefono " + trabajador.telefono + " y salario " + trabajador.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}