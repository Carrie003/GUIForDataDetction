package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.collections.ObservableList;

import java.util.*;

public class Main extends Application {


    private final String VAR1_KEY = "var1";
    private final String VAR2_KEY = "var2";
    private final String VAR3_KEY = "var3";

    private TableView<Data> geneDataTable  = new TableView<>();
//    private TableView<Map<String,Object>> geneDataTable  = new TableView<>();
    private TableColumn<Data, Integer> col1 = new TableColumn<>(VAR1_KEY);
    private TableColumn<Data, Integer> col2 = new TableColumn<>(VAR2_KEY);
    private TableColumn<Data, Integer> col3 = new TableColumn<>(VAR3_KEY);



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{




        GridPane grid = new GridPane();

//        Button btn = new Button("Button");
////        btn.getStyleClass().add("button-hi");
////
////        GridPane.setConstraints(btn,0,0);
////

        Text welcomeText = new Text("Welcome");
        GridPane.setConstraints(welcomeText,0,1);
        welcomeText.getStyleClass().add("welcome-text");


        Label usernameLabel = new Label("User Name:");
        GridPane.setConstraints(usernameLabel,0,2);
//        usernameLabel.getStyleClass().add("label");


        TextField username = new TextField();
        GridPane.setConstraints(username,1,2);



        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel,0,3);
//        passwordLabel.getStyleClass().add("label");

        TextField password = new TextField();
        GridPane.setConstraints(password,1,3);

        Button logIn = new Button("Log In");
        GridPane.setConstraints(logIn, 1,4);
        logIn.getStyleClass().add("logIn-button");

        Button signUp = new Button("Sign Up");
        GridPane.setConstraints(signUp,1,7);
        signUp.getStyleClass().add("signUp-button");







//        ObservableList<Map<String, Object>> geneDataCollection = this.getMapData();
//        ObservableList<Map<String,Object>> = this.getMapData();
//        geneDataTable.setItems(geneDataCollection);
//        geneDataTable.getItems().add(geneDataCollection);
//        Map<String, Integer> genomeDataMap = mapData();
//        ArrayList<TableColumn> tableColumnSet= new ArrayList<TableColumn>();





        initialize();
        geneDataTable.getColumns().addAll(col1,col2,col3);

//        this.addColumns(geneDataTable);
        GridPane.setConstraints(geneDataTable,1,9);




//



        String idColumnKey = "q";
        TableView<Map> DataTable  = new TableView<>();
        TableColumn<Map,Integer> idCol = new TableColumn<>("id");
        DataTable.getColumns().add(idCol);
        Map<String,Integer> row1 = new HashMap<String,Integer>();
        row1.put(idColumnKey, 1);
        row1.put(idColumnKey, 2);
        idCol.setCellValueFactory(new MapValueFactory<>(idColumnKey));
        DataTable.getItems().add(row1);












        grid.getChildren().addAll(welcomeText,usernameLabel,username,passwordLabel,password, logIn, signUp, geneDataTable);






//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(grid, 500, 500);
        scene.getStylesheets().add(getClass().getResource("GUI.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();





    }

    public ObservableList<Data> dataCollection = FXCollections.observableArrayList(
        new Data(2,3,4),
        new Data(4,5,6),
        new Data(7,8,9)
    );


    public ArrayList<Data> createDataList(){
        ArrayList<Data> dataList = new ArrayList();
        dataList.add(new Data(2,3,4));
        dataList.add(new Data(4,5,6));
        dataList.add(new Data(7,8,9));
        return dataList;
    }



    public ObservableList<Map<String,Object>> getMapData(){

        ObservableList<Map<String, Object>> items = FXCollections.<Map<String, Object>>observableArrayList();

        Map<String, Object> dataMap = new HashMap<>();
        ArrayList<Data> genomeData = createDataList();

        for(Data gData: genomeData){
            dataMap.put(VAR1_KEY, gData.getVar1());
            dataMap.put(VAR2_KEY, gData.getVar2());
            dataMap.put(VAR3_KEY, gData.getVar3());
        }

        items.add(dataMap);
        return items;

    }

    public void addColumns(TableView table){


        TableColumn<Map, Object> var1Col = new TableColumn<>(VAR1_KEY);
//        tableColumnSet.add(var1Col);

        TableColumn<Map, Object> var2Col = new TableColumn<>(VAR2_KEY);
//        tableColumnSet.add(var2Col);

        TableColumn<Map, Object> var3Col = new TableColumn<>(VAR3_KEY);
//        tableColumnSet.add(var3Col);


//        for(TableColumn<Map, Object> tableColumn: tableColumns){
//
//        }

//        var1Col.setVisible(true);



        table.getColumns().addAll(var1Col,var2Col,var3Col);
//
//        Map<String, Object> geneDataMap= this.getMapData();

        var1Col.setCellValueFactory(new MapValueFactory<>(VAR1_KEY));
        var2Col.setCellValueFactory(new MapValueFactory<>(VAR2_KEY));
        var3Col.setCellValueFactory(new MapValueFactory<>(VAR3_KEY));

//        table.setItems(geneDataMap);



//        table.getColumns().addAll(var1Col,var2Col,var3Col);
//
////
////        DataTable.getColumns().add(idCol);
////        DataTable.getItems().add(row1);
//
//
//    }
//
//    public void setTable(TableView table){
////        table.setItems();
    }


//    FilteredList filter = new




    public void initialize(){

        col1.setCellValueFactory(new PropertyValueFactory<Data, Integer>(VAR1_KEY));
        col2.setCellValueFactory(new PropertyValueFactory<Data, Integer>(VAR2_KEY));
        col3.setCellValueFactory(new PropertyValueFactory<Data, Integer>(VAR3_KEY));
        geneDataTable.setItems(dataCollection);


    }


//    public void filterData(){
//
//        FilteredList<Data> list = new FilteredList();
//
//
//
//    }


}
