def enqueue(x):
    global rear
    if isFull()==False:
        rear = (rear + 1) % MAX_QUEUE_SIZE
        queue.insert(rear, x)

def dequeue():
    global front, rear
    if isEmpty() == False:
        front = (front + 1) % MAX_QUEUE_SIZE
        returnValue = queue[front]
        queue[front] = " "
        return returnValue
    else:
        print("queue is Empty")

def peek():
    return queue[0]

def isSize():
    return len(queue)

def isEmpty():
    if rear == front:
        return True
    else:
        return False

def isFull():
    if front == (rear + 1) % MAX_QUEUE_SIZE:
        print("queue is full")
        return True
    else:
        return False

def init():
    global front, rear

    front = -1
    rear = -1
    queue.clear()

##-------------------- test Code  --------------------

MAX_QUEUE_SIZE = 7
front = -1
rear = -1
queue = []

init()
enqueue(1)
print(queue)
enqueue(3)
print(queue)
dequeue()
print(queue)
enqueue(5)
print(queue)
enqueue(8)
print(queue)

enqueue(7)
print(queue)
enqueue(9)
print(queue)
enqueue(11)
print(queue)
enqueue(4)
print(queue)
dequeue()
print(queue)
