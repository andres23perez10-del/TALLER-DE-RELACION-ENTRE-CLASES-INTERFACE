/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
interface Pagable {
    double calcularPago();
}
public class EmpleadoFijo implements Pagable {
    private double salario;

    public EmpleadoFijo(double salario) { this.salario = salario; }

    public double calcularPago() { return salario; }
}

class Freelancer implements Pagable {
    private double horas, tarifa;

    public Freelancer(double horas, double tarifa) {
        this.horas = horas;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularPago() { return horas * tarifa; }
}

