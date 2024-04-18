package com.example.todolist;

import com.example.todolist.datamodel.TodoData;
import com.example.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    // Instance variables for todoItemDialog.fxml:
    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    // Method that is going to be doing the processing: (After "OK" is pressed)
    public void processResults() {
        // Want to gather the users input, create a new todoItem, add it to our list in todoData instance
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        // Get instance and add todoItem:
        TodoData.getInstance().addTodoItem(new TodoItem(shortDescription, details, deadlineValue));
    }
}
