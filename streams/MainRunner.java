package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainRunner {
    public static void main(String[] args){
        Integer[] arr= {225,228,9,34,22,56,3,228,3,3,3,3,3,2,2,2,2,26,0,23,};


        /*
        1.filter :filter takes input and retuts those value which matche the cobstion lil ein beowe examopl eian fikletring thsoe elemebts which is didvisblie by two
        */
        List<Integer> divisibleBytWO = Arrays.asList(arr).stream().filter(num-> num %2==0).collect(Collectors.toList());
        System.out.println(divisibleBytWO);
        /* map:map takes input ad transform each element into somethi9ng abd then retus lik ein bewkie example we will take input from sourse tat ist anndna muplie by each element with 7and ratunthe resukt

        
        */
        List<Integer> multipliedBySeven = Arrays.asList(arr).stream().filter(num->num%2!=0).map(num->num*7).collect(Collectors.toList());
        System.out.println(multipliedBySeven);
        List<List<String>> sugarMills=Arrays.asList(
            Arrays.asList("Plant A", "Plant B"),
            Arrays.asList("Plant C", "Plant D"),
            Arrays.asList("Plant E")
        );
        List<String> allPlants= sugarMills.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(allPlants);

        /* distinct : distinct ietremiduacte function i used to rwmocvella the dublicats in the element i tres and and retuern aonly uiniyue elenenst  */
        List<Integer>uniqueElements=Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements);
        Arrays.asList(arr).stream().sorted().peek(num -> System.out.println(num)).skip(6).limit(4).forEach(System.out::println);
       int sum= Arrays.asList(arr).stream().distinct().reduce(1,(a,b)->a*b);
       System.out.println(sum);

    }   
    
}
