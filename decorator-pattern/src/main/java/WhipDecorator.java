public class WhipDecorator extends CondimentDecorator{

    Beverage beverage;
    Size size;

    WhipDecorator(Beverage beverage,Size size)
    {
        this.beverage = beverage;
        this.size = size;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        if(size == Size.TALL)
        return cost += 0.18;
        else if(size == Size.GRANDE)
           return  cost += 0.23;
        else if(size == Size.VENTI)
            return cost += 0.28;
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " whip ";
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
    }

    @Override
    public Size getSize() {
        return size;
    }
}
