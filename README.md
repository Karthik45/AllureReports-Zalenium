# Setting Allure Reports and Zalenium

In this project i have used selenium testng with support of allure reports and zalenium

## About Allure Reports ##

[Allure](http://allure.qatools.ru/) is an open-source framework designed to create test execution reports that are clear to everyone in the team.

We can setup these reports for any testing framework. Check example frameworks for setting up allure reports [here](https://github.com/allure-examples).

#### General FAQ about allure reports ####

[1. Would like to see a demo allure report?](https://demo.qameta.io/allure/)

[2. Would like to know each and every option available in allure report?](https://docs.qameta.io/allure/)

[3. How to edit and configure allure features and add screenshots to our test cases?](https://www.swtestacademy.com/allure-testng/)

## About Zalenium ##

[Zalenium](https://opensource.zalando.com/zalenium/) is a flexible and scalable container based Selenium Grid with video recording, live preview, basic auth & dashboard.

## About Project ##

This project consists of web ui tests using Selenium, Gradle, TestNg Framework.

* #### Run project in local system and check allure reports ####

1) Clone this repo.

2) Run Command - **gradle clean build sample -Dmode=local -Dbrowser=browserName -Dtags=tagName**.

3) Install Allure in macOs using command - **brew install allure**

4) After tests are done run command - **allure serve /path-to-your-project/build/allure-results**

**Note:** We provided support for chrome and firefox for macOs. And by default takes chrome browser and sanity tag.

* #### Run project in zalenium container and check allure reports ####

* **Using Docker Commands**

1) Install [Docker](https://docs.docker.com/) in your machine

2) Pull docker images

   *  **docker pull gradle** 
   *  **docker pull elgalu/selenium**
   *  **docker pull dosel/zalenium**

3) Trigger the zalenium container using command:

    * **docker run --rm -ti --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock \
        -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium start**

4) Move to the project in local where we cloned the repo.        

5) Now trigger gradle container and link with zalenium container and run tests using command:

    * **docker run --link zalenium:localhost -v "$PWD":/home/gradle/ -w /home/gradle gradle gradle clean build sample -   Dmode=cloud**

6) After done copy the results from gradle container to local system using command:

    * **docker co <gradle-Container_id>:/home/gradle/build/allure-results /path-to-save-in-local-system**

7) Now check reports using command:

    * **allure serve /path-you-saved-reports-in-local-system**


* **Using Docker Compose File**      

1) Follow same Steps (i) and (ii) as docker commands.

2) Run Docker Compose file using command:

   * **docker-compose -f docker-compose-zalenium.yml up**

3) For Checking results in allure reports follow Steps (vi) and (vii) as docker commands. 
