package org.webzio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ThreadResponse {
    @JsonProperty("totalResults")
    private int totalResults;

    @JsonProperty("moreResultsAvailable")
    private boolean moreResultsAvailable;

    @JsonProperty("next")
    private String next;

    @JsonProperty("requestsLeft")
    private int requestsLeft;

    @JsonProperty("warnings")
    private List<String> warnings;

    private List<ThreadData> posts;

    @Data
    public static class ThreadData {
        private String uuid;
        private String url;
        private String site_full;
        private String site;
        private String site_section;
        private List<String> site_categories;
        private String section_title;
        private String title;
        private String title_full;
        private String published;
        private int replies_count;
        private int participants_count;
        private String site_type;
        private String country;
        private String main_image;
        private int performance_score;
        private int domain_rank;
        private String domain_rank_updated;
        private String reach;
        private Social social;
    }

    @Data
    public static class Social {
        private Facebook facebook;
        private Gplus gplus;
        private Pinterest pinterest;
        private Linkedin linkedin;
        private Stumbledupon stumbledupon;
        private Vk vk;
    }

    @Data
    public static class Facebook {
        private int likes;
        private int comments;
        private int shares;
    }

    @Data
    public static class Gplus {
        private int shares;
    }

    @Data
    public static class Pinterest {
        private int shares;
    }

    @Data
    public static class Linkedin {
        private int shares;
    }

    @Data
    public static class Stumbledupon {
        private int shares;
    }

    @Data
    public static class Vk {
        private int shares;
    }

    // Other inner classes and fields remain the same
}
