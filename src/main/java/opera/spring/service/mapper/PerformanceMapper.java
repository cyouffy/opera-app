package opera.spring.service.mapper;

import opera.spring.dto.request.PerformanceRequestDto;
import opera.spring.dto.response.PerformanceResponseDto;
import opera.spring.model.Performance;
import org.springframework.stereotype.Component;

@Component
public class PerformanceMapper implements RequestDtoMapper<PerformanceRequestDto, Performance>,
        ResponseDtoMapper<PerformanceResponseDto, Performance> {
    @Override
    public Performance mapToModel(PerformanceRequestDto dto) {
        Performance performance = new Performance();
        performance.setTitle(dto.getMovieTitle());
        performance.setDescription(dto.getMovieDescription());
        return performance;
    }

    @Override
    public PerformanceResponseDto mapToDto(Performance performance) {
        PerformanceResponseDto responseDto = new PerformanceResponseDto();
        responseDto.setMovieId(performance.getId());
        responseDto.setMovieTitle(performance.getTitle());
        responseDto.setMovieDescription(performance.getDescription());
        return responseDto;
    }
}
