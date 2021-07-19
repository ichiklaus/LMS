/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;



/**
 *
 * @author Usuario
 */
public class Books {
    private int code;
    private String title;
    private String author;
    private String type;
    private String publisher;
    private String publisher_email;
    private String publisher_address;
    private int publisher_number;
    private int isbn;
    private int edition;
    private int num_pages;
    private double price;
    private int availability;
    
    //constructor 
    public Books(){}
    public Books(
                    int code,
                    String title,
                    String author,
                    String type,
                    int edition,
                    int isbn,                    
                    int num_pages,
                    double price,
                    String publisher,
                    String publisher_email,
                    String publisher_address,
                    int publisher_number,
                    int availability
            
                    
    ){
        this.code  = code;
        this.title = title;
        this.author = author;
        this.type = type;
        this.publisher = publisher;
        this.publisher_email = publisher_email;
        this.publisher_address = publisher_address;
        this.publisher_number = publisher_number;
        this.isbn = isbn;
        this.edition = edition;
        this.num_pages = num_pages;
        this.price = price;
        this.availability = availability;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the edition
     */
    public int getEdition() {
        return edition;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @return the num_pages
     */
    public int getNum_pages() {
        return num_pages;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @return the publisher_address
     */
    public String getPublisher_address() {
        return publisher_address;
    }

    /**
     * @return the publisher_email
     */
    public String getPublisher_email() {
        return publisher_email;
    }

    /**
     * @return the publisher_number
     */
    public int getPublisher_number() {
        return publisher_number;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(int edition) {
        this.edition = edition;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @param num_pages the num_pages to set
     */
    public void setNum_pages(int num_pages) {
        this.num_pages = num_pages;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @param publisher_address the publisher_address to set
     */
    public void setPublisher_address(String publisher_address) {
        this.publisher_address = publisher_address;
    }

    /**
     * @param publisher_email the publisher_email to set
     */
    public void setPublisher_email(String publisher_email) {
        this.publisher_email = publisher_email;
    }

    /**
     * @param publisher_number the publisher_number to set
     */
    public void setPublisher_number(int publisher_number) {
        this.publisher_number = publisher_number;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the availability
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

}
