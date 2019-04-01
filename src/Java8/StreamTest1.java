package Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

    public  static String abc ( String x){
        return x.toUpperCase();
    }

    public static void print (String s){{
        System.out.println("--"+s);
    }

    }

    public static void main(String[] args) {


        List<String > names  = new ArrayList<>();
        names.add ("aaaaa");
        names.add ("bbbbbdfgdfg");
        names.add ("cccccdfgdf");
        names.add ("ddddddfgdfgfdf");
        names.add ("ddddddfgdfgfdf");
        names.add ("ddddddfgdfgfdf");
        names.add ("eeeeefdgdfg");

        List<String > upper_names  = new ArrayList<>();


        for (String x : names ){
            upper_names.add(x.toUpperCase());
        }

        System.out.println(upper_names);

        names.stream().forEach(e -> System.out.println(e));


        names.stream().
                filter (e -> e.length()>10).
                map(StreamTest1 ::abc ).
                forEach(StreamTest1::print );

        names.stream().
                filter (e -> e.length()>10).
                map(e-> abc (e)).
                forEach(e-> print (e));


        String s= names.stream().
                filter (e -> e.length()>10).
                map(e-> abc (e)).
                reduce((str1, str2) -> str1 + "-" + str2).get();


        int val=100;



        int res= Stream.of(1,2,3,4,5,6).filter(e-> e>5).map(e-> e*1).reduce(val,(e1,e2)->e1*e2);


       List <String > result =  names.parallelStream().
                filter (e -> e.length()>10).
                map(e-> abc (e)).
                collect(Collectors.toList());


        Set<String > result1 =  names.parallelStream().
                filter (e -> e.length()>10).
                map(e-> abc (e)).
                collect(Collectors.toSet());

        System.out.println(res);

        try (Stream<String> stream = Files.lines(Paths.get("text.txt"))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
