package com.vince.ui;

import com.vince.bean.Clothes;
import com.vince.service.ClothesService;
import com.vince.service.impl.ClothesServiceImpl;
import com.vince.utils.ConsoleTable;

import java.util.List;

public class HomeClass extends BaseClass{
    public void show(){
        showProducts();
    }

    private void showProducts() {
        ClothesService clothesService = new ClothesServiceImpl();
        List<Clothes> list = clothesService.list();

        ConsoleTable t = new ConsoleTable(8, true);
        t.appendRow();
        t.appendColum("id")
                .appendColum("brand")
                .appendColum("style")
                .appendColum("color")
                .appendColum("size")
                .appendColum("num")
                .appendColum("price")
                .appendColum("description");

        for(Clothes c:list){
            t.appendRow();
            t.appendColum(c.getId())
                    .appendColum(c.getBrand())
                    .appendColum(c.getStyle())
                    .appendColum(c.getColor())
                    .appendColum(c.getSize())
                    .appendColum(c.getNum())
                    .appendColum(c.getPrice())
                    .appendColum(c.getDescription());
        }

        println(t.toString());
    }
}
