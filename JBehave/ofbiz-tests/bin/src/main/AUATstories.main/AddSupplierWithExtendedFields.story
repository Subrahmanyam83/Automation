

Scenario: Add Supplier in Ofbiz - With Compulsory fields

Given that I logged into ofbiz site
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I type "Test Supplier" as the "groupName"
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

And I check the value of "groupName" as the "Test Supplier"
And I check the value of "groupNameLocal" as the "TES"
And I check the value of "address1" as the "Sydney"
And I check the value of "city" as the "Manly"
And I check the value of "postalCode" as the "92"
And I check the value of "phone" as the "44556677"
And I check the value of "mobile" as the "4455667788"
And I check the value of "fax" as the "12345"
And I check the value of "email" as the "user1@pantha.com"
And I check the value of "divertemail" as the "user2@pantha.com"
And I check the value of "webaddress" as the "panthacorp.com"
