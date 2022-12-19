package com.example;

import java.util.*;

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
  public static int card1;
  public static int card2;
  public static int card3;
  public static int card4;
  public static int BlackPlayer;
  public static int BlackComputer;
  public static boolean isGame;
  public static String LastButton = "";
  public static int LotValue = 0;

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
    Button SurgeryDo = new Button();
    Button EmergencyDo = new Button();
    Button CheckDo = new Button();
    Button SlotsRaise = new Button();
    Button SlotsLower = new Button();
    Button SlotsSpin = new Button();
    Button BlackPlay = new Button();
    Button BlackRaise = new Button();
    Button BlackLower = new Button();
    Button BlackHit = new Button();
    Button BlackStand = new Button();
    Button LotLower = new Button();
    Button LotRaise = new Button();
    Button LotGet = new Button();
    Button ComputerApply = new Button();


    Button BankWithdrawLabel = new Button();
    Button BankDepositLabel = new Button();
    Button SlotsOutputLabel = new Button();
    Button SlotsWinningLabel = new Button();
    Button SlotsBetLabel = new Button();
    Button BlackBet = new Button();
    Button Black1 = new Button();
    Button Black2 = new Button();
    Button Black3 = new Button();
    Button Black4 = new Button();
    Button LotLabel = new Button();


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
      AVJFunNight.setVisible(true);

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

    Image image19 = new Image("file:carCrash.JPG");  
    ImageView CarCrashIMG = new ImageView(image19); 
    CarCrashIMG.setX(0); 
    CarCrashIMG.setY(0); 
    CarCrashIMG.setFitHeight(600); 
    CarCrashIMG.setFitWidth(800); 
    CarCrashIMG.setPreserveRatio(true);  
    CarCrashIMG.setVisible(false);

    Image image20 = new Image("file:flatTire.JPG");  
    ImageView FlatTireIMG = new ImageView(image20); 
    FlatTireIMG.setX(0); 
    FlatTireIMG.setY(0); 
    FlatTireIMG.setFitHeight(600); 
    FlatTireIMG.setFitWidth(800); 
    FlatTireIMG.setPreserveRatio(false);  
    FlatTireIMG.setVisible(false);

    Image image21 = new Image("file:Fight.JPG");  
    ImageView FightIMG = new ImageView(image21); 
    FightIMG.setX(0); 
    FightIMG.setY(0); 
    FightIMG.setFitHeight(600); 
    FightIMG.setFitWidth(800); 
    FightIMG.setPreserveRatio(false);  
    FightIMG.setVisible(false);
    
    

    
      //Setting the stage
    
     Group root = new Group(AVJFun, AVJFunNight, nameEnter, AVJWork, AVJWorkNight,toWork, toFun, Hospital, Casino, Bank, Computer,  Target,  McD, CasinoIMG, Slots, Blackjack, Lottery, SlotsIMG, BlackJackIMG, LotteryIMG, EmergencyIMG, AppointmentIMG, SurgeryIMG, HospitalIMG,  Appointment, Surgery, Emergency, McDonaldsWorkIMG, TargetApplyIMG, TargetWorkIMG, ComputerApplyIMG, ComputerWorkIMG, BankIMG, BankWithdrawIMG, BankDepositIMG, BankWithdraw, BankDeposit, BankWithdrawRaise, BankWithdrawLower,BankWithdrawLabel, BankDepositRaise, BankDepositLower, BankDepositLabel,BankDepositConfirm, BankWithdrawConfirm, Computer1,Computer2, Computer3, Computer4, McDonalds,  EmergencyDo, CheckDo, TargetWork, TargetApply, ComputerApply, SurgeryDo, SlotsOutputLabel, SlotsRaise, SlotsLower, SlotsSpin, SlotsWinningLabel, SlotsBetLabel, Black1, Black2, Black3, Black4, BlackBet, BlackPlay, BlackRaise, BlackLower, BlackHit, BlackStand, LotLabel, LotLower, LotRaise, LotGet, CarCrashIMG, FlatTireIMG, FightIMG, back, labelHBox);
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
            TargetApply.setVisible(false);
            
    




    nameEnter.setText("New Game");
    nameEnter.setTextFill(Color.WHITE);
    nameEnter.setStyle("-fx-border: 120px solid; -fx-background-color: #33b65b; -fx-border-color: #ffffff");
      nameEnter.setTranslateX(300);
      nameEnter.setTranslateY(125);
    nameEnter.setPrefWidth(200);
    nameEnter.setPrefHeight(50);
    nameEnter.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 20));
    nameEnter.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        AVJFunNight.setVisible(false);
        AVJFun.setVisible(false);
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
        SurgeryDo.setVisible(false);
        CheckDo.setVisible(false);
        EmergencyDo.setVisible(false);
        SlotsOutputLabel.setVisible(false);
        SlotsRaise.setVisible(false);
        SlotsLower.setVisible(false);
        SlotsSpin.setVisible(false);
        SlotsWinningLabel.setVisible(false);
        SlotsBetLabel.setVisible(false);
        BlackBet.setVisible(false);
        Black1.setVisible(false);
        Black2.setVisible(false);
        Black3.setVisible(false);
        Black4.setVisible(false);
        BlackPlay.setVisible(false);
        BlackHit.setVisible(false);
        BlackStand.setVisible(false);
        BlackRaise.setVisible(false);
        BlackLower.setVisible(false);
        nameEnter.setVisible(false);
        back.setVisible(true);




        value = 0;
        labelHBox.setVisible(true);
        
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);

      }
        });



      

    
