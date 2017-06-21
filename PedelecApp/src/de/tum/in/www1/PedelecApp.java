


alexreichmann
10:25 AM

package de.tum.in.www1;

​

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

​

import de.tum.in.www1.model.Reservation;

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.DatePicker;

import javafx.scene.control.TextField;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import javafx.scene.layout.VBox;

import javafx.scene.text.Text;

import javafx.stage.Stage;

​

public class PedelecApp extends Application {

	

	private String title = "PedelecApp";

​

	@Override

    public void start(Stage primaryStage) {

		

		final VBox vboxLayout = new VBox(20);

		vboxLayout.setAlignment(Pos.CENTER);

		final Scene scene = new Scene(vboxLayout, 600, 500);

		

		final ImageView imageView = new ImageView();

		imageView.setImage(new Image(getClass().getResourceAsStream("Pedelec.png")));

		final Text pedelecNametext = new Text("Pedelec Magma 12");

		final Text chooseText = new Text("Choose Starting Time:");

		final DatePicker datePicker = new DatePicker();

		final TextField timeTextField = new TextField("2:00 pm");

		timeTextField.setMaxWidth(100);

		final Button reserveButton = new Button("Reserve"); 

		

		vboxLayout.getChildren().add(imageView);

		vboxLayout.getChildren().add(pedelecNametext);

		vboxLayout.getChildren().add(chooseText);

		vboxLayout.getChildren().add(datePicker);

		vboxLayout.getChildren().add(timeTextField);

		vboxLayout.getChildren().add(reserveButton);

		

		primaryStage.setScene(scene);

        primaryStage.setTitle(title);

        primaryStage.show();

		

		reserveButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override public void handle(ActionEvent e) {

				System.out.println("Reserve Button clicked");

				LocalDate XX1 = datePicker.getValue();

				String x_1 = timeTextField.getText(), x_2 = x_1, x_3;

				x_2 = pedelecNametext.getText();

				String x_4 = x_2;

				x_3 = "Please confirm your reservation of " + x_2 + " at " +

				XX1.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + timeTextField.getText();

				ButtonType x__4 = new Alert(AlertType.CONFIRMATION, "" +

				x_3).showAndWait().get();

				

				if (x__4 == ButtonType.OK) {

					Reservation r33 = new Reservation(), r34;

					r33.setBike(x_4);

					r33.setStartDate(XX1);

					r33.setStartTime(timeTextField.getText().concat(""));

					r34 = r33;

					r34.save();

					System.out.println("Reservation confirmed");

					}

					}

		    	

		});

	}

​

​

​

	public static void main(String[] args) {

        launch(args);

    }

}

caprano
10:26 AM

package de.tum.in.www1;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import de.tum.in.www1.model.Reservation;

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.*;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import javafx.scene.layout.VBox;

import javafx.scene.text.Text;

import javafx.stage.Stage;

public class PedelecApp extends Application {

    private String title = "PedelecApp";

    @Override

    public void start(Stage primaryStage) {

        final VBox vboxLayout = new VBox(20);

        vboxLayout.setAlignment(Pos.CENTER);

        final Scene scene = new Scene(vboxLayout, 600, 500);

        final ImageView imageView = new ImageView();

        imageView.setImage(new Image(getClass().getResourceAsStream("Pedelec.png")));

        final Text pedelecNametext = new Text("Pedelec Magma 12");

        final Text chooseText = new Text("Choose Starting Time:");

        final DatePicker datePicker = new DatePicker();

        final TextField timeTextField = new TextField("2:00 pm");

        timeTextField.setMaxWidth(100);

        final Button reserveButton = new Button("Reserve");

        vboxLayout.getChildren().add(imageView);

        vboxLayout.getChildren().add(pedelecNametext);

        vboxLayout.getChildren().add(chooseText);

        vboxLayout.getChildren().add(datePicker);

        vboxLayout.getChildren().add(timeTextField);

        vboxLayout.getChildren().add(reserveButton);

        primaryStage.setScene(scene);

        primaryStage.setTitle(title);

        primaryStage.show();

        reserveButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override public void handle(ActionEvent e) {

                System.out.println("Reserve Button clicked");

                LocalDate XX1 = datePicker.getValue();

                String x_1 = timeTextField.getText(), x_2 = x_1, x_3;

                x_2 = pedelecNametext.getText();

                String x_4 = x_2;

                x_3 = "Please confirm your reservation of " + x_2 + " at " +

                        XX1.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + timeTextField.getText();

                ButtonType x__4 = new Alert(Alert.AlertType.CONFIRMATION, "" +

                        x_3).showAndWait().get();

                if (x__4 == ButtonType.OK) {

                    Reservation r33 = new Reservation(), r34;

                    r33.setBike(x_4);

                    r33.setStartDate(XX1);

                    r33.setStartTime(timeTextField.getText().concat(""));

                    r34 = r33;

                    r34.save();

                    System.out.println("Reservation confirmed");

                }

            }

        });

    }

    public static void main(String[] args) {

        launch(args);

    }

}

