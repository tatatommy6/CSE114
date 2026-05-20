/*
 * IntList.java
 * Last modified by J.Finn: 17-May-2026
 * interface for a list type with just a few operations.
 * List positions are number from 0, like arrays.
 * If the size is N, the positions in use are [0..N-1]
 
 get(i), set(i), add(i) remove(i)
 */

public interface IntList
{
	/* 
		Return number of elements currently
		stored on the stack. 0 means an empty
		stack
	 */
	public int size();

	/* 
		Return item at position i on list
		i must be in the range 0 <= i < size
	 */
	public int get(int i);
		
	/* 
		Replace the value at postion i on list
		by the given value.
		i must be in the range 0 <= i < size
		Returns: the value previously at position i
	 */
	public int set(int i, int value);
	
	/*
		add the value at position i in the list.
		the items that were at positions i..size-1
		will all have their positions increased by 1.
		i must be in the range 0 <= i <= size (if i == size
		then the new value is appended at the end of
		the list.
	 */
	public void add(int i, int value);
	
	/*
		append value to the end of the list.
	 */
	public void add(int value);

	/*
		remove the item at position i on
		the list.
		i must be in the range 0 <= i < size;
		All items on the list with postions i+1..size-1
		will have their positions decreased by 1.
		Returns: the value that was removed
	 */
	public int remove(int i);
};
