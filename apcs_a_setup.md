

## Installing and Setting Up the Windows Subsystem for Linux (_WSL_) and VS Code

### Installing WSL:

| Step | Steps                                       |  Notes                        |
|:----:|---------------------------------------------|-------------------------------|
| 1    | Go to [START] and type _Store_              |                               |
| 2    | Click on Microsoft Store                    |                               |
| 3    | Click on Search in the top right.           |                               |
| 4    | Search for _Bash_                           |                               |
| 5    | Click on [Get the apps]                     |                               |
| 6    | Click on [Ubuntu]                           |                               |
| 7    | Click on [Get]                              | Wait for Install              |
| 8    | Click on [Launch]                           | Wait for Install              |
| 9    | Type _student_ for username and hit [Enter] |                               |
| 10   | Type _ict_ for password and hit [Enter]     | Nothing will show as you type |
| 11   | Retype _ict_ for password and hit [Enter]   | Nothing will show as you type |

### Installing JDK 8 on WSL:

_Note: You can copy and past all of these commands._

| Step | Commands                           |  Notes                               |
|:----:|------------------------------------|--------------------------------------|
| 1    | sudo apt-get update                | Type this in and hit [Enter]<br />Type your password _ict_ and hit [Enter]  |
| 2    | sudo apt-get upgrade               | Type this in and hit [Enter]<br />Hit [Enter] when it asks: _Do you want to continue? [Y/n]_  |
| 3    | sudo apt-get install openjdk-8-jdk | Type this in and hit [Enter]<br />Hit [Enter] if it asks: _Do you want to continue? [Y/n]_  |

### Installing and Setting Up VS Code

| Step | Commands                         |  Notes                               |
|:----:|----------------------------------|--------------------------------------|
| 1    | To to https://code.visualstudio.com/download <br /> &nbsp;&nbsp;&nbsp;Downlaod and install Windows 64 |                           |
| 2    | [Ctrl]+[Shift]+P and type: <br /> &nbsp;&nbsp;&nbsp;Terminal: Select Default Shell <br /> &nbsp;&nbsp;&nbsp; Click on WSL Bash | _Having the editor point to the WSL_ |
| 3    | [Ctrl]+[Shift]+X and type: <br /> &nbsp;&nbsp;&nbsp;Java <br /> &nbsp;&nbsp;&nbsp; Click on Language Support for Java (TM) by Red Hat | _This will make writting Java code much easier_ |
| 4    | Click: File &#x2192; Preferences &#x2192; settings <br /> &nbsp;&nbsp;&nbsp; Search _Tab Size_ and change it to _3_ <br /> &nbsp;&nbsp;&nbsp; Search _Render Whitespace_ and change it to _boundary_ | _All tabs must be 3 spaces._ |
| 5    | [Ctrl]+[Shift]+X and type: _Material Theme_ <br /> &nbsp;&nbsp;&nbsp; Click on _Material Theme_ and _Material Icon Theme_ <br /> Click: File &#x2192; Preferences &#x2192; Color Theme <br /> &nbsp;&nbsp;&nbsp; and chose _Material Theme Darker High Constast_ <br /> Click: File &#x2192; Preferences &#x2192; File Icon Theme <br /> &nbsp;&nbsp;&nbsp; and chose _Material Icon Theme_ | _This is the color theme that I use._
