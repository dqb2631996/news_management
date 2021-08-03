/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsManagement;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Program {
    News arrayList[];   
    //    cau 3
    public void menu(){
        System.out.println("1. Insert News");
        System.out.println("2. View List News");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
    }
  
//    cau 4
    public void insertNews(){
        
        Scanner sc = new Scanner(System.in);
        News news = new News();
        News newsarrayLis[] = new News[arrayList.length+1];
        for (int i = 0; i < arrayList.length; i++) {
                newsarrayLis[i] = arrayList[i];
        }
        System.out.println("1");
        news.title = sc.nextLine();
        System.out.println("2");
        news.publistDay = sc.nextLine();
        System.out.println("3");
        news.author = sc.nextLine();
        System.out.println("4");
        news.content = sc.nextLine();
        System.out.println("Nhap vao 3 danh gia :");
        System.out.println("notable 1:");
        String notable1 = sc.nextLine();
        System.out.println("notable 2:");
        String notable2 = sc.nextLine();
        System.out.println("notable 3:");
        String notable3 = sc.nextLine();
        
         newsarrayLis[arrayList.length] = news;
         arrayList = newsarrayLis;
    }
    
    // bài 5
    public void display(){
        for(int i =0; i<arrayList.length; i++){
            System.out.println(arrayList[i]);
        }
    }
    public void run(){
        while (true) { 
            Scanner sc = new Scanner(System.in);
            menu();
            System.out.println("Nhập Thao Tác :");
            int nhap = sc.nextInt();
            if(nhap == 1 ){
                insertNews();
            }else if(nhap == 2){
                display();
            }else if(nhap == 3){
                News news = new News();
                news.calculate();
                System.out.println("Danh Gia Trung Binh : " + news.avarageRate);
                display();
            }else if(nhap == 4){
                break;
            }else{
                System.out.println("nhập sai thao tác");
            }
            
            
        }
        
    }
    
}
