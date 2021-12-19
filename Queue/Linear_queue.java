import java.io.InputStream;
import java.util.Scanner;

public class Linear_queue {
    
    private int front;
    private int rear;
    private int maxSize;
    private Object[] queueArray;
    
    //Queue 생성
    public Queue(int maxSize){
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.queueArray = new Object[maxSize];
    }
    
    //Queue 비었는지 확인
    public boolean empty(){
        return (front == rear+1);
    }
    
    //Queue 꽉 찼는지 확인
    public boolean full(){
        return (rear == maxSize-1);
    }
    
    //Queue에 item 입력
    public boolean enqueue(Object item){
        if(full()){
            System.out.println("Queue is FULL!!");
            return false;
        }
        queueArray[++rear] = item;
        return true;
    }
 
    //Queue 가장 먼저들어온 데이터 출력
    public Object dequeue(){
        if(empty()){
            System.out.println("Queue is EMPTY!!");
            return null;
        }else{
            Object item = queueArray[front];
            queueArray[front] = null;
            front++;
            return item;
        }
    }
    
    //Queue 출력
    public void printQueue(Queue queue){
        if(!empty()){
            for(int i = 0; i<maxSize; i++ ){
                if(queue.queueArray[i] == null){
                    System.out.print("|\t\t");
                }else{
                    System.out.print("|\t"+ queue.queueArray[i]+ "\t");
                }
            }
            System.out.println(" |");
        }else{
            System.out.println("큐 비어있음");
        }    
    }
    
    public static void main(String[] args) {
 
        InputStream a = System.in;
        Scanner sc = new Scanner(a);
        
        System.out.println("큐 SIZE 입력 : ");
        int size = sc.nextInt();
        Queue arrayQueue = new Queue(size); //create queue
        
        boolean flag = true;
        
        while(flag){
            menu();
            String s = sc.next();
            switch(s){
            case "1":
                System.out.print("ENQUEUE : ");
                String data = sc.next();
                arrayQueue.enqueue(data);
                break;
            case "2":
                System.out.println("DEQUEUE : " + arrayQueue.dequeue());
                break;
            case "3":
                arrayQueue.printQueue(arrayQueue);
                break;
            case "q":
            case "Q":
                flag = false;
                break;
            }
        }
    }
    public static void menu(){
        System.out.println("1. enQueue");
        System.out.println("2. deQueue");
        System.out.println("3. QUEUE");
        System.out.println("Q. 종료");
    }
}