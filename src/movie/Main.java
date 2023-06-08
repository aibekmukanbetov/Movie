package movie;

import movie.model.Cast;
import movie.model.Director;
import movie.model.Movie;
import movie.service.serviceImpl.FindableImpl;
import movie.service.serviceImpl.SortableImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>(
                List.of(new Movie("Один дома", 1990,"Comedy",
                                new Director("Крис", "Коламбус"),
                                new ArrayList<>( List.of(
                                        new Cast("Маколей Калкин", "Кевин"),
                                        new Cast("Джо Пеши","Гарри"),
                                        new Cast("Дэниел Стерн","Марва")))),
                        new Movie("Один дома 2: Затерянный в Нью-Йорке", 1992,"Comedy",
                                new Director("Крис", "Коламбус"),
                                new ArrayList<>( List.of(
                                        new Cast("Маколей Калкин", "Кевин"),
                                        new Cast("Джо Пеши","В образе старшего бандита"),
                                        new Cast("Дэниел Стерн","В образе злодея Марва")))),
                        new Movie("Гарри Поттер и философский камень", 2001, "фэнтези",
                                new Director("Крис ","Коламбус"),
                                new ArrayList<>(List.of(
                                        new Cast("Дэниэл Рэдклифф","Гарри Потер"),
                                        new Cast("Руперт Гринт","Рон"),
                                        new Cast("Эмма Уотсон","Гермиона")
                                ))
                                ),
                        new Movie("Гарри Поттер и тайная комната", 2002, "фэнтези",
                                new Director("Крис ","Коламбус"),
                                new ArrayList<>(List.of(
                                        new Cast("Дэниэл Рэдклифф","Гарри Потер"),
                                        new Cast("Руперт Гринт","Рон"),
                                        new Cast("Эмма Уотсон","Гермиона")
                                ))
                        ),
                        new Movie("Титаник", 1997, "мелодрама",
                                new Director("Джеймс","Кэмерон"),
                                new ArrayList<>(List.of(
                                        new Cast("Леонардо ДиКаприо","Джек"),
                                        new Cast("Кейт Уинслет","Роза"),
                                        new Cast("Билли Зейн","Каледона Хокли")
                                ))
                        ),
                        new Movie("Железный человек", 2008, "фантастика",
                                new Director("Джон","Фавро"),
                                new ArrayList<>(List.of(
                                        new Cast("Роберт Дауни младший","Тони Стакрк (Железный человек)"),
                                        new Cast("Джефф Бриджес","Обадайи Стейна"),
                                        new Cast("Гвинет Пэлтроу","Пеппер Поттс")
                                ))
                        ),
                        new Movie("1+1", 2011, "драма",
                                new Director("Оливье","Накаш"),
                                new ArrayList<>(List.of(
                                        new Cast("Франсуа Клюзе","Филипп Поццо ди Борго"),
                                        new Cast("Омар Си","Дрисс Бассари"),
                                        new Cast("Анн Ле Ни","Ивонна")
                                ))
                        ),
                        new Movie("Волк с Уолл-стрит", 2013, "драма",
                                new Director("Мартин","Скорсезе"),
                                new ArrayList<>(List.of(
                                        new Cast("Леонардо ДиКаприо","Джордан Белфорт"),
                                        new Cast("Джона Хилл","Донни Азоффа"),
                                        new Cast("Марго Робби","Наоми Лапалья")
                                ))
                        )
                        )
        );

        FindableImpl findable = new FindableImpl();
        SortableImpl sortable = new SortableImpl();

        int num;
        do {
            System.out.println("Enter 1 to get all movies");
            System.out.println("Enter 2 to search for a movie by title");
            System.out.println("Enter 3 to display sorting by year");
            System.out.println("Enter 4 to display sorting by name");
            System.out.println("Enter 5 to sort by Director");
            System.out.println("Enter 6 to search for a movie by actor's name");
            System.out.println("Enter 7 to search for a movie by director name");
            System.out.println("Enter 8 to search for a movie by year");
            System.out.println("Enter 9 to search for a movie by genre");
            System.out.println("Enter 10 to search for a movie by role");
            System.out.println("Enter 11 to exit");
            System.out.println("===========================================");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println(findable.getAllMovies(movies));
                    break;
                case 2:
                    findable.findMovieByFullNameOrPartName(movies);
                    break;
                case 3:
                    sortable.sortByYear(movies);
                    break;
                case 4:
                    sortable.sortByMovieName(movies);
                    break;
                case 5:
                    sortable.sortByDirector(movies);
                    break;
                case 6:
                    findable.findMovieByActorName(movies);
                    break;
                case 7:
                    findable.findMovieByDirector(movies);
                    break;
                case 8:
                    findable.findMovieByYear(movies);
                    break;
                case 9:
                    findable.findMovieByGenre(movies);
                    break;
                case 10:
                    findable.findMovieByRole(movies);
                    break;
                case 11:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Incorrect mode, try again.");
            }
        } while (num!=11);
    }
}
