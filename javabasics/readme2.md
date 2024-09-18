# day 2
# Array:

* In Java, an array is a collection of elements of the same data type, stored in a contiguous memory location.
* Arrays are useful for storing multiple values in a single variable and can be used with both primitive data types (e.g., int, char, float) and reference types (e.g., String, objects).
* Declaring and Initializing Arrays:
  1.Declaration: An array must first be declared, specifying its data type.
  2.Instantiation: The array is then instantiated using the new keyword.
  3.Initialization: Finally, the array can be initialized with values.

## Multidimensional Arrays :
* Java allows the creation of arrays with more than one dimension, such as 2D arrays (arrays of arrays).

## Limitations of Arrays:
* Fixed Size: The size of an array is fixed at the time of creation, so you cannot resize it dynamically.
* Homogeneous Data: Arrays can only store elements of the same type.
* Limited Built-in Functions: Compared to collections (like ArrayList), arrays have fewer utility methods.

## 2D Arrays in Java
* A 2D array, or matrix, in Java is essentially an array of arrays. Each element of a 2D array can be accessed using two indices: one for the row and one for the column.

* int[][] matrix = new int[3][3];  // 3x3 matrix(initializatin of matirx array).

## 2D Array Operations: Matrix Addition and Matrix Multiplication

* 1. Matrix Addition:
* Matrix addition is only possible if the two matrices have the same dimensions. For two matrices A and B of size m x n, the sum C = A + B is also a matrix of size m x n, where each element C[i][j] = A[i][j] + B[i][j].

* 2. Matrix Multiplication:
* Matrix multiplication is possible when the number of columns of the first matrix (A) is equal to the number of rows of the second matrix (B).
* For matrices A of size m x n and B of size n x p, the product C = A * B is a matrix of size m x p, where each element C[i][j] = sum(A[i][k] * B[k][j]) for all k.


# Linked Lists :

* Linked lists are a fundamental data structure in data structures and algorithms (DSA).
* Unlike arrays, linked lists store elements in a sequence where each element (or node) points to the next element, allowing for dynamic memory allocation and efficient insertion and deletion operations.

## Types of Linked Lists
* 1.Singly Linked List: Each node points to the next node and the last node points to null.
* 2.Doubly Linked List: Each node has two pointers: one to the next node and one to the previous node.
* 3.Circular Linked List: The last node points back to the first node, forming a loop.

## Structure of a Linked List Node (Java Example):

class Node{
int data ;
Node next;

Node(int data){
this.data = data;
this.next = null;
}
}

## Singly Linked List Operations
* 1.Insertion: Add a new node to the linked list (at the beginning, end, or specific position).
* 2.Deletion: Remove a node from the linked list (from the beginning, end, or specific position).
* 3.Traversal: Traverse the entire linked list to access the elements.
* 4.Searching: Search for an element in the linked list.

## Doubly Linked List
*  In a doubly linked list, each node has a pointer to both the next and the previous node, allowing traversal in both directions.

## Operations in a Doubly Linked List:
* 1.Insert at Beginning: Update both next and prev pointers.
* 2.Insert at End: Traverse the list and update the last node’s next pointer and new node’s prev.
* 3.Delete a Node: Update both prev and next pointers of adjacent nodes.

## Circular Linked List
* In a circular linked list, the last node points to the first node, making the list circular.
* It can be singly or doubly linked. Traversal starts at the head and continues until the head is reached again.

## Common Problems Involving Linked Lists
* 1.Detect a Cycle in a Linked List:
Use Floyd’s cycle-finding algorithm (Tortoise and Hare).
* 2.Reverse a Linked List:
Reverse the pointers to reverse the linked list.
* 3.Find the Middle of a Linked List:
Use the slow and fast pointer technique to find the middle node.
* 4.Merge Two Sorted Linked Lists:
Merge two sorted linked lists into a single sorted list.
* 5.Remove Duplicates from a Sorted Linked List:
* 6.Traverse the list and remove duplicate nodes.
* 7.Nth Node from the End:
Use two pointers to find the nth node from the end of the list.