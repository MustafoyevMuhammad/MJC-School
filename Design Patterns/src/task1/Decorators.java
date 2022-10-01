package task1;

import java.util.ArrayList;
import java.util.List;

public class Decorators {
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        List<String> result = new ArrayList<>();
        if(sourceList.size() == 0)return result;
        for (int i = 0; i < sourceList.size(); i++) {
            if(i % 2 == 0){
                result.add(sourceList.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(0 % 2 == 0);
    }

}
