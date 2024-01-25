package org.webzio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ThreadResponse {

    @JsonProperty("posts")
    private List<Post> posts;

    @JsonProperty("totalResults")
    private int totalResults;

    @JsonProperty("moreResultsAvailable")
    private int moreResultsAvailable;

    @JsonProperty("next")
    private String next;

    @JsonProperty("requestsLeft")
    private int requestsLeft;

    @Data
    public static class Post {

        @JsonProperty("thread")
        private ThreadData thread;

        // Add other properties as needed

        @Data
        public static class ThreadData {

            @JsonProperty("uuid")
            private String uuid;

            @JsonProperty("url")
            private String url;

            @JsonProperty("site_full")
            private String siteFull;

            @JsonProperty("site")
            private String site;

            @JsonProperty("site_section")
            private String siteSection;

            @JsonProperty("site_categories")
            private List<String> siteCategories;

            @JsonProperty("section_title")
            private String sectionTitle;

            @JsonProperty("title")
            private String title;

            @JsonProperty("title_full")
            private String titleFull;

            @JsonProperty("published")
            private String published;

            @JsonProperty("replies_count")
            private int repliesCount;

            @JsonProperty("participants_count")
            private int participantsCount;

            @JsonProperty("site_type")
            private String siteType;

            @JsonProperty("country")
            private String country;

            @JsonProperty("spam_score")
            private double spamScore;

            @JsonProperty("main_image")
            private String mainImage;

            // Add other properties as needed

            @JsonProperty("social")
            private Social social;

            @Data
            public static class Social {

                @JsonProperty("facebook")
                private SocialPlatform facebook;

                @JsonProperty("gplus")
                private SocialPlatform gplus;

                // Add other social platforms as needed

                @Data
                public static class SocialPlatform {

                    @JsonProperty("likes")
                    private int likes;

                    @JsonProperty("comments")
                    private int comments;

                    @JsonProperty("shares")
                    private int shares;
                }
            }

            // Add other properties as needed

            @JsonProperty("uuid")
            private String postUuid;

            @JsonProperty("url")
            private String postUrl;

            @JsonProperty("ord_in_thread")
            private int ordInThread;

            @JsonProperty("author")
            private String author;

            @JsonProperty("published")
            private String postPublished;

            @JsonProperty("title")
            private String postTitle;

            @JsonProperty("text")
            private String postText;

            // Add other properties as needed

            @JsonProperty("external_links")
            private List<String> externalLinks;

            @JsonProperty("external_images")
            private List<ExternalImage> externalImages;

            @JsonProperty("entities")
            private Entities entities;

            @Data
            public static class ExternalImage {

                @JsonProperty("url")
                private String url;

                @JsonProperty("meta_info")
                private String metaInfo;

                @JsonProperty("uuid")
                private String uuid;

                @JsonProperty("label")
                private List<String> label;

                @JsonProperty("text")
                private String text;
            }

            @Data
            public static class Entities {

                @JsonProperty("persons")
                private List<Person> persons;

                @JsonProperty("organizations")
                private List<Organization> organizations;

                @JsonProperty("locations")
                private List<Location> locations;

                @Data
                public static class Person {

                    @JsonProperty("name")
                    private String name;

                    @JsonProperty("sentiment")
                    private String sentiment;
                }

                @Data
                public static class Organization {

                    @JsonProperty("name")
                    private String name;

                    @JsonProperty("sentiment")
                    private String sentiment;
                }

                @Data
                public static class Location {

                    @JsonProperty("name")
                    private String name;

                    @JsonProperty("sentiment")
                    private String sentiment;
                }
            }

            // Add other properties as needed

            @JsonProperty("rating")
            private Object rating;

            @JsonProperty("crawled")
            private String crawled;
        }
    }
}