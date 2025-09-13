package com.fr1tzen.store;

import com.fr1tzen.store.entity.Category;
import com.fr1tzen.store.entity.Client;
import com.fr1tzen.store.entity.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);

        Client c1 = new Client("Éric", "ericfritzenvalle@gmail.com", "12312312332");
        List<Product> produtos = criarProdutosAcademia();
        produtos.forEach(System.out::println);
        //Alguns filtros
        System.out.println("Somente hipercaloricos");
        produtos.stream().filter(p -> p.getCategoria() == Category.HIPERCALORICO).toList().forEach(System.out::println);
        //E se o usuario colocar por preço?
        System.out.println("Produtos menos de 100 reias");
        produtos.stream().filter(p -> p.getPreco() < 100).toList().forEach(System.out::println);
        //Pegar so os nomes
        produtos.stream().filter(p -> p.getCategoria() == Category.SUPLEMENTOS_ESPECIAIS)
                .map(p -> p.getNome()).toList().forEach(System.out::println);
        //Sorts...
        produtos.sort(Comparator.comparing(Product::getPreco));
        produtos.forEach(System.out::println);
        //Pegar o item mais caro e mais barato
        produtos.stream().min(Comparator.comparing(Product::getPreco)).ifPresent(System.out::println);
        produtos.stream().max(Comparator.comparing(Product::getPreco)).ifPresent(System.out::println);
        //Pegar item que tem whey no nome
        produtos.stream().filter(p -> p.getNome().toLowerCase().contains("whey")).toList().forEach(System.out::println);
        

    }
    //Para fins de praticar Streams etc.

    public static List<Product> criarProdutosAcademia() {
        List<Product> produtos = new ArrayList<>();

        // Proteínas
        produtos.add(new Product("Whey Protein 1kg", 150.0, Category.PROTEINA));
        produtos.add(new Product("Casein Protein 900g", 170.0, Category.PROTEINA));
        produtos.add(new Product("Egg Protein 1kg", 140.0, Category.PROTEINA));
        produtos.add(new Product("Pea Protein 1kg", 160.0, Category.PROTEINA));
        produtos.add(new Product("Soy Protein 1kg", 145.0, Category.PROTEINA));

        // BCAAs / Aminoácidos
        produtos.add(new Product("BCAA 300g", 120.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Glutamina 300g", 65.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Creatina 200g", 80.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Beta-Alanina 250g", 70.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("L-Carnitina 500ml", 55.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Arginina 300g", 60.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Taurina 200g", 50.0, Category.SUPLEMENTOS_ESPECIAIS));

        // Pré-treino
        produtos.add(new Product("Pré-treino Pump 400g", 130.0, Category.PRETREINO));
        produtos.add(new Product("Pré-treino Extreme Energy 350g", 145.0, Category.PRETREINO));
        produtos.add(new Product("Pré-treino Nitric Max 300g", 125.0, Category.PRETREINO));
        produtos.add(new Product("Pré-treino Focus & Energy 250g", 110.0, Category.PRETREINO));
        produtos.add(new Product("Pré-treino Power Surge 400g", 150.0, Category.PRETREINO));

        // Termogênicos
        produtos.add(new Product("Termogênico Fat Burner 60 caps", 90.0, Category.TERMOGENICO));
        produtos.add(new Product("Termogênico Thermo Max 90 caps", 95.0, Category.TERMOGENICO));
        produtos.add(new Product("Termogênico Slim Burn 60 caps", 85.0, Category.TERMOGENICO));
        produtos.add(new Product("Termogênico Lipo-X 120 caps", 110.0, Category.TERMOGENICO));
        produtos.add(new Product("Termogênico Extreme Thermo 90 caps", 105.0, Category.TERMOGENICO));

        // Hipercalóricos
        produtos.add(new Product("Hipercalórico Mass Gainer 3kg", 220.0, Category.HIPERCALORICO));
        produtos.add(new Product("Hipercalórico Super Gainer 4kg", 250.0, Category.HIPERCALORICO));
        produtos.add(new Product("Hipercalórico Mega Mass 5kg", 280.0, Category.HIPERCALORICO));
        produtos.add(new Product("Hipercalórico Protein Gainer 3kg", 210.0, Category.HIPERCALORICO));
        produtos.add(new Product("Hipercalórico Bulk Up 4kg", 240.0, Category.HIPERCALORICO));

        // Vitaminas / Minerais
        produtos.add(new Product("Multivitamínico Daily 60 caps", 50.0, Category.VITAMINA));
        produtos.add(new Product("Vitamin D3 1000UI 60 caps", 40.0, Category.VITAMINA));
        produtos.add(new Product("Vitamina C 500mg 100 caps", 35.0, Category.VITAMINA));
        produtos.add(new Product("Complexo B 60 caps", 45.0, Category.VITAMINA));
        produtos.add(new Product("Magnésio 100mg 60 caps", 38.0, Category.VITAMINA));

        // Saúde geral
        produtos.add(new Product("Ômega 3 1000mg 60 caps", 70.0, Category.SAUDE_GERAL));
        produtos.add(new Product("Colágeno Hidrolisado 300g", 80.0, Category.SAUDE_GERAL));
        produtos.add(new Product("Probiótico 60 caps", 60.0, Category.SAUDE_GERAL));
        produtos.add(new Product("Coenzima Q10 30 caps", 90.0, Category.SAUDE_GERAL));
        produtos.add(new Product("Vitamina K2 60 caps", 55.0, Category.SAUDE_GERAL));

        // Suplementos especiais
        produtos.add(new Product("Testosterona Booster 60 caps", 120.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Sleep Aid Melatonin 60 caps", 40.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Cognitive Nootropic 60 caps", 95.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Joint Support 60 caps", 85.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("HMB 500g", 110.0, Category.SUPLEMENTOS_ESPECIAIS));

        // Extras
        produtos.add(new Product("Barra de Proteína Chocolate 50g", 12.0, Category.PROTEINA));
        produtos.add(new Product("Barra de Proteína Baunilha 50g", 12.0, Category.PROTEINA));
        produtos.add(new Product("Shake Proteico Morango 500ml", 15.0, Category.PROTEINA));
        produtos.add(new Product("Pré-treino Citrus 300g", 125.0, Category.PRETREINO));
        produtos.add(new Product("Termogênico Green Burn 60 caps", 95.0, Category.TERMOGENICO));
        produtos.add(new Product("Hipercalórico Energy Gainer 3kg", 230.0, Category.HIPERCALORICO));
        produtos.add(new Product("Glutamina Instant 400g", 75.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("L-Arginina 500g", 90.0, Category.SUPLEMENTOS_ESPECIAIS));
        produtos.add(new Product("Vitamina E 400UI 60 caps", 45.0, Category.VITAMINA));
        produtos.add(new Product("Multivitamínico Sport 90 caps", 65.0, Category.VITAMINA));

        return produtos;
    }

}
