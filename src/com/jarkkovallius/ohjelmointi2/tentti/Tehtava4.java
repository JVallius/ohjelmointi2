package com.jarkkovallius.ohjelmointi2.tentti;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Ohjelmointi 2 kurssikuulustelu
 * 31.3.2017
 *
 * Teht‰v‰ 4
 *
 * Jarkko Vallius
 * 284576
 */

public class Tehtava4 extends Application {

	private final String DATE_FORMAT = "d.M.yyyy" ;

	private TextField textFieldName = new TextField();
	private TextField textFieldDateOfBirth = new TextField();

	private Button buttonCalculateAge = new Button("Laske ik‰");
	private Button buttonClear = new Button("Tyhjenn‰");
	private Button buttonQuit = new Button("Lopeta");
	private Label labelAgeInYears = new Label();

	private List<Henkilo> henkilot ;


	@Override
	public void start(Stage alkuIkkuna) {

      GridPane paneeli = new GridPane();

      // asetetaan tilaa solmujen v‰lille
      paneeli.setHgap(5);
      paneeli.setVgap(5);
      // lis‰t‰‰n solmut

      paneeli.add(new Label("Nimi: "),0,0);
      paneeli.add(textFieldName, 0, 1);

      paneeli.add(new Label("Syntym‰aika (pp.kk.vvvv): "),0,3);
      paneeli.add(textFieldDateOfBirth, 0, 4);

      paneeli.add(labelAgeInYears, 0,5);

      paneeli.add(buttonCalculateAge, 0, 7);
      paneeli.add(buttonClear, 1, 7);
      paneeli.add(buttonQuit, 2, 7);


      // m‰‰ritell‰‰n asettelua
      paneeli.setAlignment(Pos.CENTER);


      // laske ik‰ -nappi
      buttonCalculateAge.setOnAction(e -> calculateAge());

      // tyhjenn‰ -nappi
      buttonClear.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			textFieldName.setText("");
			clearDateOfBirthField();

		}
      });

      // lopetus -nappi
      buttonQuit.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			Platform.exit();
			System.exit(0);
		}
	});


      //luodaan Scene ja n‰ytet‰‰n ikkuna
      Scene kehys = new Scene(paneeli, 400, 250);
      alkuIkkuna.setTitle("Teht‰v‰ 4");
      alkuIkkuna.setScene(kehys);
      alkuIkkuna.show();

      henkilot = new ArrayList<Henkilo>();

   }

   private void calculateAge() {
	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

	   // tyhjennet‰‰n aikaisempi ik‰-teksti
	   labelAgeInYears.setText("");

	   // yritet‰‰n parsia syntym‰aika
	   LocalDate date = null;
	   try {
			date = LocalDate.parse(textFieldDateOfBirth.getText(), formatter);
	   } catch (Exception e) {
		   date = null ;
	   }

	   // syntym‰ajan parsiminen onnistui
	   if (date != null) {
		   LocalDate today = LocalDate.now();

		   // onko syntym‰p‰iv‰ joko t‰n‰‰n tai aikaisempi p‰iv‰m‰‰r‰
		   if (today.compareTo(date) >= 0) {
			   long years = ChronoUnit.YEARS.between(date, today);
			   labelAgeInYears.setText("Ik‰: " + years + " vuotta");

			   // lis‰t‰‰n syˆtetty k‰ytt‰j‰ listaan
			   Henkilo henkilo = new Henkilo(textFieldName.getText(), date);
			   henkilot.add(henkilo);

		   } else {
			   // syntym‰p‰iv‰ on tulevaisuudessa -> virheilmoitus
			   clearDateOfBirthField();
			   showDialog("VIRHE:\nSyntym‰aika on tulevaisuudessa");
		   }

	   } else {
		   // syntym‰p‰iv‰ on virheellisess‰ muodossa -> virheilmoitus
		   clearDateOfBirthField();
		   showDialog("VIRHE:\n Anna p‰iv‰m‰‰r‰ muodossa pp.kk.yyy");
	   }

   }

   private void clearDateOfBirthField() {
	   textFieldDateOfBirth.setText("");
   }


   private void showDialog(String text) {
	   Stage dialog = new Stage();
	   dialog.initStyle(StageStyle.UTILITY);
	   dialog.setWidth(300);
	   dialog.setHeight(200);

	   Scene scene = new Scene(
			   new Group(
					   new Text(20, 50, text)
					   )
			   );

	   dialog.setScene(scene);
	   dialog.show();
   }


   public static void main(String [] args)
   {
      Application.launch(args);
   }



   /**
    * Henkilo -luokka
    *
    */
   public class Henkilo {

		private String nimi ;
		private LocalDate syntymaAika ;

		public Henkilo(String nimi, LocalDate syntymaAika) {
			super();
			this.nimi = nimi;
			this.syntymaAika = syntymaAika;
		}

		public String getNimi() {
			return nimi;
		}

		public void setNimi(String nimi) {
			this.nimi = nimi;
		}

		public LocalDate getSyntymaAika() {
			return syntymaAika;
		}

		public void setSyntymaAika(LocalDate syntymaAika) {
			this.syntymaAika = syntymaAika;
		}

   }


}