public class VehiculoCarga extends Vehiculo {

    private int capacidadCarga;

     //Constructor 

   public VehiculoCarga( String marca, String modelo , int año ,int kilometraje , int capacidadCarga){
      super(marca, modelo, año, kilometraje);
      this.capacidadCarga= capacidadCarga;
  
  }

  //Getters and setter
  public int getCapacidadCarga(){
     return capacidadCarga;
  }

  public void setcapacidadCarga (int capacidadCarga){
     this.capacidadCarga = capacidadCarga;
  }

  //Sobreeescribir
  @Override
  public void mostrarInfo(){
     super.mostrarInfo();
        System.out.println("Capacidad de Carga: " +capacidadCarga);

  }

}
