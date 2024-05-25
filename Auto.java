import java.util.Scanner;

public class Auto extends VehiculoPasajeros {
    
    private String tipocombustible;
    public static  double costo=0;
    
    
    //Constructor
    public Auto (String marca, String modelo , int año, int kilometraje, int numpasajeros, String tipocombustible){
        super (marca,modelo,año,kilometraje,numpasajeros);
        this.tipocombustible=tipocombustible;

    }
    //Getters and Setters
    public String gettipocombustible(){
        return tipocombustible;
    }
    public void settipocombustible(String tipocombustible){
        this.tipocombustible= tipocombustible;
    }
    //Sobreescribir 
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo combustible:  "+tipocombustible);

    }

    Scanner Leer=new Scanner (System.in);
    public double CostoMantenimiento (int costokm, int kmrecorridos){
            
        costo = costokm * kmrecorridos;
       
        return (costo);
      
   }
    
   
    
  public void mostrarDatos (int kmrecorridos,int costokm){ 
    System.out.println("Agregue los km recorridos:"+kmrecorridos);
  Leer.nextInt();
  Leer.nextLine();

  System.out.println("Agregar el costokm:"+costokm);
  Leer.nextInt();


    System.out.println("El costo de km recorridos es:" +costo);
      


   }

  
    
    
    


 }
        


    



