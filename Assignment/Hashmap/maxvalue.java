import java.util.*;
public class maxvalue {
    static void freq(int[] arr,int n){
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n ; i++){
            int c = 0;
            for (int j = 0 ; j < n; j++) {
                if (arr[i]==arr[j]){
                    c+=1;
                }
            map.put(arr[i], c);

            }
        }
        int max = 0;
        int result = 0;
        int equals = 0;
        int a = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet() ){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > max){
                max = value;
                result = key;
            }else if (value == max){
                if (value > equals){
                    equals = value;
                    a = key;
                }
            }
        }
            if (max > equals){
                System.out.println(result);
            }else if (result > a){
                System.out.println(a);
            }else if (result < a){
                System.out.println(result);
            }
    
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        int [] arr ={1,1,0,0,0,2,3,3,2,5,5,6};
        int n = arr.length;
        //sc.close();
        freq(arr, n);
    }
}
