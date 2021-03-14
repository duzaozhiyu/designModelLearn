package com.hym.bridgemodelstudly;

/**
 *  桥接模式使用例子
 */
public class Client {

    public static void main(String args[]){
        ShopModel sm=new OnLineShopModel();
        sm.setShopBrand(new JingDongShop());
        sm.searchGoods();
        sm.showGoods();
        sm.saleGoods();

        System.out.println("-----------------------------");

        ShopModel sm2=new OutLineShopModel();
        sm2.setShopBrand(new TianMaoShop());
        sm2.searchGoods();
        sm2.showGoods();
        sm2.saleGoods();
    }
}
