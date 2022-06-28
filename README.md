# TAH 2021

Test Automation Hackathon 2021
---------------------
### drivers

###### chrome
In project using **chromedriver** for Chrome 93 version. <br />
Use https://chromedriver.chromium.org/downloads if you need use another vesion of Chrome.<br />
After download navigate to path where your **chromedriver** file is located and execute command: <br />
<code>xattr -d com.apple.quarantine chromedriver</code><br />
This command solve problem with permission on Mac: <br />
<i>“chromedriver” cannot be opened because the developer cannot be verified. Unable to launch the chrome browser</i>. 
<br />
###### safari
You need enable "Allow Remote Automation" in Safari: <br />
<i>Safari -> Preferences -> Advanced -> check "enable Develop Menu" and then select "Develop -> Allow Remote Automation"</i>
