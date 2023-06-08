package movie.service.serviceImpl;

import movie.model.Cast;
import movie.model.Movie;
import movie.service.Findable;
import java.util.List;
import java.util.Scanner;

public class FindableImpl implements Findable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        String nameMovie = scanner.nextLine();
        for (Movie movie: movies) {
            if (movie.getName().equals(nameMovie) || movie.getName().contains(nameMovie)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the actor's name");
        String nameActor = scanner.nextLine();
        for (Movie movie: movies){
            if (movie.getCast().equals(nameActor) || movie.getCast().contains(nameActor)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of the movie: ");
        int year = scanner.nextInt();
        for (Movie movie: movies) {
            if (movie.getYear()== year){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the director's name: ");
        String nameDirector = scanner.nextLine();
        for (Movie movie: movies){
            if (movie.getDirector().getName().contains(nameDirector) || movie.getDirector().getLastName().contains(nameDirector)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie genre: ");
        String genre = scanner.nextLine();
        for (Movie movie: movies){
            if(movie.getGenre().equals(genre) || movie.getGenre().contains(genre)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the actor's role: ");
        String role = scanner.nextLine();

        for (Movie movie: movies){
            List<Cast> castList = movie.getCast();
            for (Cast cast : castList) {
                if (cast.getRole().equalsIgnoreCase(role) || cast.getRole().contains(role)) {
                    System.out.println(movie);
                }
            }
        }

    }
}
