package subway.dto;

import subway.domain.Line;

import java.util.List;

public class LineResponse {

    private Long id;
    private String name;
    private String color;
    private List<StationResponse> stations;
    private List<SectionResponse> sections;

    public LineResponse(Long id, String name, String color, List<StationResponse> stations, List<SectionResponse> sections) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.stations = stations;
        this.sections = sections;
    }

    public static LineResponse of(Line line) {
        return new LineResponse(
                line.getId()
                , line.getName()
                , line.getColor()
                , StationResponse.asList(line.getUpStation(), line.getDownStation())
                , SectionResponse.asList(line.getSections())
        );
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public List<StationResponse> getStations() {
        return stations;
    }

    public List<SectionResponse> getSections() {
        return sections;
    }


}
