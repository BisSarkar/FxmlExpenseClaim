/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenseClaims;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ClaimExpenseController implements Initializable {

     @FXML
    private TextField txtEmpName;

    @FXML
    private TextField txtClaimAmt;

     @FXML
    private Label lblAmtRcv;

    @FXML
    private Label lblEmpName;
    
     @FXML
    private Label lblblank;
      @FXML
    private Label lblblank1;
    
    

    @FXML
    private Label lblClaimAmt;
    
       @FXML
    private Label lblRecAmt;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        lblEmpName.setText("Employee Name");
        lblClaimAmt.setText("Expense Claim Amount($)");
    }  
    
     @FXML
    private void calculate(ActionEvent event) {
        
        int amount=Integer.parseInt(txtClaimAmt.getText());
        double amt;
        if(amount<100)
        {
            amt=amount*.67;
            
        }else 
        {
          
             amt=(100*.67)+(amount-100)*.38;
            
            
        }
        lblAmtRcv.setText("Amount To Receive: ");
        lblRecAmt.setText(txtEmpName.getText() + " will receive $"+ amt);
        

    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);


    }
    
}
