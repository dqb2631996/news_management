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
    String publishDay;
    String author;
    String content;
    Float averageRate;
    // cau d tao mang co 3 phan tu
    int rateList [] = new int [ 3];
@Override
// cau c : display() in ra cac thuoc tinh
    public void display(){
        System.out.println(id);
        System.out.println(title);
        System.out.println(publishDay);
        System.out.println(author);
        System.out.println(content);
        System.out.println(averageRate);
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

    public String getPublishDay() {
        return publishDay;
    }

    public void setPublistDay(String publistDay) {
        this.publishDay = publistDay;
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

    public Float getAverageRate() {
        return averageRate;
    }

    // ham dung
    // cau b : tao ham dung
    
    public News() {
    }

    public News(int id, String title, String publistDay, String author, String content, Float avarageRate) {
        this.id = id;
        this.title = title;
        this.publishDay = publishDay;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }
    
    public void calculate(){
       averageRate = (float)(rateList[0] + rateList[1] +rateList[2])/3;
    }

    
    
    
    
}
