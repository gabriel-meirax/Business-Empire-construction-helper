/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.businessempire;

import java.util.Scanner;

/**
 *
 * @author g_120
 */
public class BusinessEmpire {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quanto dinheiro você tem?");
        long dinheiro = leitor.nextLong();
        System.out.println();
        long faz;
        
        Construcao restos = new Construcao();
        System.out.println("Quantos builder sobraram?");
        restos.resourceBuilder = leitor.nextLong();
        System.out.println("Quantos metal sobraram?");
        restos.resourceMetal = leitor.nextLong();
        System.out.println("quantos wood sobraram?");
        restos.resourceWood = leitor.nextLong();
        System.out.println("Quantos concrete sobraram?");
        restos.resourceConcrete = leitor.nextLong();
        
        Construcao privateHouse = new Construcao();
        privateHouse.nome = "Private House";
        privateHouse.resourceBuilder = 4;
        privateHouse.resourceMetal = 4;
        privateHouse.resourceWood = 50;
        privateHouse.resourceConcrete = 170;
        privateHouse.custo = 39474;

        Construcao officeBuilding = new Construcao();
        officeBuilding.nome = "Office Building";
        officeBuilding.resourceBuilder = 13;
        officeBuilding.resourceMetal = 12;
        officeBuilding.resourceWood = 400;
        officeBuilding.resourceConcrete = 1500;
        officeBuilding.custo = 248602;

        Construcao tradeCenter = new Construcao();
        tradeCenter.nome = "Trade Center";
        tradeCenter.resourceBuilder = 90;
        tradeCenter.resourceMetal = 25;
        tradeCenter.resourceWood = 300;
        tradeCenter.resourceConcrete = 3800;
        tradeCenter.custo = 543575;

        Construcao apartmentBuilding = new Construcao();
        apartmentBuilding.nome = "Apartment Building";
        apartmentBuilding.resourceBuilder = 150;
        apartmentBuilding.resourceMetal = 660;
        apartmentBuilding.resourceWood = 2200;
        apartmentBuilding.resourceConcrete = 30200;
        apartmentBuilding.custo = 3302560;

        Construcao skyscraper = new Construcao();
        skyscraper.nome = "Skyscraper";
        skyscraper.resourceBuilder = 800;
        skyscraper.resourceMetal = 1450;
        skyscraper.resourceWood = 2800;
        skyscraper.resourceConcrete = 190000;
        skyscraper.custo = 13655150;

        Construcao total = new Construcao();
        total.nome = "Recursos necessários";
        total.resourceBuilder = 0;
        total.resourceMetal = 0;
        total.resourceWood = 0;
        total.resourceConcrete = 0;

        if ((faz = dinheiro / skyscraper.custo) >= 1) {

            System.out.println(skyscraper.nome);
            System.out.println("Consegue fazer: " + faz);
            System.out.println();
            skyscraper.resourceBuilder *= faz;
            skyscraper.resourceMetal *= faz;
            skyscraper.resourceWood *= faz;
            skyscraper.resourceConcrete *= faz;
            skyscraper.custo *= faz;
            
            dinheiro -= skyscraper.custo;
            
            total.resourceBuilder += skyscraper.resourceBuilder;
            total.resourceMetal += skyscraper.resourceMetal;
            total.resourceWood += skyscraper.resourceWood;
            total.resourceConcrete += skyscraper.resourceConcrete;
            
        }

        if ((faz = dinheiro / apartmentBuilding.custo) >= 1) {

            System.out.println(apartmentBuilding.nome);
            System.out.println("Consegue fazer: " + faz);
            System.out.println();
            apartmentBuilding.resourceBuilder *= faz;
            apartmentBuilding.resourceMetal *= faz;
            apartmentBuilding.resourceWood *= faz;
            apartmentBuilding.resourceConcrete *= faz;
            apartmentBuilding.custo *= faz;
            dinheiro -= apartmentBuilding.custo;
            
            total.resourceBuilder += apartmentBuilding.resourceBuilder;
            total.resourceMetal += apartmentBuilding.resourceMetal;
            total.resourceWood += apartmentBuilding.resourceWood;
            total.resourceConcrete += apartmentBuilding.resourceConcrete;
        }

        if ((faz = dinheiro / tradeCenter.custo) >= 1) {

            System.out.println(tradeCenter.nome);
            System.out.println("Consegue fazer: " + faz);
            System.out.println();
            tradeCenter.resourceBuilder *= faz;
            tradeCenter.resourceMetal *= faz;
            tradeCenter.resourceWood *= faz;
            tradeCenter.resourceConcrete *= faz;
            tradeCenter.custo *= faz;
            dinheiro -= tradeCenter.custo;
            
            total.resourceBuilder += tradeCenter.resourceBuilder;
            total.resourceMetal += tradeCenter.resourceMetal;
            total.resourceWood += tradeCenter.resourceWood;
            total.resourceConcrete += tradeCenter.resourceConcrete;
        }

        if ((faz = dinheiro / officeBuilding.custo) >= 1) {

            System.out.println(officeBuilding.nome);
            System.out.println("Consegue fazer: " + faz);
            System.out.println();
            officeBuilding.resourceBuilder *= faz;
            officeBuilding.resourceMetal *= faz;
            officeBuilding.resourceWood *= faz;
            officeBuilding.resourceConcrete *= faz;
            officeBuilding.custo *= faz;
            dinheiro -= officeBuilding.custo;
            
            total.resourceBuilder += officeBuilding.resourceBuilder;
            total.resourceMetal += officeBuilding.resourceMetal;
            total.resourceWood += officeBuilding.resourceWood;
            total.resourceConcrete += officeBuilding.resourceConcrete;
        }

        if ((faz = dinheiro / privateHouse.custo) >= 1) {

            System.out.println(privateHouse.nome);
            System.out.println("Consegue fazer: " + faz);
            System.out.println();
            privateHouse.resourceBuilder *= faz;
            privateHouse.resourceMetal *= faz;
            privateHouse.resourceWood *= faz;
            privateHouse.resourceConcrete *= faz;
            privateHouse.custo *= faz;
            
            total.resourceBuilder += privateHouse.resourceBuilder;
            total.resourceMetal += privateHouse.resourceMetal;
            total.resourceWood += privateHouse.resourceWood;
            total.resourceConcrete += privateHouse.resourceConcrete;
        }
        
        total.resourceBuilder -= restos.resourceBuilder;
        total.resourceMetal -= restos.resourceMetal;
        total.resourceWood -= restos.resourceWood;
        total.resourceConcrete -= restos.resourceConcrete;
        
        total.mostrarDetalhes();
    }
}
