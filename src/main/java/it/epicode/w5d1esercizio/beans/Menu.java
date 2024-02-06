package it.epicode.w5d1esercizio.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Toppings> toppings;
    private List<Bevanda> bevandas;



    public void stampaMenu() {
        pizzas.stream().forEach(pizze -> System.out.println(pizze));
        bevandas.stream().forEach(bevande -> System.out.println(bevande));
        toppings.stream().forEach(toppings -> System.out.println(toppings));
    }


    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +"\n"+
                ", toppings=" + toppings +"\n"+
                ", bevandas=" + bevandas +
                '}';
    }




}
