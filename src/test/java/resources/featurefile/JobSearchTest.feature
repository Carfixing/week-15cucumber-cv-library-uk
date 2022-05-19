Feature: Job Search Test
  As a User I can able to use all functionality and fined the job
 @smoke
  Scenario Outline: verify job search result using different dataset
    Given I am on HomePage
    When I enter job title "<jobTitle>"
    And I enter the "<location>"
    And I can select the "<distance>"
    And I can click on more Search Options Link
    And I can enter salaryMin "<salaryMin>"
    And I can enter salaryMax "<salaryMax>"
    And I can select salaryType "<salaryType>"
    And I can select jobType "<jobType>"
    And I can click on 'Find Jobs' button
    Then I can verify the result "<result>"
    Examples:

      | jobTitle        | location               | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                         |
      | Tester          | Harrow                 | up to 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill    |
      | Developer       | Hampshire              | up to 7 miles  | 32000     | 51000     | Per annum  | Permanent | Permanent Developer jobs in Hampshire          |
      | Test Engineer   | Hertfordshire          | up to 10 miles | 35000     | 55000     | Per annum  | Permanent | Permanent Test Engineer jobs in Hertfordshire  |
      | Test Manager    | Longford County        | up to 15 miles | 37000     | 60000     | Per annum  | Permanent | Permanent Test Manager jobs in Longford County |
      | Test Technician | Heston, Greater London | up to 10 miles | 40000     | 60000     | Per annum  | Permanent | Permanent Test Technician jobs in Heston       |
