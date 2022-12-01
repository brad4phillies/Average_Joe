import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application 
{ 
  
  @Override
  public void start(Stage stage) {

    //Creating a Button
      Button button = new Button();
      //Setting text to the button
      button.setText("Invisible?");
    button.setStyle("-fx-background-color: #ffffff00");
      //Setting the location of the button
      button.setTranslateX(200);
      button.setTranslateY(150);

    Button button2 = new Button();
      //Setting text to the button
      button2.setText("Invisible2?");
    button2.setStyle("-fx-background-color: #ffffff00");
      //Setting the location of the button
      button2.setTranslateX(100);
      button2.setTranslateY(50);
    button2.setVisible(false);

    
      //Setting the stage
    
     Group root = new Group(button, button2);
      Scene scene = new Scene(root, 400, 200, Color.BEIGE);
      stage.setTitle("Main Screen");
      stage.setScene(scene);
      stage.show();

    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.RED);
        button.setVisible(false);
        
        button2.setVisible(true);

      }
    });

    button2.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.BEIGE);
        button.setVisible(true);
        
        button2.setVisible(false);

      }
    });

    
  }


  // public void start(Stage stage) throws FileNotFoundException {         
  //     //Creating an image 
  //     Image image = new Image(new FileInputStream("C:\Users\bdavis377\Downloads\House.jpg"));  
      
  //     //Setting the image view 
  //     ImageView imageView = new ImageView(image); 
      
  //     //Setting the position of the image 
  //     imageView.setX(50); 
  //     imageView.setY(25); 
      
  //     //setting the fit height and width of the image view 
  //     imageView.setFitHeight(455); 
  //     imageView.setFitWidth(500); 
      
  //     //Setting the preserve ratio of the image view 
  //     imageView.setPreserveRatio(true);  
      
  //     //Creating a Group object  
  //     Group root = new Group(imageView);  
      
  //     //Creating a scene object 
  //     Scene scene = new Scene(root, 600, 500);  
      
  //     //Setting title to the Stage 
  //     stage.setTitle("Loading an image");  
      
  //     //Adding scene to the stage 
  //     stage.setScene(scene);
      
  //     //Displaying the contents of the stage 
  //     stage.show(); 
  //  }  
    
  public static void main(String[] args) {
    launch(args);
  }
} 
