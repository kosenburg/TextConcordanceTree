/**
 * Created by Kevin on 4/9/2017.
 */
public class BSTTree {
    private BinaryNode root;

    public BSTTree(BinaryNode root) {
        System.out.println("Setting root:" + root.getWord());
        setRoot(root);
    }


    public void addToTree(String word) {
        if (word != null) {
//            System.out.println("Adding " + word + " to tree.");
            addToTree(root, new BinaryNode(word));
        }
    }

    public BinaryNode getRoot() {
        return root;
    }

    private BinaryNode addToTree(BinaryNode currentNode, BinaryNode insertionNode) {

      //  System.out.println("Comparing the word " + insertionNode.getWord() + " to " + currentNode.getWord());
        int comparison = insertionNode.getWord().compareTo(currentNode.getWord());

        if (comparison < 0) {
    //        System.out.println("Word is smaller");
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(insertionNode);
            } else {
                currentNode.setLeft(addToTree(currentNode.getLeft(), insertionNode));
            }
        } else if (comparison > 0) {
  //          System.out.println("Word is larger");
            if (currentNode.getRight() == null) {
                currentNode.setRight(insertionNode);
            } else {
                currentNode.setRight(addToTree(currentNode.getRight(), insertionNode));
            }
        } else {
//            System.out.println("Word is already in list, incrementing counter");
            currentNode.incrementWordCount();
        }
        return currentNode;
    }

    private void setRoot(BinaryNode root) {
        this.root = root;
    }

    public void outputInorderTraversal() {
        startInorderTraversal(root);
    }

    private void startInorderTraversal(BinaryNode currentPoint) {

        if (currentPoint.getLeft() != null) {
            startInorderTraversal(currentPoint.getLeft());
        }

        System.out.println(currentPoint.getWord() + " " + currentPoint.getWordCount());

        if (currentPoint.getRight() != null) {
            startInorderTraversal(currentPoint.getRight());
        }
    }

    public void outputPreorderTraversal() {
        startPreorderTraversal(root, 0);
    }

    private void startPreorderTraversal(BinaryNode currentNode, int depth) {
        String line = "";
        for (int i = 0; i < depth; i++) {
            line += "\t";
        }

        System.out.println(line + currentNode.getWord() + " " + currentNode.getWordCount());

        if (currentNode.getLeft() != null) {
            startPreorderTraversal(currentNode.getLeft(), depth + 1);
        }

        if (currentNode.getRight() != null) {
            startPreorderTraversal(currentNode.getRight(), depth + 1);
        }
    }
}
