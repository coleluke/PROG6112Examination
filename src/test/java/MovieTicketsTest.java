import org.example.MovieTickets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTicketsTest {

    // Instance of MovieTickets for testing
    MovieTickets movieTickets = new MovieTickets();
    private Assertions Assert;

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        // Arrange: Define sample sales data
        int[] ticketSales = {3000, 1500, 1700}; // Sample sales for a movie in Jan, Feb, Mar
        int expectedTotal = 6200;

        // Act: Calculate the total sales using the method
        int actualTotal = movieTickets.TotalMovieSales(ticketSales);

        // Assert: Check if the actual total matches the expected total
        Assert.assertEquals(expectedTotal, actualTotal, "The total movie sales should be 6200.");
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        // Arrange: Define movies and their respective total sales
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300}; // Sales totals for each movie
        String expectedTopMovie = "Oppenheimer";

        // Act: Determine the top movie using the method
        String actualTopMovie = movieTickets.TopMovie(movies, totalSales);

        // Assert: Check if the actual top movie matches the expected movie
        Assert.assertEquals(expectedTopMovie, actualTopMovie, "The top performing movie should be Oppenheimer.");
    }
}
