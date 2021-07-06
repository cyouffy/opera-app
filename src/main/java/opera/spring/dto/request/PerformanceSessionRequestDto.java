package opera.spring.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class PerformanceSessionRequestDto {
    @Positive
    private Long performanceId;
    @Positive
    private Long stageId;
    @NotNull
    private String showTime;

    public Long getPerformanceId() {
        return performanceId;
    }

    public Long getStageId() {
        return stageId;
    }

    public String getShowTime() {
        return showTime;
    }
}
