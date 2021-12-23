package programmers;
public class funtion {
    public static void main(String[] args) {
        // 문제 넣기 위한 배열 생성
        int[] progresses = new int[100];
        int[] speeds = new int[100];
        progresses[0] = 93;
        progresses[1] = 30;
        progresses[2] = 55;
        speeds[0] = 1;
        speeds[0] = 30;
        speeds[0] = 5;

        // 문제 풀이
        int[] temp = new int[100];
        int day = -1;

        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            temp[day]++;
        }

        int cnt = 0;
        
        for(int n : temp){
            if(n != 0) cnt++;
        }
        
        int[] answer = new int[cnt];
        
        cnt = 0;

        for(int n : temp){
            if(n != 0) answer[cnt++] = n;
        }

        System.out.println(answer);
    }
}
