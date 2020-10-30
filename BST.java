/*
* Binary search tree data structure
* @author : 
*/

public class BST<T>
{
    /*
    * The root of the BST
    */
    Node<T> root;

    /*
    * Node class for a BST
    */
    private class Node<T>
    {
        Comparable<T> data;
        Node<T> left;
        Node<T> right;
        int instance;

        Node(Comparable<T> item)
        {
            data = item;
            instance = 1;
        }
    }

    public BST()
    {
        root = null;
    }

    /*
    * Find function that finds an item in the BST
    * @param item to be found
    * @return boolean if the item was found
    */
    public boolean find(Comparable<T> item)
    {
        return find(item, root);
    }

    /*
    * Function override of the find function
    * @param item to be found
    * @param node the current node you are at
    * @return boolean if the item was found
    */
    private boolean find(Comparable<T> item, Node<T> node)
    {
        //TODO FILL IN FUNCITON
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
    * Insert an item to the tree
    * @param item to insert
    */
    public void insert(Comparable<T> item)
    {
        root = insert(item, root);
    }

    /*
    * Helper function for insert
    * @param item to add
    * @param node you are at
    * @return node you traverse to
    */
    private Node<T> insert(Comparable<T> item, Node<T> node)
    {
        //TODO FILL IN FUNCITON
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
    * Function for deletion of a node
    * @param item to delete
    */
    public void delete(Comparable<T> item)
    {
        root = delete(item, root);
    }

    /*
    * Helper function for deletion of a node
    * @param item to delete
    * @param node you are at
    * @return node you traverse to
    */
    private Node<T> delete(Comparable<T> item, Node<T> node)
    {
        //TODO FILL IN FUNCITON
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
    * Function to find the range sum of the binary tree
    * @param L the left bound
    * @param R the right bound
    * @return The sum of the range in the binary tree
    */
    public int rangeSum(int L, int R)
    {
        //TODO FILL IN FUNCITON
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
    * Function to print the Binary tree
    */
    public void print()
    {
        print(root);
    }

    /*
    * Helper Function to print the Binary tree
    * @param root the root of the tree
    */
    private void print(Node<T> root)
    {
        //TODO FILL IN FUNCITON
        throw new UnsupportedOperationException("Not yet implemented");
    }
}