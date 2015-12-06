

Scenario: ALfred to RB edit supplier - With Compulsory fields

Given that I logged into ofbiz site
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I type "AgileComp" as the "groupName"
And I type "TES" as the "groupNameLocal"
And I type "Sydney" as the "address1"
And I type "Manly" as the "city"
And I type "92" as the "postalCode"
And I select "Australia" as the "countryGeoId"
And I select "New South Wales" as the "stateProvinceGeoId"
And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I get the SupplierName
And I get the PartyID


And I wait for "15" seconds

Given that I logged into Ting site
When I go to newly added supplier page
Then I verify the value "AgileComp" as "Supplier Name"
Then I verify the value "Sydney" as "Address"
Then I verify the value "Manly" as "Suburb"
Then I verify the value "92" as "Post Code"
Then I verify the value "New South Wales" as "State"

And I click Edit under "Details "

And I add "44556677" as "Phone"
And I add "12345" as "Fax"
And I add "user1@panthacorp.com" as "Email"
And I add "panthacorp.com" as "Website"
And I add "4455667788" as "Mobile"


And I click "Save" button

And I "Logout"
And I wait for "50" seconds

Given that I logged into ofbiz site
When I go to earlier supplier page in Alfred

Then I check the value of "phone" as the "44556677"
Then I check the value of "fax" as the "12345"
Then I check the value of "mobile" as the "4455667788"
Then I check the value of "email" as the "user1@panthacorp.com"
Then I check the value of "webaddress" as the "panthacorp.com"







