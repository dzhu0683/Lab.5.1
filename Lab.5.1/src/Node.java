import java.lang.reflect.Array;
import java.util.ArrayList;


public class Node 
{
	public String city;
	Node leftChild;
	Node rightChild;
	
	public Node(String city, Node firstChild, Node secondChild)
	{
		this.city = city;
		this.leftChild = firstChild;
		this.rightChild = secondChild;
	}
	
	public ArrayList<Node> getChildren()
	{
		ArrayList<Node> childNodes = new ArrayList<>();
		if(this.leftChild != null)
		{
			childNodes.add(leftChild);
		}
		if(this.rightChild != null)
		{
			childNodes.add(rightChild);
		}
		return childNodes;
	}
	
	public boolean removeChild(Node n)
	{
		return false;
	}

}
