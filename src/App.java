
import java.time.LocalDate;
import java.util.Scanner;

public class App {
   static Double balance = 80000.00;;
   static Scanner in = new Scanner(System.in);
   static LocalDate dateToday = LocalDate.now();
   static boolean repeat = true;
    public static void main(String[] args) throws Exception {

        System.out.println("""
            ****Bienvenido al banco de Java Oracle One****
            Favor elegir la operacion que desea realizar el dia de hoy
                """ + dateToday);

        while(repeat)
        {

            System.out.println("""
                1. Deposito.
                2. Transferencia.
                3. Consultar Balance.
                4. Cerrar.
                """);        

        int op = Integer.parseInt(in.nextLine());
        switch (op) {
            case 1:
                Deposito();
                repeat = again();
                break;

            case 2:
                Transferencia();
                repeat = again();
            break;

            case 3:
                System.out.println("Tu balance actual es de " + balance + "Dop");
                repeat = false;
            break;

            case 4:
                close();
                repeat = false;
                break;

            default:
            System.out.println("Opcion incorrecta");
                break;
        }
     }

    }
    public static void Deposito()
    {
        System.out.println("""
                Has decidido realizar un deposito, 
                favor ingresar el monto que desea transferir.
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
