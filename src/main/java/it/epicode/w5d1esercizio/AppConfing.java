package it.epicode.w5d1esercizio;

import it.epicode.w5d1esercizio.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfing {
    @Bean("cheese")
    @Scope("prototype")
    public Toppings getCheese(){
        return new Toppings("cheese",92,0.69);
    }
    @Bean("ham")
    @Scope("prototype")
    public Toppings getHam(){
        return new Toppings("ham",35,0.99);
    }

    @Bean("onion")
    @Scope("prototype")
    public Toppings getOnins(){
        return new Toppings("onion",22,0.69);}
    @Bean("pineApple")
    @Scope("prototype")
    public Toppings getPn(){
        return new Toppings("pineApple", 24,0.79);}
    @Bean("salami")
    @Scope("prototype")
    public Toppings getSalami(){
        return new Toppings("salami",86,0.99);}

    @Bean("margherita")
    @Scope("prototype")
    public Pizza getPizza(){
        Pizza pizza=new Pizza();
        pizza.setNome("Margherita");
        pizza.setTipologia(Tipologia.ROSSA);
        pizza.setCalorie(1104);
        pizza.setPrezzo(4.99);
        pizza.setToppings(List.of(getCheese()));
        return pizza;
    }
    @Bean("hawaii")
    @Scope("prototype")

    public Pizza getPizza1(){
        Pizza pizza=new Pizza();
        pizza.setNome("hawaii");
        pizza.setTipologia(Tipologia.ROSSA);
        pizza.setCalorie(1124);
        pizza.setPrezzo(6.49);
        pizza.setToppings(List.of(getCheese(),getHam(),getPn()));


        return pizza;}
     @Bean("salame")
     @Scope("prototype")
    public Pizza getPizza2(){
        Pizza pizza=new Pizza();
        pizza.setNome("Salami");
        pizza.setTipologia(Tipologia.ROSSA);
        pizza.setCalorie(1164);
        pizza.setPrezzo(5.99);
        pizza.setToppings(List.of(getCheese(),getSalami()));
        return pizza;}


    @Bean("bevanda")
    @Scope("prototype")
    public Bevanda getdrink(){
        Bevanda bevanda =new Bevanda();
        bevanda.setNome("lemonate");
        bevanda.setCalorie(128);
        bevanda.setPrezzo(1.29);

        return bevanda;
    }

    @Bean("water")
    @Scope("prototype")
    public Bevanda getdrink1(){
        Bevanda bevanda =new Bevanda();
        bevanda.setNome("water");
        bevanda.setCalorie(0);
        bevanda.setPrezzo(1.29);
        return bevanda;
}
    @Bean("wine")
    @Scope("prototype")
    public Bevanda getdrink3(){
        Bevanda bevanda =new Bevanda();
        bevanda.setNome("wine");
        bevanda.setCalorie(607);
        bevanda.setPrezzo(7.49);
        return bevanda;}
       @Bean("menu")
        public Menu menu(){
            return new Menu(List.of(getPizza(),getPizza1(),getPizza2()),List.of(getCheese(),getSalami(),getHam(),getPn(),getOnins()),List.of(getdrink(),getdrink1(),getdrink3()));
        }
}
