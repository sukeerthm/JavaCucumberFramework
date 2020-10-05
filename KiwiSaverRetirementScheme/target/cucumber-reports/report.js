$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KiwiSaverCalculator/CalculateRetirementBalance.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Sukeerth Madaka"
    }
  ],
  "line": 2,
  "name": "As a Product Owner",
  "description": "I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement\nSo that \nThe users are able to plan their investments better.",
  "id": "as-a-product-owner",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10444316300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Given User enters information in the form to calculate projected balance",
  "description": "",
  "id": "as-a-product-owner;given-user-enters-information-in-the-form-to-calculate-projected-balance",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I Open navigate to the Retirement Calculator Form",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I fill the retirement FormDetails",
  "rows": [
    {
      "cells": [
        "currentAge",
        "employmentStatus",
        "salaryWage",
        "kiwiSaverContribution",
        "currentKiwiSaverBalance",
        "voluntaryContribution",
        "voluntaryContributionFre",
        "riskProfile",
        "savingGoal"
      ],
      "line": 12
    },
    {
      "cells": [
        "30",
        "Employed",
        "82000",
        "4",
        "",
        "",
        "Weekly",
        "Defensive",
        ""
      ],
      "line": 13
    },
    {
      "cells": [
        "45",
        "Self-employed",
        "",
        "",
        "100000",
        "90",
        "Fortnightly",
        "Conservative",
        "290000"
      ],
      "line": 14
    },
    {
      "cells": [
        "55",
        "Not employed",
        "",
        "",
        "140000",
        "10",
        "Annually",
        "Balanced",
        "200000"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.navigate_to_the_website()"
});
formatter.result({
  "duration": 5507391900,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.fill_retirement_form(DataTable)"
});
formatter.result({
  "duration": 15525544800,
  "status": "passed"
});
formatter.after({
  "duration": 971200900,
  "status": "passed"
});
formatter.uri("KiwiSaverCalculator/ValidateHelpText.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Sukeerth Madaka"
    }
  ],
  "line": 2,
  "name": "As a Product Owner",
  "description": "I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present\nSo that \nThe user is able to get a clear understanding of what needs to be entered in the field .",
  "id": "as-a-product-owner",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8396198600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Given User Clicks information icon besides \u003cLabel\u003e the message \u003cHelpText\u003e is displayed below the current age field.",
  "description": "",
  "id": "as-a-product-owner;given-user-clicks-information-icon-besides-\u003clabel\u003e-the-message-\u003chelptext\u003e-is-displayed-below-the-current-age-field.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I Open navigate to the Retirement Calculator Form",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I validate the helptext for all the fields",
  "rows": [
    {
      "cells": [
        "Label",
        "HelpText"
      ],
      "line": 11
    },
    {
      "cells": [
        "Current age",
        "This calculator has an age limit of 18 to 64 years old."
      ],
      "line": 12
    },
    {
      "cells": [
        "Employment status",
        "If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make."
      ],
      "line": 13
    },
    {
      "cells": [
        "Salary or wages per year (before tax)",
        "Only include your total annual income that is paid to you by your employer(s). Other income sources such as rental income or dividends should not be included."
      ],
      "line": 14
    },
    {
      "cells": [
        "KiwiSaver member contribution",
        "You can choose to contribute a regular amount equal to 3%, 4%, 6%, 8% or 10% of your before-tax salary or wage. If you do not select a rate, your rate will be 3%."
      ],
      "line": 15
    },
    {
      "cells": [
        "Current KiwiSaver balance",
        "If you do not have a KiwiSaver account, then leave this field blank."
      ],
      "line": 16
    },
    {
      "cells": [
        "Voluntary contributions",
        "If you are \u0027Self-Employed\u0027 or \u0027Not employed\u0027, you can make direct contributions to your KiwiSaver account. If you are \u0027Employed\u0027, you can make voluntary contributions in addition to your regular employee contributions."
      ],
      "line": 17
    },
    {
      "cells": [
        "Risk profile",
        "The risk profile affects your potential investment returns:"
      ],
      "line": 18
    },
    {
      "cells": [
        "Savings goal at retirement",
        "Enter the amount you would like to have saved when you reach your intended retirement age. If you aren’t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.navigate_to_the_website()"
});
formatter.result({
  "duration": 4207942600,
  "status": "passed"
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.validate_helptext(DataTable)"
});
formatter.result({
  "duration": 3929051100,
  "status": "passed"
});
formatter.after({
  "duration": 823175000,
  "status": "passed"
});
});