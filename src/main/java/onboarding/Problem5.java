package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 1. int money를 List로 바꿔주기
// 2. 각자리에 얼마가 필요한지 나누는 메소드
// 3. 거꾸로 만들어주는 메소드
public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;}
    public static List<Integer> intToList(int i){  // int money -> List로 떼어냄
        List<Integer> moneyList = new ArrayList<>();
        while(i>0){ // 50237
            moneyList.add(i%10); // 7 3 2 0 5
            i = i/10;
        }
        return moneyList;
    }

    public static List<Integer> makemoneyList(List<Integer> list){
        List<Integer> moneyList = list;
        List<Integer> moneyTemp = new ArrayList<>();
        moneyTemp.add(moneyList.get(0)); // 일의 자리는 그냥 넣기
        for(int i =1; i<moneyList.size();i++) {
            int m = moneyList.get(i);
            if(m<5) { // 5가 안넘으면
                moneyTemp.add(m);
                moneyTemp.add(0);}
            else {//8 -> 1…3
                moneyTemp.add(m%5);
                moneyTemp.add(m/5);
            }
        }
        return moneyTemp;
    }
    public static List<Integer> inversemoneyList(List<Integer> list){
        List<Integer> moneyTemp = new ArrayList<>();
        for(int i =list.size()-1; i>-1;i--) {
            moneyTemp.add(list.get(i));
        }
        return moneyTemp;
    }


}
