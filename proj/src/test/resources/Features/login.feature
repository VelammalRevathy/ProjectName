Feature: Verifying Adactin login credentials

  Scenario Outline: Login with credentials
    Given Launching Adactin URL
    When Entering "<UserName>" and "<Password>"
    And Clicking Login button
    When Entering "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Click Search
    And click the Checkbox and Click Continue
    When Entering Personal details "<FirstName>", "<LastName>", "<BillingAddress>", "<CreditCardNo>", "<CreditCardType>", "<ExpiryMonth>", "<ExpiryYear>" and "<CVVNumber>"
    Then Booking room

    Examples: 
      | UserName   | Password | Location | Hotels         | RoomType     | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName | BillingAddress        | CreditCardNo     | CreditCardType   | ExpiryMonth | ExpiryYear | CVVNumber |
      | Sarath7774 | EWHERJ   | Sydney   | Hotel Sunshine | Super Deluxe | 1 - One       | 15/09/2021  | 16/09/2021   | 1 - One       | 1 - One         | Sarath    | TA       | 35A,Sambanthar street | 9878987898789878 | American Express | October     |       2022 |      2348 |
