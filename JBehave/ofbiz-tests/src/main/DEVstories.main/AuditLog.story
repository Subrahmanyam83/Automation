Scenario:

Given that I logged into alfred site as Product Analyst
And I open "Tandem sky diving 14,000ft" product
And I change product name to "Tandem sky diving 15,000ft"
And I save changes
When I go to audit log
Then I should see changes logged
And I should see previous value "Tandem sky diving 14,000ft"
And I should see new value "Tandem sky diving 15,000ft"
And I should see change by person "alfred"
And I should see changed date time

Given that I logged into alfred site as Product Analyst
And I open "Tendem sky diving 15,000ft" product
And I change product summary from "Test Product" to "new product" 
And I save changes 
When I go to audit log 
Then I should see content changes logged 
And I should see previous content value "Test Product" 
And I should see new content value "new product" 
And I should see content change by person "alfred" 
And I should see changed date time for the content

Given that I logged into alfred site as Product Analyst
And I open "Tandem sky diving 15,000ft" product
And I change product selling price from "100" to "200" 
And I save changes 
When I go to audit log 
Then I should see price changes logged 
And I should see previous price value "100" 
And I should see new price value "200" 
And I should see price change by person "alfred" 
And I should see changed date time for the price