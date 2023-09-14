import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean exitChat = false;

    System.out.println("JavaGPT");
    System.out.print("Enter your name:");
    String user = scanner.nextLine();

    while (!exitChat) {
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }

      System.out.print(user + ": ");
      String input = scanner.nextLine();

      if (input.equals("hi") || input.equals("hello") || input.equals("sup") || input.equals("Hi") || input.equals("Sup") || input.equals("Hello") || input.contains("sup") || input.contains("Sup") || input.contains("Hii") || input.contains("hii")) {
        System.out.println("JavaGPT: Hello! How can I assist you today?");
      } else if (input.contains("bye") || input.contains("Bye")) {
        System.out.println("JavaGPT: Goodbye! If you ever have more questions or need assistance in the future, feel free to return. Have a great day!");
      } else if (input.contains("thank") || input.contains("Thank")) {
        System.out.println("JavaGPT: You're welcome! If you have any more questions or need further assistance in the future, feel free to reach out!");
      } else if (input.contains("help") || input.contains("Help")) {
        System.out.println("JavaGPT: Of course! I'm here to help. Please let me know what you need assistance with, and I'll do my best to provide you with the information or guidance you're looking for.");
      } else if (input.equals("calculator")) {
        System.out.println("JavaGPT: Of course! I'd be happy to help you with your calculations.");
        System.out.print("JavaGPT: X = ");
        double x = scanner.nextDouble();
        System.out.print("JavaGPT: Y = ");
        double y = scanner.nextDouble();
        double add = x + y;
        double sub = x - y;
        double mul = x * y;
        double div = x / y;
        System.out.println("JavaGPT: " + x + " + " + y + " = " + add);
        System.out.println("JavaGPT: " + x + " - " + y + " = " + sub);
        System.out.println("JavaGPT: " + x + " times " + y + " = " + mul);
        System.out.println("JavaGPT: " + x + " divide by " + y + " = " + div);
      } else if(input.equals("ok") || input.equals("Ok") || input.contains("okay") || input.contains("Okay")) {
        System.out.println("JavaGPT: Is there anything else I can help you with?");
      } else if(input.contains("what is your name") || input.contains("What is your name") || input.contains("what is ur name") || input.contains("What is ur name") || input.contains("whats is ur name") || input.contains("Whats ur name") || input.contains("whats your name") || input.contains("whats your name")) {
        System.out.println("JavaGPT: My name is JavaGPT. Is there anything else I can help you with?");
      } else if(input.contains("how are you") || input.contains("How are you") || input.contains("How r u") || input.contains("how r u") || input.contains("how are u") || input.contains("How are u") || input.contains("how r you") || input.contains("How r you")) {
        System.out.println("JavaGPT: Thank you for asking! I'm just a computer program, so I don't have feelings, but I'm here to help you with any questions or tasks you have. How can I assist you today?");
      } else if(input.equals("no") || input.equals("No")) {
        System.out.println("JavaGPT: Alright.");
      } else if(input.contains("when is your birthday") || input.contains("When is your birthday") || input.contains("when is ur birthday") || input.contains("When is ur birthday") || input.contains("Whens your birthday") || input.contains("whens ur birthday") || input.contains("when is ur bday") || input.contains("When is ur bday") || input.contains("whens ur bday") || input.contains("Whens ur bday")) {
        System.out.println("JavaGPT: I don't have a birthday because I am a computer program, so I don't have a physical form or a birthdate. My existence is based on lines of code and data, rather than a biological or personal history. Is there anything else you'd like to know or discuss?");
      } else if (input.contains("sorry") || input.contains("Sorry") || input.equalsIgnoreCase("srry")) {
        System.out.println("JavaGPT: No need to apologize! If you have any more questions or if there's anything else you'd like to know or discuss, feel free to ask. I'm here to help!");
      } else if (input.contains("i love you") || input.contains("I love you") || input.equalsIgnoreCase("i love you") || input.equalsIgnoreCase("i luv you") || input.equalsIgnoreCase("i luv u") || input.equalsIgnoreCase("i love u") || input.equalsIgnoreCase("i like u") || input.equalsIgnoreCase("i like you")) {
        System.out.println("JavaGPT: I'm just a computer program, so I don't have feelings, but I'm here to assist you and provide information to the best of my abilities. How can I assist you today?");
      } else if (input.equalsIgnoreCase("what is my name") || input.equalsIgnoreCase("whats my name")) {
        System.out.println("Your name is " + user);
      }

      else {
        System.out.println("JavaGPT: Sorry, I do not understand.");
      }
    }

    scanner.close();
  }
}
