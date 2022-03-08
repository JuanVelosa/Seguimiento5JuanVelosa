package control;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WindowB implements Initializable {

	private String[] types = { "GASTO", "INGRESO" };
	@FXML
	private Button acceptBTN;

	@FXML
	private TextField dateTF;

	@FXML
	private TextArea descTF;

	@FXML
	private TextField typeTF;

	@FXML
	private ChoiceBox<String> typeCB;

	@FXML
	private TextField valueTF;

	@FXML
	void registerMoveBTN(ActionEvent event) {

		if (confirmDouble(dateTF.getText())) {
			double value = Double.parseDouble(valueTF.getText());
		} else {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Dato erróneo!");
			alert.setContentText("No puede agregar un monto con valores no admitidos");
			Optional<ButtonType> result = alert.showAndWait();

			clear();
		}
		Date date = confirmDate(dateTF.getText());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		completeCB();
	}

	public void completeCB() {
		typeCB.getItems().addAll(types);
	}

	
	public Date confirmDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date f = new Date();
		// crear excepcion para la siguiente parte
		try {
			f = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Dato erróneo!");
			alert.setContentText("El dato ingresado no tiene formato de fecha (yyyy-MM-dd)");
			Optional<ButtonType> result = alert.showAndWait();

			clear();
		}
		return f;

	}

	
	public boolean confirmDouble(String value) {

		boolean out = true;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) != '.' && value.charAt(i) != '1' && value.charAt(i) != '2' && value.charAt(i) != '3'
					&& value.charAt(i) != '4' && value.charAt(i) != '5' && value.charAt(i) != '6'
					&& value.charAt(i) != '7' && value.charAt(i) != '8' && value.charAt(i) != '9'
					&& value.charAt(i) != '0') {
				out = false;
				break;
			}
		}
		return out;
	}

	public void clear() {
		dateTF.setText("");
		descTF.setText("");
		valueTF.setText("");
		typeTF.setText("");
	}

}