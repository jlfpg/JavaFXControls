package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controlador {
	@FXML
	private Button izq;
	@FXML
	private Button der;

	@FXML
	private ListView<String> lista;
	@FXML
	private ListView<String> lista1;
	public String seleccionado;

	ObservableList<String> tabla1 = FXCollections.observableArrayList("a", "b");
	ObservableList<String> tabla2 = FXCollections.observableArrayList();

	public void initialize() {
		lista.setItems(this.tabla1);
		lista1.setItems(this.tabla2);

	}

	public void Add() {
		seleccionado = (String) lista.getSelectionModel().getSelectedItem();
		if (seleccionado != null) {
			tabla2.add(seleccionado);
			tabla1.remove(seleccionado);
			lista.setItems(tabla1);
			lista1.setItems(tabla2);
		}
	}

	public void Eliminiar() {
		seleccionado = (String) lista1.getSelectionModel().getSelectedItem();
		if (seleccionado != null) {
			tabla1.add(seleccionado);
			tabla2.remove(seleccionado);
			lista.setItems(tabla1);
			lista1.setItems(tabla2);
		}
	}
}
