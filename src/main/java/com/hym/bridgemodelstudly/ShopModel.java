package com.hym.bridgemodelstudly;

/**
 *  商场模式
 */
public abstract class ShopModel {
    private ShopBrand sb;

    public void setShopBrand(ShopBrand sb){
        this.sb=sb;
    }

    public ShopBrand getShopBrand(){
        return this.sb;
    }
    abstract void showGoods();

    abstract void saleGoods();

    abstract void searchGoods();
}
