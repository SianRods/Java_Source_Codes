
import java.util.Scanner;
public class TextUI {

    private Scanner scanner;

    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }

    public void start() {
        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Command: ");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "end":
                    System.out.println("Bye bye!");
                    shouldLoop = false;
                    break;
                case "add":
                    //ask for word
                    System.out.println("Word");
                    String wordInput = scanner.nextLine();
                    //ask for its translation
                    System.out.println("Translation");
                    String translationInput = scanner.nextLine();

                    //add it to the diction simpleDict
                    simpleDict.add(wordInput, translationInput);
                    break;
                case "search":
                    System.out.println("To be translated");
                    String wordToTranslate = scanner.nextLine();
                    
                    if (simpleDict.translate(wordToTranslate) == null) {
                        System.out.println("Word " + wordToTranslate + " was not found");
                    } else {
                        System.out.println(simpleDict.translate(wordToTranslate));
                    }

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}

