package LLDCaseStudies.BookMyShow.entity;

import java.util.List;

public class BookMyShow {

    private User user;
    private List<Region> regions;

    public BookMyShow(User user, List<Region> regions) {
        this.user = user;
        this.regions = regions;
    }
}
