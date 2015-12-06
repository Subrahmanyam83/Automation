

Scenario: Search Product in of biz - Product name

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "4 results"
And I should see "APR542" as Product code

Examples:
|searchterm|
|Rhino Rodeo|



Scenario: Search Product in of biz - Supplier name

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "1 result"
And I should see "ABX891" as Product code

Examples:
|searchterm|
|Alexia Biggs|

Scenario: Search Product in of biz - Part of Product Code

Given that I logged into ofbiz site
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


Scenario: Search Product in of biz - Part of Product Code

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "1 result"

Examples:
|searchterm|
|NG|


Scenario: Search Product in of biz - Published

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "19 results"
And I select "published" option
And I should see "5 results" text


Examples:
|searchterm|
|FFF|

Scenario: Search Product in of biz - UnPublished

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "16 results"
And I select "unpublished" option
And I should see "14 results" text

Examples:
|searchterm|
|FFF|






Scenario: Search Product in ofbiz - Verify number of results

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search
And I should see "200 results"
And I verify the number of search results

Examples:
|searchterm|
|wine|