toWork.setText("9 to 5 Street");
    toWork.setStyle("-fx-border: 120px solid; -fx-background-color: #33b65b; -fx-border-color: #ffffff");
      toWork.setTranslateX(575);
      toWork.setTranslateY(20);
    toWork.setPrefWidth(200);
    toWork.setPrefHeight(60);
    toWork.setVisible(false);
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
          int chance = (int)(Math.random()*10);
          if(chance == 3){
            BigDecimal winner = new BigDecimal(LotValue);
            money = money.add(winner);
            LotValue = 0;
          }
          } else{

            scene.setFill(Color.BEIGE);
        toWork.setVisible(false);
        AVJFunNight.setVisible(false);
        AVJFun.setVisible(false);
        if(hours > 12){
            AVJFun.setVisible(false);
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
            AVJFunNight.setVisible(false);
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
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
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
        toWork.setVisible(false);
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
        SurgeryDo.setVisible(false);
        CheckDo.setVisible(false);
        EmergencyDo.setVisible(false);
        SlotsOutputLabel.setVisible(false);
        SlotsRaise.setVisible(false);
        SlotsLower.setVisible(false);
        SlotsSpin.setVisible(false);
        SlotsWinningLabel.setVisible(false);
        SlotsBetLabel.setVisible(false);
        BlackBet.setVisible(false);
        Black1.setVisible(false);
        Black2.setVisible(false);
        Black3.setVisible(false);
        Black4.setVisible(false);
        BlackPlay.setVisible(false);
        BlackHit.setVisible(false);
        BlackStand.setVisible(false);
        BlackRaise.setVisible(false);
        BlackLower.setVisible(false);
        nameEnter.setVisible(false);
        back.setVisible(false);

        AVJFunNight.setVisible(true);

 money = new BigDecimal("0");
 health = 100;
day = 1;
 name = "Joe Smith";
hours = 24;
bank = new BigDecimal("0");
job = "McDonalds";
ranJob = 0;
ranComputer = 0;
value = 0;
 card1 = 0;
card2 = 0;
card3 = 0;
card4 = 0;
BlackPlayer = 0;
 BlackComputer = 0;
 isGame = false;
 LotValue = 0;
LastButton = "";
nameEnter.setVisible(true);




        value = 0;
        labelHBox.setVisible(false);
        
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
            
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
          int chance = (int)(Math.random()*10);
          if(chance == 3){
            BigDecimal winner = new BigDecimal(LotValue);
            money = money.add(winner);
            LotValue = 0;
          }
          } else{

            scene.setFill(Color.BEIGE);
            toWork.setVisible(false);
            AVJFunNight.setVisible(false);
            AVJFun.setVisible(false);
            if(hours > 12){
                AVJFun.setVisible(false);
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
                AVJFunNight.setVisible(false);
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
            toWork.setVisible(false);
            Bank.setVisible(false);
            Casino.setVisible(false);
            Hospital.setVisible(false);
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
            SurgeryDo.setVisible(false);
            CheckDo.setVisible(false);
            EmergencyDo.setVisible(false);
            SlotsOutputLabel.setVisible(false);
            SlotsRaise.setVisible(false);
            SlotsLower.setVisible(false);
            SlotsSpin.setVisible(false);
            SlotsWinningLabel.setVisible(false);
            SlotsBetLabel.setVisible(false);
            BlackBet.setVisible(false);
            Black1.setVisible(false);
            Black2.setVisible(false);
            Black3.setVisible(false);
            Black4.setVisible(false);
            BlackPlay.setVisible(false);
            BlackHit.setVisible(false);
            BlackStand.setVisible(false);
            BlackRaise.setVisible(false);
            BlackLower.setVisible(false);
            nameEnter.setVisible(false);
            back.setVisible(false);
    
            AVJFunNight.setVisible(true);
    
     money = new BigDecimal("0");
     health = 100;
    day = 1;
     name = "Joe Smith";
    hours = 24;
    bank = new BigDecimal("0");
    job = "McDonalds";
    ranJob = 0;
    ranComputer = 0;
    value = 0;
     card1 = 0;
    card2 = 0;
    card3 = 0;
    card4 = 0;
    BlackPlayer = 0;
     BlackComputer = 0;
     isGame = false;
     LotValue = 0;
    LastButton = "";
    nameEnter.setVisible(true);
    
    
    
    
            value = 0;
            labelHBox.setVisible(false);
            
             MoneyLabel.setText("Money on Hand: " + money);
        DayLabel.setText("Day: " + day);
        HoursLabel.setText("Hours Left: " + hours);
        HealthLabel.setText("Health: " + health);
        BankLabel.setText("Money in Account: " + bank);
        NameLabel.setText("Name: " + name);
            
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
        LastButton = "Hospital";


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
        LastButton = "Casino";


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
    LastButton = "Bank";
        
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
        LastButton = "Work";
        
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
        ComputerApply.setVisible(true);
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
        LastButton = "Work";

        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
        
      }
    }); ComputerApply.setStyle("-fx-background-color: #ffffff00");
    ComputerApply.setTranslateX(10);
    ComputerApply.setTranslateY(100);
    ComputerApply.setPrefWidth(780);
    ComputerApply.setPrefHeight(400);
    ComputerApply.setVisible(false);
    ComputerApply.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        AVJFunNight.setVisible(false);
        AVJFun.setVisible(false);
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
        SurgeryDo.setVisible(false);
        CheckDo.setVisible(false);
        EmergencyDo.setVisible(false);
        SlotsOutputLabel.setVisible(false);
        SlotsRaise.setVisible(false);
        SlotsLower.setVisible(false);
        SlotsSpin.setVisible(false);
        SlotsWinningLabel.setVisible(false);
        SlotsBetLabel.setVisible(false);
        BlackBet.setVisible(false);
        Black1.setVisible(false);
        Black2.setVisible(false);
        Black3.setVisible(false);
        Black4.setVisible(false);
        BlackPlay.setVisible(false);
        BlackHit.setVisible(false);
        BlackStand.setVisible(false);
        BlackRaise.setVisible(false);
        BlackLower.setVisible(false);
        LotGet.setVisible(false);
        LotLower.setVisible(false);
        LotRaise.setVisible(false);
        LotLabel.setVisible(false);
        ComputerApply.setVisible(false);





        value = 0;
        labelHBox.setVisible(true);
        hours -= 1;
        if(hours < 6){
          hours = 24;
          day += 1;
          int chance = (int)(Math.random()*10);
          if(chance == 3){
            BigDecimal winner = new BigDecimal(LotValue);
            money = money.add(winner);
            LotValue = 0;
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
                int chance = (int)(Math.random()*10);
                if(chance == 3){
                  BigDecimal winner = new BigDecimal(LotValue);
                  money = money.add(winner);
                  LotValue = 0;
                }
                } else{
                  scene.setFill(Color.BEIGE);
                  toWork.setVisible(false);
                  AVJFunNight.setVisible(false);
                  AVJFun.setVisible(false);
                  if(hours > 12){
                      AVJFun.setVisible(false);
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
                      AVJFunNight.setVisible(false);
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
                  Bank.setVisible(false);
                  Casino.setVisible(false);
                  Hospital.setVisible(false);
                  McD.setVisible(false);
                  Computer.setVisible(false);
                  Target.setVisible(false);
                  toWork.setVisible(false);
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
                  SurgeryDo.setVisible(false);
                  CheckDo.setVisible(false);
                  EmergencyDo.setVisible(false);
                  SlotsOutputLabel.setVisible(false);
                  SlotsRaise.setVisible(false);
                  SlotsLower.setVisible(false);
                  SlotsSpin.setVisible(false);
                  SlotsWinningLabel.setVisible(false);
                  SlotsBetLabel.setVisible(false);
                  BlackBet.setVisible(false);
                  Black1.setVisible(false);
                  Black2.setVisible(false);
                  Black3.setVisible(false);
                  Black4.setVisible(false);
                  BlackPlay.setVisible(false);
                  BlackHit.setVisible(false);
                  BlackStand.setVisible(false);
                  BlackRaise.setVisible(false);
                  BlackLower.setVisible(false);
                  nameEnter.setVisible(false);
                  back.setVisible(false);
          
                  AVJFunNight.setVisible(true);
          
           money = new BigDecimal("0");
           health = 100;
          day = 1;
           name = "Joe Smith";
          hours = 24;
          bank = new BigDecimal("0");
          job = "McDonalds";
          ranJob = 0;
          ranComputer = 0;
          value = 0;
           card1 = 0;
          card2 = 0;
          card3 = 0;
          card4 = 0;
          BlackPlayer = 0;
           BlackComputer = 0;
           isGame = false;
           LotValue = 0;
          LastButton = "";
          nameEnter.setVisible(true);
          
          
          
          
                  value = 0;
                  labelHBox.setVisible(false);
                  
                   MoneyLabel.setText("Money on Hand: " + money);
              DayLabel.setText("Day: " + day);
              HoursLabel.setText("Hours Left: " + hours);
              HealthLabel.setText("Health: " + health);
              BankLabel.setText("Money in Account: " + bank);
              NameLabel.setText("Name: " + name);
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
                int chance = (int)(Math.random()*10);
                if(chance == 3){
                  BigDecimal winner = new BigDecimal(LotValue);
                  money = money.add(winner);
                  LotValue = 0;
                }
                } else{
                  scene.setFill(Color.BEIGE);
                  toWork.setVisible(false);
                  AVJFunNight.setVisible(false);
                  AVJFun.setVisible(false);
                  if(hours > 12){
                      AVJFun.setVisible(false);
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
                      AVJFunNight.setVisible(false);
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
                  toWork.setVisible(false);
                  Bank.setVisible(false);
                  Casino.setVisible(false);
                  Hospital.setVisible(false);
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
                  SurgeryDo.setVisible(false);
                  CheckDo.setVisible(false);
                  EmergencyDo.setVisible(false);
                  SlotsOutputLabel.setVisible(false);
                  SlotsRaise.setVisible(false);
                  SlotsLower.setVisible(false);
                  SlotsSpin.setVisible(false);
                  SlotsWinningLabel.setVisible(false);
                  SlotsBetLabel.setVisible(false);
                  BlackBet.setVisible(false);
                  Black1.setVisible(false);
                  Black2.setVisible(false);
                  Black3.setVisible(false);
                  Black4.setVisible(false);
                  BlackPlay.setVisible(false);
                  BlackHit.setVisible(false);
                  BlackStand.setVisible(false);
                  BlackRaise.setVisible(false);
                  BlackLower.setVisible(false);
                  nameEnter.setVisible(false);
                  back.setVisible(false);
          
                  AVJFunNight.setVisible(true);
          
           money = new BigDecimal("0");
           health = 100;
          day = 1;
           name = "Joe Smith";
          hours = 24;
          bank = new BigDecimal("0");
          job = "McDonalds";
          ranJob = 0;
          ranComputer = 0;
          value = 0;
           card1 = 0;
          card2 = 0;
          card3 = 0;
          card4 = 0;
          BlackPlayer = 0;
           BlackComputer = 0;
           isGame = false;
           LotValue = 0;
          LastButton = "";
          nameEnter.setVisible(true);
          
          
          
          
                  value = 0;
                  labelHBox.setVisible(false);
                  
                   MoneyLabel.setText("Money on Hand: " + money);
              DayLabel.setText("Day: " + day);
              HoursLabel.setText("Hours Left: " + hours);
              HealthLabel.setText("Health: " + health);
              BankLabel.setText("Money in Account: " + bank);
              NameLabel.setText("Name: " + name);
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
                int chance = (int)(Math.random()*10);
                if(chance == 3){
                  BigDecimal winner = new BigDecimal(LotValue);
                  money = money.add(winner);
                  LotValue = 0;
                }
                } else{
                  scene.setFill(Color.BEIGE);
                  toWork.setVisible(false);
                  AVJFunNight.setVisible(false);
                  AVJFun.setVisible(false);
                  if(hours > 12){
                      AVJFun.setVisible(false);
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
                      AVJFunNight.setVisible(false);
                      MoneyLabel.setTextFill(Color.GREEN);
                      NameLabel.setTextFill(Color.ORANGE);
                      HoursLabel.setTextFill(Color.BLUE);
                      DayLabel.setTextFill(Color.YELLOW);
                      BankLabel.setTextFill(Color.GREEN);
                      HealthLabel.setTextFill(Color.RED);
                  }
                  AVJWork.setVisible(false);
                  AVJWorkNight.setVisible(false);
                  toWork.setVisible(false);
                  toFun.setVisible(false);
                  Bank.setVisible(false);
                  Casino.setVisible(false);
                  Hospital.setVisible(false);
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
                  SurgeryDo.setVisible(false);
                  CheckDo.setVisible(false);
                  EmergencyDo.setVisible(false);
                  SlotsOutputLabel.setVisible(false);
                  SlotsRaise.setVisible(false);
                  SlotsLower.setVisible(false);
                  SlotsSpin.setVisible(false);
                  SlotsWinningLabel.setVisible(false);
                  SlotsBetLabel.setVisible(false);
                  BlackBet.setVisible(false);
                  Black1.setVisible(false);
                  Black2.setVisible(false);
                  Black3.setVisible(false);
                  Black4.setVisible(false);
                  BlackPlay.setVisible(false);
                  BlackHit.setVisible(false);
                  BlackStand.setVisible(false);
                  BlackRaise.setVisible(false);
                  BlackLower.setVisible(false);
                  nameEnter.setVisible(false);
                  back.setVisible(false);
          
                  AVJFunNight.setVisible(true);
          
           money = new BigDecimal("0");
           health = 100;
          day = 1;
           name = "Joe Smith";
          hours = 24;
          bank = new BigDecimal("0");
          job = "McDonalds";
          ranJob = 0;
          ranComputer = 0;
          value = 0;
           card1 = 0;
          card2 = 0;
          card3 = 0;
          card4 = 0;
          BlackPlayer = 0;
           BlackComputer = 0;
           isGame = false;
           LotValue = 0;
          LastButton = "";
          nameEnter.setVisible(true);
          
          
          
          
                  value = 0;
                  labelHBox.setVisible(false);
                  
                   MoneyLabel.setText("Money on Hand: " + money);
              DayLabel.setText("Day: " + day);
              HoursLabel.setText("Hours Left: " + hours);
              HealthLabel.setText("Health: " + health);
              BankLabel.setText("Money in Account: " + bank);
              NameLabel.setText("Name: " + name);
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
                int chance = (int)(Math.random()*10);
                if(chance == 3){
                  BigDecimal winner = new BigDecimal(LotValue);
                  money = money.add(winner);
                  LotValue = 0;
                }
                } else{
                  scene.setFill(Color.BEIGE);
                  toWork.setVisible(false);
                  AVJFunNight.setVisible(false);
                  AVJFun.setVisible(false);
                  if(hours > 12){
                      AVJFun.setVisible(false);
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
                      AVJFunNight.setVisible(false);
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
                  Bank.setVisible(false);
                  Casino.setVisible(false);
                  Hospital.setVisible(false);
                  McD.setVisible(false);
                  Computer.setVisible(false);
                  Target.setVisible(false);
                  HospitalIMG.setVisible(false);
                  toWork.setVisible(false);
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
                  SurgeryDo.setVisible(false);
                  CheckDo.setVisible(false);
                  EmergencyDo.setVisible(false);
                  SlotsOutputLabel.setVisible(false);
                  SlotsRaise.setVisible(false);
                  SlotsLower.setVisible(false);
                  SlotsSpin.setVisible(false);
                  SlotsWinningLabel.setVisible(false);
                  SlotsBetLabel.setVisible(false);
                  BlackBet.setVisible(false);
                  Black1.setVisible(false);
                  Black2.setVisible(false);
                  Black3.setVisible(false);
                  Black4.setVisible(false);
                  BlackPlay.setVisible(false);
                  BlackHit.setVisible(false);
                  BlackStand.setVisible(false);
                  BlackRaise.setVisible(false);
                  BlackLower.setVisible(false);
                  nameEnter.setVisible(false);
                  back.setVisible(false);
          
                  AVJFunNight.setVisible(true);
          
           money = new BigDecimal("0");
           health = 100;
          day = 1;
           name = "Joe Smith";
          hours = 24;
          bank = new BigDecimal("0");
          job = "McDonalds";
          ranJob = 0;
          ranComputer = 0;
          value = 0;
           card1 = 0;
          card2 = 0;
          card3 = 0;
          card4 = 0;
          BlackPlayer = 0;
           BlackComputer = 0;
           isGame = false;
          LastButton = "";
          LotValue = 0;
          nameEnter.setVisible(true);
          
          
          
          
                  value = 0;
                  labelHBox.setVisible(false);
                  
                   MoneyLabel.setText("Money on Hand: " + money);
              DayLabel.setText("Day: " + day);
              HoursLabel.setText("Hours Left: " + hours);
              HealthLabel.setText("Health: " + health);
              BankLabel.setText("Money in Account: " + bank);
              NameLabel.setText("Name: " + name);
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
        LastButton = "Work";
        
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
            int chance = (int)(Math.random()*10);
            if(chance == 3){
              BigDecimal winner = new BigDecimal(LotValue);
              money = money.add(winner);
              LotValue = 0;
            }
            } else{
              scene.setFill(Color.BEIGE);
              toWork.setVisible(false);
              AVJFunNight.setVisible(false);
              AVJFun.setVisible(false);
              if(hours > 12){
                  AVJFun.setVisible(false);
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
                  AVJFunNight.setVisible(false);
                  MoneyLabel.setTextFill(Color.GREEN);
                  NameLabel.setTextFill(Color.ORANGE);
                  HoursLabel.setTextFill(Color.BLUE);
                  DayLabel.setTextFill(Color.YELLOW);
                  BankLabel.setTextFill(Color.GREEN);
                  HealthLabel.setTextFill(Color.RED);
              }
              AVJWork.setVisible(false);
              AVJWorkNight.setVisible(false);
              toWork.setVisible(false);
              toFun.setVisible(false);
              Bank.setVisible(false);
              Casino.setVisible(false);
              Hospital.setVisible(false);
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
              SurgeryDo.setVisible(false);
              CheckDo.setVisible(false);
              EmergencyDo.setVisible(false);
              SlotsOutputLabel.setVisible(false);
              SlotsRaise.setVisible(false);
              SlotsLower.setVisible(false);
              SlotsSpin.setVisible(false);
              SlotsWinningLabel.setVisible(false);
              SlotsBetLabel.setVisible(false);
              BlackBet.setVisible(false);
              Black1.setVisible(false);
              Black2.setVisible(false);
              Black3.setVisible(false);
              Black4.setVisible(false);
              BlackPlay.setVisible(false);
              BlackHit.setVisible(false);
              BlackStand.setVisible(false);
              BlackRaise.setVisible(false);
              BlackLower.setVisible(false);
              nameEnter.setVisible(false);
              back.setVisible(false);
      
              AVJFunNight.setVisible(true);
      
       money = new BigDecimal("0");
       health = 100;
      day = 1;
       name = "Joe Smith";
      hours = 24;
      bank = new BigDecimal("0");
      job = "McDonalds";
      ranJob = 0;
      ranComputer = 0;
      value = 0;
       card1 = 0;
      card2 = 0;
      card3 = 0;
      card4 = 0;
      BlackPlayer = 0;
       BlackComputer = 0;
       isGame = false;
       LotValue = 0;
      LastButton = "";
      nameEnter.setVisible(true);
      
      
      
      
              value = 0;
              labelHBox.setVisible(false);
              
               MoneyLabel.setText("Money on Hand: " + money);
          DayLabel.setText("Day: " + day);
          HoursLabel.setText("Hours Left: " + hours);
          HealthLabel.setText("Health: " + health);
          BankLabel.setText("Money in Account: " + bank);
          NameLabel.setText("Name: " + name);
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
                int chance = (int)(Math.random()*10);
                if(chance == 3){
                  BigDecimal winner = new BigDecimal(LotValue);
                  money = money.add(winner);
                  LotValue = 0;
                }
                } else{
                  scene.setFill(Color.BEIGE);
                  toWork.setVisible(false);
                  AVJFunNight.setVisible(false);
                  AVJFun.setVisible(false);
                  if(hours > 12){
                      AVJFun.setVisible(false);
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
                      AVJFunNight.setVisible(false);
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
                  Bank.setVisible(false);
                  toWork.setVisible(false);
                  Casino.setVisible(false);
                  Hospital.setVisible(false);
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
                  SurgeryDo.setVisible(false);
                  CheckDo.setVisible(false);
                  EmergencyDo.setVisible(false);
                  SlotsOutputLabel.setVisible(false);
                  SlotsRaise.setVisible(false);
                  SlotsLower.setVisible(false);
                  SlotsSpin.setVisible(false);
                  SlotsWinningLabel.setVisible(false);
                  SlotsBetLabel.setVisible(false);
                  BlackBet.setVisible(false);
                  Black1.setVisible(false);
                  Black2.setVisible(false);
                  Black3.setVisible(false);
                  Black4.setVisible(false);
                  BlackPlay.setVisible(false);
                  BlackHit.setVisible(false);
                  BlackStand.setVisible(false);
                  BlackRaise.setVisible(false);
                  BlackLower.setVisible(false);
                  nameEnter.setVisible(false);
                  back.setVisible(false);
          
                  AVJFunNight.setVisible(true);
          
           money = new BigDecimal("0");
           health = 100;
          day = 1;
           name = "Joe Smith";
          hours = 24;
          bank = new BigDecimal("0");
          job = "McDonalds";
          ranJob = 0;
          ranComputer = 0;
          value = 0;
           card1 = 0;
          card2 = 0;
          card3 = 0;
          card4 = 0;
          BlackPlayer = 0;
           BlackComputer = 0;
           isGame = false;
           LotValue = 0;
          LastButton = "";
          nameEnter.setVisible(true);
          
          
          
          
                  value = 0;
                  labelHBox.setVisible(false);
                  
                   MoneyLabel.setText("Money on Hand: " + money);
              DayLabel.setText("Day: " + day);
              HoursLabel.setText("Hours Left: " + hours);
              HealthLabel.setText("Health: " + health);
              BankLabel.setText("Money in Account: " + bank);
              NameLabel.setText("Name: " + name);
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
        SlotsOutputLabel.setVisible(true);
        SlotsRaise.setVisible(true);
        SlotsLower.setVisible(true);
        SlotsSpin.setVisible(true);
        SlotsWinningLabel.setVisible(true);
        SlotsBetLabel.setVisible(true);
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
        BlackBet.setVisible(true);
        Black1.setVisible(true);
        Black2.setVisible(true);
        Black3.setVisible(true);
        Black4.setVisible(true);
        BlackPlay.setVisible(true);
        BlackHit.setVisible(true);
        BlackStand.setVisible(true);
        BlackRaise.setVisible(true);
        BlackLower.setVisible(true);


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
        LotGet.setVisible(true);
        LotLower.setVisible(true);
        LotRaise.setVisible(true);
        LotLabel.setVisible(true);



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
        CheckDo.setVisible(true);
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
        SurgeryDo.setVisible(true);
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
        EmergencyDo.setVisible(true);
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
          value += 10000;
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
          value -= 10000;
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
          value += 10000;
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
          value -= 10000;
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

    SurgeryDo.setStyle("-fx-background-color: #ffffff00");
    SurgeryDo.setTranslateX(10);
    SurgeryDo.setTranslateY(250);
    SurgeryDo.setPrefWidth(780);
    SurgeryDo.setPrefHeight(350);
    SurgeryDo.setVisible(false);
    SurgeryDo.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal surg = new BigDecimal("250000");
        if(money.compareTo(surg) >= 0){
          money = money.subtract(surg);
          hours -= 4;
          health = 100;
        }else{}
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    EmergencyDo.setStyle("-fx-background-color: #ffffff00");
    EmergencyDo.setTranslateX(10);
    EmergencyDo.setTranslateY(250);
    EmergencyDo.setPrefWidth(780);
    EmergencyDo.setPrefHeight(350);
    EmergencyDo.setVisible(false);
    EmergencyDo.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal emer = new BigDecimal("100000");
        if(money.compareTo(emer) >= 0){
          money = money.subtract(emer);
          hours -= 2;
          health += 60;
          if(health > 100){
            health = 100;
          }
        }else{}
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    CheckDo.setStyle("-fx-background-color: #ffffff00");
    CheckDo.setTranslateX(10);
    CheckDo.setTranslateY(250);
    CheckDo.setPrefWidth(780);
    CheckDo.setPrefHeight(350);
    CheckDo.setVisible(false);
    CheckDo.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal cheq = new BigDecimal("50000");
        if(money.compareTo(cheq) >= 0){
          money = money.subtract(cheq);
          hours -= 1;
          health += 25;
          if(health > 100){
            health = 100;
          }
        }else{}
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    SlotsOutputLabel.setStyle("-fx-background-color: #ffffff00");
    SlotsOutputLabel.setTranslateX(250);
    SlotsOutputLabel.setTranslateY(175);
    SlotsOutputLabel.setPrefWidth(300);
    SlotsOutputLabel.setPrefHeight(100);
    SlotsOutputLabel.setVisible(false);
    SlotsOutputLabel.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 60));

    SlotsWinningLabel.setStyle("-fx-background-color: #ffffff00");
    SlotsWinningLabel.setTranslateX(350);
    SlotsWinningLabel.setTranslateY(313);
    SlotsWinningLabel.setPrefWidth(100);
    SlotsWinningLabel.setPrefHeight(10);
    SlotsWinningLabel.setVisible(false);
    SlotsWinningLabel.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 15));

    SlotsBetLabel.setStyle("-fx-background-color: #ffffff00");
    SlotsBetLabel.setTranslateX(325);
    SlotsBetLabel.setTranslateY(115);
    SlotsBetLabel.setPrefWidth(160);
    SlotsBetLabel.setPrefHeight(10);
    SlotsBetLabel.setVisible(false);
    SlotsBetLabel.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 20));

    SlotsRaise.setStyle("-fx-background-color: #ffffff00");
    SlotsRaise.setTranslateX(225);
    SlotsRaise.setTranslateY(400);
    SlotsRaise.setPrefWidth(50);
    SlotsRaise.setPrefHeight(50);
    SlotsRaise.setVisible(false);
    SlotsRaise.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        if(money.compareTo(valueBig) > 0){
          value += 1000;
          SlotsBetLabel.setText("" + value);
        }
      }
    });
    SlotsLower.setStyle("-fx-background-color: #ffffff00");
    SlotsLower.setTranslateX(280);
    SlotsLower.setTranslateY(400);
    SlotsLower.setPrefWidth(50);
    SlotsLower.setPrefHeight(50);
    SlotsLower.setVisible(false);
    SlotsLower.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(value >0){
          value -= 1000;
          SlotsBetLabel.setText("" + value);
        }
      }
    });
    SlotsSpin.setStyle("-fx-background-color: #ffffff00");
    SlotsSpin.setTranslateX(550);
    SlotsSpin.setTranslateY(325);
    SlotsSpin.setPrefWidth(100);
    SlotsSpin.setPrefHeight(200);
    SlotsSpin.setVisible(false);
    SlotsSpin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        SlotsWinningLabel.setText("");
        BigDecimal valueBig = new BigDecimal(value);
        if(money.compareTo(valueBig) >= 0){
        money = money.subtract(valueBig);
        int random1 = (int)(Math.random()*10);
        int random2 = (int)(Math.random()*10);
        int random3 = (int)(Math.random()*10);
        SlotsOutputLabel.setText(random1 + "  " + random2 + "  " +random3);
        if(random1 == random2 && random2 == random3){
          int winning = value *105;
          SlotsWinningLabel.setText(winning+"");
          BigDecimal winnings = new BigDecimal(winning);
          money = money.add(winnings);
        }}
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });




    BlackPlay.setStyle("-fx-background-color: #ffffff00");
    BlackPlay.setTranslateX(250);
    BlackPlay.setTranslateY(495);
    BlackPlay.setPrefWidth(100);
    BlackPlay.setPrefHeight(30);
    BlackPlay.setVisible(false);
    BlackPlay.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        Black1.setText("");
          Black2.setText("");
          Black3.setText("");
          Black4.setText("");
        if(money.compareTo(valueBig) >= 0){
          money = money.subtract(valueBig);
          isGame = true;
           card1 = (int)(Math.random()*11)+1;
          Black1.setText("" + card1);
           card2 = (int)(Math.random()*11)+1;
          Black2.setText("" + card2);
           card3 = (int)(Math.random()*11)+1;
          Black3.setText("" + card3);
        }
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    BlackRaise.setStyle("-fx-background-color: #ffffff00");
    BlackRaise.setTranslateX(425);
    BlackRaise.setTranslateY(525);
    BlackRaise.setPrefWidth(100);
    BlackRaise.setPrefHeight(30);
    BlackRaise.setVisible(false);
    BlackRaise.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        if(money.compareTo(valueBig) > 0){
          value += 1000;
          BlackBet.setText("" + value);
        }
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    BlackLower.setStyle("-fx-background-color: #ffffff00");
    BlackLower.setTranslateX(425);
    BlackLower.setTranslateY(555);
    BlackLower.setPrefWidth(100);
    BlackLower.setPrefHeight(30);
    BlackLower.setVisible(false);
    BlackLower.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(value - 1000 >= 0){
          value -= 1000;
          BlackBet.setText("" + value);
        }
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    BlackHit.setStyle("-fx-background-color: #ffffff00");
    BlackHit.setTranslateX(250);
    BlackHit.setTranslateY(525);
    BlackHit.setPrefWidth(100);
    BlackHit.setPrefHeight(30);
    BlackHit.setVisible(false);
    BlackHit.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(isGame){
          BlackPlayer = card1 + card3;
          card1 += card3;
          Black1.setText("" + BlackPlayer);
          card3 = (int)(Math.random()*11)+1;
         Black3.setText("" + card3);

        }
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    BlackStand.setStyle("-fx-background-color: #ffffff00");
    BlackStand.setTranslateX(250);
    BlackStand.setTranslateY(555);
    BlackStand.setPrefWidth(100);
    BlackStand.setPrefHeight(30);
    BlackStand.setVisible(false);
    BlackStand.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(isGame){
          BigDecimal valueBig = new BigDecimal(value*2);
        BlackPlayer = card1 + card3;
        card4 = (int)(Math.random()*11)+1;
        Black4.setText(""+card4);
        BlackComputer = card2 + card4;
        while(BlackComputer < 17){
          card2 += card4;
        card4 = (int)(Math.random()*11)+1;
        Black4.setText(""+card4);
        Black2.setText(""+card2);
        BlackComputer = card2 + card4;
        }
         
        if(BlackComputer > 21 || (BlackComputer < BlackPlayer && BlackPlayer < 21)){
          money = money.add(valueBig);
          isGame = false;
        }else if(BlackComputer == BlackPlayer){
          BigDecimal valueLit = new BigDecimal(value);
          money = money.add(valueLit);
          isGame = false;
        } else {isGame = false;}
        }
        
        
        MoneyLabel.setText("Money on Hand: " + money);
   DayLabel.setText("Day: " + day);
   HoursLabel.setText("Hours Left: " + hours);
   HealthLabel.setText("Health: " + health);
   BankLabel.setText("Money in Account: " + bank);
   NameLabel.setText("Name: " + name);
      }
    });

    BlackBet.setStyle("-fx-background-color: #ffffff00");
    BlackBet.setTranslateX(425);
    BlackBet.setTranslateY(500);
    BlackBet.setPrefWidth(75);
    BlackBet.setPrefHeight(10);
    BlackBet.setVisible(false);
    BlackBet.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 10));

    Black1.setStyle("-fx-background-color: #ffffff00");
    Black1.setTranslateX(335);
    Black1.setTranslateY(545);
    Black1.setPrefWidth(50);
    Black1.setPrefHeight(50);
    Black1.setVisible(false);
    Black1.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 20));

    Black2.setStyle("-fx-background-color: #ffffff00");
    Black2.setTranslateX(335);
    Black2.setTranslateY(470);
    Black2.setPrefWidth(50);
    Black2.setPrefHeight(50);
    Black2.setVisible(false);
    Black2.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 20));

    Black3.setStyle("-fx-background-color: #ffffff00");
    Black3.setTranslateX(380);
    Black3.setTranslateY(545);
    Black3.setPrefWidth(50);
    Black3.setPrefHeight(50);
    Black3.setVisible(false);
    Black3.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 20));

    Black4.setStyle("-fx-background-color: #ffffff00");
    Black4.setTranslateX(380);
    Black4.setTranslateY(470);
    Black4.setPrefWidth(50);
    Black4.setPrefHeight(50);
    Black4.setVisible(false);
    Black4.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 20));


    LotLabel.setStyle("-fx-background-color: #ffffff00");
    LotLabel.setTranslateX(300);
    LotLabel.setTranslateY(160);
    LotLabel.setPrefWidth(200);
    LotLabel.setPrefHeight(10);
    LotLabel.setVisible(false);
    LotLabel.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 30));
    LotLabel.setTextFill(Color.CHARTREUSE);

    LotRaise.setStyle("-fx-background-color: #ffffff00");
    LotRaise.setTranslateX(300);
    LotRaise.setTranslateY(285);
    LotRaise.setPrefWidth(150);
    LotRaise.setPrefHeight(50);
    LotRaise.setVisible(false);
    LotRaise.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        if(money.compareTo(valueBig) > 0){
          value += 1000;
          LotLabel.setText("" + value);
        }
      }
    });
    LotLower.setStyle("-fx-background-color: #ffffff00");
    LotLower.setTranslateX(300);
    LotLower.setTranslateY(335);
    LotLower.setPrefWidth(150);
    LotLower.setPrefHeight(50);
    LotLower.setVisible(false);
    LotLower.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(value >0){
          value -= 1000;
          LotLabel.setText("" + value);
        }
      }
    });
    LotGet.setStyle("-fx-background-color: #ffffff00");
    LotGet.setTranslateX(300);
    LotGet.setTranslateY(235);
    LotGet.setPrefWidth(150);
    LotGet.setPrefHeight(50);
    LotGet.setVisible(false);
    LotGet.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        BigDecimal valueBig = new BigDecimal(value);
        if(money.compareTo(valueBig) >= 0){
        money = money.subtract(valueBig);
        LotValue = value*100;
        }
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
    back.setVisible(false);
    back.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        scene.setFill(Color.BEIGE);
        toWork.setVisible(true);
        AVJFunNight.setVisible(false);
        AVJFun.setVisible(false);
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
        SurgeryDo.setVisible(false);
        CheckDo.setVisible(false);
        EmergencyDo.setVisible(false);
        SlotsOutputLabel.setVisible(false);
        SlotsRaise.setVisible(false);
        SlotsLower.setVisible(false);
        SlotsSpin.setVisible(false);
        SlotsWinningLabel.setVisible(false);
        SlotsBetLabel.setVisible(false);
        BlackBet.setVisible(false);
        Black1.setVisible(false);
        Black2.setVisible(false);
        Black3.setVisible(false);
        Black4.setVisible(false);
        BlackPlay.setVisible(false);
        BlackHit.setVisible(false);
        BlackStand.setVisible(false);
        BlackRaise.setVisible(false);
        BlackLower.setVisible(false);
        LotGet.setVisible(false);
        LotLower.setVisible(false);
        LotRaise.setVisible(false);
        LotLabel.setVisible(false);
        ComputerApply.setVisible(false);
        CarCrashIMG.setVisible(false);
        FlatTireIMG.setVisible(false);
        FightIMG.setVisible(false);

        if(LastButton.equals("Casino")){
          int random = (int)(Math.random()*10);
          if(random == 0){
            CarCrashIMG.setVisible(true);
            money = money.subtract(new BigDecimal("100000"));
            if(health - 75 > 0){
            health -= 75;
            }else{health = 0;}
            hours -= 1;
          }
          if(random == 1){
            FightIMG.setVisible(true);
            money = money.divide(new BigDecimal("2"));
            if(health - 50 > 0){
            health -= 50;
            }else{health = 0;}
            hours -= 1;
          }
          if(random == 2){
            job = "McDonalds";
            hours -= 1;
          }
          if(random == 9){
            money = money.add(new BigDecimal("50000"));
            hours -= 1;
          }
        }
        if(LastButton.equals("Hospital") || LastButton.equals("Bank")){
          int random = (int)(Math.random()*10);
          if(random == 0){
            FlatTireIMG.setVisible(true);
            money = money.subtract(new BigDecimal("10000"));
            if(health - 10 > 0){
            health -= 10;
            }else{health = 0;}
            hours -= 1;
          }
          if(random == 1){
            FightIMG.setVisible(true);
            money = new BigDecimal("0");
            if(health - 50 > 0){
            health -= 50;
            }else{health = 0;}
            hours -= 1;
          }
          if(random == 9){
            money = money.add(new BigDecimal("1000000"));
            hours -= 1;
          }
        }






        value = 0;
        labelHBox.setVisible(true);
        hours -= 1;
        if(hours < 6){
          hours = 24;
          day += 1;
          int chance = (int)(Math.random()*10);
          if(chance == 3){
            BigDecimal winner = new BigDecimal(LotValue);
            money = money.add(winner);
            LotValue = 0;
          }
        }
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);


    if(health <= 0){
      scene.setFill(Color.BEIGE);
        toWork.setVisible(false);
        CarCrashIMG.setVisible(false);
        AVJFunNight.setVisible(false);
        AVJFun.setVisible(false);
        if(hours > 12){
            AVJFun.setVisible(false);
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
            AVJFunNight.setVisible(false);
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
        Bank.setVisible(false);
        Casino.setVisible(false);
        Hospital.setVisible(false);
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
        toWork.setVisible(false);
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
        SurgeryDo.setVisible(false);
        CheckDo.setVisible(false);
        EmergencyDo.setVisible(false);
        SlotsOutputLabel.setVisible(false);
        SlotsRaise.setVisible(false);
        SlotsLower.setVisible(false);
        SlotsSpin.setVisible(false);
        SlotsWinningLabel.setVisible(false);
        SlotsBetLabel.setVisible(false);
        BlackBet.setVisible(false);
        Black1.setVisible(false);
        Black2.setVisible(false);
        Black3.setVisible(false);
        Black4.setVisible(false);
        BlackPlay.setVisible(false);
        BlackHit.setVisible(false);
        BlackStand.setVisible(false);
        BlackRaise.setVisible(false);
        BlackLower.setVisible(false);
        nameEnter.setVisible(false);
        back.setVisible(false);

        AVJFunNight.setVisible(true);

 money = new BigDecimal("0");
 health = 100;
day = 1;
 name = "Joe Smith";
hours = 24;
bank = new BigDecimal("0");
job = "McDonalds";
ranJob = 0;
ranComputer = 0;
value = 0;
 card1 = 0;
card2 = 0;
card3 = 0;
card4 = 0;
BlackPlayer = 0;
 BlackComputer = 0;
 isGame = false;
 LotValue = 0;
LastButton = "";
nameEnter.setVisible(true);




        value = 0;
        labelHBox.setVisible(false);
        
         MoneyLabel.setText("Money on Hand: " + money);
    DayLabel.setText("Day: " + day);
    HoursLabel.setText("Hours Left: " + hours);
    HealthLabel.setText("Health: " + health);
    BankLabel.setText("Money in Account: " + bank);
    NameLabel.setText("Name: " + name);
    }

    LastButton = "";

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