package com.hym.bridgemodelstudly;

public class OutLineShopModel extends ShopModel {
    void showGoods() {
        getShopBrand().showGoods();
        System.out.println("线下模式");
    }

    void saleGoods() {
        getShopBrand().saleGoods();
        System.out.println("线下模式");
    }

    void searchGoods() {
        getShopBrand().searchGoods();
        System.out.println("线下模式");
    }
}
