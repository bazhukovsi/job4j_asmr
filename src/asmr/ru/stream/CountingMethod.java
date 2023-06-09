package asmr.ru.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingMethod {
    public static class Company {

        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static class Worker {

        private int age;

        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream().collect(Collectors.groupingBy(worker -> worker.getCompany().getName(), Collectors.counting()));
    }

    public static void main(String[] args) {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Amazon");
        Company c3 = new Company("Microsoft");
        Worker w1 = new Worker(20, c1);
        Worker w2 = new Worker(25, c2);
        Worker w3 = new Worker(30, c2);
        Worker w4 = new Worker(35, c3);
        Worker w5 = new Worker(40, c3);
        Worker w6 = new Worker(45, c3);
        List<Worker> list = List.of(w1, w2, w3, w4, w5, w6);
        Map<String, Long> out = groupAndCount(list);
        for (Map.Entry<String, Long> entry : out.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map<String, Long> expect = Map.of(
                "Apple", 1L,
                "Amazon", 2L,
                "Microsoft", 3L
        );

    }

}
