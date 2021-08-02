/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsManagement;

public abstract class New {
    int id;
    String title;
    String publistDay;
    String author;
    String content;
    Float avarageRate;

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

    
    
    
    
}
