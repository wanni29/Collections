package queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Practice_PriorityQueue_HardMode {

    public static void main(String[] args) {

        // 우선 순위 큐를 요소를 저장할 때 각 요소에 우선순위를 부여
        // 가장 높은 우선순위를 가진 요소가 항상 먼저 나오는 자료구조
        // default - 작은 값 부터 큰 값 순서로 정렬
        // offer() => 요소를 추가할 때 사용
        // poll() => 큐에서 가장높은 우선 순위를 가진 요소를 제거하고 반환, 큐가 비어있으면 null 값 반환
        // peek() => 큐에서 가장 높은 우선 순위를 가진 요소를 반환하지만 제거하지 않는다. 큐가 비어 있으면 null 값 반환

        // PriorityQueue 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 요소 추가
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);

        // PriorityQueue를 Stream 으로 변환 후 필터링과 변환 수행
        Stream<Integer> filteredStream = pq.stream()
                .filter(val -> val > 2)
                .map(val -> val * 2);

        // 결과 출력
        filteredStream.forEach(System.out::println);
    }

}
