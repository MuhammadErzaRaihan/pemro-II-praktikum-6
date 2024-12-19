package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
    	
        TableView<Mahasiswa> table = new TableView<>();

        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        table.getColumns().add(nimColumn);
        table.getColumns().add(namaColumn);

        table.getItems().addAll(
            new Mahasiswa("121", "Budiono Siregar"),
            new Mahasiswa("122", "Adul"),
            new Mahasiswa("123", "Dono"),
            new Mahasiswa("124", "Emon"),
            new Mahasiswa("125", "Ikin"),
            new Mahasiswa("126", "Fani"),
            new Mahasiswa("127", "Gilang"),
            new Mahasiswa("128", "Haryono"),
            new Mahasiswa("129", "Cece"),
            new Mahasiswa("120", "Joko")
        );

        VBox vbox = new VBox(table);

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
