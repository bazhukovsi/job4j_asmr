package asmr.ru.task5;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                count++;
                index = i;
                if (count == number) {
                    break;
                } else {
                    index = -1;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char [] str = {'a', 'b', 'c', 'd', 'e', 'f', 'd'};
        int index = indexOf(str, 'd', 2);
        System.out.println(index);
    }
}
