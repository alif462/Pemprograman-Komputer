/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource;
import java.io.Serializable;
import javax.swing.ImageIcon;
/**
 *
 * @author Lenovo
 */
public class Data implements Serializable {
    
    /**
     * @param args the command line arguments
     */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return name;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    private String status;
    private ImageIcon image;
    private byte[] file;
    private String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
