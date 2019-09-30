package com.ezycom.projectEzycom.utils;

import com.ezycom.projectEzycom.entities.Sale;
import com.ezycom.projectEzycom.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
    public class CommandeLine implements CommandLineRunner {
   
    @Autowired
        private SaleRepository saleRepository;

        public void run(String... args) throws Exception {
            saleRepository.deleteAll();

            Sale[] data = new Sale[]{
                new Sale(
                    
                    201900001L, //numero de commande
                    "04.10.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "P0001", //code produit
                    12, //quantité
                    4680, // Prix Reel HT
                    6084, //Prix vente HT
                    2404, // Marge
                    10, // Taux en %
                    "Octobre"
                ),
                new Sale(
                    
                    201900021L, //numero de commande
                    "07.10.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "P0002", //code produit
                    8, //quantité
                    4800, // Prix Reel HT
                    6240, //Prix vente HT
                    1440, // Marge
                    10, // Taux en %
                    "Octobre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "04.10.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "P0003", //code produit
                    25, //quantité
                    15000, // Prix Reel HT
                    19500, //Prix vente HT
                    4500, // Marge
                    10, // Taux en %
                    "Octobre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "10.09.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "P0003", //code produit
                    25, //quantité
                    15000, // Prix Reel HT
                    19500, //Prix vente HT
                    4500, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "04.09.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "P0003", //code produit
                    25, //quantité
                    15000, // Prix Reel HT
                    19500, //Prix vente HT
                    4500, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "20.09.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "P0003", //code produit
                    25, //quantité
                    15000, // Prix Reel HT
                    19500, //Prix vente HT
                    4500, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "11.09.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "P0003", //code produit
                    25, //quantité
                    15000, // Prix Reel HT
                    19500, //Prix vente HT
                    4500, // Marge
                    10, // Taux en %
                    "Septembre"
                )
            };
            for(Sale sale : data) {
    
                saleRepository.save(sale);
    
            }   
    }
}