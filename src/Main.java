import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] st = new String[]{"0123456789","9876543210","9999999999999"};
       System.out.println(solution1(st, 50000, 5, 5));

    }

    public static int[] solution1(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs).mapToInt(item -> Integer.parseInt(item.substring(s, s + l)))
                .filter(item -> k < item)
                .toArray();
    }

//    public static int[] solution(String[] intStrs, int k, int s, int l) {
//        int[] answer = {};
//        List<Integer> ls = new ArrayList<>();
//        for(String st1 : intStrs){
//            String st = (st1.substring(s,st1.length()).substring(st1.substring(s,st1.length()).length()-5));
//            if(st.length() == l && Integer.parseInt(st) > k){
//                ls.add(Integer.parseInt(st));
//            }
//        }
//
//        int[] return_val = new int[ls.size()];
//        for(int i = 0; i < ls.size(); i++){
//           return_val[i] = ls.get(i);
//        }
//
//
//        return ls.toArray();
//    }


}