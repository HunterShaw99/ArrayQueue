/**
 * This is a simplified interface for Queue, based on the Java API.
 * See <a href="https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Queue.html">this documentation</a>
 * for more details.

 * @author Stephen J. Sarma-Weierman
 * @author Hunter M. Shaw
 * @version 1.0
 */
public interface Queue<T> {

	/**
	 * See the documentation linked above for more details. Instead of throwing an exception
	 * if the maximum capacity is exceeded, we'll return false (if there is a capacity restriction).
	 * @param obj - object to be added.
	 * @return true if successful.
	 */
	public boolean add(T obj);

	/**
	 * Adds specified element to queue.
	 * @return add(T obj) if successful.
	 * @return false if unsuccessful.
	 */
	public boolean offer(T obj);

	/**
	 * Gets and removes front of queue.
	 * @return (T)Object o.
	 */
	public T remove();

	/**
	 * Get and remove front of queue.
	 * @return remove() if successful.
	 * catch (NoSuchElementException ex).
	 * @return null.
	 */
	public T poll();

	/**
	 * Method to get the front of the queue.
	 * @return (T)queue[front].
	 * Otherwise Throws NoSuchElementException.
	 */
	public T element();

	/**
	 * @returns element() if successful
	 * @returns null if queue is empty
	 */
	public T peek();

	/**
	 * Searches collection specified element. Returns true
	 only if Objects.equals(o, T)
	 * @param obj - element to search for within the collection.
	 * @return true if obj is found
	 * @return false if obj is not found
	 */
	public boolean contains(Object o);

	/**
	 * @returns size.
	 */
	public int size();

	/**
	 * Removes all emements from the collection.
	 * Resets queue[front] to zero.
	 * resets queue[back] to zero.
	 */
	public void clear();

	/**
	 * Checks if collection is empty.
	 * @returns size == 0.
	 */
	public boolean isEmpty();

	/**
	 * Returns an object array containing all elements within the collection.
	 * This method oes preserve the order of the circular queue.
	 * The methods returned array's runtime type is Object.
	 * @return arr
	 */
	public Object [] toArray();

	/**
	 * Returns array contining all emements within the collection.
	 * The runtime type of returned array is that of the specified array.
	 * If collection fits within specified array returned that array.
	 * Otherwise, a new array is allocated.
	 * Returns array of type T.
	 * @return arr
	 */
	public T[] toArray(T[] a);
}
