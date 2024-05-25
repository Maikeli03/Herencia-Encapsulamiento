public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Programacion orientada a objetos
        //clase practica

        Auto auto = new Auto ( "Toyota" , "Corolla",  2020  , 15000 ,5 ,"Gasolina");

     Camion camion = new Camion ("Volvo","FH",2019,75000,20000,4);

       //Mostrar la informacion de cada Vehiculo
         System.out.println("Mostar informacion del auto:  "  );
         auto.mostrarInfo();
         auto.mostrarDatos();

         System.out.println("Mostar informacion de camion:  "  );
         camion.mostrarInfo();

    }    
        

    }

