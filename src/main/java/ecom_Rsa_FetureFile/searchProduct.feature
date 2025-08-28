Feature: Search and Place the order for products

@OffersPage
Scenario Outline: Serach Experience for product search in both home and Offers page
Given User is on GreenCart Landing page
When User serarched with <Name> and extracted actual name of product
Then User searched for <Name> shortname in offers page 
And Validate product name in offers page matches with landing page


Examples:
|Name|
|Tom|
|Pot|