package it.epicode.w5d1esercizio.beans;

import lombok.Data;

import java.util.List;

@Data
public class Pizza  extends menuIteam{
private Tipologia tipologia;
private List<Toppings> toppings;
}
