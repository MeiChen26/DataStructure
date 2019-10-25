package ch09;

import ch002.LinkList.LinkList;

public class HashTable<E> {
    public LinkList[] table;
    public HashTable(int size) {
    	this.table = new LinkList[size];
    	for(int i = 0; i < table.length; i++) {
    		table[i] = new LinkList();
    	}
    }
    public int hash(int key) {
    	return key % table.length;
    }
    
    public void insert(E element) throws Exception{
    	int key = element.hashCode();
    	int i = hash(key);
    	table[i].insert(0, element);
    } 
    
    public void printHashTable() {
    	for(int i = 0; i<table.length; i++) {
    		System.out.print("table[" + i + "]=");
    		table[i].display();
    	}
    }
    
    public Object search(E element) throws Exception{
    	int key = element.hashCode();
    	int i = hash(key);
    	int index = table[i].indexOf(element);
    	if(index >= 0) {
    		return table[i].get(index);
    	}
    	else {
    		return null;
    	}
    }
    
    public boolean contain(E element) throws Exception{
    	return this.search(element) != null;
    }
    
    public boolean remove(E element) throws Exception{
    	int key = element.hashCode();
    	int i = hash(key);
    	int index = table[i].indexOf(element);
    	if(index >= 0) {
    		table[i].remove(index);
    		return true;
    	}
    	else {
    		return false;
    	}
    		
    }
}
