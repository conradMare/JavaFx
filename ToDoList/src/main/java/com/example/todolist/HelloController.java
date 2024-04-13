package com.example.todolist;

import com.example.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctors appointment", "See Dr.Smith at 123 Main Street",
                LocalDate.of(2016, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Finish Design Proposal", "I promised Mike I'd finish website mockups by Friday 22nd April",
                LocalDate.of(2016, Month.APRIL, 22));
        TodoItem item4 = new TodoItem("Pick up Doug at the train station", "Doug is arriving March 23 on the 5:00 train",
                LocalDate.of(2016, Month.MARCH, 23));
        TodoItem item5 = new TodoItem("Pick up dry cleaning", "The clothes should be ready by Wednesday",
                LocalDate.of(2016, Month.APRIL, 20));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}