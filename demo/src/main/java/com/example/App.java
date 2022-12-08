package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*; 
import java.math.BigDecimal;
import javafx.scene.transform.Translate;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public static BigDecimal money = new BigDecimal("0");
  public static int health = 100;
  public static int day = 1;
  public static String name = "Joe Smith";
  public static int hours = 24;
  public static BigDecimal bank = new BigDecimal("0");
  public static String job = "McDonalds";
  public static int ranJob = 0;
  public static int ranComputer = 0;
  public static int value = 0;

    @Override
    public void start(Stage stage) throws IOException {
        Label MoneyLabel = new Label();
    Label placeHolder = new Label();
    Label NameLabel = new Label();
    Label HealthLabel = new Label();
    Label DayLabel = new Label();
    Label HoursLabel = new Label();
    Label BankLabel = new Label();
    VBox labelVBox = new VBox(NameLabel, HoursLabel, DayLabel, MoneyLabel, HealthLabel, BankLabel);
    HBox labelHBox = new HBox( placeHolder, labelVBox);

    TextField nameTF = new TextField("What is your name?");
    nameTF.setPrefWidth(200);
    nameTF.setPrefHeight(50);
    

    Button nameEnter = new Button();
    Button toWork = new Button();
    Button toFun = new Button();
    Button Hospital = new Button();
    Button Casino = new Button();
    Button Bank = new Button();
    Button Computer = new Button();
    Button Target = new Button();
    Button McD = new Button();
    Button Slots = new Button();
    Button Blackjack = new Button();
    Button Lottery = new Button();
    Button Surgery = new Button();
    Button Emergency = new Button();
    Button Appointment = new Button();
    Button back = new Button();
    Button BankWithdraw = new Button();
    Button BankDeposit = new Button();
    Button McDonalds = new Button();
    Button TargetWork = new Button();
    Button TargetApply = new Button();
    Button Computer1 = new Button();
    Button Computer2 = new Button();
    Button Computer3 = new Button();
    Button Computer4 = new Button();
    Button BankWithdrawRaise = new Button();
    Button BankWithdrawLower = new Button();
    Button BankDepositRaise = new Button();
    Button BankDepositLower = new Button();
    Button BankDepositConfirm = new Button();
    Button BankWithdrawConfirm = new Button();

    Button BankWithdrawLabel = new Button();
    Button BankDepositLabel = new Button();


        //Creating an image 
      Image image = new Image("file:AverageJoeDay.jpg");  
      ImageView AVJFun = new ImageView(image); 
      AVJFun.setX(0); 
      AVJFun.setY(0); 
      AVJFun.setFitHeight(600); 
      AVJFun.setFitWidth(800); 
      AVJFun.setPreserveRatio(true); 
    AVJFun.setVisible(false);

    Image image00 = new Image("file:AverageJoeNight.jpg");  
      ImageView AVJFunNight = new ImageView(image00); 
      AVJFunNight.setX(0); 
      AVJFunNight.setY(0); 
      AVJFunNight.setFitHeight(600); 
      AVJFunNight.setFitWidth(800); 
      AVJFunNight.setPreserveRatio(true); 
      AVJFunNight.setVisible(false);

    Image image2 = new Image("file:AverageJoeWorkDay.jpg");  
      ImageView AVJWork = new ImageView(image2); 
      AVJWork.setX(0); 
      AVJWork.setY(0); 
      AVJWork.setFitHeight(600); 
      AVJWork.setFitWidth(800); 
      AVJWork.setPreserveRatio(true);  
    AVJWork.setVisible(false);

    Image image200 = new Image("file:AverageJoeWorkNight.jpg");  
      ImageView AVJWorkNight = new ImageView(image200); 
      AVJWorkNight.setX(0); 
      AVJWorkNight.setY(0); 
      AVJWorkNight.setFitHeight(600); 
      AVJWorkNight.setFitWidth(800); 
      AVJWorkNight.setPreserveRatio(true);  
      AVJWorkNight.setVisible(false);
    
    Image image3 = new Image("file:Casino.jpg");  
      ImageView CasinoIMG = new ImageView(image3); 
      CasinoIMG.setX(0); 
      CasinoIMG.setY(0); 
      CasinoIMG.setFitHeight(600); 
      CasinoIMG.setFitWidth(800); 
      CasinoIMG.setPreserveRatio(true);  
    CasinoIMG.setVisible(false);

    Image image4 = new Image("file:Slots.jpg");  
      ImageView SlotsIMG = new ImageView(image4); 
      SlotsIMG.setX(0); 
      SlotsIMG.setY(0); 
      SlotsIMG.setFitHeight(600); 
      SlotsIMG.setFitWidth(800); 
      SlotsIMG.setPreserveRatio(true);  
    SlotsIMG.setVisible(false);
    
    Image image5 = new Image("file:BlackJack.jpg");  
      ImageView BlackJackIMG = new ImageView(image5); 
      BlackJackIMG.setX(0); 
      BlackJackIMG.setY(0); 
      BlackJackIMG.setFitHeight(600); 
      BlackJackIMG.setFitWidth(800); 
      BlackJackIMG.setPreserveRatio(true);  
    BlackJackIMG.setVisible(false);

    Image image6 = new Image("file:Lottery.jpg");  
      ImageView LotteryIMG = new ImageView(image6); 
      LotteryIMG.setX(0); 
      LotteryIMG.setY(0); 
      LotteryIMG.setFitHeight(600); 
      LotteryIMG.setFitWidth(800); 
      LotteryIMG.setPreserveRatio(true);  
    LotteryIMG.setVisible(false);
    
    Image image7 = new Image("file:Hospital.jpg");  
      ImageView HospitalIMG = new ImageView(image7); 
      HospitalIMG.setX(0); 
      HospitalIMG.setY(0); 
      HospitalIMG.setFitHeight(600); 
      HospitalIMG.setFitWidth(800); 
      HospitalIMG.setPreserveRatio(true);  
    HospitalIMG.setVisible(false);
    
    Image image8 = new Image("file:Surgery.jpg");  
      ImageView SurgeryIMG = new ImageView(image8); 
      SurgeryIMG.setX(0); 
      SurgeryIMG.setY(0); 
      SurgeryIMG.setFitHeight(600); 
      SurgeryIMG.setFitWidth(800); 
      SurgeryIMG.setPreserveRatio(true);  
    SurgeryIMG.setVisible(false);
    
    Image image9 = new Image("file:Appointment.jpg");  
      ImageView AppointmentIMG = new ImageView(image9); 
      AppointmentIMG.setX(0); 
      AppointmentIMG.setY(0); 
      AppointmentIMG.setFitHeight(600); 
      AppointmentIMG.setFitWidth(800); 
      AppointmentIMG.setPreserveRatio(true);  
    AppointmentIMG.setVisible(false);
    
    Image image10 = new Image("file:Emergency.jpg");  
      ImageView EmergencyIMG = new ImageView(image10); 
      EmergencyIMG.setX(0); 
      EmergencyIMG.setY(0); 
      EmergencyIMG.setFitHeight(600); 
      EmergencyIMG.setFitWidth(800); 
      EmergencyIMG.setPreserveRatio(true);  
    EmergencyIMG.setVisible(false);

    Image image11 = new Image("file:Bank.jpg");  
      ImageView BankIMG = new ImageView(image11); 
      BankIMG.setX(0); 
      BankIMG.setY(0); 
      BankIMG.setFitHeight(600); 
      BankIMG.setFitWidth(800); 
      BankIMG.setPreserveRatio(true);  
    BankIMG.setVisible(false);

    Image image12 = new Image("file:BankWithdraw.jpg");  
      ImageView BankWithdrawIMG = new ImageView(image12); 
      BankWithdrawIMG.setX(0); 
      BankWithdrawIMG.setY(0); 
      BankWithdrawIMG.setFitHeight(600); 
      BankWithdrawIMG.setFitWidth(800); 
      BankWithdrawIMG.setPreserveRatio(true);  
    BankWithdrawIMG.setVisible(false);

    Image image13 = new Image("file:BankDeposit.jpg");  
      ImageView BankDepositIMG = new ImageView(image13); 
      BankDepositIMG.setX(0); 
      BankDepositIMG.setY(0); 
      BankDepositIMG.setFitHeight(600); 
      BankDepositIMG.setFitWidth(800); 
      BankDepositIMG.setPreserveRatio(true);  
    BankDepositIMG.setVisible(false);

    Image image14 = new Image("file:ComputerApply.jpg");  
      ImageView ComputerApplyIMG = new ImageView(image14); 
      ComputerApplyIMG.setX(0); 
      ComputerApplyIMG.setY(0); 
      ComputerApplyIMG.setFitHeight(600); 
      ComputerApplyIMG.setFitWidth(800); 
      ComputerApplyIMG.setPreserveRatio(true);  
    ComputerApplyIMG.setVisible(false);

    Image image15 = new Image("file:ComputerWork.jpg");  
      ImageView ComputerWorkIMG = new ImageView(image15); 
      ComputerWorkIMG.setX(0); 
      ComputerWorkIMG.setY(0); 
      ComputerWorkIMG.setFitHeight(600); 
      ComputerWorkIMG.setFitWidth(800); 
      ComputerWorkIMG.setPreserveRatio(true);  
    ComputerWorkIMG.setVisible(false);

    Image image16 = new Image("file:TargetApply.jpg");  
      ImageView TargetApplyIMG = new ImageView(image16); 
      TargetApplyIMG.setX(0); 
      TargetApplyIMG.setY(0); 
      TargetApplyIMG.setFitHeight(600); 
      TargetApplyIMG.setFitWidth(800); 
      TargetApplyIMG.setPreserveRatio(true);  
    TargetApplyIMG.setVisible(false);

    Image image17 = new Image("file:TargetWork.jpg");  
      ImageView TargetWorkIMG = new ImageView(image17); 
      TargetWorkIMG.setX(0); 
      TargetWorkIMG.setY(0); 
      TargetWorkIMG.setFitHeight(600); 
      TargetWorkIMG.setFitWidth(800); 
      TargetWorkIMG.setPreserveRatio(true);  
    TargetWorkIMG.setVisible(false);

    Image image18 = new Image("file:McDonaldsWork.jpg");  
      ImageView McDonaldsWorkIMG = new ImageView(image18); 
      McDonaldsWorkIMG.setX(0); 
      McDonaldsWorkIMG.setY(0); 
      McDonaldsWorkIMG.setFitHeight(600); 
      McDonaldsWorkIMG.setFitWidth(800); 
      McDonaldsWorkIMG.setPreserveRatio(true);  
    McDonaldsWorkIMG.setVisible(false);
    
    

    
      //Setting the stage
    
     Group root = new Group(nameTF, nameEnter, AVJFun, AVJFunNight, AVJWork, AVJWorkNight,toWork, toFun, Hospital, Casino, Bank, Computer,  Target,  McD, CasinoIMG, Slots, Blackjack, Lottery, SlotsIMG, BlackJackIMG, LotteryIMG, EmergencyIMG, AppointmentIMG, SurgeryIMG, HospitalIMG,  Appointment, Surgery, Emergency, McDonaldsWorkIMG, TargetApplyIMG, TargetWorkIMG, ComputerApplyIMG, ComputerWorkIMG, BankIMG, BankWithdrawIMG, BankDepositIMG, BankWithdraw, BankDeposit, BankWithdrawRaise, BankWithdrawLower,BankWithdrawLabel, BankDepositRaise, BankDepositLower, BankDepositLabel,BankDepositConfirm, BankWithdrawConfirm, Computer1,Computer2, Computer3, Computer4, McDonalds,  TargetWork, TargetApply, back, labelHBox);
      Scene scene = new Scene(root, 800, 600, Color.BEIGE);
      stage.setTitle("Main Screen");
      stage.setScene(scene);
      stage.show();


    labelHBox.setVisible(false);
    MoneyLabel.setText("Money on Hand: " + money);
    MoneyLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    DayLabel.setText("Day: " + day);
    DayLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    HoursLabel.setText("Hours Left: " + hours);
    HoursLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    HealthLabel.setText("Health: " + health);
    HealthLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    BankLabel.setText("Money in Account: " + bank);
    BankLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    NameLabel.setText("Name: " + name);
    NameLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            
    



toWork.setVisible(false);
  toFun.setVisible(false);
    back.setVisible(false);
    nameEnter.setText("Enter Name");
    nameEnter.setStyle("-fx-border-color: #ffffff");
      nameEnter.setTranslateX(250);
      nameEnter.setTranslateY(0);
    nameEnter.setPrefWidth(200);
    nameEnter.setPrefHeight(50);
    nameEnter.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    nameEnter.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        name = nameTF.getText();
      }
        });



      

    
