# CustomSwitch
custom switch library for android. Easy to use and with all customization   
 Custom switch library for android. Easy to use and with all customization.
Follow these steps to use this switch:

1. Download customSwitchLibrary module from here

2. Add it in your project.

3. Add dependency to your project :

compile project(path: ':customswitchlibrary') 

4. Now it is ready to use with your project.

5. To add view in xml, write tag with this:

lj.customswitchlibrary.ViewSwitch

6. Now it is ready.


Customize in switch in xml file add below attribs :

    Set text color for active view -  app:activeTextColor
    Set text color for in-active view -  app:inActiveTextColor
    Set text for first view - app:firstText
    Set text for second view - app:secondText
    Set view color for active view - app:activeColor
    Set view color for in-active view - app:inActiveColor
    Set default selected view - app:currentActive - First/Second

Customize switch from Java file : 

    Create and findviewById.
    Set text color for active view -  vsMySwitch.setActiveTextColor(color)
    Set text color for in-active view -  vsMySwitch.setInActiveTextColor(color)
    Set view color for active view - vsMySwitch.setActiveColor(color)
    Set view color for in-active view - vsMySwitch.setInActiveColor(color)
    Get current selected view - vsMySwitch.getCurrentPosition() returns 0/1
    Set listener to check view selection changes - vsMySwitch.setOnStatusChangeListener(new ...)


checkout my blog for more updates: https://lalitjadav007.blogspot.in/
