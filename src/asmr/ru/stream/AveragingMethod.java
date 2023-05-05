package asmr.ru.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragingMethod {
    public static class Company {
        private final String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Worker {
        private final int age;
        private final Company company;

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

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream().collect(Collectors.groupingBy(w -> w.getCompany().getName(), Collectors.averagingDouble(Worker::getAge)));
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
        List<Worker> list = List.of(w1,w2,w3,w4,w5,w6);
        Map<String, Double> map = averaging(list);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
