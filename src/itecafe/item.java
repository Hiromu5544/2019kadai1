/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

/**
 *
 * @author kbc19a31
 */
public class item {
     private int no;        //商品番号
    private String name;        //商品名
    private int price;        //料金

    public item(int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}


    

