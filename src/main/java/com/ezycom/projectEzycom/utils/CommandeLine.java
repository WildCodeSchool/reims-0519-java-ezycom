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
                    "Baudou Jeremie", // Commercial
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
                    "Baudou Jeremie", // Commercial
                    "P0002", //code produit
                    8, //quantité
                    4800, // Prix Reel HT
                    6240, //Prix vente HT
                    1440, // Marge
                    10, // Taux en %
                    "Octobre"
                ),
                new Sale(
                    
                    201906009L, //numero de commande
                    "04.10.2019", // date de commande
                    "Mando Morgane", // Commercial
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
                    "Mando Morgane", // Commercial
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
                    "Mando Morgane", // Commercial
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
                    "Mando Morgan", // Commercial
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
                    "Baudou Jeremie", // Commercial
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
                    "08.09.2019", // date de commande
                    "Jacques Adrien", // Commercial
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
                    "Jacques Adrien", // Commercial
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
                    "Jacques Adrien", // Commercial
                    "S0001", //code produit
                    10, //quantité
                    80, // Prix Reel HT
                    104, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),

                new Sale(
                    201906118L, //numero de commande
                    "08.10.2019", // date de commande
                    "Jacques Adrien", // Commercial
                    "S0012", //code produit
                    2, //quantité
                    2340, // Prix Reel HT
                    2700, //Prix vente HT
                    440, // Marge
                    10, // Taux en %
                    "Octobre"
                ),
                new Sale(
                    201906318L, //numero de commande
                    "01.10.2019", // date de commande
                    "Jacques Adrien", // Commercial
                    "S0013", //code produit
                    5, //quantité
                    500, // Prix Reel HT
                    650, //Prix vente HT
                    150, // Marge
                    10, // Taux en %
                    "Octobre"

                ),
                new Sale(
                    
                    2019060011L, //numero de commande
                    "08.07.2019", // date de commande
                    "Jacques Adrien", // Commercial
                    "S0001", //code produit
                    10, //quantité
                    60, // Prix Reel HT
                    84, //Prix vente HT
                    24, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060012L, //numero de commande
                    "08.07.2019", // date de commande
                    "Jacques Adrien", // Commercial
                    "S0002", //code produit
                    11, //quantité
                    160, // Prix Reel HT
                    200, //Prix vente HT
                    40, // Marge
                    10, // Taux en %
                    "Septembre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "08.07.2019", // date de commande
                    "Baudou Jeremie", // Commercial
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
                    "Mando Morgane", // Commercial
                    "S0004", //code produit
                    4, //quantité
                    160, // Prix Reel HT
                    194, //Prix vente HT
                    34, // Marge
                    10, // Taux en %
                    "Octobre"
                ),
                new Sale(
                    
                    2019060010L, //numero de commande
                    "15.07.2019", // date de commande
                    "Mando Morgane", // Commercial
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
                    "Mando Morgane", // Commercial
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
                    "Mando Morgane", // Commercial
                    "S0006", //code produit
                    15, //quantité
                    80, // Prix Reel HT
                    184, //Prix vente HT
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