package ch.fabiankurt.ka;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class Controller {

	// Button
		@FXML 
		public Button exportbu;
		@FXML 
		public Button ladenbu;


	//Exportieren
		@FXML
		protected void export(ActionEvent event) {
/*
			//To open a file using FileChooser first we create a new FileChooser 
			FileChooser fileChooser = new FileChooser();
			//TO set a title to the fileChooser 
			fileChooser.setTitle("Choose a File");
			Window stage = null;
			//TO show the popup window for opening file.
			fileChooser.showOpenDialog(stage);
			//System.printline.Out("");
			*/
			 try{		
			        System.out.println("Create Simple PDF file with Text");
			        String fileName = "PdfTest.pdf"; // Name			    
			        PDDocument doc = new PDDocument();
			        
			        
			        for(int z = 1; z < Main.monat.size();z++){
			       
			        PDPage page = new PDPage(PDRectangle.A4);
			        doc.addPage(page);
			        PDPageContentStream content = new PDPageContentStream(doc, page);		    
			        content.beginText();
			        content.setFont(PDType1Font.HELVETICA, 26);
			        content.moveTextPositionByAmount(220, 750);
			        content.drawString(Main.monat.get(z));
			        content.endText();
			        
        
			        content.close();
			        }
			       
			        doc.save(fileName);
			        doc.close();
			        
			        System.out.println("your file created in : "+ System.getProperty("user.dir"));

			        }
			        catch(Exception e){
			        
			        System.out.println(e.getMessage());
			        
			        }

		
			    
			    
		}
}
