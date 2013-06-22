package com.jugvale.login.app;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button btEntrar;

	private static final String BACKGROUND_CSS = "-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);";

	@Override
	public void start(Stage stage) throws Exception {
		pane = new AnchorPane();
		pane.setStyle(BACKGROUND_CSS);
		Scene scene = new Scene(pane, 400, 300);
		stage.setScene(scene);
		stage.setTitle("Login na raça");
		stage.show();
		initComponents();
		initListeners();
	}

	private void initComponents() {
		txLogin = new TextField();
		txLogin.setEffect(new DropShadow());
		txLogin.setLayoutX(130);
		txLogin.setLayoutY(50);
		txLogin.setPromptText("Digite seu login");
		txSenha = new PasswordField();
		txSenha.setEffect(new DropShadow());
		txSenha.setLayoutX(130);
		txSenha.setLayoutY(150);
		txSenha.setPromptText("Digite sua senha");
		btEntrar = new Button("Entrar");
		btEntrar.setEffect(new Reflection());
		btEntrar.setLayoutX(180);
		btEntrar.setLayoutY(250);
		pane.getChildren().addAll(txLogin, txSenha, btEntrar);
	}

	private void initListeners() {
		btEntrar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent evt) {
				if (txLogin.getText().equals("jugvale")
						&& txSenha.getText().equals("jugvale")) {
					JOptionPane.showMessageDialog(null, "Bem-vindo usuário!");
				} else {
					JOptionPane.showMessageDialog(null,
							"Login e/ou senha inválidos");
				}
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}

}