package d10_factory_method.creator;

import d10_factory_method.product.Shoes;

public abstract class ShoesStore {
    public Shoes orderShoes(String name) {
        Shoes shoes = makeShoes(name);

        shoes.prepare();
        shoes.packing();

        return shoes;
    }

    abstract Shoes makeShoes(String name);
}
