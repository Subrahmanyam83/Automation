
Scenario: Edit a Supplier in AlfRED

Given that I logged into alfred site as Product Analyst
And I'm on supplier "TestEdit Manly Skydiving" page in Alfred
When I change the supplier company name to "TestEdit Manly Skydive"
And I change the product code prefix to "MSD"
And I change the address to "1500, George St"
And I change the post code to "2019"
And I change the suburb to "Newtown"
And I change the phone to "0288888800"
And I change the mobile to "0499999900"
And I change the fax to "04999999900"
And I change the booking emails to "booking@manlyskydive.com.au"
And I change the redirect emails to "nosupplier@manlyskydive.com.au"
And I change the website to "http://www.manlyskydive.com.au"
And I Save
Then I should see Supplier successfully modified message
When I search for supplier "TestEdit Manly Skydive"
Then I should be able to see supplier "TestEdit Manly Skydive"
When I go to supplier "TestEdit Manly Skydive" details page
Then I should see "TestEdit Manly Skydive" as supplier company name
And I should see "MSD" as product code prefix
And I should see "Newtown" as suburb
And I should see "2019" as post code
And I should see "0288888800" as phone
And I should see "0499999900" as mobile
And I should see "04999999900" as fax
And I should see "booking@manlyskydive.com.au" as booking emails
And I should see "nosupplier@manlyskydive.com.au" as redirect emails
And I should see "http://www.manlyskydive.com.au" as website

