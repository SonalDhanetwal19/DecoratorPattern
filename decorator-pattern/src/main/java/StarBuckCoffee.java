public class StarBuckCoffee {
    public static void main(String[] args)
    {
        Beverage basicEspressoBeverage = new Espresso(Beverage.Size.VENTI);
        System.out.println("espressoBeverage details : "+basicEspressoBeverage.getDescription() + " cost - $" + basicEspressoBeverage.cost());

        Beverage espressoWithMochaAndWhipToppings = new Espresso(Beverage.Size.GRANDE);
        espressoWithMochaAndWhipToppings = new MochaDecorator(espressoWithMochaAndWhipToppings, Beverage.Size.GRANDE);
        espressoWithMochaAndWhipToppings = new WhipDecorator(espressoWithMochaAndWhipToppings, Beverage.Size.GRANDE);
        System.out.println("espressoWithMochaAndWhipToppings details : "+espressoWithMochaAndWhipToppings.getDescription()+" Size = "+espressoWithMochaAndWhipToppings.getSize()+" cost - $"+espressoWithMochaAndWhipToppings.cost());

        Beverage darkRoastwithDoubleMochaAndWhipToppings = new DarkRoast();
        darkRoastwithDoubleMochaAndWhipToppings = new MochaDecorator(darkRoastwithDoubleMochaAndWhipToppings, Beverage.Size.VENTI);
        darkRoastwithDoubleMochaAndWhipToppings = new MochaDecorator(darkRoastwithDoubleMochaAndWhipToppings, Beverage.Size.VENTI);
        darkRoastwithDoubleMochaAndWhipToppings = new WhipDecorator(darkRoastwithDoubleMochaAndWhipToppings, Beverage.Size.VENTI);
        System.out.println("darkRoastwithDoubleMochaAndWhipToppings details : "+darkRoastwithDoubleMochaAndWhipToppings.getDescription()+" Size = "+darkRoastwithDoubleMochaAndWhipToppings.getSize()+" cost - $"+darkRoastwithDoubleMochaAndWhipToppings.cost());


    }
}
