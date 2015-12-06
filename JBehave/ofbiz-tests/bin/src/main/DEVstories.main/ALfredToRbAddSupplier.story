

Scenario: ALfred to RB add supplier - With Compulsory fields

Given that I logged into ofbiz site
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I type "PanthaXebia" as the "groupName"
And I type "TES" as the "groupNameLocal"
And I type "Sydney" as the "address1"
And I type "Manly" as the "city"
And I type "92" as the "postalCode"
And I select "Australia" as the "countryGeoId"
And I select "New South Wales" as the "stateProvinceGeoId"
And I type "44556677" as the "phone"
And I type "4455667788" as the "mobile"
And I type "12345" as the "fax"
And I type "user1@pantha.com" as the "email"
And I type "user2@pantha.com" as the "divertemail"
And I type "panthacorp.com" as the "webaddress"
And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I get the SupplierName


And I wait for "15" seconds

Given that I logged into Ting site
When I go to newly added supplier page
Then I verify the value "PanthaXebia" as "Supplier Name"
Then I verify the value "44556677" as "Phone"
Then I verify the value "4455667788" as "Mobile Phone"
Then I verify the value of Email "user1@pantha.com" as "Contact Email"
Then I verify the value "12345" as "Fax"
Then I verify the value "panthacorp.com" as "Website"
Then I verify the value "Manly" as "Suburb"
Then I verify the value "92" as "Post Code"
Then I verify the value "New South Wales" as "State"


