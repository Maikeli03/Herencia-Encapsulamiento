public class Camion extends VehiculoCarga {

    private int numEjes;

    //Constructor
    public Camion (String marca, String modelo, int año, int kilometraje,int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje,capacidadCarga);
      this.numEjes =numEjes;
      }
  

  //Getters and setter
  public int getNumEjes(){
     return numEjes;
  }

  public void setNumEjes (int numEjes){
     this.numEjes = numEjes;
  }

  //Sobreeescribir
  @Override
  public void mostrarInfo(){
     super.mostrarInfo();
        System.out.println("Numero de ejes: "+numEjes);

  }

}