toWork.setText("9 to 5 Street");
    toWork.setStyle("-fx-border: 120px solid; -fx-background-color: #33b65b; -fx-border-color: #ffffff");
      toWork.setTranslateX(575);
      toWork.setTranslateY(20);
    toWork.setPrefWidth(200);
    toWork.setPrefHeight(60);
    toWork.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    toWork.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.RED);
        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJFunNight.setVisible(false);
        toFun.setVisible(true);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(true);
        Computer.setVisible(true);
        Target.setVisible(true);
        if(hours > 12){
            AVJWork.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJWorkNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }

        if(hours > 6){
        hours -= 1;
        }else{
          hours = 24;
          if(day < 7){
          day += 1;
          } else{
            
          }
        }


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

     toFun.setText("NW Fun Drive");
    toFun.setStyle("-fx-border: 120px solid; -fx-background-color: #33b65b; -fx-border-color: #ffffff");
      toFun.setTranslateX(575);
      toFun.setTranslateY(20);
    toFun.setPrefWidth(200);
    toFun.setPrefHeight(60);
    toFun.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    toFun.setVisible(false);
    toFun.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);

        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }

        if(hours > 6){
        hours -= 1;
        }else{
          hours = 24;
          if(day < 7){
          day += 1;
          } else{
            
          }
        }


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
        

      }
    });

    


    Hospital.setStyle("-fx-background-color: #ffffff00");
      Hospital.setTranslateX(500);
      Hospital.setTranslateY(300);
    Hospital.setPrefWidth(200);
    Hospital.setPrefHeight(300);
    Hospital.setVisible(true);
    Hospital.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJWork.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(true);
        Surgery.setVisible(true);
        Emergency.setVisible(true);
        Appointment.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(false);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
            NameLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
            HoursLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
            DayLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
            BankLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
            HealthLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");

      }
    });

    Casino.setStyle("-fx-background-color: #ffffff00");
      Casino.setTranslateX(100);
      Casino.setTranslateY(370);
    Casino.setPrefWidth(225);
    Casino.setPrefHeight(200);
    Casino.setVisible(true);
    Casino.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        hours -= 1;
        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJWork.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        CasinoIMG.setVisible(true);
        Slots.setVisible(true);
        Blackjack.setVisible(true);
        Lottery.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(false);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
    MoneyLabel.setTextFill(Color.BLACK);
    NameLabel.setTextFill(Color.BLACK);
    HoursLabel.setTextFill(Color.BLACK);
    DayLabel.setTextFill(Color.BLACK);
    BankLabel.setTextFill(Color.BLACK);
    HealthLabel.setTextFill(Color.BLACK);
        
    MoneyLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
    NameLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
    HoursLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
    DayLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
    BankLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
    HealthLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        

      }
    });

    Bank.setStyle("-fx-background-color: #ffffff00");
      Bank.setTranslateX(425);
      Bank.setTranslateY(320);
    Bank.setPrefWidth(75);
    Bank.setPrefHeight(100);
    Bank.setVisible(true);
    Bank.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        hours -= 1;

        BankIMG.setVisible(true);

        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJWork.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        BankWithdraw.setVisible(true);
        BankDeposit.setVisible(true);
        MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
    MoneyLabel.setTextFill(Color.BLACK);
    NameLabel.setTextFill(Color.BLACK);
    HoursLabel.setTextFill(Color.BLACK);
    DayLabel.setTextFill(Color.BLACK);
    BankLabel.setTextFill(Color.BLACK);
    HealthLabel.setTextFill(Color.BLACK);
        
        MoneyLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        NameLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        HoursLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        DayLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        BankLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        HealthLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");

      }
    });


    Target.setStyle("-fx-background-color: #ffffff00");
      Target.setTranslateX(500);
      Target.setTranslateY(300);
    Target.setPrefWidth(200);
    Target.setPrefHeight(300);
    Target.setVisible(false);
    Target.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        ranJob = (int)(Math.random()*10);
        if(ranJob > 5){
          job = "Target";
        }

        

        if(job == "Target"){
        TargetWorkIMG.setVisible(true);
        }else{
        TargetApplyIMG.setVisible(true);
        }

        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJWork.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        MoneyLabel.setTextFill(Color.BLACK);
        NameLabel.setTextFill(Color.BLACK);
        HoursLabel.setTextFill(Color.BLACK);
        DayLabel.setTextFill(Color.BLACK);
        BankLabel.setTextFill(Color.BLACK);
        HealthLabel.setTextFill(Color.BLACK);
        TargetWork.setVisible(true);
        
        MoneyLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        NameLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        HoursLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        DayLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        BankLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        HealthLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");

        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);

      }
    });

    Computer.setStyle("-fx-background-color: #ffffff00");
      Computer.setTranslateX(100);
      Computer.setTranslateY(370);
    Computer.setPrefWidth(225);
    Computer.setPrefHeight(200);
    Computer.setVisible(false);
    Computer.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        ranComputer = (int)(Math.random()*4);

        ranJob = (int)(Math.random()*10);
        if(ranJob == 5){
          job = "Computer";
        }

        if (job == "Computer"){
        ComputerWorkIMG.setVisible(true);
        Computer1.setVisible(true);
        Computer2.setVisible(true);
        Computer3.setVisible(true);
        Computer4.setVisible(true);
        }else{
        ComputerApplyIMG.setVisible(true);
        }

        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJWork.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        MoneyLabel.setTextFill(Color.BLACK);
        NameLabel.setTextFill(Color.BLACK);
        HoursLabel.setTextFill(Color.BLACK);
        DayLabel.setTextFill(Color.BLACK);
        BankLabel.setTextFill(Color.BLACK);
        HealthLabel.setTextFill(Color.BLACK);

        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
        
      }
    });

    Computer1.setStyle("-fx-background-color: #ffffff00");
    Computer1.setTranslateX(300);
    Computer1.setTranslateY(150);
    Computer1.setPrefWidth(150);
    Computer1.setPrefHeight(100);
    Computer1.setVisible(false);
    Computer1.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        if(ranComputer == 0){

        BigDecimal comWage = new BigDecimal("250000");
        if(job == "Computer"){
          money = money.add(comWage);
          if(hours > 14){
            hours -= 8;
            }else{
              hours = 24;
              if(day < 7){
                day += 1;
                } else{
                  
                }
            }
        }else{
          hours -= 1;
        }
        
        

        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        labelHBox.setVisible(true);
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
      }else{}

      }
    });

    Computer2.setStyle("-fx-background-color: #ffffff00");
    Computer2.setTranslateX(450);
    Computer2.setTranslateY(150);
    Computer2.setPrefWidth(150);
    Computer2.setPrefHeight(100);
    Computer2.setVisible(false);
    Computer2.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        if(ranComputer == 1){

        BigDecimal comWage = new BigDecimal("250000");
        if(job == "Computer"){
          money = money.add(comWage);
          if(hours > 14){
            hours -= 8;
            }else{
              hours = 24;
              if(day < 7){
                day += 1;
                } else{
                  
                }
            }
        }else{
          hours -= 1;
        }
        
        

        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        labelHBox.setVisible(true);
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
      }else{}

      }
    });

    Computer3.setStyle("-fx-background-color: #ffffff00");
    Computer3.setTranslateX(300);
    Computer3.setTranslateY(250);
    Computer3.setPrefWidth(150);
    Computer3.setPrefHeight(100);
    Computer3.setVisible(false);
    Computer3.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        if(ranComputer == 2){

        BigDecimal comWage = new BigDecimal("250000");
        if(job == "Computer"){
          money = money.add(comWage);
          if(hours > 14){
            hours -= 8;
            }else{
              hours = 24;
              if(day < 7){
                day += 1;
                } else{
                  
                }
            }
        }else{
          hours -= 1;
        }
        
        

        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        labelHBox.setVisible(true);
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
      }else{}

      }
    });

    Computer4.setStyle("-fx-background-color: #ffffff00");
    Computer4.setTranslateX(450);
    Computer4.setTranslateY(250);
    Computer4.setPrefWidth(150);
    Computer4.setPrefHeight(100);
    Computer4.setVisible(false);
    Computer4.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        if(ranComputer == 3){

        BigDecimal comWage = new BigDecimal("250000");
        if(job == "Computer"){
          money = money.add(comWage);
          if(hours > 14){
            hours -= 8;
            }else{
              hours = 24;
              if(day < 7){
                day += 1;
                } else{
                  
                }
            }
        }else{
          hours -= 1;
        }
        
        

        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        labelHBox.setVisible(true);
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
      }else{}

      }
    });

    Slots.setStyle("-fx-background-color: #ffffff00");
      Slots.setTranslateX(50);
      Slots.setTranslateY(45);
    Slots.setPrefWidth(250);
    Slots.setPrefHeight(50);
    Slots.setVisible(false);
    Slots.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Blackjack.setStyle("-fx-background-color: #ffffff00");
      Blackjack.setTranslateX(350);
      Blackjack.setTranslateY(425);
    Blackjack.setPrefWidth(150);
    Blackjack.setPrefHeight(75);
    Blackjack.setVisible(false);
    Blackjack.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        BlackJackIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    McD.setStyle("-fx-background-color: #ffffff00");
      McD.setTranslateX(425);
      McD.setTranslateY(320);
    McD.setPrefWidth(75);
    McD.setPrefHeight(100);
    McD.setVisible(false);
    McD.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {


        McDonaldsWorkIMG.setVisible(true);

        toWork.setVisible(false);
        AVJFun.setVisible(false);
        AVJWork.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        McDonalds.setVisible(true);
        
        MoneyLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        NameLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        HoursLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        DayLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        BankLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");
        HealthLabel.setStyle("-fx-background-color:rgba(255, 255, 255,0.7);");

        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
   MoneyLabel.setTextFill(Color.BLACK);
   NameLabel.setTextFill(Color.BLACK);
   HoursLabel.setTextFill(Color.BLACK);
   DayLabel.setTextFill(Color.BLACK);
   BankLabel.setTextFill(Color.BLACK);
   HealthLabel.setTextFill(Color.BLACK);
   
      }
    });

    McDonalds.setStyle("-fx-background-color: #ffffff00");
    McDonalds.setTranslateX(10);
    McDonalds.setTranslateY(300);
    McDonalds.setPrefWidth(780);
    McDonalds.setPrefHeight(300);
    McDonalds.setVisible(false);
    McDonalds.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        BigDecimal mcDWage = new BigDecimal("50000");
        money = money.add(mcDWage);
        if(hours > 14){
        hours -= 8;
        }else{
          hours = 24;
          if(day < 7){
            day += 1;
            } else{
              
            }
        }

        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        labelHBox.setVisible(true);
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    TargetWork.setStyle("-fx-background-color: #ffffff00");
    TargetWork.setTranslateX(10);
    TargetWork.setTranslateY(200);
    TargetWork.setPrefWidth(780);
    TargetWork.setPrefHeight(350);
    TargetWork.setVisible(false);
    TargetWork.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        BigDecimal TarWage = new BigDecimal("100000");
        if(job == "Target"){
          money = money.add(TarWage);
          if(hours > 14){
            hours -= 8;
            }else{
              hours = 24;
              if(day < 7){
                day += 1;
                } else{
                  
                }
            }
        }else{
          hours -= 1;
        }
        
        

        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        labelHBox.setVisible(true);
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Slots.setStyle("-fx-background-color: #ffffff00");
      Slots.setTranslateX(50);
      Slots.setTranslateY(45);
    Slots.setPrefWidth(250);
    Slots.setPrefHeight(50);
    Slots.setVisible(false);
    Slots.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Blackjack.setStyle("-fx-background-color: #ffffff00");
      Blackjack.setTranslateX(350);
      Blackjack.setTranslateY(425);
    Blackjack.setPrefWidth(150);
    Blackjack.setPrefHeight(75);
    Blackjack.setVisible(false);
    Blackjack.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        BlackJackIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Lottery.setStyle("-fx-background-color: #ffffff00");
      Lottery.setTranslateX(725);
      Lottery.setTranslateY(10);
    Lottery.setPrefWidth(50);
    Lottery.setPrefHeight(200);
    Lottery.setVisible(false);
    Lottery.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        LotteryIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Appointment.setStyle("-fx-background-color: #ffffff00");
      Appointment.setTranslateX(75);
      Appointment.setTranslateY(25);
    Appointment.setPrefWidth(300);
    Appointment.setPrefHeight(50);
    Appointment.setVisible(false);
    Appointment.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        AppointmentIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Surgery.setStyle("-fx-background-color: #ffffff00");
      Surgery.setTranslateX(10);
      Surgery.setTranslateY(400);
    Surgery.setPrefWidth(500);
    Surgery.setPrefHeight(200);
    Surgery.setVisible(false);
    Surgery.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        SurgeryIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    Emergency.setStyle("-fx-background-color: #ffffff00");
      Emergency.setTranslateX(700);
      Emergency.setTranslateY(10);
    Emergency.setPrefWidth(100);
    Emergency.setPrefHeight(550);
    Emergency.setVisible(false);
    Emergency.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    BankWithdraw.setStyle("-fx-background-color: #ffffff00");
    BankWithdraw.setTranslateX(10);
    BankWithdraw.setTranslateY(200);
    BankWithdraw.setPrefWidth(300);
    BankWithdraw.setPrefHeight(400);
    BankWithdraw.setVisible(false);
    BankWithdraw.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        BankIMG.setVisible(false);
        BankDeposit.setVisible(false);
        BankWithdraw.setVisible(false);
        BankWithdrawIMG.setVisible(true);
        BankWithdrawRaise.setVisible(true);
        BankWithdrawLower.setVisible(true);
        BankWithdrawLabel.setVisible(true);
        BankWithdrawConfirm.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    BankDeposit.setStyle("-fx-background-color: #ffffff00");
    BankDeposit.setTranslateX(400);
    BankDeposit.setTranslateY(200);
    BankDeposit.setPrefWidth(300);
    BankDeposit.setPrefHeight(400);
    BankDeposit.setVisible(false);
    BankDeposit.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {

        BankIMG.setVisible(false);
        BankDeposit.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDepositIMG.setVisible(true);
        BankDepositRaise.setVisible(true);
        BankDepositLower.setVisible(true);
        BankDepositLabel.setVisible(true);
        BankDepositConfirm.setVisible(true);
        back.setVisible(true);
        labelHBox.setVisible(true);


         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    BankDepositLabel.setStyle("-fx-background-color: #ffffff00");
    BankDepositLabel.setTranslateX(140);
    BankDepositLabel.setTranslateY(300);
    BankDepositLabel.setPrefWidth(250);
    BankDepositLabel.setPrefHeight(50);
    BankDepositLabel.setVisible(false);
    BankDepositLabel.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 18));

    BankDepositRaise.setStyle("-fx-background-color: #ffffff00");
    BankDepositRaise.setTranslateX(290);
    BankDepositRaise.setTranslateY(375);
    BankDepositRaise.setPrefWidth(100);
    BankDepositRaise.setPrefHeight(50);
    BankDepositRaise.setVisible(false);
    BankDepositRaise.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        if(money.compareTo(valueBig) > 0){
          value += 1000;
          BankDepositLabel.setText("" + value);
        }
      }
    });
    BankDepositLower.setStyle("-fx-background-color: #ffffff00");
    BankDepositLower.setTranslateX(290);
    BankDepositLower.setTranslateY(455);
    BankDepositLower.setPrefWidth(100);
    BankDepositLower.setPrefHeight(50);
    BankDepositLower.setVisible(false);
    BankDepositLower.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(value >0){
          value -= 1000;
          BankDepositLabel.setText("" + value);
        }
      }
    });
    BankDepositConfirm.setStyle("-fx-background-color: #ffffff00");
    BankDepositConfirm.setTranslateX(190);
    BankDepositConfirm.setTranslateY(545);
    BankDepositConfirm.setPrefWidth(200);
    BankDepositConfirm.setPrefHeight(50);
    BankDepositConfirm.setVisible(false);
    BankDepositConfirm.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        money = money.subtract(valueBig);
        bank = bank.add(valueBig);
        value = 0;
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    BankWithdrawLabel.setStyle("-fx-background-color: #ffffff00");
    BankWithdrawLabel.setTranslateX(490);
    BankWithdrawLabel.setTranslateY(300);
    BankWithdrawLabel.setPrefWidth(250);
    BankWithdrawLabel.setPrefHeight(50);
    BankWithdrawLabel.setVisible(false);
    BankWithdrawLabel.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 20));

    BankWithdrawRaise.setStyle("-fx-background-color: #ffffff00");
    BankWithdrawRaise.setTranslateX(490);
    BankWithdrawRaise.setTranslateY(375);
    BankWithdrawRaise.setPrefWidth(100);
    BankWithdrawRaise.setPrefHeight(50);
    BankWithdrawRaise.setVisible(false);
    BankWithdrawRaise.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        if(bank.compareTo(valueBig) > 0){
          value += 1000;
          BankWithdrawLabel.setText("" + value);
        }
      }
    });
    BankWithdrawLower.setStyle("-fx-background-color: #ffffff00");
    BankWithdrawLower.setTranslateX(490);
    BankWithdrawLower.setTranslateY(455);
    BankWithdrawLower.setPrefWidth(100);
    BankWithdrawLower.setPrefHeight(50);
    BankWithdrawLower.setVisible(false);
    BankWithdrawLower.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(value >0){
          value -= 1000;
          BankWithdrawLabel.setText("" + value);
        }
      }
    });
    BankWithdrawConfirm.setStyle("-fx-background-color: #ffffff00");
    BankWithdrawConfirm.setTranslateX(490);
    BankWithdrawConfirm.setTranslateY(545);
    BankWithdrawConfirm.setPrefWidth(200);
    BankWithdrawConfirm.setPrefHeight(50);
    BankWithdrawConfirm.setVisible(false);
    BankWithdrawConfirm.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        bank = bank.subtract(valueBig);
        money = money.add(valueBig);
        value = 0;
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    back.setText("Back");
    back.setStyle("-fx-border: 120px solid; -fx-background-color: #990000; -fx-border-color: #ffffff");
      back.setTranslateX(10);
      back.setTranslateY(555);
    back.setPrefWidth(100);
    back.setPrefHeight(25);
    back.setTextFill(Color.WHITE);
    back.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    back.setVisible(true);
    back.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        if(hours > 12){
            AVJFun.setVisible(true);
            MoneyLabel.setTextFill(Color.BLACK);
            NameLabel.setTextFill(Color.BLACK);
            HoursLabel.setTextFill(Color.BLACK);
            DayLabel.setTextFill(Color.BLACK);
            BankLabel.setTextFill(Color.BLACK);
            HealthLabel.setTextFill(Color.BLACK);
            MoneyLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            NameLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HoursLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            DayLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            BankLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
            HealthLabel.setStyle("-fx-background-color:rgba(0, 0, 255,0);");
        }else{
            AVJFunNight.setVisible(true);
            MoneyLabel.setTextFill(Color.GREEN);
            NameLabel.setTextFill(Color.ORANGE);
            HoursLabel.setTextFill(Color.BLUE);
            DayLabel.setTextFill(Color.YELLOW);
            BankLabel.setTextFill(Color.GREEN);
            HealthLabel.setTextFill(Color.RED);
        }
        AVJWork.setVisible(false);
        AVJWorkNight.setVisible(false);
        toFun.setVisible(false);
        Bank.setVisible(true);
        Casino.setVisible(true);
        Hospital.setVisible(true);
        McD.setVisible(false);
        Computer.setVisible(false);
        Target.setVisible(false);
        HospitalIMG.setVisible(false);
        Appointment.setVisible(false);
        Surgery.setVisible(false);
        Emergency.setVisible(false);
        EmergencyIMG.setVisible(false);
        AppointmentIMG.setVisible(false);
        SurgeryIMG.setVisible(false);
        CasinoIMG.setVisible(false);
        Slots.setVisible(false);
        Blackjack.setVisible(false);
        Lottery.setVisible(false);
        SlotsIMG.setVisible(false);
        BlackJackIMG.setVisible(false);
        LotteryIMG.setVisible(false);
        BankIMG.setVisible(false);
        BankWithdrawIMG.setVisible(false);
        BankDepositIMG.setVisible(false);
        McDonaldsWorkIMG.setVisible(false);
        TargetApplyIMG.setVisible(false);
        TargetWorkIMG.setVisible(false);
        ComputerWorkIMG.setVisible(false);
        ComputerApplyIMG.setVisible(false);
        BankWithdraw.setVisible(false);
        BankDeposit.setVisible(false);
        McDonalds.setVisible(false);
        TargetApply.setVisible(false);
        TargetWork.setVisible(false);
        Computer2.setVisible(false);
        Computer1.setVisible(false);
        Computer3.setVisible(false);
        Computer4.setVisible(false);
        BankDepositRaise.setVisible(false);
        BankDepositLower.setVisible(false);
        BankDepositLabel.setVisible(false);
        BankDepositConfirm.setVisible(false);
        BankWithdrawRaise.setVisible(false);
        BankWithdrawLower.setVisible(false);
        BankWithdrawLabel.setVisible(false);
        BankWithdrawConfirm.setVisible(false);
        value = 0;
        labelHBox.setVisible(true);
        hours -= 1;
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
    });

    
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }


}