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
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("Nama");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nim"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getItems().add(new Mahasiswa(1, "123410", "Alanjueno"));
        tabel.getItems().add(new Mahasiswa(2, "123573", "Beuno"));
        tabel.getItems().add(new Mahasiswa(3, "123522", "Capueno"));
        tabel.getItems().add(new Mahasiswa(4, "123634", "Demuno"));
        tabel.getItems().add(new Mahasiswa(5, "132543", "Elantonio"));
        tabel.getItems().add(new Mahasiswa(6, "123523", "Felipino"));
        tabel.getItems().add(new Mahasiswa(7, "123542", "Geronimo"));
        tabel.getItems().add(new Mahasiswa(8, "123214", "Hipoueno"));
        tabel.getItems().add(new Mahasiswa(9, "123452", "Inoueo"));
        tabel.getItems().add(new Mahasiswa(10, "123511", "Jemimalopueno"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
