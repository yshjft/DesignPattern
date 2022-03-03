package d10_factory_method.product;

public abstract class Shoes {
    protected String name;
    protected String bottom;
    protected String leather;
    protected boolean hasPattern;

    public void prepare() {
        System.out.println("준비 중....");
    }

    public void packing() {
        System.out.println("포장 중....");
    }

    public String getName() {
        return name;
    }
}
