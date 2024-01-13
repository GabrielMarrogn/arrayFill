import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<Integer>();
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < 10; i++){
            arr.add(a);
            a = a*2;
        }
        
        for(int k = 0; k < 10; k++) {
            System.out.println("N[" +k +"] = " +arr.get(k));
        }
    }
}