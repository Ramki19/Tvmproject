import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Optional2learn {
static HashMap<Integer, String> map= new HashMap<Integer,String>();
static {
    map.put(1, "Laptop");
    map.put(2, "desktop");
    map.put(3, "keyboard");
    map.put(4, "mouse");
    map.put(5, "camera");
}
static Optional<String> product(int num){

    if(map.containsKey(num)){
        return Optional.of(map.get(num));
    }

return Optional.empty();
}

    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your product code ");
        int choice=sc.nextInt();
        Optional<String> name=product(choice);
name.ifPresentOrElse(
        value-> System.out.println("Show the product " + value),
            ()-> System.out.println("product is not shown"));
        }
}

