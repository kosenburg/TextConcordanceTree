import java.io.*;
import java.util.LinkedList;

public class Main {

    private static BSTTree tree;
    private static LinkedList<String> listOfWords;

    public static void main(String[] args) throws IOException {
	    String pathToFile = "C:\\Users\\Kevin\\IdeaProjects\\TextConcordanceTree\\src\\test.txt";

        readWordsFromFile(pathToFile);

        tree = new BSTTree(new BinaryNode(listOfWords.poll()));
        for (String word: listOfWords) {
            tree.addToTree(word);
        }

        tree.outputInorderTraversal();
        //tree.outputPreorderTraversal();
    }

    private static void readWordsFromFile(String pathToFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        listOfWords = new LinkedList<>();

        String line;
        System.out.println("Filling linked list");
        while ((line  = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word: words) {
                if (!word.equals("")) {
                    listOfWords.add(word);
                }
            }
        }


    }
}
