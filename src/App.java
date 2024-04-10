
import java.time.LocalDate;
import java.util.Scanner;

import Services.Operaciones;

public class App {
    
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
                Operaciones.Deposito();
                repeat = Operaciones.again();
                break;

            case 2:
                Operaciones.Transferencia();
                repeat = Operaciones.again();
            break;

            case 3:
                System.out.println("Tu balance actual es de " + Operaciones.balance + "Dop");
                repeat = Operaciones.again();;
            break;

            case 4:
                Operaciones.close();
                repeat = false;
                break;

            default:
            System.out.println("Opcion incorrecta");
                break;
        }
     }

    }
    
}
