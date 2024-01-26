Feature: Web Content Filtering
  @API
  Scenario: Filtering web content with a specific query
    When I make a GET request to filter web content with query "q=%28%22stock%20market%22%20OR%20NASDAQ%29%20language%3Aenglish&format=json&sort=crawled&ts=1595156935835&highlight=true"
    Then the total results should be 10

