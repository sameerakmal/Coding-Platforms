class MyQueue
{
    QueueNode front, rear;
    int size = 0;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        QueueNode temp = new QueueNode(a);
        
        if(size == 0){
            front = rear = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
        size++;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if(size == 0){
            return -1;
        }
        else{
            int x = front.data;
            front = front.next;
            size--;
            return x;
        }
	}
	
}

