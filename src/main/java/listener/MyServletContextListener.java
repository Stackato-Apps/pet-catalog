package listener;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.ejb.EJB;
import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import controller.ItemFacade;

/**
 * Populate the database
 * @author jeremya
 *
 */
public class MyServletContextListener implements ServletContextListener {

	@EJB
	private ItemFacade itemFacade;

	@Override
	public void contextDestroyed(ServletContextEvent servlet) {

	}

	@Override
	public void contextInitialized(ServletContextEvent servlet) {
		String currentDir = servlet.getServletContext().getRealPath(".");
		String catalogUrl = currentDir + "/WEB-INF/classes/catalog.sql";
		
		File file = new File(catalogUrl);
		
        try {
 
            Scanner scanner = new Scanner(file);
 
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                itemFacade.executeQuety(line);
            }
            scanner.close();
        } 
        catch (FileNotFoundException e) {
        	servlet.getServletContext().log("File: "+ catalogUrl +" not found");
        } 
        catch (EntityExistsException e){
        	servlet.getServletContext().log("This entity already exists in the database");
        }
        catch (PersistenceException e){
        	servlet.getServletContext().log(e.getMessage());
        }
        catch (Exception e){
        	if(e.getMessage().contains("Duplicate entry"))
        		servlet.getServletContext().log("This entity already exists in the database");
        	else
        		servlet.getServletContext().log(e.getMessage());
        }
	}

}
