package it.epicode.w5d1esercizio;

import it.epicode.w5d1esercizio.beans.Bevanda;
import it.epicode.w5d1esercizio.beans.Menu;
import it.epicode.w5d1esercizio.beans.Pizza;
import it.epicode.w5d1esercizio.beans.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class W5d1esercizioApplication {

	public static void main(String[] args) {
		SpringApplication.run(W5d1esercizioApplication.class, args);
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfing.class);
		Pizza pizza= ctx.getBean("margherita", Pizza.class);
		Pizza P1=ctx.getBean("hawaii",Pizza.class);
		Pizza p2=ctx.getBean("salame", Pizza.class);



		Bevanda b1=ctx.getBean("bevanda", Bevanda.class);
		Bevanda b2=ctx.getBean("water", Bevanda.class);
		Bevanda b3=ctx.getBean("wine", Bevanda.class);

		Toppings t1=ctx.getBean("cheese", Toppings.class);
		Toppings t2=ctx.getBean("ham", Toppings.class);
		Toppings t3=ctx.getBean("pineApple", Toppings.class);
		Toppings t4=ctx.getBean("salami", Toppings.class);
		Toppings t5=ctx.getBean("onion", Toppings.class);

		Menu m1=ctx.getBean("menu", Menu.class);
	m1.stampaMenu();

	}

}
