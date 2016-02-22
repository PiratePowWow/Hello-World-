import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by PiratePowWow on 2/17/16.
 */
public class Gson {

    public static void main(String[] args) {


        ArrayList<Email> allEmails = new ArrayList<>();
        allEmails.add(new Email("alice@gmail.com", "Hi", "What's up?"));
        allEmails.add(new Email("bob@gmail.com", "Hi", "What's up?"));
        allEmails.add(new Email("charlie@gmail.com", "Hi", "What's up?"));
        allEmails.add(new Email("alice@gmail.com", "Hi", "What's up?"));
        allEmails.add(new Email("bob@gmail.com", "Hi", "What's up?"));

        //Gson gson = new Gson;


        //ObservableList list = FXCollections.observableArrayList(gson.fromJson(json, new TypeToken<ArrayList<Contact>>(){}.getType()));





    }

}
