package com.hym.bridgemodelstudly;

public class OnLineShopModel extends ShopModel {
    void showGoods() {
        getShopBrand().showGoods();
        System.out.println("线上销售");
    }

    void saleGoods() {
        getShopBrand().saleGoods();
        System.out.println("线上销售");
    }

    void searchGoods() {
        getShopBrand().searchGoods();
        System.out.println("线上销售");
    }
}
