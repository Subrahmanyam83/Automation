
Scenario: Remove Custom fields to a product



Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "newtestproduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I enter the Primary category as "Jet Boating"
And I type "Test summary" as the "summary"
And I click the new custom field "Testfield1" with "attribute0"
And I type in custom value "test" as "Testfield1"
And I do not see "Tstfield2" with "attribute1"
And I click save button
And I see Congratulations. You just added a new product

