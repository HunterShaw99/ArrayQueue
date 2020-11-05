/**
* Test for ArrayQueue.java
* This file will be used to test methods implemented within ArrayQueue.java
* @author Hunter M. Shaw
*/

public class ArrayQueueDriver {

  public static void main (String[] args) {
    ArrayQueue<Integer> numbers = new ArrayQueue<>();
    System.out.println("Attempting to add 7: "+numbers.add(7)+" Should be true");
    System.out.println("Attempting to add 8: "+numbers.add(8)+" Should be true");
    System.out.println("Attempting to add 24: "+numbers.add(24)+" Should be true");
    System.out.println("Attempting to add 48: "+numbers.offer(48)+" Should be true");
    System.out.println("Attempting to look at Front of Queue: "+numbers.element()+" Should be 7");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 4");
    System.out.println("Attempting to remove front of queue: " + numbers.remove()+" should be 7");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 3");
    System.out.println("Attempting to add 87: "+numbers.offer(87)+" Should be true");
    System.out.println("Attempting to add 64: "+numbers.add(64)+" Should be true");
    System.out.println("Attempting to remove front of queue: " + numbers.poll()+" should be 8");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 4");
    System.out.println("Check if numbers is empty: "+numbers.isEmpty()+" Should be false");
    numbers.clear();
    System.out.println("Check if numbers is empty: "+numbers.isEmpty()+" Should be true");

  }
}
