package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gusti Muhammad Naufal Razin");
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("ID");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("id"));
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolom3 = new TableColumn<>("NIM");
        kolom3.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getColumns().add(kolom3);

        tabel.getItems().add(
                new Mahasiswa(1, "Aliyah","221081722001" ));
        tabel.getItems().add(
                new Mahasiswa(2, "Bella","221081722002"));
        tabel.getItems().add(
                new Mahasiswa(3, "Caca", "221081722003"));
        tabel.getItems().add(
                new Mahasiswa(4, "Davina", "221081722004"));
        tabel.getItems().add(
                new Mahasiswa(5, "Erina", "221081722005"));
        tabel.getItems().add(
                new Mahasiswa(6, "Febby", "221081722006"));
        tabel.getItems().add(
                new Mahasiswa(7, "Gina", "221081722007"));
        tabel.getItems().add(
                new Mahasiswa(8, "Halimah", "221081722008"));
        tabel.getItems().add(
                new Mahasiswa(9, "Intan", "221081722009"));
        tabel.getItems().add(
                new Mahasiswa(10, "Jasjus", "221081722010"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}