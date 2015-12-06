Scenario: Create a Supplier in AlfRED

Given that I logged into alfred site as Product Analyst
And I go to Add Supplier page
When I add "Sydney permium sky diving" as supplier company name
And I add "SP1" as product code prefix
And I add "151, George St" as address
And I add "Manly" as suburb
And I add "2009" as post code
And I choose "Australia" as country
And I choose "New South Wales" as state
And I add "0299988222" as phone
And I add "0499988222" as mobile
And I add "0299988223" as fax
And I add "booking@spskydiving.com.au" as booking emails
And I add "nosupplier@redballoon.com.au" as redirect emails
And I add "http://www.spskydiving.com.au" as website
When I Save
Then I should see Supplier successfully created message
And I should see supplier marked as active
When I search for supplier "Sydney permium sky diving"
Then I should be able to see supplier "Sydney permium sky diving"
When I go to supplier "Sydney permium sky diving" details page
Then I should see "Sydney permium sky diving" as supplier company name
And I should see "SP1" as product code prefix
And I should see "Manly" as suburb
And I should see "2009" as post code
And I should see "0299988222" as phone
And I should see "0499988222" as mobile
And I should see "0299988223" as fax
And I should see "booking@spskydiving.com.au" as booking emails
And I should see "nosupplier@redballoon.com.au" as redirect emails
And I should see "http://www.spskydiving.com.au" as website