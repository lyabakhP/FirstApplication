//import java.util.PriorityQueue;
//import java.util.PriorityQueue;
import java.util.Scanner;

//abacabad
public class Huffman {
//	public int Counter(String str, char ch) {
//		return 1;
//	} 
//	
//	public void sort_arrays(int sorted_value[],char sorted_key[] ) {
//		
//	} 
	//public class MaxPQ<Key extends Comparable<Key>>{}
	public class Node{
		final int sum;// sum of frequency in sub-tree
		public Node(int sum) {
			this.sum = sum;
		}
	}
	
	public class InternalNode extends Node{
		Node left;
		Node right;
		public InternalNode(Node left, Node right) {
			super(left.sum+right.sum);
			this.left = left;
			this.right = right;
		}
	}
	
	public class LeafNode extends Node{
		char symbol;
		//int frequency;
		public LeafNode(char symbol, int frequency) {
			super(frequency);
			this.symbol = symbol;
			//this.frequency = frequency;
		}
	}
	
	//PriorityQueue<Node> sfs=new PriorityQueue<>();
	// frequency of char
	public static void Huffman_Func(String word) {
		//System.out.println(word);
		char key[] = new char[26];
		int value[] = new int[26];
		int counter=0;
		int length_of_arrays = 0;
		String str = word;
		int j=0;
		while(str.length()>0) {
			//System.out.println("Length: "+str.length());
			char ch = str.charAt(0);
			//System.out.println("Char: "+ch);
			
			for(int i=0;i<word.length();i++) {
				if(ch==word.charAt(i)) {
					counter++;
					int char_to_del = str.indexOf(ch);
					StringBuilder sb = new StringBuilder(str);
					sb.deleteCharAt(char_to_del);
					str = sb.toString();
				}
			}
			
			key[j]= ch;
			value[j]=counter;
			j++;
			length_of_arrays++;
			counter=0;
			}
		
		// sort arrays by min frequency
		char sorted_key[] = new char[length_of_arrays];
		int sorted_value[] = new int[length_of_arrays];
		System.arraycopy(key, 0, sorted_key, 0,length_of_arrays);
		System.arraycopy(value, 0, sorted_value, 0,length_of_arrays);
		int buff_value = 0;
		char buff_key;
		for(int i=0;i<sorted_value.length;i++) {
			for (int k = 0; k < sorted_value.length; k++) {
				if(sorted_value[i]<sorted_value[k]) {
					buff_value = sorted_value[i];
					sorted_value[i]=sorted_value[k];
					sorted_value[k]=buff_value;	
					
					buff_key = sorted_key[i];
					sorted_key[i]=sorted_key[k];
					sorted_key[k]=buff_key;	
				}
			}
		}
		
		
		// adding leafs to node
		LeafNode leaf_array[] = new LeafNode[length_of_arrays];
		
		for(int i=0;i<sorted_value.length;i++) {
			char character = sorted_key[i];
			int frequency = sorted_value[i];
			LeafNode leafnode = new Huffman().new LeafNode(character, frequency);
			leaf_array[i] = leafnode;
		}
		
		
		InternalNode internal[] = new InternalNode[(length_of_arrays/2)+1];
		int index_of_Node=0;
		int sum =0;
		for(int i=0;i<leaf_array.length;i++) {
			LeafNode left = leaf_array[i];
			LeafNode right = leaf_array[i+1];
			InternalNode intern_node = new Huffman().new InternalNode(left, right);
			sum+=intern_node.sum;
			internal[index_of_Node]= intern_node;
			i++;
			index_of_Node++;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input_string = sc.next();
		Huffman_Func(input_string);
	}

}
