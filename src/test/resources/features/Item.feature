Feature: Invite Vendor

  Scenario Outline: Invite Vendor with Valid Input Data for HeaderTab,ColourTab
    Given Login Dss+ Application with Valid User Details
    When User is on Home Page Click on New Item Tab and Click Create New Item
    And Enter the Required Field Values for "<Item_No>" "<Short_Desc>" "<Item_Desc>" "<Est_FF_Due_Date>" "<CPMCategory>" "<Season>" "<Year>" "<Story>" "<Line_Type>" "<Sell_Unit>" "<Department>" "<Brand_Label_Type>" "<Brand_Name>" "<Buy_Code>"in Header Tab and Click Save
    And Enter the Required Field Values for Colour Tab
    And Enter the Required Field Values for Requirement Tab
    And Enter the Required Field Values for Specification Tab
    Then The Values Should be Saved Successfully

    Examples: 
      | Item_No             | Short_Desc | Item_Desc | Est_FF_Due_Date | Season | Year | Story | Line_Type             | Sell_Unit | Department               | Brand_Label_Type | CPMCategory | Brand_Name | Buy_Code     |
      | zzDummyAutoTestItem | Test       | Test      | 07/10/2019      | Winter | 2019 | Test  | Apparel Consolidation | EACH      | 991 - APPAREL DUMMY DEPT | Private          | Generic     | ADVANCE    | Fashion Line |

  Scenario Outline: Invite Vendor without  Mandatory Input Data for Department
    Given Login Dss+ Application with Valid User Details
    When User is on Home Page Click on New Item Tab and Click Create New Item
    And Enter the Required Field Values for "<Item_No>" "<Short_Desc>" "<Item_Desc>" "<Est_FF_Due_Date>" "<CPMCategory>" "<Season>" "<Year>" "<Story>" "<Line_Type>" "<Sell_Unit>" "<Department>" "<Brand_Label_Type>" "<Brand_Name>" "<Buy_Code>"in Header Tab and Click Save
    Then The Warning Message Should be displayed Successfully as "Product Category: Mandatory field is missing."

    Examples: 
      | Item_No             | Short_Desc | Item_Desc | Est_FF_Due_Date | Season | Year | Story | Line_Type             | Sell_Unit | Department | Brand_Label_Type | CPMCategory | Brand_Name | Buy_Code     |
      | zzDummyAutoTestItem | Test       | Test      | 30/09/2019      | Winter | 2019 | Test  | Apparel Consolidation | EACH      |            | Private          | Generic     | ADVANCE    | Fashion Line |
