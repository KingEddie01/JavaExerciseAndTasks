package DiaryPackage;

import javax.swing.*;
import java.time.LocalDate;


public class DiaryMain {
    private static String username;
    private static String password;
    private static  String  title;
    private static String   body;
    private static final LocalDate date = LocalDate.now();
    static Diaries diary = new Diaries();
    static Entry entry;

    public static void main(String[] args) {
        mainDisplay();
    }

    public static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }


    public static String collectInput(String input) {
        return JOptionPane.showInputDialog(null, input);
    }

    public static void mainDisplay() {
        display("WELCOME TO EDDIE'S DIARY");
        display("\"your story, your life!!!\"");
        String choice = collectInput("""
                Select an option
                HOME PAGE
                1.Create Account:
                2.Login:
                0.Exit
                """);
        switch (choice) {
            case "1" -> {
                createAccount();
            }
            case "2" -> {
                login();
            }
            case "0" -> {
            }
            default -> exit();
        }
    }

    public static void exit() {
        display("Thanks for using Eddie's Dairy");
        display("");
        System.exit(0);
    }

    public static void login() {
        display("Login Username and Password");
        try {
            username = collectInput("Enter Username");
            password = collectInput("Enter Password");
            if (diary.findByUsername(username).getPassword().equals(password)) {
                display("Login successful");
                menuDisplay();
            }
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
            loginDisplay();

        }
    }

    public static void loginDisplay() {
        String select = collectInput("""
                Select an option
                1. Login
                2. Create a new account
                0. Exit
                """);
        switch (select) {
            case "1" -> {
                login();

            }
            case "2" -> {
                createAccount();
            }
            case "0" -> {
                exit();
            }
        }
    }

    public static void createAccount() {
        display("Create Account");
        username = collectInput("Enter Username");
        password = collectInput("Enter password");
        if (username.isEmpty()) {
            display("Enter Valid Username");
            createAccount();
        } else if (password.isEmpty()) {
            display("Enter Valid Password");
            createAccount();
        } else {
            display("Username and Password created successfully on" + " " + date);
            diary.addDiary(username, password);
            menuDisplay();
        }
    }

    public static void menuDisplay() {
        String choiceMenu = collectInput("""
                MENU
                1.Create Entry:
                2.Update Entry:
                3.Find Entry:
                4.Delete Entry:
                0.Exit
                """);
        switch (choiceMenu) {
            case "1" -> {
                createEntry();
            }

            case "2" -> {
                updateEntry();
            }

            case "3" -> {
                findEntry();
            }

            case "4" -> {
                deleteEntry();
            }

            case "0" -> {
                mainDisplay();
            }
        }
    }
    public static void findEntry() {
        display("Find Entry");
        try {
            String id = collectInput("Enter id");
            diary.findByUsername(username).findEntry(Integer.parseInt(id));
            display(diary.findByUsername(username).findEntry(Integer.parseInt(id)).getEntry());
            entryDisplay();
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
            entryDisplay();
        }
    }

    public static void entryDisplay() {
        String selectFind = collectInput("""
                Select an option: 
                1.Find New Entry:
                0.Exit
                """);
        switch ((selectFind)) {
            case "1" -> {
                findEntry();
            }
            case "0" -> {
                menuDisplay();
            }
        }
    }

    public static void deleteEntry() {
        display("Delete entry");
        String id = null;
        try {
            id = collectInput("Enter id");
            diary.findByUsername(username).deleteEntry(Integer.parseInt(id));
            display(diary.findByUsername(username).findEntry(Integer.parseInt(id)).getEntry());
        } catch (IllegalArgumentException e) {
            display("Entry" + " " + id + " " + "was deleted successfully");
        }
        String selectDelete = collectInput("""
                Select an option:
                1.Delete New Entry:
                0.Exit""");
        switch ((selectDelete)) {
            case "1" -> {
                deleteEntry();
            }
            case "0" -> {
                menuDisplay();
            }
        }
    }

    public static void updateEntry() {
        display("Update Entry");
        String id = collectInput("Enter id");
        entry = diary.findByUsername(username).findEntry(Integer.parseInt(id));
        String newTitle = collectInput("Enter New title");
        String newBody = collectInput("Enter New body");
        diary.findByUsername(username).updateEntry(Integer.parseInt(id), title, body);
        entry.setTitle(newTitle);
        entry.setBody(newBody);
        display("Entry has been updated successfully on" + " " + date);
        displayOption();

    }

    public static void displayOption(){
        String selectUpdate = collectInput("""
               Select an option:
               1.Update Entry:
               0.Exit""");
        switch ((selectUpdate)){
            case "1"-> {updateEntry();}
            case "0"-> {menuDisplay();}
            default->{
                display("Enter a valid option");
                displayOption();
            }
        }
    }
    public static void createEntry() {
        display("Create Entry");
        title = collectInput("Enter title");
        body = collectInput("Enter body");
        diary.addDiary(title, body);
        diary.findByUsername(username).createEntry(title, body);
        display("Successfully created entry on" + " " + date);
        displayCreateEntry();
    }
    public static void displayCreateEntry(){
        String selectEntry = collectInput("""
                Select an option: 
                1.Create New Entry:
                0.Exit""");
        switch ((selectEntry)){
            case "1"-> {createEntry();}
            case "0"-> {menuDisplay();}

            default->{
                display("Enter a valid option");
                displayCreateEntry();
            }
        }
    }

}




