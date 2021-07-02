package opera.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PerformanceRequestDto {
    @NotNull
    private String movieTitle;
    @Size(max = 200)
    private String movieDescription;

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }
}
