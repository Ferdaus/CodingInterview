import java.util.HashMap;
import java.util.Map;

public class Chapter1_1 {
    public static void main(String args[]){
        isUnique("Hello");
    }

    public static boolean isUnique(String str){
        int len = str.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i =0;
        while(i< len)
        {
            if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                    return false;
                }
            else
                map.put(str.charAt(i),1);
            i++;
        }
        
        //Iterable it =
        for(Map.Entry element: map.entrySet())
            System.out.println(element.getKey()+ " "+ element.getValue());
        return true;
    }
}
