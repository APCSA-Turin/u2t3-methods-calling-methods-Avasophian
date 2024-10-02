public class Letter {
    // instance variables

    String sender;
 
    public Letter(String sender) 
    { 
        this.sender = sender;
    }
    
    public void writeLetter(String x)
    {
        greeting(x);
        specialMessage();
        closing();

    }
    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is påretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + sender);
    }
}

