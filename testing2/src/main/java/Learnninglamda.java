import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//interface Number{
//    void num(int element);
//
//
//}
//
public class Learnninglamda {
    public static void main(String[] args) {
//        Number n=(int ele) -> System.out.println(ele * ele);
//        n.num(5);
//    System.out.println(n);
//
//List<String> list= Arrays.asList("amal","devies", "lara");
//List<String> l=list.stream().filter(name->(name.startsWith("a")) && (name.endsWith("s"))) .collect(Collectors.toList());
//System.out.println(l);
//List<Integer> list1=new ArrayList<>();
//list1.add(23);
//list1.add(31);
//list1.add(35);
//list1.add(1);
//
//
//        List<Integer> sort = list1.stream()
//                .filter(value -> value < 2)
//
//                .collect(Collectors.toList());
//        System.out.println(sort);
//
//        List<String> list2=Arrays.asList("ram","sankar", "ragul");
//        List<String> list3=list2.stream()
//                .filter(letter -> letter.startsWith("r"))
//                .map(letter-> letter.toUpperCase())
//                .sorted()
//                .collect(Collectors.toList());
//System.out.println(list3);
//
//List<Integer> list4=new ArrayList<>();
//list4.add(3);
//list4.add(32);
//list4.add(12);
//list4.add(42);
//list4.add(55);
//list4.add(2);
//List<Integer> list5=list4.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//System.out.println(list5);
//
//
//String arr[]={"ram", "siva", "ragul", "jairam"};
//Stream<String> stream= Arrays.stream(arr);
//stream
//        .filter(ni->ni.length()>=4)
//        .forEach(System.out::println);
//
 List<String> list6=new ArrayList<>();
 list6.add("ramu");
 list6.add("somu");
 list6.add("raju");
 list6.add("ragul");
 list6.add("ravi");
 list6.add("somu");
 list6.add("raju");
        int arrr[] = {12, 24, 22, 26, 16, 43};
        for (int i = 0; i < arrr.length-1; i++) {
            for (int j = 0; j < arrr.length-i-1; j++) {
                if (arrr[j] > arrr[j + 1]) {
                    int temp = arrr[j + 1];
                    arrr[j + 1] = arrr[j];
                    arrr[j] = temp;
                }
            }

        }
        for(int i=0; i<arrr.length; i++){
            System.out.println(arrr[i]);
        }


        }
    }



