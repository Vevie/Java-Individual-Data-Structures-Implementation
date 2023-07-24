import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Queue<Integer> queue = new Queue<>();

        int choice;

        do {
            System.out.println("Please select an option");
            System.out.println("1. Stack");
            System.out.println("2. Linked List");
            System.out.println("3. Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    handleStackOperations(scanner, stack);
                    break;
                case 2:
                    handleLinkedListOperations(scanner, linkedList);
                    break;
                case 3:
                    handleQueueOperations(scanner, queue);
                    break;
                case 4:
                    System.out.println("Exiting..... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void handleStackOperations(Scanner scanner, Stack<Integer> stack) {
        int choice;
        do {
            System.out.println("");
            System.out.println("Stack Options:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    try {
                        int peekedElement = stack.peek();
                        System.out.println("Peeked element: " + peekedElement);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Stack size: " + stack.size());
                    break;
                case 5:
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void handleLinkedListOperations(Scanner scanner, LinkedList<Integer> linkedList) {
        int choice;
        do {
            System.out.println("");
            System.out.println("Linked List Options:");
            System.out.println("1. Add Front");
            System.out.println("2. Add End");
            System.out.println("3. Remove Front");
            System.out.println("4. Size");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add at the front: ");
                    int element = scanner.nextInt();
                    linkedList.addFront(element);
                    break;
                case 2:
                    System.out.print("Enter the element to add at the end: ");
                    int endElement = scanner.nextInt();
                    linkedList.addEnd(endElement);
                    break;
                case 3:
                    try {
                        int removedElement = linkedList.removeFront();
                        System.out.println("Removed element from the front: " + removedElement);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Linked list is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Linked list size: " + linkedList.size());
                    break;
                case 5:
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void handleQueueOperations(Scanner scanner, Queue<Integer> queue) {
        int choice;
        do {
            System.out.println("");
            System.out.println("Queue Options:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    try {
                        int dequeuedElement = queue.dequeue();
                        System.out.println("Dequeued element: " + dequeuedElement);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    try {
                        int peekedElement = queue.peek();
                        System.out.println("Peeked element: " + peekedElement);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Queue size: " + queue.size());
                    break;
                case 5:
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
