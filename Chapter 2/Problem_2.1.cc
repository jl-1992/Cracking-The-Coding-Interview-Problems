#include <iostream>
#include <unordered_set>
using namespace std;

struct Node
{
	Node * next;
	int data;

	Node(int newData, Node * newNext)
		: data(newData), next(newNext)
		{
		}

	static void printList(Node * n)
	{
		for(Node * temp=n;temp!=nullptr;temp=temp->next)
			cout << temp->data << " ";
	}

};

Node * remDups(Node * n)
{
	Node * lag=n;
	unordered_set<int> hs;
	for(Node * temp=n;temp!=nullptr;temp=temp->next)
	{
		if((hs.insert(temp->data)).second==false)
			lag->next = temp->next;
		if(temp!=lag)
			lag=lag->next;
		
	}
	return n;
}

int main(){
	Node * a = new Node(2,nullptr);
	Node * b = new Node(4,a);
	Node * c = new Node(4,b);
	Node * d = new Node(3,c);
	Node * e = new Node(1,d);
	Node * t=remDups(e);
	Node::printList(t);

	return 0;
}
