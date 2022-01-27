package cgpa_calculator.nsu_cgap_calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.*;
import java.text.DecimalFormat;

// PLEASE READ THE COMMENTS FOR FULL DETAILS ON EDITING THE CODE IF NEEDED

public class Main extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Labels
            //Main Heading
        Label heading = new Label("NSU CGPA Calculator");

            //NSU logo importing and sizing
        Image image = new Image(new FileInputStream("src/main/resources/NSU_Logo.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(80);

            //Sub-Headings
        Label sHeading1 = new Label("\t\tCourse Name");
        Label sHeading2 = new Label("Course Credits");
        Label sHeading3 = new Label("Course Grade");

            //Course Labels
        Label line1 = new Label("Course 1: ");
        Label line2 = new Label("Course 2: ");
        Label line3 = new Label("Course 3: ");
        Label line4 = new Label("Course 4: ");
        Label line5 = new Label("Course 5: ");

            //Label Formatting
                //Main heading text size styling
        heading.setFont(Font.font ("", FontWeight.BOLD, 20));

                //Sub-Headings format
        sHeading1.setFont(Font.font("",FontWeight.BOLD,13));
        sHeading2.setFont(Font.font("",FontWeight.BOLD,13));
        sHeading3.setFont(Font.font("",FontWeight.BOLD,13));

                //Course Labels formatting
        line1.setFont(Font.font("",FontWeight.BOLD,13));
        line2.setFont(Font.font("",FontWeight.BOLD,13));
        line3.setFont(Font.font("",FontWeight.BOLD,13));
        line4.setFont(Font.font("",FontWeight.BOLD,13));
        line5.setFont(Font.font("",FontWeight.BOLD,13));

        //UI
            //DropDown
        ComboBox<String> drop1 = new ComboBox<>();
        drop1.setPromptText("Course");
        drop1.getItems().add("CSE 115");
        drop1.getItems().add("CSE 115L");
        drop1.getItems().add("CSE 215");
        drop1.getItems().add("CSE 215L");
        drop1.getItems().add("ENG 102");
        drop1.getItems().add("ENG 103");
        drop1.getItems().add("ENG 111");
        drop1.getItems().add("PHI 101");
        drop1.getItems().add("PHI 104");
        drop1.getItems().add("LBA 101");
        drop1.getItems().add("LBA 102");
        drop1.getItems().add("POL 101");
        drop1.getItems().add("POL 104");
        drop1.getItems().add("ECO 101");
        drop1.getItems().add("ECO 104");
        drop1.getItems().add("SOC 101");
        drop1.getItems().add("ENV 203");
        drop1.getItems().add("GEO 205");
        drop1.getItems().add("ANT 101");
        drop1.getItems().add("BIO 103");
        drop1.getItems().add("MAT 116");
        drop1.getItems().add("MAT 120");
        drop1.getItems().add("MAT 125");
        drop1.getItems().add("MAT 130");
        drop1.getItems().add("MAT 250");
        drop1.getItems().add("MAT 350");
        drop1.getItems().add("MAT 361");
        drop1.getItems().add("PHY 107");
        drop1.getItems().add("PHY 108");
        drop1.getItems().add("CHE 101");
        drop1.getItems().add("EEE 452");
        drop1.getItems().add("CEE 110");
        drop1.getItems().add("CSE 173");
        drop1.getItems().add("CSE 225");
        drop1.getItems().add("CSE 225L");
        drop1.getItems().add("CSE 231");
        drop1.getItems().add("CSE 231L");
        drop1.getItems().add("CSE 299");
        drop1.getItems().add("EEE 141");
        drop1.getItems().add("EEE 141L");
        drop1.getItems().add("EEE 111");
        drop1.getItems().add("EEE 111L");
        drop1.getItems().add("CSE 311");
        drop1.getItems().add("CSE 311L");
        drop1.getItems().add("CSE 323");
        drop1.getItems().add("CSE 327");
        drop1.getItems().add("CSE 331");
        drop1.getItems().add("CSE 331L");
        drop1.getItems().add("CSE 332");
        drop1.getItems().add("CSE 373");
        drop1.getItems().add("CSE 325");
        drop1.getItems().add("CSE 498");
        drop1.getItems().add("CSE 499A");
        drop1.getItems().add("CSE 499B");
        drop1.getItems().add("CSE 417");
        drop1.getItems().add("CSE 401");
        drop1.getItems().add("CSE 418");
        drop1.getItems().add("CSE 426");
        drop1.getItems().add("CSE 473");
        drop1.getItems().add("CSE 491");
        drop1.getItems().add("CSE 411");
        drop1.getItems().add("CSE 424");
        drop1.getItems().add("CSE 427");
        drop1.getItems().add("CSE 428");
        drop1.getItems().add("CSE 429");
        drop1.getItems().add("CSE 492");
        drop1.getItems().add("CSE 422");
        drop1.getItems().add("CSE 438");
        drop1.getItems().add("CSE 482");
        drop1.getItems().add("CSE 485");
        drop1.getItems().add("CSE 486");
        drop1.getItems().add("CSE 493");
        drop1.getItems().add("CSE 433");
        drop1.getItems().add("CSE 435");
        drop1.getItems().add("CSE 413");
        drop1.getItems().add("CSE 414");
        drop1.getItems().add("CSE 494");
        drop1.getItems().add("CSE 419");
        drop1.getItems().add("CSE 440");
        drop1.getItems().add("CSE 445");
        drop1.getItems().add("CSE 465");
        drop1.getItems().add("CSE 467");
        drop1.getItems().add("CSE 468");
        drop1.getItems().add("CSE 470");
        drop1.getItems().add("CSE 495");
        drop1.getItems().add("CSE 446");
        drop1.getItems().add("CSE 447");
        drop1.getItems().add("CSE 448");
        drop1.getItems().add("CSE 449");
        drop1.getItems().add("CSE 496");

        ComboBox<String> drop2 = new ComboBox<>();
        drop2.setPromptText("Course");
        drop2.getItems().add("CSE 115");
        drop2.getItems().add("CSE 115L");
        drop2.getItems().add("CSE 215");
        drop2.getItems().add("CSE 215L");
        drop2.getItems().add("ENG 102");
        drop2.getItems().add("ENG 103");
        drop2.getItems().add("ENG 111");
        drop2.getItems().add("PHI 101");
        drop2.getItems().add("PHI 104");
        drop2.getItems().add("LBA 101");
        drop2.getItems().add("LBA 102");
        drop2.getItems().add("POL 101");
        drop2.getItems().add("POL 104");
        drop2.getItems().add("ECO 101");
        drop2.getItems().add("ECO 104");
        drop2.getItems().add("SOC 101");
        drop2.getItems().add("ENV 203");
        drop2.getItems().add("GEO 205");
        drop2.getItems().add("ANT 101");
        drop2.getItems().add("BIO 103");
        drop2.getItems().add("MAT 116");
        drop2.getItems().add("MAT 120");
        drop2.getItems().add("MAT 125");
        drop2.getItems().add("MAT 130");
        drop2.getItems().add("MAT 250");
        drop2.getItems().add("MAT 350");
        drop2.getItems().add("MAT 361");
        drop2.getItems().add("PHY 107");
        drop2.getItems().add("PHY 108");
        drop2.getItems().add("CHE 101");
        drop2.getItems().add("EEE 452");
        drop2.getItems().add("CEE 110");
        drop2.getItems().add("CSE 173");
        drop2.getItems().add("CSE 225");
        drop2.getItems().add("CSE 225L");
        drop2.getItems().add("CSE 231");
        drop2.getItems().add("CSE 231L");
        drop2.getItems().add("CSE 299");
        drop2.getItems().add("EEE 141");
        drop2.getItems().add("EEE 141L");
        drop2.getItems().add("EEE 111");
        drop2.getItems().add("EEE 111L");
        drop2.getItems().add("CSE 311");
        drop2.getItems().add("CSE 311L");
        drop2.getItems().add("CSE 323");
        drop2.getItems().add("CSE 327");
        drop2.getItems().add("CSE 331");
        drop2.getItems().add("CSE 331L");
        drop2.getItems().add("CSE 332");
        drop2.getItems().add("CSE 373");
        drop2.getItems().add("CSE 325");
        drop2.getItems().add("CSE 498");
        drop2.getItems().add("CSE 499A");
        drop2.getItems().add("CSE 499B");
        drop2.getItems().add("CSE 417");
        drop2.getItems().add("CSE 401");
        drop2.getItems().add("CSE 418");
        drop2.getItems().add("CSE 426");
        drop2.getItems().add("CSE 473");
        drop2.getItems().add("CSE 491");
        drop2.getItems().add("CSE 411");
        drop2.getItems().add("CSE 424");
        drop2.getItems().add("CSE 427");
        drop2.getItems().add("CSE 428");
        drop2.getItems().add("CSE 429");
        drop2.getItems().add("CSE 492");
        drop2.getItems().add("CSE 422");
        drop2.getItems().add("CSE 438");
        drop2.getItems().add("CSE 482");
        drop2.getItems().add("CSE 485");
        drop2.getItems().add("CSE 486");
        drop2.getItems().add("CSE 493");
        drop2.getItems().add("CSE 433");
        drop2.getItems().add("CSE 435");
        drop2.getItems().add("CSE 413");
        drop2.getItems().add("CSE 414");
        drop2.getItems().add("CSE 494");
        drop2.getItems().add("CSE 419");
        drop2.getItems().add("CSE 440");
        drop2.getItems().add("CSE 445");
        drop2.getItems().add("CSE 465");
        drop2.getItems().add("CSE 467");
        drop2.getItems().add("CSE 468");
        drop2.getItems().add("CSE 470");
        drop2.getItems().add("CSE 495");
        drop2.getItems().add("CSE 446");
        drop2.getItems().add("CSE 447");
        drop2.getItems().add("CSE 448");
        drop2.getItems().add("CSE 449");
        drop2.getItems().add("CSE 496");

        ComboBox<String> drop3 = new ComboBox<>();
        drop3.setPromptText("Course");
        drop3.getItems().add("CSE 115");
        drop3.getItems().add("CSE 115L");
        drop3.getItems().add("CSE 215");
        drop3.getItems().add("CSE 215L");
        drop3.getItems().add("ENG 102");
        drop3.getItems().add("ENG 103");
        drop3.getItems().add("ENG 111");
        drop3.getItems().add("PHI 101");
        drop3.getItems().add("PHI 104");
        drop3.getItems().add("LBA 101");
        drop3.getItems().add("LBA 102");
        drop3.getItems().add("POL 101");
        drop3.getItems().add("POL 104");
        drop3.getItems().add("ECO 101");
        drop3.getItems().add("ECO 104");
        drop3.getItems().add("SOC 101");
        drop3.getItems().add("ENV 203");
        drop3.getItems().add("GEO 205");
        drop3.getItems().add("ANT 101");
        drop3.getItems().add("BIO 103");
        drop3.getItems().add("MAT 116");
        drop3.getItems().add("MAT 120");
        drop3.getItems().add("MAT 125");
        drop3.getItems().add("MAT 130");
        drop3.getItems().add("MAT 250");
        drop3.getItems().add("MAT 350");
        drop3.getItems().add("MAT 361");
        drop3.getItems().add("PHY 107");
        drop3.getItems().add("PHY 108");
        drop3.getItems().add("CHE 101");
        drop3.getItems().add("EEE 452");
        drop3.getItems().add("CEE 110");
        drop3.getItems().add("CSE 173");
        drop3.getItems().add("CSE 225");
        drop3.getItems().add("CSE 225L");
        drop3.getItems().add("CSE 231");
        drop3.getItems().add("CSE 231L");
        drop3.getItems().add("CSE 299");
        drop3.getItems().add("EEE 141");
        drop3.getItems().add("EEE 141L");
        drop3.getItems().add("EEE 111");
        drop3.getItems().add("EEE 111L");
        drop3.getItems().add("CSE 311");
        drop3.getItems().add("CSE 311L");
        drop3.getItems().add("CSE 323");
        drop3.getItems().add("CSE 327");
        drop3.getItems().add("CSE 331");
        drop3.getItems().add("CSE 331L");
        drop3.getItems().add("CSE 332");
        drop3.getItems().add("CSE 373");
        drop3.getItems().add("CSE 325");
        drop3.getItems().add("CSE 498");
        drop3.getItems().add("CSE 499A");
        drop3.getItems().add("CSE 499B");
        drop3.getItems().add("CSE 417");
        drop3.getItems().add("CSE 401");
        drop3.getItems().add("CSE 418");
        drop3.getItems().add("CSE 426");
        drop3.getItems().add("CSE 473");
        drop3.getItems().add("CSE 491");
        drop3.getItems().add("CSE 411");
        drop3.getItems().add("CSE 424");
        drop3.getItems().add("CSE 427");
        drop3.getItems().add("CSE 428");
        drop3.getItems().add("CSE 429");
        drop3.getItems().add("CSE 492");
        drop3.getItems().add("CSE 422");
        drop3.getItems().add("CSE 438");
        drop3.getItems().add("CSE 482");
        drop3.getItems().add("CSE 485");
        drop3.getItems().add("CSE 486");
        drop3.getItems().add("CSE 493");
        drop3.getItems().add("CSE 433");
        drop3.getItems().add("CSE 435");
        drop3.getItems().add("CSE 413");
        drop3.getItems().add("CSE 414");
        drop3.getItems().add("CSE 494");
        drop3.getItems().add("CSE 419");
        drop3.getItems().add("CSE 440");
        drop3.getItems().add("CSE 445");
        drop3.getItems().add("CSE 465");
        drop3.getItems().add("CSE 467");
        drop3.getItems().add("CSE 468");
        drop3.getItems().add("CSE 470");
        drop3.getItems().add("CSE 495");
        drop3.getItems().add("CSE 446");
        drop3.getItems().add("CSE 447");
        drop3.getItems().add("CSE 448");
        drop3.getItems().add("CSE 449");
        drop3.getItems().add("CSE 496");

        ComboBox<String> drop4 = new ComboBox<>();
        drop4.setPromptText("Course");
        drop4.getItems().add("CSE 115");
        drop4.getItems().add("CSE 115L");
        drop4.getItems().add("CSE 215");
        drop4.getItems().add("CSE 215L");
        drop4.getItems().add("ENG 102");
        drop4.getItems().add("ENG 103");
        drop4.getItems().add("ENG 111");
        drop4.getItems().add("PHI 101");
        drop4.getItems().add("PHI 104");
        drop4.getItems().add("LBA 101");
        drop4.getItems().add("LBA 102");
        drop4.getItems().add("POL 101");
        drop4.getItems().add("POL 104");
        drop4.getItems().add("ECO 101");
        drop4.getItems().add("ECO 104");
        drop4.getItems().add("SOC 101");
        drop4.getItems().add("ENV 203");
        drop4.getItems().add("GEO 205");
        drop4.getItems().add("ANT 101");
        drop4.getItems().add("BIO 103");
        drop4.getItems().add("MAT 116");
        drop4.getItems().add("MAT 120");
        drop4.getItems().add("MAT 125");
        drop4.getItems().add("MAT 130");
        drop4.getItems().add("MAT 250");
        drop4.getItems().add("MAT 350");
        drop4.getItems().add("MAT 361");
        drop4.getItems().add("PHY 107");
        drop4.getItems().add("PHY 108");
        drop4.getItems().add("CHE 101");
        drop4.getItems().add("EEE 452");
        drop4.getItems().add("CEE 110");
        drop4.getItems().add("CSE 173");
        drop4.getItems().add("CSE 225");
        drop4.getItems().add("CSE 225L");
        drop4.getItems().add("CSE 231");
        drop4.getItems().add("CSE 231L");
        drop4.getItems().add("CSE 299");
        drop4.getItems().add("EEE 141");
        drop4.getItems().add("EEE 141L");
        drop4.getItems().add("EEE 111");
        drop4.getItems().add("EEE 111L");
        drop4.getItems().add("CSE 311");
        drop4.getItems().add("CSE 311L");
        drop4.getItems().add("CSE 323");
        drop4.getItems().add("CSE 327");
        drop4.getItems().add("CSE 331");
        drop4.getItems().add("CSE 331L");
        drop4.getItems().add("CSE 332");
        drop4.getItems().add("CSE 373");
        drop4.getItems().add("CSE 325");
        drop4.getItems().add("CSE 498");
        drop4.getItems().add("CSE 499A");
        drop4.getItems().add("CSE 499B");
        drop4.getItems().add("CSE 417");
        drop4.getItems().add("CSE 401");
        drop4.getItems().add("CSE 418");
        drop4.getItems().add("CSE 426");
        drop4.getItems().add("CSE 473");
        drop4.getItems().add("CSE 491");
        drop4.getItems().add("CSE 411");
        drop4.getItems().add("CSE 424");
        drop4.getItems().add("CSE 427");
        drop4.getItems().add("CSE 428");
        drop4.getItems().add("CSE 429");
        drop4.getItems().add("CSE 492");
        drop4.getItems().add("CSE 422");
        drop4.getItems().add("CSE 438");
        drop4.getItems().add("CSE 482");
        drop4.getItems().add("CSE 485");
        drop4.getItems().add("CSE 486");
        drop4.getItems().add("CSE 493");
        drop4.getItems().add("CSE 433");
        drop4.getItems().add("CSE 435");
        drop4.getItems().add("CSE 413");
        drop4.getItems().add("CSE 414");
        drop4.getItems().add("CSE 494");
        drop4.getItems().add("CSE 419");
        drop4.getItems().add("CSE 440");
        drop4.getItems().add("CSE 445");
        drop4.getItems().add("CSE 465");
        drop4.getItems().add("CSE 467");
        drop4.getItems().add("CSE 468");
        drop4.getItems().add("CSE 470");
        drop4.getItems().add("CSE 495");
        drop4.getItems().add("CSE 446");
        drop4.getItems().add("CSE 447");
        drop4.getItems().add("CSE 448");
        drop4.getItems().add("CSE 449");
        drop4.getItems().add("CSE 496");

        ComboBox<String> drop5 = new ComboBox<>();
        drop5.setPromptText("Course");
        drop5.getItems().add("CSE 115");
        drop5.getItems().add("CSE 115L");
        drop5.getItems().add("CSE 215");
        drop5.getItems().add("CSE 215L");
        drop5.getItems().add("ENG 102");
        drop5.getItems().add("ENG 103");
        drop5.getItems().add("ENG 111");
        drop5.getItems().add("PHI 101");
        drop5.getItems().add("PHI 104");
        drop5.getItems().add("LBA 101");
        drop5.getItems().add("LBA 102");
        drop5.getItems().add("POL 101");
        drop5.getItems().add("POL 104");
        drop5.getItems().add("ECO 101");
        drop5.getItems().add("ECO 104");
        drop5.getItems().add("SOC 101");
        drop5.getItems().add("ENV 203");
        drop5.getItems().add("GEO 205");
        drop5.getItems().add("ANT 101");
        drop5.getItems().add("BIO 103");
        drop5.getItems().add("MAT 116");
        drop5.getItems().add("MAT 120");
        drop5.getItems().add("MAT 125");
        drop5.getItems().add("MAT 130");
        drop5.getItems().add("MAT 250");
        drop5.getItems().add("MAT 350");
        drop5.getItems().add("MAT 361");
        drop5.getItems().add("PHY 107");
        drop5.getItems().add("PHY 108");
        drop5.getItems().add("CHE 101");
        drop5.getItems().add("EEE 452");
        drop5.getItems().add("CEE 110");
        drop5.getItems().add("CSE 173");
        drop5.getItems().add("CSE 225");
        drop5.getItems().add("CSE 225L");
        drop5.getItems().add("CSE 231");
        drop5.getItems().add("CSE 231L");
        drop5.getItems().add("CSE 299");
        drop5.getItems().add("EEE 141");
        drop5.getItems().add("EEE 141L");
        drop5.getItems().add("EEE 111");
        drop5.getItems().add("EEE 111L");
        drop5.getItems().add("CSE 311");
        drop5.getItems().add("CSE 311L");
        drop5.getItems().add("CSE 323");
        drop5.getItems().add("CSE 327");
        drop5.getItems().add("CSE 331");
        drop5.getItems().add("CSE 331L");
        drop5.getItems().add("CSE 332");
        drop5.getItems().add("CSE 373");
        drop5.getItems().add("CSE 325");
        drop5.getItems().add("CSE 498");
        drop5.getItems().add("CSE 499A");
        drop5.getItems().add("CSE 499B");
        drop5.getItems().add("CSE 417");
        drop5.getItems().add("CSE 401");
        drop5.getItems().add("CSE 418");
        drop5.getItems().add("CSE 426");
        drop5.getItems().add("CSE 473");
        drop5.getItems().add("CSE 491");
        drop5.getItems().add("CSE 411");
        drop5.getItems().add("CSE 424");
        drop5.getItems().add("CSE 427");
        drop5.getItems().add("CSE 428");
        drop5.getItems().add("CSE 429");
        drop5.getItems().add("CSE 492");
        drop5.getItems().add("CSE 422");
        drop5.getItems().add("CSE 438");
        drop5.getItems().add("CSE 482");
        drop5.getItems().add("CSE 485");
        drop5.getItems().add("CSE 486");
        drop5.getItems().add("CSE 493");
        drop5.getItems().add("CSE 433");
        drop5.getItems().add("CSE 435");
        drop5.getItems().add("CSE 413");
        drop5.getItems().add("CSE 414");
        drop5.getItems().add("CSE 494");
        drop5.getItems().add("CSE 419");
        drop5.getItems().add("CSE 440");
        drop5.getItems().add("CSE 445");
        drop5.getItems().add("CSE 465");
        drop5.getItems().add("CSE 467");
        drop5.getItems().add("CSE 468");
        drop5.getItems().add("CSE 470");
        drop5.getItems().add("CSE 495");
        drop5.getItems().add("CSE 446");
        drop5.getItems().add("CSE 447");
        drop5.getItems().add("CSE 448");
        drop5.getItems().add("CSE 449");
        drop5.getItems().add("CSE 496");

            //Dropdown for Credit
        ComboBox<String> creditLine1 = new ComboBox<>();
        creditLine1.setPrefSize(109,1);
        creditLine1.setPromptText("Select Credit");
        creditLine1.getItems().add("3.0");
        creditLine1.getItems().add("2.0");
        creditLine1.getItems().add("1.0");
        creditLine1.getItems().add("0.0");

        ComboBox<String> creditLine2 = new ComboBox<>();
        creditLine2.setPrefSize(109,1);
        creditLine2.setPromptText("Select Credit");
        creditLine2.getItems().add("3.0");
        creditLine2.getItems().add("2.0");
        creditLine2.getItems().add("1.0");
        creditLine2.getItems().add("0.0");

        ComboBox<String> creditLine3 = new ComboBox<>();
        creditLine3.setPrefSize(109,1);
        creditLine3.setPromptText("Select Credit");
        creditLine3.getItems().add("3.0");
        creditLine3.getItems().add("2.0");
        creditLine3.getItems().add("1.0");
        creditLine3.getItems().add("0.0");

        ComboBox<String> creditLine4 = new ComboBox<>();
        creditLine4.setPrefSize(109,1);
        creditLine4.setPromptText("Select Credit");
        creditLine4.getItems().add("3.0");
        creditLine4.getItems().add("2.0");
        creditLine4.getItems().add("1.0");
        creditLine4.getItems().add("0.0");

        ComboBox<String> creditLine5 = new ComboBox<>();
        creditLine5.setPrefSize(109,1);
        creditLine5.setPromptText("Select Credit");
        creditLine5.getItems().add("3.0");
        creditLine5.getItems().add("2.0");
        creditLine5.getItems().add("1.0");
        creditLine5.getItems().add("0.0");

            //Dropdown for Grades
        ComboBox<String> gradesLine1 = new ComboBox<>();
        gradesLine1.setPrefSize(109,1);
        gradesLine1.setPromptText("Select Grade");
        gradesLine1.getItems().add("A");
        gradesLine1.getItems().add("A-");
        gradesLine1.getItems().add("B+");
        gradesLine1.getItems().add("B");
        gradesLine1.getItems().add("B-");
        gradesLine1.getItems().add("C+");
        gradesLine1.getItems().add("C");
        gradesLine1.getItems().add("C-");
        gradesLine1.getItems().add("D+");
        gradesLine1.getItems().add("D");
        gradesLine1.getItems().add("F");
        gradesLine1.getItems().add("I");
        gradesLine1.getItems().add("W");
        gradesLine1.getItems().add("R");

        ComboBox<String> gradesLine2 = new ComboBox<>();
        gradesLine2.setPrefSize(109,1);
        gradesLine2.setPromptText("Select Grade");
        gradesLine2.getItems().add("A");
        gradesLine2.getItems().add("A-");
        gradesLine2.getItems().add("B+");
        gradesLine2.getItems().add("B");
        gradesLine2.getItems().add("B-");
        gradesLine2.getItems().add("C+");
        gradesLine2.getItems().add("C");
        gradesLine2.getItems().add("C-");
        gradesLine2.getItems().add("D+");
        gradesLine2.getItems().add("D");
        gradesLine2.getItems().add("F");
        gradesLine2.getItems().add("I");
        gradesLine2.getItems().add("W");
        gradesLine2.getItems().add("R");

        ComboBox<String> gradesLine3 = new ComboBox<>();
        gradesLine3.setPrefSize(109,1);
        gradesLine3.setPromptText("Select Grade");
        gradesLine3.getItems().add("A");
        gradesLine3.getItems().add("A-");
        gradesLine3.getItems().add("B+");
        gradesLine3.getItems().add("B");
        gradesLine3.getItems().add("B-");
        gradesLine3.getItems().add("C+");
        gradesLine3.getItems().add("C");
        gradesLine3.getItems().add("C-");
        gradesLine3.getItems().add("D+");
        gradesLine3.getItems().add("D");
        gradesLine3.getItems().add("F");
        gradesLine3.getItems().add("I");
        gradesLine3.getItems().add("W");
        gradesLine3.getItems().add("R");

        ComboBox<String> gradesLine4 = new ComboBox<>();
        gradesLine4.setPrefSize(109,1);
        gradesLine4.setPromptText("Select Grade");
        gradesLine4.getItems().add("A");
        gradesLine4.getItems().add("A-");
        gradesLine4.getItems().add("B+");
        gradesLine4.getItems().add("B");
        gradesLine4.getItems().add("B-");
        gradesLine4.getItems().add("C+");
        gradesLine4.getItems().add("C");
        gradesLine4.getItems().add("C-");
        gradesLine4.getItems().add("D+");
        gradesLine4.getItems().add("D");
        gradesLine4.getItems().add("F");
        gradesLine4.getItems().add("I");
        gradesLine4.getItems().add("W");
        gradesLine4.getItems().add("R");

        ComboBox<String> gradesLine5 = new ComboBox<>();
        gradesLine5.setPrefSize(109,1);
        gradesLine5.setPromptText("Select Grade");
        gradesLine5.getItems().add("A");
        gradesLine5.getItems().add("A-");
        gradesLine5.getItems().add("B+");
        gradesLine5.getItems().add("B");
        gradesLine5.getItems().add("B-");
        gradesLine5.getItems().add("C+");
        gradesLine5.getItems().add("C");
        gradesLine5.getItems().add("C-");
        gradesLine5.getItems().add("D+");
        gradesLine5.getItems().add("D");
        gradesLine5.getItems().add("F");
        gradesLine5.getItems().add("I");
        gradesLine5.getItems().add("W");
        gradesLine5.getItems().add("R");

        //Button
        Button submit = new Button("Check CGPA");
        submit.setAlignment(Pos.BASELINE_CENTER);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String c1cred = creditLine1.getValue();
                String c2cred = creditLine2.getValue();
                String c3cred = creditLine3.getValue();
                String c4cred = creditLine4.getValue();
                String c5cred = creditLine5.getValue();

                String c1grade = gradesLine1.getValue();
                String c2grade = gradesLine2.getValue();
                String c3grade = gradesLine3.getValue();
                String c4grade = gradesLine4.getValue();
                String c5grade = gradesLine5.getValue();

                String dropChoice1 = drop1.getValue();
                String dropChoice2 = drop2.getValue();
                String dropChoice3 = drop3.getValue();
                String dropChoice4 = drop4.getValue();
                String dropChoice5 = drop5.getValue();

                String[] choice = {dropChoice1,dropChoice2,dropChoice3,dropChoice4,dropChoice5};
                String[] credits = {c1cred,c2cred,c3cred,c4cred,c5cred};
                String[] grades = {c1grade,c2grade,c3grade,c4grade,c5grade};

                //CGPA formatting
                Calculations cgpa = new Calculations(credits,grades);
                DecimalFormat d = new DecimalFormat("#.##");
                double finalCgpa = cgpa.calc();

                try {
                    File info = new File("information.txt");
                    FileWriter filer = new FileWriter("information.txt");
                    for(int i=0; i< choice.length; i++){
                        filer.write(choice[i]+" "+credits[i]+" "+grades[i]+"\n");
                    }
                    filer.write("CGPA :"+finalCgpa);
                    filer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Alert a1 = new Alert(Alert.AlertType.INFORMATION);
                a1.setTitle("CGPA");
                a1.setHeaderText("Your CGPA is : "+d.format(finalCgpa));
                a1.setContentText("Press OK to return to the calculator");
                a1.show();

            }
        });

        //Layout
            //For logo
        HBox logo = new HBox(imageView);
        logo.setAlignment(Pos.TOP_CENTER);

            //Rest of the labels excluding logo
        HBox displayLine1 = new HBox(heading);
        displayLine1.setAlignment(Pos.TOP_CENTER);

        HBox selectionHeading = new HBox(30,sHeading1,sHeading2,sHeading3);
        selectionHeading.setAlignment(Pos.TOP_CENTER);

        HBox displayLine2 = new HBox(10,line1,drop1,creditLine1,gradesLine1);
        displayLine2.setAlignment(Pos.BASELINE_CENTER);

        HBox displayLine3 = new HBox(10,line2,drop2,creditLine2,gradesLine2);
        displayLine3.setAlignment(Pos.BASELINE_CENTER);

        HBox displayLine4 = new HBox(10,line3,drop3,creditLine3,gradesLine3);
        displayLine4.setAlignment(Pos.BASELINE_CENTER);

        HBox displayLine5 = new HBox(10,line4,drop4,creditLine4,gradesLine4);
        displayLine5.setAlignment(Pos.BASELINE_CENTER);

        HBox displayLine6 = new HBox(10,line5,drop5,creditLine5,gradesLine5);
        displayLine6.setAlignment(Pos.BASELINE_CENTER);

        HBox displayLine7 = new HBox(10,submit);
        displayLine7.setAlignment(Pos.BASELINE_CENTER);

        VBox finalDisplay = new VBox(10,logo,displayLine1,selectionHeading,displayLine2,displayLine3,displayLine4,displayLine5,displayLine6,displayLine7);

        //If you decide to remove the logo then erase line 728 and remove comment from line 731
        //VBox finalDisplay = new VBox(10,displayLine1,selectionHeading,displayLine2,displayLine3,displayLine4,displayLine5,displayLine6,displayLine7);

            //Scene
        Scene scene1 = new Scene(finalDisplay,600,400);

                //css title and title icon  (you may comment these out if necessary) <- it is safe to do so
        scene1.getStylesheets().add("Style.css");
        stage.getIcons().add(image);
        stage.setTitle("NSU CGPA Calculator");

        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}