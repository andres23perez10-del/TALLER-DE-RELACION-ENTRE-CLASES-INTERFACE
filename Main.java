/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner; 
public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo (1 = Empleado fijo, 2 = Freelancer): ");
        int tipo = Integer.parseInt(sc.nextLine());

        Pagable p;
        if (tipo == 1) {
            System.out.print("Salario: ");
            p = new EmpleadoFijo(Double.parseDouble(sc.nextLine()));
        } else {
            System.out.print("Horas trabajadas: ");
            double horas = Double.parseDouble(sc.nextLine());
            System.out.print("Tarifa por hora: ");
            double tarifa = Double.parseDouble(sc.nextLine());
            p = new Freelancer(horas, tarifa);
        }

        System.out.println("Pago: " + p.calcularPago());

        sc.close();
    }
}

