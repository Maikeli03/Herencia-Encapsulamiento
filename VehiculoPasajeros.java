public class VehiculoPasajeros extends Vehiculo {

    private int numpasajeros;
     
    //Constructor
    public VehiculoPasajeros (String marca, String modelo , int año, int kilometraje, int numpasajeros){
        
        super (marca,modelo,año , kilometraje);
        this.numpasajeros = numpasajeros;

    }
    
    //Getters and Stters
    public int getNumpasajeros(){
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros){
        this.numpasajeros=numpasajeros;
    }
  
    //Sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        System.out.println("Numero de pasajeros:  " +numpasajeros);


    }

   
}
