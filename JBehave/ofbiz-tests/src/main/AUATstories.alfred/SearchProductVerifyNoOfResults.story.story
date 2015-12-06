

Scenario: Search Product in ofbiz - Verify number of results

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "399" results
And I verify the number of search results

Examples:
|searchterm|
|wine|