package hash;

import java.util.ArrayList;


/**
 * http://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
 * @author vinay
 *
 */
public class RunHashMapWithChaining 
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new Map<String,String>();
		map.insert("hitesh1", "vinay");
		map.insert("hitesh10", "harshu");
		map.insert("abc", "hello");
		
		System.out.println(map.get("hitesh1"));
		System.out.println(map.get("hitesh10"));
		System.out.println(map.get("abc"));
		System.out.println(map.getMapSize());
		System.out.println(map.remove("hitesh1"));
		System.out.println(map.getMapSize());
		System.out.println(map.get("hitesh1"));
	}
}

class Map<K,V>
{
	private ArrayList<LinkedList<K,V>> bucketArray;
	private  int mapSize =0;
	private int numOfBuckets =0;
	
	/** Initially create an arraylist having 10 indexes*/ 
	public Map()
	{
		bucketArray = new ArrayList<>();
		
		numOfBuckets = 10;
		for(int i=0;i<numOfBuckets;i++)
		{
			bucketArray.add(null);
		}
	}
	
	public int getMapSize()
	{
		return mapSize;
	}
	
	/** This is step 2 where we get the index of the  bucket where the key has to be set. Since hashcode can be negative, use Math.abs to
	 * get the positive value of the key and the index will be the reminder of the hash code divided by the index*/
	private int getBucketIndex(K key)
	{
		int hashCode = key.hashCode();
		hashCode = Math.abs(hashCode);
		int index = hashCode % numOfBuckets;
		return index;
		
	}
	/**
	 * This allows  us to remove the key and corresponding value from the map. First get the index where the key might be present. Once we get the 
	 * index iterate through the linked list of the index to get the key. If the key is found remove the key and reduce the size of the map by 1.
	 * 
	 * @param key
	 * @return
	 */
	public V remove(K key)
	{
		int bucketIndex = getBucketIndex(key);
		
		LinkedList<K,V> head = bucketArray.get(bucketIndex);
		
		LinkedList<K,V> previous=null;
		while(head != null)
		{
			if(head.key.equals(key))
			{
				mapSize--;
				break;
			}
			previous = head;
			head = head.next;
		}
		
		/* Remove key*/
		if(previous!=null)
		{
			previous.next = head.next;
		}else
		{
			/* If the key is in the first place of the selected index then move the head pointer to the 2nd location within the index */
			bucketArray.set(bucketIndex,head.next);
		}
		return head.value;
	}
	
	/** This is the third step in the flow. This method returns the value of the key searched for. First get the index of the key using getBucketIndex.
	 * Next iterate through the linkedlist of the index to get the value. If the key is not present then, this method will return null.
	 */
	public V get(K key)
	{
		int bucketIndex = getBucketIndex(key);
		LinkedList<K,V> head = bucketArray.get(bucketIndex);
		/** Iterate through the linked list of the index to get to the key object or till we reach null. If we reach null, there is no key and we can
		  *  return null.*/
		while(head!=null)
		{
			if(head.key == key)
			{
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	/** 
	 * This is the step where we add value to the map. We insert key value pair by first calculating the index of the array list where the 
	 * value has to be stored. Once we get the index, then check if the first element is null. This means we can insert value at this point.
	 * Else iterate through the linked list till we reach a point where we get head as null.
	 * Once we get the head as null, create a LinkedList object and store the key value pair and move the head to the next position.
	 * Also increase the size of the map only if we are inserting a new key.
	 * If the key is already present, then update the value of the key with new value. 
	 * @param key
	 * @param value
	 */
	public void insert(K key, V value)
	{
		int bucketIndex = getBucketIndex(key);
		LinkedList<K,V> head = bucketArray.get(bucketIndex);
		boolean shouldIncreaseSizeOfMap = true;
		while(head !=null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				shouldIncreaseSizeOfMap = false;
				break;
			}
			head = head.next;
		}
		
		if(shouldIncreaseSizeOfMap == true)
		{
			mapSize++;
		}
		
		head = bucketArray.get(bucketIndex);
		LinkedList<K,V> linkedList = new LinkedList<K,V>(key, value);
		linkedList.next = head;
		bucketArray.set(bucketIndex,linkedList);
		

	}
	
	
}

class LinkedList<K,V>
{
	
	LinkedList<K,V> next = null;
	K key;
	V value;
	
	public LinkedList(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
}
