/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsManagement;

import java.util.Scanner;

public class News implements INews{
    int id;
    String title;
    String publistDay;
    String author;
    String content;
    Float avarageRate;
    // cau d tao mang co 3 phan tu
    int rateList [] = new int [ 3];
@Override
// cau c : display() in ra cac thuoc tinh
    public void display(){
        System.out.println(id);
        System.out.println(title);
        System.out.println(publistDay);
        System.out.println(author);
        System.out.println(content);
        System.out.println(avarageRate);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublistDay() {
        return publistDay;
    }

    public void setPublistDay(String publistDay) {
        this.publistDay = publistDay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getAvarageRate() {
        return avarageRate;
    }

    // ham dung
    // cau b : tao ham dung
    
    public News() {
    }

    public News(int id, String title, String publistDay, String author, String content, Float avarageRate) {
        this.id = id;
        this.title = title;
        this.publistDay = publistDay;
        this.author = author;
        this.content = content;
        this.avarageRate = avarageRate;
    }
    
    public void calculate(){
       avarageRate = (float)(rateList[0] + rateList[1] +rateList[2])/3;
    }

    
    
    
    
}
