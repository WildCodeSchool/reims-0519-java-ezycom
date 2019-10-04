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
                    
                    201906007L, //numero de commande
                    "10.09.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "P0003", //code produit
                    8, //quantité
                    4800, // Prix Reel HT
                    6240, //Prix vente HT
                    1440, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "04.09.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "S0005", //code produit
                    14, //quantité
                    420, // Prix Reel HT
                    546, //Prix vente HT
                    126, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    201906002L, //numero de commande
                    "20.09.2019", // date de commande
                    "Rousseau Sebastien", // Commercial
                    "P0003", //code produit
                    5, //quantité
                    3000, // Prix Reel HT
                    3900, //Prix vente HT
                    900, // Marge
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
                ),
                new Sale(
                    201906006L, //numero de commande
                    "08.07.2019", // date de commande
                    "Richard Jacques", // Commercial
                    "S0003", //code produit
                    80, //quantité
                    640, // Prix Reel HT
                    830, //Prix vente HT
                    190, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060008L, //numero de commande
                    "08.07.2019", // date de commande
                    "Richard Jacques", // Commercial
                    "S0001", //code produit
                    600, //quantité
                    4800, // Prix Reel HT
                    6200, //Prix vente HT
                    1400, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "08.07.2019", // date de commande
                    "Richard Jacques", // Commercial
                    "S0001", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    104, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),

                new Sale(
                    
                    2019060011L, //numero de commande
                    "08.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0001", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    104, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060012L, //numero de commande
                    "08.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0002", //code produit
                    11, //quantité
                    80, // Prix Reel HT
                    124, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "08.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0003", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    164, //Prix vente HT
                    20, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "18.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0004", //code produit
                    2, //quantité
                    80, // Prix Reel HT
                    194, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "15.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0001", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    104, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "02.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0003", //code produit
                    1, //quantité
                    80, // Prix Reel HT
                    104, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "09.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0006", //code produit
                    15, //quantité
                    80, // Prix Reel HT
                    184, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "22.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0011", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    99, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "28.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S00011", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    104, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "30.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0002", //code produit
                    20, //quantité
                    80, // Prix Reel HT
                    174, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "20.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0008", //code produit
                    5, //quantité
                    80, // Prix Reel HT
                    98, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),new Sale(
                    
                    2019060010L, //numero de commande
                    "19.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0011", //code produit
                    19, //quantité
                    80, // Prix Reel HT
                    142, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "23.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0009", //code produit
                    40, //quantité
                    80, // Prix Reel HT
                    194, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "23.07.2019", // date de commande
                    "Dupond Daniel", // Commercial
                    "S0009", //code produit
                    40, //quantité
                    80, // Prix Reel HT
                    194, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                )
            };
            for(Sale sale : data) {
    
                saleRepository.save(sale);
            }   
    }
}