public class MochaDecorator extends CondimentDecorator{

    Beverage beverage;
    Size size;
    MochaDecorator(Beverage beverage, Size size)
    {
        this.beverage=beverage;
        this.size = size;
    }


    @Override
    public double cost() {
        double cost = beverage.cost();
        if(size == Size.TALL)
            return cost += 0.20;
        else if(size == Size.GRANDE)
            return cost += 0.25;
        else if(size == Size.VENTI)
            return cost += 0.30;
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha ";
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
