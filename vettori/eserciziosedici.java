package it.edu.iisgubbio.vettori;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class eserciziosedici extends Application {
	int vettore[];
	TextField tNumero = new TextField();
	TextField tK = new TextField();
	Label lRis = new Label();
	int contatore = 0;

	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Button pCalcola = new Button("calcola");
		Label lnum = new Label("vettore");
		Label lK = new Label("K");

		griglia.add(lnum, 1, 0);
		griglia.add(tNumero, 0, 0);
		griglia.add(lK, 1, 1);
		griglia.add(tK, 0, 1);
		griglia.add(pCalcola, 0, 2);
		griglia.add(lRis, 0, 3);

		griglia.setPadding(new Insets(20));
		griglia.setHgap(20);
		griglia.setVgap(20);
		pCalcola.setOnAction(e -> calcola());

		Scene scena = new Scene(griglia);
		finestra.setTitle("16-");
		finestra.setScene(scena);
		finestra.show();
	}

	public void calcola() {
		int c = Integer.parseInt(tK.getText());
		int v = 0;
		int m = 0;
		String s[];
		s = tNumero.getText().split("-");
		vettore = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			vettore[i] = Integer.parseInt(s[i]);
		}
		for (int b = 0; b < vettore.length; b++) {
			if (vettore[b] > c) {
				contatore++;
			}
		}
		if (contatore > 1) {
			lRis.setText("il vettore contiene almeno un numero maggiore");
		} else {
			lRis.setText("il vettore non contiene almeno un numero maggiore");
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}