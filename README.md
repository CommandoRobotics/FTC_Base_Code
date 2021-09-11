## NOTICE

This repository contains the public FTC SDK for the Ultimate Goal (2020-2021) competition season.

The repository for the FTC Robot Controller and all of the documentation that goes along with it can be found [here](https://github.com/FIRST-Tech-Challenge/FtcRobotController).

# Welcome!

This repository contains the code that we can use as a starting point when creating a new project. It comes with op modes for testing sensors, as well as a PID controller library.

## Getting Started

You'll start by cloning this repository.
```
git clone https://github.com/CommandoRobotics/FTC_Base_Code.git
```

Next, you'll want to rename the local repository. Then, create an empty repository on GitHub.

Within your local version of this repository, run
```
git remote -v
```
You should see that this repository is currently your remote named origin. Go ahead and remove that remote by running
```
git remote rm origin
```

Then, you add your empty GitHub repository as a remote, called origin.
```
git remote add origin [your repo link]
```

Run `git push` to push all of the base code to your new repository, and you're all set. You can create your teamcode in the `TeamCode/src/main/java/org/firstinspires/ftc/teamcode` directory. There you will also find some pre-existing op modes and libraries.

## Updating

You can either add the [FTC_Base_Code](https://github.com/CommandoRobotics/FTC_Base_Code) repository as a remote (recommended), or you can add the [FtcRobotController](https://github.com/FIRST-Tech-Challenge/FtcRobotController) repository as a remote.

Using the FTC_Base_Code repository for updates will allow you to receive updates of the op modes and libraries in this project, in addition to the updates from FtcRobotController. However, these updates might be less frequent than those coming from FtcRobotController.

## Using Android Studio

This repository contains everything you need to build the robot controller app. All you have to do is create your teamcode. 

The best way to deploy robot code is with ADB (Android Debug Bridge) connected via Wifi to the main REV Robotics Control Hub on your robot. Documentation on the specifics of that are coming soon.