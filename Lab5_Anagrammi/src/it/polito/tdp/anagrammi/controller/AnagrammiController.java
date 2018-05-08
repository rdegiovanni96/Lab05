package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtCorretto;

    @FXML
    private TextArea txtErrato;

    @FXML
    private Button btnReset;

    @FXML
    void doCalcola(ActionEvent event) {
    		txtErrato.clear();
    		txtCorretto.clear();
    		String parola = txtParola.getText();
    		String parziale = "";
    		int livello = 0;
    		for(String s  : model.getAnagrammi(parola)) {
    			if(model.isCorrect(s))
    			txtCorretto.appendText(s+"\n");
    			else 
    				txtErrato.appendText(s+"\n");
    		}
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    		txtParola.clear();
    		txtErrato.clear();
    		txtCorretto.clear();

    }
    
    public void setModel(Model model) {
    		this.model = model;
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtCorretto != null : "fx:id=\"txtCorretto\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtErrato != null : "fx:id=\"txtErrato\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}
