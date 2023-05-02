package asmr.ru.arraylist.maptasks;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> infoMap = new LinkedHashMap();
        for (int i = 0; i < list.size(); i++) {
            if (infoMap.containsKey(list.get(i).getCity())) {
                int finalI = i;
                infoMap.computeIfPresent(list.get(i).getCity(), (key, value) -> value + list.get(finalI).getRainfall());
            } else {
                infoMap.putIfAbsent(list.get(i).getCity(), list.get(i).getRainfall());
            }
        }
        for (Map.Entry<String, Integer> entry : infoMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            rsl.add(new Info(entry.getKey(), entry.getValue()));
        }
        return rsl;
    }

    public static class Info {
        private final String city;

        private final int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }

    public static void main(String[] args) {
        List<Info> list = List.of(
                new Info("Minsk", 25), new Info("Brest", 5), new Info("Grodna", 33),
                new Info("Gomel", 26), new Info("Minsk", 15), new Info("Vitebsk", 18),
                new Info("Grodna", 18), new Info("Brest", 18), new Info("Gomel", 40),
                new Info("Minsk", 55), new Info("Vitebsk", 36), new Info("Minsk", 30),
                new Info("Gomel", 15), new Info("Grodna", 15), new Info("Brest", 40)
        );
        List<Info> rsl = Weather.editData(list);
        List<Info> expected = List.of(
                new Info("Minsk", 125),
                new Info("Brest", 63),
                new Info("Grodna", 66),
                new Info("Gomel", 81),
                new Info("Vitebsk", 54)
        );
    }
}
