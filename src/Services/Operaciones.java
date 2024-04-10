package Services;

import java.time.LocalDate;
import java.util.Scanner;
public class Operaciones {

    //Campo de clase 

   static Scanner in = new Scanner(System.in);
   static LocalDate dateToday = LocalDate.now();
   static boolean repeat = true;
   public static double balance = 80000;

   ////Metodo encargado de realizar depositos
    public static void Deposito()
    {
        System.out.println("""
                Has decidido realizar un deposito, 
                favor ingresar el monto que desea Depositar.
                """);

         Double _balance = Double.parseDouble(in.nextLine());

        if(_balance > 0 )
        {
            System.out.printf("""
                    Detalle de la transferencia:
                    Balance en su cuenta: %f.
                    Cantidad a transferir: %f.
                    """,balance, _balance);

                    System.out.println("Realizar la tranferencia SI/NO");

                    if(in.nextLine().equalsIgnoreCase("si"))
                    {
                        balance += _balance;
                        System.out.println("Tranferencia realizada con exito, monto actual " + balance + "DOP." );

                    }else
                    {
                        System.out.println("Has cancelado la transferencia1");
                    }
        }else
        {
            System.out.println("Monto erroneo");
        }
            
        
    }

    ////Metodo encargado de realizar las transferencias

    public static void Transferencia()
    {
        System.out.println("""
            Has decidido realizar una transferencia, 
            favor ingresar la cuenta destino.
            """);

        String AccountDestino = in.nextLine();
        System.out.println("Monto que desea transferir");
         Double _balance = Double.parseDouble(in.nextLine());

         if(_balance > 0 )
         {
             System.out.printf("""
                     Detalle de la transferencia:
                     Cuenta Destinatario: %s.
                     Balance en su cuenta: %f.
                     Cantidad a transferir: %f.
                      
 
                     """, AccountDestino, balance, _balance);
 
                     System.out.println("Realizar la tranferencia SI/NO");
 
                     if(in.nextLine().equalsIgnoreCase("si"))
                     {
                         balance -= _balance;
                         System.out.println("Tranferencia realizada con exito, monto actual " + balance + "DOP." );
 
                     }else
                     {
 
                         System.out.println("Has cancelado la transferencia1");
                     }
         }else
         {
             System.out.println("Monto erroneo");
 
         }
             


    }

    ///Operaciones relacionas al manejo del menu

    public static void close ()
    {
        System.out.println("Presiona cualquier tecla para cerrar");
        in.nextLine();
        System.out.println("Cerrando.......");
       
    }

    public static Boolean again ()
    {
        System.out.println("Desea realizar otra operacion o cerrar servicio? Cerrar/Servicio");
        String resp = in.nextLine();
        if(resp.equalsIgnoreCase("Servicio"))
        {
            return true;
        }else
        {
            return false;
        }
      
    }
    
}
