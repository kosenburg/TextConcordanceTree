/**
 * Created by Kevin on 4/9/2017.
 */
public class BinaryNode {
    private String word;
    private int wordCount;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(String word, BinaryNode leftChild, BinaryNode rightChild) {
        setWord(word);
        this.left = leftChild;
        this.right = rightChild;
        this.wordCount = 1;
    }

    public void incrementWordCount() {
        wordCount++;
    }

    public BinaryNode(String word) {
        this(word,null,null);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        System.out.println("Setting the left child of " + word +" to " + left.getWord());
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        System.out.println("Setting the right child of " + word + " to " + right.getWord());
        this.right = right;
    }

    public int getWordCount() {
        return wordCount;
    }
}
