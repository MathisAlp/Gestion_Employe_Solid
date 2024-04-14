package com.example;

import java.util.Scanner;

import com.example.entities.Service;
import com.example.services.ServiceEmpService;

public class Main {
    public static void main(String[] args) {

        ServiceEmpService servEmp = new ServiceEmpService();

        Scanner scanner=new Scanner(System.in);
        int choix;
        
        do {
            System.out.println("1-Enregistrer un service dans une liste");
            System.out.println("2-Enregistrer un employé");
            System.out.println("3-Virer Salaire");
            System.out.println("4-Enregistrer un congé pour un employé");
            choix=scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1 ->{
                    Service serv = new Service();
                    System.out.println("Entrer le nom du service");
                    serv.setNom(scanner.nextLine());
                    servEmp.addService(serv);
                    System.out.println("Liste des Services");
                    servEmp.getAll().forEach(System.out::println);
                }
            }
        }while(choix!=5);
        scanner.close();


    }
}