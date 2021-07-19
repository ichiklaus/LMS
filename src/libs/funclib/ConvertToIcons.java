/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs.funclib;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import libs.uilib.Main;

/**
 *
 * @author Nicolas
 */
public class ConvertToIcons implements Nullify{
    private BufferedImage img = null;
    private Image dimg = null;
    private ImageIcon reg_icon = null;
    
    //Resizes all the original icons to fit the label.
    public void getAddUserIcon(javax.swing.JLabel label_add_user){
        try{
            img = ImageIO.read(new File("src/icons/user-1.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_add_user.getWidth(), label_add_user.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_add_user.setIcon(reg_icon);
    }
    public void getSearchUserIcon(javax.swing.JLabel label_search_user){
        try{
            img = ImageIO.read(new File("src/icons/search-user.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_search_user.getWidth(), label_search_user.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_search_user.setIcon(reg_icon);
    }    
    public void getReturnHomeIcon(javax.swing.JLabel label_home){
        try{
            img = ImageIO.read(new File("src/icons/home.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_home.getWidth(), label_home.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_home.setIcon(reg_icon);
    }      
    public void getExitIcon(javax.swing.JLabel label_exit){
        try{
            img = ImageIO.read(new File("src/icons/cancel.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_exit.getWidth(), label_exit.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_exit.setIcon(reg_icon);
    }
    public void getAddBookIcon(javax.swing.JLabel label_add_book){
        try{
            img = ImageIO.read(new File("src/icons/add-book-2.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_add_book.getWidth(), label_add_book.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_add_book.setIcon(reg_icon);
    }
    public void getSearchBookIcon(javax.swing.JLabel label_search_book){
        try{
            img = ImageIO.read(new File("src/icons/search-book.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_search_book.getWidth(), label_search_book.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_search_book.setIcon(reg_icon);
    }
    public void getUserIcon(javax.swing.JLabel label_reg_user){
        try{
            img = ImageIO.read(new File("src/icons/user-3.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_reg_user.getWidth(), label_reg_user.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_reg_user.setIcon(reg_icon);        
    }
    public void getBookIcon(javax.swing.JLabel label_reg_book){
        try{
            img = ImageIO.read(new File("src/icons/add-book.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        dimg = img.getScaledInstance(label_reg_book.getWidth(), label_reg_book.getHeight(), Image.SCALE_SMOOTH);
        reg_icon = new ImageIcon(dimg);
        label_reg_book.setIcon(reg_icon);
    }
    public void getStaffIcon(javax.swing.JLabel label_reg_staff){
        try{
            img = ImageIO.read(new File("src/icons/group.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_reg_staff.getWidth(), label_reg_staff.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_reg_staff.setIcon(reg_icon);
    }
    public void getIssueBookIcon(javax.swing.JLabel label_issue_book){
        try{
            img = ImageIO.read(new File("src/icons/double-chevron-right.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_issue_book.getWidth(), label_issue_book.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_issue_book.setIcon(reg_icon);
    }
    public void getReturnBookIcon(javax.swing.JLabel label_return_book){
        try{
            img = ImageIO.read(new File("src/icons/double-chevron-left.png"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        
        dimg = img.getScaledInstance(label_return_book.getWidth(), label_return_book.getHeight(), Image.SCALE_SMOOTH);        
        reg_icon = new ImageIcon(dimg);        
        label_return_book.setIcon(reg_icon);
    }
    public void getLogoutIcon(javax.swing.JLabel label_logout){
        try{
            img = ImageIO.read(new File("src/icons/logout.png"));
        } catch (IOException ex) {
            Logger.getLogger(ConvertToIcons.class.getName()).log(Level.SEVERE, null, ex);
        }
        dimg = img.getScaledInstance(label_logout.getWidth(), label_logout.getHeight(), Image.SCALE_SMOOTH);
        reg_icon = new ImageIcon(dimg);
        label_logout.setIcon(reg_icon);
    }

    @Override
    public void disposeOfAll() {
        this.dimg = null;
        this.img = null;
        this.reg_icon = null;
    }
}
