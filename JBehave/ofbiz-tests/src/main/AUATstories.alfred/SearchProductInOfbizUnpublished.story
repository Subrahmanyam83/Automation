Scenario: Search Product in of biz - UnPublished

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "19 results"
And I select "unpublished" option
And I should see "14 results" text

Examples:
|searchterm|
|FFF|
