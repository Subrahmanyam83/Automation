Scenario: Search Product in of biz - Product name

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "4 results"
And I should see "APR542" as Product code

Examples:
|searchterm|
|Rhino Rodeo|























