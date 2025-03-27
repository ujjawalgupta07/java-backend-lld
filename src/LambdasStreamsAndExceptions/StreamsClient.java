package LambdasStreamsAndExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsClient {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(33);
        list.add(44);
        list.add(5);
        list.add(6);
        list.add(72);
        list.add(8);
        list.add(96);
        list.add(105);

        List<Integer> ans = list.stream()
                .filter((data) -> {
                    return data > 10;
                })
                .map((data) -> data * 2)
                .sorted((a1, a2) -> {
                    if(a1 > a2)
                        return -1;
                    else if(a2 > a1)
                        return 1;
                    else return 0;
                })
                .collect(Collectors.toList());

        System.out.println(ans);

    }
}
