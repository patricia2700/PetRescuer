package src.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class PetsAvalable {
    private List<Pets> petsList;
    private Date lastUpdate;
    @Builder
    @ToString
    public static final class Pets implements Comparable {

        private String description;

        @Override
        public int compareTo(Object o) {
            return description.compareTo(((Pets) o).description);
        }
    }
}
