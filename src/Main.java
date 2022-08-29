public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Marco Antonio");
        cliente.setEdad(26);
        cliente.setTelefono("5523032709");
        cliente.setCredito("Autorizado");
        System.out.println("Nombre: " + cliente.getNombre() + "\nEdad: " + cliente.getEdad() + "\nTelefono: " +
                cliente.getTelefono() + "\nCredito: " + cliente.getCredito());

        System.out.println("--------------------------------------------------------------------------");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Marco Antonio");
        trabajador.setEdad(26);
        trabajador.setTelefono("5523032709");
        trabajador.setSalario(250.26f);
        System.out.println("Nombre: " + trabajador.getNombre() + "\nEdad: " + trabajador.getEdad() + "\nTelefono: " +
                trabajador.getTelefono() + "\nSalario: " + trabajador.getSalario());
    }
}
