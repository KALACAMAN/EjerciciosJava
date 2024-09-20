package EjercicioenclasePOO;


public class main {
   public static void main(String[] args) {
       TelefonoMovil telefono = new TelefonoMovil();
        telefono.setPrecio(5899);
        telefono.setMarca("OPPO");
        telefono.setModelo("A78");
        telefono.setCapacidadAlmacenamiento(128);
        telefono.setDuracionBateria(48);

        System.out.println("Marca: " + telefono.getMarca());
        System.out.println("Modelo: " + telefono.getModelo());
        System.out.println("Precio: " + telefono.getPrecio());
        System.out.println("Capacidad de Almacenamiento: " + telefono.getCapacidadAlmacenamiento() + "GB");
        System.out.println("Duración de la Batería: " + telefono.getDuracionBateria() + " horas");
   }
}
