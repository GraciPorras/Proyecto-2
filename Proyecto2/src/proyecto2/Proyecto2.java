
package proyecto2;

import javafx.application.Application;

import javafx.stage.Stage;


public class Proyecto2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        InterfazMenuAgenda ima= new InterfazMenuAgenda();
        
        primaryStage.setTitle("Agenda");
        primaryStage.setScene(ima.getEscenaMenu());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
