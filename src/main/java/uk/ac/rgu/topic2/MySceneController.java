package uk.ac.rgu.topic2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * A Controller class provides the functionality to JavaFX scenes. Interactive components in the scene (e.g., Buttons)
 * are assigned a method that will be executed when an event occurs (e.g., clicking a Button). Controllers are specified
 * in the Controller pane, on the left-hand side of the scene builder.
 * 
 * Note that Controller classes must be in the same package in src/main/java as the scene in src/main/resources.
 * For example, if a scene is in the folder uk/ac/rgu/topic2, then its Controller must be the in uk.ac.rgu.topic2. 
 */
public class MySceneController {
    

    /**
     * For a Controller class to use a component in a Scene, the component must be here as a field.
     * The name of the field must match the fx:id provided in the Code panel of the Scene Builder.
     * Components also need the @FXML annotation so the compiler knows they are referring to a component 
     * in an FXML file. If you don't add @FXML, or the name doesn't match an fx:id, you'll get a NullPointerException
     * when trying to use the field.
     */
    @FXML 
    private Button btnMyButton;

    @FXML
    private Label lblMessage;

    /**
     * This method is assigned to the event action of the btnMyButton Button. If you use private methods for event
     * handlers (recommended) these also need the @FXML annotation so the scene can see them.
     */
    @FXML
    private void btnMyButtonOnClick(){
        this.lblMessage.setText("Hello world");
    }
}
