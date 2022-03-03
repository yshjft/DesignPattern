package d10_factory_method.creator;

import d10_factory_method.product.JPStyleBlackShoes;
import d10_factory_method.product.Shoes;

public class JapanShoesStore extends ShoesStore{
    @Override
    Shoes makeShoes(String name) {
        // 상품이 추가 될경우 이 메서드만 수정하면 된다.
        if(name.equals("blackShoes")) {
            return new JPStyleBlackShoes();
        }else{
            return null;
        }
    }
}
