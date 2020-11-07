/**
* Test for ArrayQueue.java
* This file will be used to test methods implemented within ArrayQueue.java
* @author Hunter M. Shaw
*/

public class ArrayQueueDriver {

  public static void main (String[] args) {
    ArrayQueue<Integer> numbers = new ArrayQueue<>();
    System.out.println("Attempting to add 7: "+numbers.add(7)+" Should be true.");
    System.out.println("Attempting to add 8: "+numbers.add(8)+" Should be true.");
    System.out.println("Attempting to add 24: "+numbers.add(24)+" Should be true.");
    System.out.println("Attempting to add 48: "+numbers.offer(48)+" Should be true.");
    System.out.println("Attempting to look at Front of Queue: ["+numbers.element()+"] Should be 7.");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 4.");
    System.out.println("Attempting to remove front of queue: [" + numbers.remove()+"] should be 7.");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 3.");
    System.out.println("Attempting to add 87: "+numbers.offer(87)+" Should be true.");
    System.out.println("Attempting to add 64: "+numbers.add(64)+" Should be true.");
    System.out.println("Searching queue for 64 "+numbers.contains(64)+" Should be true.");
    System.out.println("Printing out values in queue:");
    for (Object y : numbers.toArray()) {
      System.out.print(y+" ");
    }
    System.out.println("Should be [8 24 48 87 64] in that order.");
    System.out.println("Searching queue for 87 "+numbers.contains(87)+" Should be true.");
    System.out.println("Attempting to remove front of queue: [" + numbers.poll()+"] should be 8.");
    System.out.println("Size of numbers: "+numbers.size()+" Should be 4.");
    System.out.println("Check if numbers is empty: "+numbers.isEmpty()+" Should be false.");
    System.out.println("Clearing numbers.");
    numbers.clear();
    System.out.println("Size of numbers: "+numbers.size()+" Should be 0.");
    System.out.println("Searching numbers for 64 "+numbers.contains(64)+" Should be false.");
    System.out.println("Check if numbers is empty: "+numbers.isEmpty()+" Should be true.");
    for (int i = 1; i <= 15; i++) {
      System.out.println("Attempting to add "+i+" "+numbers.add(i));
    }
    System.out.println("Size of numbers: "+numbers.size()+" Should be 15.");
    System.out.println("Attempting to remove front of queue: [" + numbers.remove()+"] should be 1.");
    System.out.println("Attempting to look at Front of Queue: ["+numbers.peek()+"] Should be 2.");
    System.out.println("Attempting to remove front of queue: [" + numbers.poll()+"] should be 2.");
    System.out.println("Printing out values in queue:");
    for (Object k : numbers.toArray()) {
      System.out.print(k+" ");
    }

  }
}
