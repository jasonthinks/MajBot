package chatbot;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Seyed Majid Khosravi
 */
public class State {

    private String id = "";
    private ArrayList<String> messages;
    private ArrayList keywords;
    public String argument = "";

    // default constructor, constructs State object
    public State(String id, ArrayList messages, ArrayList keywords) {
        this.id = id;
        this.messages = messages;
        this.keywords = keywords;
    }

    // get state id
    public String getId() {
        return id;
    }

    // get random state messages
    public String getMessage() {
        Random generator = new Random();
        return getMessage(argument);
    }

    // replace message dynamic field with given argument
    public String getMessage(String arg){
        System.out.println("arg:" + arg);
        Random generator = new Random();
        String message = messages.get(generator.nextInt(messages.size()));
        return Regex.replace(message,arg);
    }

    // set the argument from regex matcher
    public void setRegex(String argument){
        this.argument = argument;
    }

    // get state keywords
    public ArrayList getKeywords() {
        return keywords;
    }
}
