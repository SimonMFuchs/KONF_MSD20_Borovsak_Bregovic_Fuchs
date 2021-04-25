package at.fhj.iit;

public class Wine extends Drink {

    protected Liquid w;
    protected Liquid a;


    Wine (String name, Liquid w, Liquid a) {
        super(name);
        this.w = w;
        this.a = a;
    }

    @Override
    public double getVolume() {
        return w.getVolume() + a.getVolume();
    }

    @Override
    public double getAlcoholPercent() {
        return w.getAlcoholPercent();
    }

    @Override
    public boolean isAlcoholic() {
        if (w.getAlcoholPercent() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}


