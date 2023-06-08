package movie.service.serviceImpl;

import movie.model.Movie;
import movie.service.Sortable;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortableImpl implements Sortable{
    @Override
    public void sortByMovieName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 SortByNameFromAtoZ");
        System.out.println("2 SortByNameFromZtoA");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                movies.sort(SortByNameFromAtoZ);
                System.out.println(movies);
                break;
            case 2:
                movies.sort(SortByNameFromZtoA);
                System.out.println(movies);
                break;
        }

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 SortByYearAscending");
        System.out.println("2 SortByYearDescending");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                movies.sort(SortByYearAscending);
                System.out.println(movies);
                break;
            case 2:
                movies.sort(SortByYearDescending);
                System.out.println(movies);
                break;
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(SortByDirector);
        System.out.println(movies);
    }


    public static Comparator<Movie> SortByNameFromAtoZ = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> SortByNameFromZtoA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };


    public static Comparator<Movie> SortByYearAscending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    };

    public static Comparator<Movie> SortByYearDescending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }
    };


    public static Comparator<Movie> SortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

}
