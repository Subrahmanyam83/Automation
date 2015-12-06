Scenario: Search Product in of biz - Part of Product Code

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "1 result"

Examples:
|searchterm|
|NG|

Scenario: Search Product in of biz - Part of Product Code

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "66 results"
And I should see "MOB105" as Product code
And I should see "MOB167" as Product code

Examples:
|searchterm|
|MOB1|