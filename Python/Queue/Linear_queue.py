def enqueue(x):
    global rear
    rear += 1
    queue.insert(rear, x)

def dequeue():
    global rear
    if isEmpty() == False:
        rear -= 1
        return queue.pop(0)
    else:
        print("queue is Empty")

def peek():
    return queue[0]

def isSize():
    return len(queue)

def isEmpty():
    if rear == -1:
        return True
    else:
        return False

def init():
    global rear

    rear = -1
    queue.clear()

##-------------------- test Code  --------------------

rear = -1
queue = []

init()
enqueue(1)
print(queue)
print('-'*10)
enqueue(2)
print(queue)
print('-'*10)
print(isSize())
print('-'*10)
print(dequeue())
print('-'*10)
print(queue)
print('-'*10)
print(peek())
print('-'*10)
enqueue(4)
print(queue)
print('-'*10)
print(peek())
print('-'*10)
init()
print(queue)

