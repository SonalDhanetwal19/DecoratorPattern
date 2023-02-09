import java.sql.SQLInvalidAuthorizationSpecException;

public class Espresso extends Beverage{

    Size size;
    public Espresso(Size size)
    {
        description = "Espresso";
        this.size = size;
    }
    @Override
    public double cost() {
        if(size.equals(Size.TALL))
        return 1.99;
        if(size.equals(Size.GRANDE))
            return 2.99;
        if(size.equals(Size.VENTI))
            return 3.99;
        return 1.99;
    }
}
