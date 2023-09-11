package set.treeset;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class Practice_TreeSet_HardMode {

    public static void main(String[] args) {


        // 정수를 저장 할 수 있는 TreeSet 생성
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(7);

        // 2로 나눈 나머지가 0인 요소만 선택하여 새로운 TreeSet 생성
        TreeSet<Integer> evenNumbers = treeSet.stream()
        .filter(num -> num % 2 == 0)
        .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("2로 나눈 나머지가 0인 요소들 : " + evenNumbers);
    }

}
