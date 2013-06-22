package com.jugvale.login.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;

public class LoginController implements Initializable {

	@FXML
	private TextField txLogin;
	@FXML
	private PasswordField txSenha;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txLogin.setCursor(Cursor.HAND);
		txLogin.setEffect(new DropShadow());
	}

	@FXML
	protected void btEntrarAction(ActionEvent evt) {
		if (txLogin.getText().equals("jugvale")
				&& txSenha.getText().equals("jugvale")) {
			JOptionPane.showMessageDialog(null, "Bem-vindo usuário!");
		} else {
			JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos");
		}
	}

}
