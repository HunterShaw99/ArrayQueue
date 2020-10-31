/**
* Test for ArrayQueue.java
* This file will be used to test methods implemented within ArrayQueue.java
* @author Hunter M. Shaw
*/

public class ArrayQueueDriver {

  public static void main (String[] args) {
    ArrayQueue<Integer> numbers = new ArrayQueue<>();
    System.out.println("Atempting to add 7: "+numbers.add(7)+" Should be true");
    System.out.println("Atempting to add 7: "+numbers.add(8)+" Should be true");
    System.out.println("Atempting to add 7: "+numbers.add(24)+" Should be true");
    System.out.println("Atempting to add 7: "+numbers.offer(48)+" Should be true");
    System.out.println("Atempting to look at Front of Queue: "+numbers.element()+" Should be 7");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 4");
    System.out.println("Check if numbers is empty: "+numbers.isEmpty()+" Should be false");
    numbers.clear();
    System.out.println("Check if numbers is empty: "+numbers.isEmpty()+" Should be true");
  }
}
