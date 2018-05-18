/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlfeldolgozas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cd;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Safi
 */
public class XMLFeldolgozas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SAXBuilder builder = new SAXBuilder();
            File file = new File ("c:/progs/cd_catalog.xml");
        try {
            Document document = builder.build(file);
            Element root = document.getRootElement();
            List  <Cd> cds = new ArrayList<>();
            List <Element> xmlCDs = root.getChildren();
            
            
            for (Element e : xmlCDs) {
                
                
                Cd cd = new Cd(e.getChildText("TITLE"),e.getChildText("ARTIST"),e.getChildText("COUNTRY"),e.getChildText("COMPANY"), Double.parseDouble(e.getChildText("PRICE")),Integer.parseInt(e.getChildText("YEAR")));

            cds.add(cd);
            }
            
            for (Cd  c : cds) {
                System.out.println(c);
                System.out.println(c.getArtist());
                
            }
            
            
            
        } catch (JDOMException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
                    
                    
            
    }
    
}
