package asmr.ru.tasks6;

public class Cinema {
    public static int[] checkEmptyPlace(char[][] places) {

        return new int[] {};
    }

    public static void main(String[] args) {
        char[][] places = {
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'O', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'O'}
        };
        int[] rsl = Cinema.checkEmptyPlace(places);
    }
}
