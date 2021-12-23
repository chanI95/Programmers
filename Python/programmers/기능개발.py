progresses = [93, 20, 55]
speeds = [1, 30, 5]
answer = []
days = []
day = 0

for i in range(len(progresses)) :
    if((100 - progresses[i])%speeds[i] == 0):
        day = int((100 - progresses[i])/speeds[i])
    else:
        day = int((100 - progresses[i])/speeds[i]) + 1
    days.append(day)

count = 0
wait = days[0]

for i in range(len(days)) :
    if wait < days[i] :
        answer.append(count)
        count = 1
        wait = days[i]
    else :
        count += 1

answer.append(count)

print(answer)