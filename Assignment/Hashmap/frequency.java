import java.util.*;
public class frequency {
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
        for (Map.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        int [] arr ={1,2,3,3,2};
        int n = arr.length;
        //sc.close();
        freq(arr, n);
    }
}
