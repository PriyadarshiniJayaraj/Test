$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Item.feature");
formatter.feature({
  "line": 1,
  "name": "Invite Vendor",
  "description": "",
  "id": "invite-vendor",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Invite Vendor with Valid Input Data for HeaderTab,ColourTab",
  "description": "",
  "id": "invite-vendor;invite-vendor-with-valid-input-data-for-headertab,colourtab",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login Dss+ Application with Valid User Details",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page Click on New Item Tab and Click Create New Item",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter the Required Field Values for \"\u003cItem_No\u003e\" \"\u003cShort_Desc\u003e\" \"\u003cItem_Desc\u003e\" \"\u003cEst_FF_Due_Date\u003e\" \"\u003cCPMCategory\u003e\" \"\u003cSeason\u003e\" \"\u003cYear\u003e\" \"\u003cStory\u003e\" \"\u003cLine_Type\u003e\" \"\u003cSell_Unit\u003e\" \"\u003cDepartment\u003e\" \"\u003cBrand_Label_Type\u003e\" \"\u003cBrand_Name\u003e\" \"\u003cBuy_Code\u003e\"in Header Tab and Click Save",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter the Required Field Values for Colour Tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter the Required Field Values for Requirement Tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the Required Field Values for Specification Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The Values Should be Saved Successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "invite-vendor;invite-vendor-with-valid-input-data-for-headertab,colourtab;",
  "rows": [
    {
      "cells": [
        "Item_No",
        "Short_Desc",
        "Item_Desc",
        "Est_FF_Due_Date",
        "Season",
        "Year",
        "Story",
        "Line_Type",
        "Sell_Unit",
        "Department",
        "Brand_Label_Type",
        "CPMCategory",
        "Brand_Name",
        "Buy_Code"
      ],
      "line": 13,
      "id": "invite-vendor;invite-vendor-with-valid-input-data-for-headertab,colourtab;;1"
    },
    {
      "cells": [
        "zzDummyAutoTestItem",
        "Test",
        "Test",
        "07/10/2019",
        "Winter",
        "2019",
        "Test",
        "Apparel Consolidation",
        "EACH",
        "991 - APPAREL DUMMY DEPT",
        "Private",
        "Generic",
        "ADVANCE",
        "Fashion Line"
      ],
      "line": 14,
      "id": "invite-vendor;invite-vendor-with-valid-input-data-for-headertab,colourtab;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Invite Vendor with Valid Input Data for HeaderTab,ColourTab",
  "description": "",
  "id": "invite-vendor;invite-vendor-with-valid-input-data-for-headertab,colourtab;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login Dss+ Application with Valid User Details",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page Click on New Item Tab and Click Create New Item",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter the Required Field Values for \"zzDummyAutoTestItem\" \"Test\" \"Test\" \"07/10/2019\" \"Generic\" \"Winter\" \"2019\" \"Test\" \"Apparel Consolidation\" \"EACH\" \"991 - APPAREL DUMMY DEPT\" \"Private\" \"ADVANCE\" \"Fashion Line\"in Header Tab and Click Save",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter the Required Field Values for Colour Tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter the Required Field Values for Requirement Tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the Required Field Values for Specification Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The Values Should be Saved Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.login_Dss_Application_with_Valid_User_Details()"
});
formatter.result({
  "duration": 6210578846,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Home_Page_Click_on_New_Item_Tab_and_Click_Create_New_Item()"
});
formatter.result({
  "duration": 53798474046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zzDummyAutoTestItem",
      "offset": 37
    },
    {
      "val": "Test",
      "offset": 59
    },
    {
      "val": "Test",
      "offset": 66
    },
    {
      "val": "07/10/2019",
      "offset": 73
    },
    {
      "val": "Generic",
      "offset": 86
    },
    {
      "val": "Winter",
      "offset": 96
    },
    {
      "val": "2019",
      "offset": 105
    },
    {
      "val": "Test",
      "offset": 112
    },
    {
      "val": "Apparel Consolidation",
      "offset": 119
    },
    {
      "val": "EACH",
      "offset": 143
    },
    {
      "val": "991 - APPAREL DUMMY DEPT",
      "offset": 150
    },
    {
      "val": "Private",
      "offset": 177
    },
    {
      "val": "ADVANCE",
      "offset": 187
    },
    {
      "val": "Fashion Line",
      "offset": 197
    }
  ],
  "location": "StepDefinitions.enter_the_Required_Field_Values_for_in_Header_Tab_and_Click_Save(String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 14178396306,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.enter_the_Required_Field_Values_for_Colour_Tab()"
});
formatter.result({
  "duration": 20264674224,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.enter_the_Required_Field_Values_for_Requirement_Tab()"
});
formatter.result({
  "duration": 11638955304,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.enter_the_Required_Field_Values_for_Specification_Tab()"
});
formatter.result({
  "duration": 6403853933,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.the_Values_Should_be_Saved_Successfully()"
});
formatter.result({
  "duration": 21503770058,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Invite Vendor without  Mandatory Input Data for Department",
  "description": "",
  "id": "invite-vendor;invite-vendor-without--mandatory-input-data-for-department",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "Login Dss+ Application with Valid User Details",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User is on Home Page Click on New Item Tab and Click Create New Item",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Enter the Required Field Values for \"\u003cItem_No\u003e\" \"\u003cShort_Desc\u003e\" \"\u003cItem_Desc\u003e\" \"\u003cEst_FF_Due_Date\u003e\" \"\u003cCPMCategory\u003e\" \"\u003cSeason\u003e\" \"\u003cYear\u003e\" \"\u003cStory\u003e\" \"\u003cLine_Type\u003e\" \"\u003cSell_Unit\u003e\" \"\u003cDepartment\u003e\" \"\u003cBrand_Label_Type\u003e\" \"\u003cBrand_Name\u003e\" \"\u003cBuy_Code\u003e\"in Header Tab and Click Save",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "The Warning Message Should be displayed Successfully as \"Product Category: Mandatory field is missing.\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "invite-vendor;invite-vendor-without--mandatory-input-data-for-department;",
  "rows": [
    {
      "cells": [
        "Item_No",
        "Short_Desc",
        "Item_Desc",
        "Est_FF_Due_Date",
        "Season",
        "Year",
        "Story",
        "Line_Type",
        "Sell_Unit",
        "Department",
        "Brand_Label_Type",
        "CPMCategory",
        "Brand_Name",
        "Buy_Code"
      ],
      "line": 23,
      "id": "invite-vendor;invite-vendor-without--mandatory-input-data-for-department;;1"
    },
    {
      "cells": [
        "zzDummyAutoTestItem",
        "Test",
        "Test",
        "30/09/2019",
        "Winter",
        "2019",
        "Test",
        "Apparel Consolidation",
        "EACH",
        "",
        "Private",
        "Generic",
        "ADVANCE",
        "Fashion Line"
      ],
      "line": 24,
      "id": "invite-vendor;invite-vendor-without--mandatory-input-data-for-department;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Invite Vendor without  Mandatory Input Data for Department",
  "description": "",
  "id": "invite-vendor;invite-vendor-without--mandatory-input-data-for-department;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "Login Dss+ Application with Valid User Details",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User is on Home Page Click on New Item Tab and Click Create New Item",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Enter the Required Field Values for \"zzDummyAutoTestItem\" \"Test\" \"Test\" \"30/09/2019\" \"Generic\" \"Winter\" \"2019\" \"Test\" \"Apparel Consolidation\" \"EACH\" \"\" \"Private\" \"ADVANCE\" \"Fashion Line\"in Header Tab and Click Save",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "The Warning Message Should be displayed Successfully as \"Product Category: Mandatory field is missing.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.login_Dss_Application_with_Valid_User_Details()"
});
formatter.result({
  "duration": 6258535087,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Home_Page_Click_on_New_Item_Tab_and_Click_Create_New_Item()"
});
formatter.result({
  "duration": 20288588074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zzDummyAutoTestItem",
      "offset": 37
    },
    {
      "val": "Test",
      "offset": 59
    },
    {
      "val": "Test",
      "offset": 66
    },
    {
      "val": "30/09/2019",
      "offset": 73
    },
    {
      "val": "Generic",
      "offset": 86
    },
    {
      "val": "Winter",
      "offset": 96
    },
    {
      "val": "2019",
      "offset": 105
    },
    {
      "val": "Test",
      "offset": 112
    },
    {
      "val": "Apparel Consolidation",
      "offset": 119
    },
    {
      "val": "EACH",
      "offset": 143
    },
    {
      "val": "",
      "offset": 150
    },
    {
      "val": "Private",
      "offset": 153
    },
    {
      "val": "ADVANCE",
      "offset": 163
    },
    {
      "val": "Fashion Line",
      "offset": 173
    }
  ],
  "location": "StepDefinitions.enter_the_Required_Field_Values_for_in_Header_Tab_and_Click_Save(String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 13780073915,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product Category: Mandatory field is missing.",
      "offset": 57
    }
  ],
  "location": "StepDefinitions.the_Warning_Message_Should_be_displayed_Successfully_as(String)"
});
formatter.result({
  "duration": 10588281361,
  "status": "passed"
});
});