import java.util.*;
import java.util.stream.Collectors;

public class Taskstream1 {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Siva", "Ramu", "Sundar", "Mani", "Selva");

// Print names starting with "S"
       names.stream()
               .filter(name->name.startsWith("S"))
               .forEach(name->System.out.println(name));

       List<Integer> num=Arrays.asList(111,31,41,45,1,3);
       Optional<Integer> num1=num.stream()
               .filter(num2->num2 %2==0)
               .findFirst();

       num1.ifPresentOrElse(num3-> System.out.println("number fouund" +num3),
               ()-> System.out.println("the value is not there"));

       List<String>list1=Arrays.asList("ravi", "raju", "raguram");
       list1.stream().map(n->n.toUpperCase()).forEach(n-> System.out.println(n));

     List<String>l=Arrays.asList("sundar","sudhakar","robbin", "ravi");
     l.stream().filter(letter-> letter.length()>5)
             .forEach(letter-> System.out.println(letter));

     HashMap<Integer, String> map= new HashMap<>();
     map.put(1,"sundar");
     map.put(2,"rahul");
    map.put(3, "sam");
    map.put(4, "sampath");

    map.forEach((id, name)-> System.out.println("id" + id + "name" +name));
    List<String> l1=map.values().stream().map(n->n.toUpperCase()).collect(Collectors.toList());

    }
}
