package lab_2;

import java.util.NoSuchElementException;

class LinkedQueue
{
    protected Node front, rear;
    public int size;
    int capacity;

    public LinkedQueue(int capacity){
        this.capacity = capacity;
        front = null;
        rear = null;
        size = 0;
    }

    public LinkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
        capacity = -1;
    }

    public boolean isEmpty()
    {
        if(front == null) {
            System.out.println("Queue is empty.");
        }
       /* else {
            System.out.println("Queue is not empty.");
        }*/
        return front == null;
    }

    public boolean isFull()
    {
        {
            boolean status = false;
            if (size == capacity){
                System.out.println("Queue is full and contains " + size + " elements.");
                status = true;
            }
            else if (capacity == -1){
                System.out.println("Queue is never full.");
            }

            else {
                System.out.println("Queue is not full and contains " + size + " elements.");
            }

            return status;
        }
    }

    public int getSize()
    {
        System.out.println("Number of elements: "+ size);
        return size;
    }

    public void push(int data)
    {
        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        System.out.println("Inserted element: "+ data);
        size++ ;
    }

    public int pop()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        System.out.println("Deleted element: "+ front.getData());
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size-- ;
        return ptr.getData();
    }

    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        System.out.println("First element: "+ front.getData());
        return front.getData();
    }

    public void display()
    {
        System.out.print("Queue: ");
        if (size == 0)
        {
            System.out.print("Empty");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}