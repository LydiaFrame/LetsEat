/*
 * Program: LetsEat.java
 * Programmer: Lydia Frame
 * Purpose: Demonstrat Java inheritance
 */

 import java.util.Scanner;

 public class testLetsEat{

    public static void main(String[] args) {
        //instantiate Scanner Object Input. 
        Scanner input = new Scanner(System.in);

        //instantiate Food class.
        Food food = new Food();
        System.out.println(food.getLikes());

        Steak steak = new Steak();
        System.out.println(steak.getLikes() + " Inherited from Food");

        //instantiate subclass Chicken. 
        Chicken chicken = new Chicken();
        System.out.println(chicken.getLikes() + " Overrides getLike()in Food.");

        //subclass potatoes
        Potatoes potatoes = new Potatoes();
        System.out.println(potatoes.getLikes() + " Overrides getLikes() in Food.");

        //subclass Vegetables 
        Vegetables vegetables = new Vegetables();
        System.out.println(vegetables.getLikes() + " Overrides getLikes() in Food.");

        //subclass Drinks
        Drinks drinks = new Drinks();
        System.out.println(drinks.getLikes() + " Overrides getLikes() in Food.");

        //SubSubclass Beer
        Beer beer = new Beer();
        System.out.println(beer.getLikes() + "Overrides getLikes() in Drink.");

        //SubSubClass wine
        Wine wine = new Wine();
        System.out.println(wine.getLikes() + "Overrides getLikes() in Drink.");

    }
 }